package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Registrarse extends vistas.VistaRegistrarse {
//	private event _cancelar;
//	private event _enviar;
//	private Label _email;
//	private Label _nombre;
//	private Label _apellidos;
//	private Label _fecha_naciemiento;
//	private Label _apodo;
//	private Label _dni;
//	private Label _num_tarjeta;
//	private Label _contrasena;
//	private Label _repetir_contrasena;
	public Iniciar_Sesion _iniciar_Sesion;
	public Gestionar_correo _gestionar_correo;
	public Gestionar_pagos _gestionar_pagos;
	
	public Registrarse(Iniciar_Sesion _iniciar_Sesion) {
		super();
		this._iniciar_Sesion = _iniciar_Sesion;
		this.getCancelarregistrarse().addClickListener(event->Cancelar());
		this.getEnviarregistrarse().addClickListener(event->Enviar());
	}

	public void Gestionar_correo() {
		throw new UnsupportedOperationException();
	}

	public void Cancelar() {
		this._iniciar_Sesion._usuario_no_Registrado.Iniciar_Sesion();
	}

	public void Comprobar_datos() {
		// borrar
	}

	public void Enviar() {
		// crear usuario suscrito BD
		this._iniciar_Sesion._usuario_no_Registrado.mainview.remove(this._iniciar_Sesion._usuario_no_Registrado);
		this._iniciar_Sesion._usuario_no_Registrado.mainview.add(this._iniciar_Sesion._usuario_no_Registrado.mainview._usuario_suscrito);
	}

	public void Gestionar_pagos() {
		throw new UnsupportedOperationException();
	}
}