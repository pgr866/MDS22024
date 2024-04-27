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
		this.getLabelmensajeerrorlogin().setVisible(false);
		this.getButtonentrarlogin().addClickListener(event->Entrar());
		this.getButtonregistrarselogin().addClickListener(event->Registrarse());
	}

	public void Entrar() {
		String email = this.getTextfieldemaillogin().getValue();
		String contrasena = this.getPasswordfieldogin().getValue();
		// comprobar tipo de usuario y credenciales BD
		
//		String condition = "Email = '" + email + "' AND Contraseña = '" + contrasena + "'";
//		try {
//			basededatos.Identificado result = (basededatos.Identificado) basededatos.Identificado.queryIdentificado(condition, "").get(0);
//			this._usuario_no_Registrado.mainview.removeAll();
//			Identificado identificado = new Identificado(this._usuario_no_Registrado.mainview, result);
//			this._usuario_no_Registrado.mainview.add(identificado);
//		} catch (PersistentException e) {
//			this.getLabelmensajeerrorlogin().setVisible(true);
//		}
	}

	public void Registrarse() {
		this._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).removeAll();
		_registrarse = new Registrarse(this);
		this._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).add(_registrarse);
	}
}