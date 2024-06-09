package interfaz;

import com.vaadin.flow.component.notification.Notification;

public class Seccion_comentarios_Usuario_no_registrado_item extends Seccion_comentarios_item {
	
	public Seccion_comentarios_Usuario_no_registrado_item(Seccion_comentarios _seccion_comentarios, basededatos.Comentario comentario) {
		super(_seccion_comentarios, comentario);
		this._mostrar_valoracion_comentario.getMegustaseccioncomentariositem().addClickListener(event -> Notification.show("Inicia sesión o Registrate para desbloquear nuevas funcionalidades"));
		this._mostrar_valoracion_comentario.getNomegustaseccioncomentariositem().addClickListener(event -> Notification.show("Inicia sesión o Registrate para desbloquear nuevas funcionalidades"));
		this.getLayoutborrarcomentarioseccioncomentariositem().setVisible(false);
	}
}