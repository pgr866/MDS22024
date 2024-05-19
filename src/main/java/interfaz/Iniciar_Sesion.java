package interfaz;

import org.orm.PersistentException;

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
		try {
			basededatos.Identificado[] consulta = basededatos.IdentificadoDAO.listIdentificadoByQuery(
					"Email = '" + email + "' AND Contrasena = '" + contrasena + "'", "DEFAULT");
			if (consulta.length > 0) {
				basededatos.Identificado result = consulta[0];
				this._usuario_no_Registrado.mainview.removeAll();
				if (result instanceof basededatos.Editor) {
					
					this._usuario_no_Registrado.mainview._editor = new Editor(this._usuario_no_Registrado.mainview, (basededatos.Editor) result);
					this._usuario_no_Registrado.mainview.add(this._usuario_no_Registrado.mainview._editor);
				} else if (result instanceof basededatos.Periodista) {
					if (((basededatos.Periodista) result).getDa_de_baja() == null) {
						this.getLabelmensajeerrorlogin().setVisible(true);
					} else {
						this._usuario_no_Registrado.mainview._periodista = new Periodista(this._usuario_no_Registrado.mainview, (basededatos.Periodista) result);
						this._usuario_no_Registrado.mainview.add(this._usuario_no_Registrado.mainview._periodista);
					}
				} else if (result instanceof basededatos.Usuario_suscrito) {
					if (((basededatos.Usuario_suscrito) result).getEsEliminado()) {
						this.getLabelmensajeerrorlogin().setVisible(true);
					} else {
						this._usuario_no_Registrado.mainview._usuario_suscrito = new Usuario_Suscrito(this._usuario_no_Registrado.mainview, (basededatos.Usuario_suscrito) result);
						this._usuario_no_Registrado.mainview.add(this._usuario_no_Registrado.mainview._usuario_suscrito);
					}
				}
			} else {
				this.getLabelmensajeerrorlogin().setVisible(true);
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void Registrarse() {
		this._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).removeAll();
		_registrarse = new Registrarse(this);
		this._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).add(_registrarse);
	}
}