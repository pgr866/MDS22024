package interfaz;

public class Seccion_comentarios_Editor_item extends Seccion_comentarios_Identificado_item {
//	private event _eliminar_comentario;

	public Seccion_comentarios_Editor_item(Seccion_comentarios _seccion_comentarios) {
	super(_seccion_comentarios);
	this.getLayoutborrarcomentarioseccioncomentariositem().setVisible(true);
	this.getSeccioncomentariositem().addClickListener(event->Eliminar_comentario());
}

	public void Eliminar_comentario() {
		this._seccion_comentarios._item.remove(this);
	}
}
