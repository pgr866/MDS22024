package interfaz;

public class Seccion_comentarios_Editor_item extends Seccion_comentarios_Identificado_item {
//	private event _eliminar_comentario;
	public Seccion_comentarios_Editor _seccion_comentarios_Editor;
	
	public Seccion_comentarios_Editor_item(Seccion_comentarios _seccion_comentarios) {
		super(_seccion_comentarios);
		this.getLayoutborrarcomentarioseccioncomentariositem().setVisible(true);
		this.getLayoutborrarcomentarioseccioncomentariositem().setVisible(true);
	}

	public void Eliminar_comentario() {
		throw new UnsupportedOperationException();
	}
}