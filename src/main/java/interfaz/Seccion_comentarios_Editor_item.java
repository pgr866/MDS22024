package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Seccion_comentarios_Editor_item extends Seccion_comentarios_Identificado_item {
	
//	private event _eliminar_comentario;

	public Seccion_comentarios_Editor_item(Seccion_comentarios _seccion_comentarios,
			basededatos.Identificado identificado, basededatos.Comentario comentario) {
	super(_seccion_comentarios, identificado, comentario);
	this.getLayoutborrarcomentarioseccioncomentariositem().setVisible(true);
	this.getSeccioncomentariositem().addClickListener(event->Eliminar_comentario());
}

	public void Eliminar_comentario() {
		this.comentario.setElimina_comentario((basededatos.Editor) this._seccion_comentarios_Identificado._pagina_noticia_Identificado.identificado);
		this._seccion_comentarios_Identificado.getLayoutvistaseccioncomentarios().as(VerticalLayout.class).remove(this);
		this._seccion_comentarios_Identificado._item.remove(this);
	}
}
