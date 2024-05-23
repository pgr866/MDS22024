package interfaz;

import com.vaadin.flow.component.notification.Notification;

public class Gestionar_pagos {

	public Gestor_de_pago _gestor_de_pago;
	public Registrarse _registrarse;

	public Gestionar_pagos(Registrarse _registrarse) {
		super();
		this._registrarse = _registrarse;
		Verificar_pago();
	}
	
	public void Verificar_pago() {
		Notification.show("Pago validado correctamente");
	}
}