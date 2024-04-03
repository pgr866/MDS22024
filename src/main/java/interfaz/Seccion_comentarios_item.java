package interfaz;

import vistas.VistaSeccioncomentarios_item;

public class Seccion_comentarios_item extends VistaSeccioncomentarios_item {
	public Seccion_comentarios _seccion_comentarios;
	public Mostrar_comentario _mostrar_comentario;
	public Mostrar_valoracion_comentario _mostrar_valoracion_comentario;
	
	public Seccion_comentarios_item(Seccion_comentarios _seccion_comentarios,
			interfaz.Mostrar_comentario _mostrar_comentario,
			interfaz.Mostrar_valoracion_comentario _mostrar_valoracion_comentario) {
		super();
		this._seccion_comentarios = _seccion_comentarios;
		this._mostrar_comentario = _mostrar_comentario;
		this._mostrar_valoracion_comentario = _mostrar_valoracion_comentario;
		this.getLayoutborrarcomentarioseccioncomentariositem().setVisible(false);
	}

	public void Mostrar_comentario() {
		throw new UnsupportedOperationException();
	}

	public void Mostrar_valoracion_comentario() {
		throw new UnsupportedOperationException();
	}
}