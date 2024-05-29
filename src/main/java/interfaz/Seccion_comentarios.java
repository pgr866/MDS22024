package interfaz;

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
		for (int i=0;i<comentarios.length;i++){
			if (comentarios[i].getElimina_comentario() == null) {
				Seccion_comentarios_item item = new Seccion_comentarios_item(this, comentarios[i]);
				this._item.add(item);
				this.getLayoutvistaseccioncomentarios().as(VerticalLayout.class).add(item);
			}
		}
	}
}