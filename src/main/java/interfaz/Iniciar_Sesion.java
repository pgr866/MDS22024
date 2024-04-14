package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaIniciarsesion;

public class Iniciar_Sesion extends VistaIniciarsesion {
//	private event _entrar;
//	private Label _usuario;
//	private Label _contrasena;
//	private TextArea _nombre_usuario;
//	private TextArea _introducir_contrasena;
	public Usuario_no_Registrado _usuario_no_Registrado;
	public Registrarse _registrarse;

	public Iniciar_Sesion(Usuario_no_Registrado _usuario_no_Registrado) {
		super();
		this._usuario_no_Registrado = _usuario_no_Registrado;
		this.getButtonentrarlogin().addClickListener(event->Entrar());
		this.getButtonregistrarselogin().addClickListener(event->Registrarse());
	}

	public void Entrar() {
		// comprobar tipo de usuario y credenciales BD
		this._usuario_no_Registrado.mainview.remove(this);
		this._usuario_no_Registrado.mainview.add(this._usuario_no_Registrado.mainview._usuario_suscrito);
	}

	public void Validar_datos() {
		// borrar
	}

	public void Registrarse() {
		this._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).removeAll();
		_registrarse = new Registrarse(this);
		this._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).add(_registrarse);	}
}