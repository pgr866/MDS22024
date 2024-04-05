package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaSeccioncomentarios_item;

public class Seccion_comentarios_item extends VistaSeccioncomentarios_item {
	public Seccion_comentarios _seccion_comentarios;
	public Mostrar_comentario _mostrar_comentario;
	public Mostrar_valoracion_comentario _mostrar_valoracion_comentario;
	
	public Seccion_comentarios_item(Seccion_comentarios _seccion_comentarios) {
		super();
		this._seccion_comentarios = _seccion_comentarios;
		this._mostrar_comentario = new Mostrar_comentario(this);
		this._mostrar_valoracion_comentario = new Mostrar_valoracion_comentario(this);
		this.getLayoutborrarcomentarioseccioncomentariositem().setVisible(false);
		Mostrar_comentario();
		Mostrar_valoracion_comentario();
	}

	public void Mostrar_comentario() {
		this.getLayoutvistamostrarcomentarioseccioncomentariositem().as(VerticalLayout.class).add(_mostrar_comentario);
	}

	public void Mostrar_valoracion_comentario() {
		this.getLayoutvistamostrarvaloracioncomentarioseccioncomentariositem().as(VerticalLayout.class).add(_mostrar_valoracion_comentario);

	}
}