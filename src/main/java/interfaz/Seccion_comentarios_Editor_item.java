package interfaz;

public class Seccion_comentarios_Editor_item extends Seccion_comentarios_Identificado_item {
//	private event _eliminar_comentario;

	public Seccion_comentarios_Editor_item(Seccion_comentarios _seccion_comentarios, basededatos.Comentario comentario) {
	super(_seccion_comentarios, comentario);
	this.getLayoutborrarcomentarioseccioncomentariositem().setVisible(true);
	this.getSeccioncomentariositem().addClickListener(event->Eliminar_comentario());
}

	public void Eliminar_comentario() {
		this._seccion_comentarios._item.remove(this);
	}
}
