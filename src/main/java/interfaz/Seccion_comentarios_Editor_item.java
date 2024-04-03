package interfaz;

public class Seccion_comentarios_Editor_item extends Seccion_comentarios_Identificado_item {
//	private event _eliminar_comentario;
	public Seccion_comentarios_Editor _seccion_comentarios_Editor;

	public Seccion_comentarios_Editor_item(Seccion_comentarios_Editor _seccion_comentarios_Editor,
		interfaz.Mostrar_comentario _mostrar_comentario,
		interfaz.Mostrar_valoracion_comentario _mostrar_valoracion_comentario) {
	super(_seccion_comentarios_Editor, _mostrar_comentario, _mostrar_valoracion_comentario);
	this._seccion_comentarios_Editor = _seccion_comentarios_Editor;
}

	public void Eliminar_comentario() {
		throw new UnsupportedOperationException();
	}
}