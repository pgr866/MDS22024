package interfaz;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaSeccioncomentarios_item;

public class Seccion_comentarios_item extends VistaSeccioncomentarios_item {
	
	public Seccion_comentarios _seccion_comentarios;
	public Mostrar_comentario _mostrar_comentario;
	public Mostrar_valoracion_comentario _mostrar_valoracion_comentario;
	basededatos.Comentario comentario;
	
	public Seccion_comentarios_item(Seccion_comentarios _seccion_comentarios,
			basededatos.Comentario comentario) {
		super();
		this._seccion_comentarios = _seccion_comentarios;
		this.comentario = comentario;
		if (!(this instanceof Seccion_comentarios_Editor_item)) this.getLayoutborrarcomentarioseccioncomentariositem().setVisible(false);
		this._mostrar_comentario = new Mostrar_comentario(this, comentario);
		this._mostrar_valoracion_comentario = new Mostrar_valoracion_comentario(this, comentario);
		Mostrar_comentario();
		Mostrar_valoracion_comentario();

		Image foto = new Image(comentario.getEscribe().getUrl_foto_perfil(), "fotocomentario");
		foto.setWidth("100px");
        foto.setHeight("100px");
		this.getLayoutfotousuarioseccioncomentariositem().as(VerticalLayout.class).removeAll();
		this.getLayoutfotousuarioseccioncomentariositem().as(VerticalLayout.class).add(foto);
		
	    this.getLabelnickusuarioseccioncomentariositem().setText(comentario.getEscribe().getNick_apodo());
	}

	public void Mostrar_comentario() {
		this.getLayoutvistamostrarcomentarioseccioncomentariositem().as(VerticalLayout.class).add(_mostrar_comentario);
	}

	public void Mostrar_valoracion_comentario() {
		this.getLayoutvistamostrarvaloracioncomentarioseccioncomentariositem().as(VerticalLayout.class).add(_mostrar_valoracion_comentario);
	}
}