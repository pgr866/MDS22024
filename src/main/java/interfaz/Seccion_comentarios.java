package interfaz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Comentario;
import vistas.VistaSeccioncomentarios;

public class Seccion_comentarios extends VistaSeccioncomentarios {

//	private Label _comentarios;
//	private Label _valoraciones;
//	private Label _nickname;
//	private Label _contenido_comentario;
//	private Image _foto_perfil;
	public Vector<Seccion_comentarios_item> _item = new Vector<Seccion_comentarios_item>();
	public Pagina_Noticia _pagina_Noticia;

	public Seccion_comentarios(Pagina_Noticia _pagina_Noticia) {
		super();
		this._pagina_Noticia = _pagina_Noticia;
		
		Comentario[] comentarios = this._pagina_Noticia.noticia.pertenece_a_noticia.toArray();
		
		Arrays.sort(comentarios, new Comparator<Comentario>() {
			@Override
			public int compare(Comentario c1, Comentario c2) {
				return Integer.compare(c2.getId_comentario(), c1.getId_comentario());
			}
		});
		
		for (int i=0;i<comentarios.length;i++){
			if (comentarios[i].getElimina_comentario() == null) {
				Seccion_comentarios_item item;
				if (this instanceof Seccion_comentarios_Editor)
					item = new Seccion_comentarios_Editor_item(this, (basededatos.Editor) ((Pagina_noticia_Editor) this._pagina_Noticia).identificado, comentarios[i]);
				else if (this instanceof Seccion_comentarios_Identificado)
					item = new Seccion_comentarios_Identificado_item(this, ((Pagina_noticia_Identificado) this._pagina_Noticia).identificado, comentarios[i]);
				else
					item = new Seccion_comentarios_Usuario_no_registrado_item(this, comentarios[i]);
				this._item.add(item);
				this.getLayoutvistaseccioncomentarios().as(VerticalLayout.class).add(item);
			}
		}
		if (!_item.isEmpty()) this.getLabelmensajenohaycomentarios().setVisible(false);
	}
}