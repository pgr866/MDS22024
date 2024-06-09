package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import vistas.VistaIniciarsesion;
import base_de_datos.BDPrincipal;
import base_de_datos.iUsuario_no_Registrado;

public class Iniciar_Sesion extends VistaIniciarsesion {
	
//	private event _entrar;
//	private Label _usuario;
//	private Label _contrasena;
//	private TextArea _nombre_usuario;
//	private TextArea _introducir_contrasena;
	iUsuario_no_Registrado iusuario_no_registrado = new BDPrincipal();
	public Usuario_no_Registrado _usuario_no_Registrado;
	public Registrarse _registrarse;

	public Iniciar_Sesion(Usuario_no_Registrado _usuario_no_Registrado) {
		super();
		this._usuario_no_Registrado = _usuario_no_Registrado;
		this.getButtonentrarlogin().addClickListener(event->Entrar());
		this.getButtonregistrarselogin().addClickListener(event->Registrarse());
	}

	public void Entrar() {
		String email = this.getTextfieldemaillogin().getValue();
		String contrasena = this.getPasswordfieldogin().getValue();
		basededatos.Identificado usuario = null;
		try {
			usuario = iusuario_no_registrado.Login(email, contrasena);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		if (usuario == null)
			this.getLabelmensajeerrorlogin().setText("Email o contraseña erróneos, inténtelo de nuevo");
		else if (usuario instanceof basededatos.Usuario_suscrito) {
			this._usuario_no_Registrado.mainview._usuario_suscrito = new Usuario_Suscrito(this._usuario_no_Registrado.mainview, (basededatos.Usuario_suscrito) usuario);
			this._usuario_no_Registrado.mainview.removeAll();
			this._usuario_no_Registrado.mainview.add(this._usuario_no_Registrado.mainview._usuario_suscrito);
		}
		else if (usuario instanceof basededatos.Periodista) {
			this._usuario_no_Registrado.mainview._periodista = new Periodista(this._usuario_no_Registrado.mainview, (basededatos.Periodista) usuario);
			this._usuario_no_Registrado.mainview.removeAll();
			this._usuario_no_Registrado.mainview.add(this._usuario_no_Registrado.mainview._periodista);
		}
		else if (usuario instanceof basededatos.Editor) {
			this._usuario_no_Registrado.mainview._editor = new Editor(this._usuario_no_Registrado.mainview, (basededatos.Editor) usuario);
			this._usuario_no_Registrado.mainview.removeAll();
			this._usuario_no_Registrado.mainview.add(this._usuario_no_Registrado.mainview._editor);
		}
	}

	public void Registrarse() {
		this._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).removeAll();
		_registrarse = new Registrarse(this);
		this._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).add(_registrarse);
	}
}