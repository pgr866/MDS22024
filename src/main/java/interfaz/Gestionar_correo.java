package interfaz;

import com.vaadin.flow.component.notification.Notification;

public class Gestionar_correo {

	public Gestor_de_correo _gestor_de_correo;
	public Registrarse _registrarse;

	public Gestionar_correo(Registrarse _registrarse) {
		super();
		this._registrarse = _registrarse;
		Enviar_correo_verificacion();
	}
	
	public void Enviar_correo_verificacion() {
		Notification.show("Correo verificado correctamente");
	}

}