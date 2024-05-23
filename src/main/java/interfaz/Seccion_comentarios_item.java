package interfaz;

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
		this._mostrar_comentario = new Mostrar_comentario(this, comentario);
		this._mostrar_valoracion_comentario = new Mostrar_valoracion_comentario(this, comentario);
		this.getLayoutborrarcomentarioseccioncomentariositem().setVisible(false);
		Mostrar_comentario();
		Mostrar_valoracion_comentario();
	    this.getFotousuarioseccioncomentariositem().setSrc(comentario.getEscribe().getUrl_foto_perfil());
	    this.getLabelnickusuarioseccioncomentariositem().setText(comentario.getEscribe().getNick_apodo());
	}

	public void Mostrar_comentario() {
		this.getLayoutvistamostrarcomentarioseccioncomentariositem().as(VerticalLayout.class).add(_mostrar_comentario);
	}

	public void Mostrar_valoracion_comentario() {
		this.getLayoutvistamostrarvaloracioncomentarioseccioncomentariositem().as(VerticalLayout.class).add(_mostrar_valoracion_comentario);
	}
}