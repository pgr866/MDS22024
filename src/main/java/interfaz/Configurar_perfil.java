package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.BDPrincipal;
import base_de_datos.iIdentificado;

public class Configurar_perfil extends vistas.VistaConfigurarperfil {

//	private event _guardar_cambios;
//	private event _modificar_datos;
//	private Image _imagen_perfil;
//	private Label _nombre;
//	private TextArea _rellenar_nombre;
//	private Label _apodo;
//	private TextArea _rellenar_apodo;
//	private Label _email;
//	private TextArea _rellenar_email;
//	private Label _num_tarjeta;
//	private TextArea _rellenar_num_tarjeta;
//	private Label _contrasena;
//	private TextArea _rellenar_contrasena;
	iIdentificado iidentificado = new BDPrincipal();
	public Identificado _identificado;
	basededatos.Identificado identificado;

	public Configurar_perfil(Identificado _identificado, basededatos.Identificado identificado) {
		super();
		this._identificado = _identificado;
		this.getLayoutntarjetaconfigurarperfil().setVisible(false);
		this.getButtoneliminarcuentaconfigurarperfil().setVisible(false);
		this.getButtonguardarcambiosconfigurarperfil().addClickListener(event -> Guardar_cambios());
		this.identificado = identificado;
		
		Image foto = new Image(identificado.getUrl_foto_perfil(), "fotoconfigurarperfil");
		foto.setWidth("300px");
		foto.setHeight("300px");
		this.getLayoutfotoconfigurarperfil().as(VerticalLayout.class).removeAll();
		this.getLayoutfotoconfigurarperfil().as(VerticalLayout.class).add(foto);
		
		this.getTextfieldurlimagenconfigurarperfil().setValue(identificado.getUrl_foto_perfil());
		this.getTextfieldnombreconfigurarperfil().setValue(identificado.getNombre());
		this.getTextfieldapellidosconfigurarperfil().setValue(identificado.getApellidos());
		this.getTextfieldapodoconfigurarperfil().setValue(identificado.getNick_apodo());
		this.getTextfieldemailconfigurarperfil().setValue(identificado.getEmail());
		this.getTextfieldtelefonoconfigurarperfil().setValue(String.valueOf(identificado.getTelefono()));
		this.getPasswordfieldcontrasenaconfigurarperfil().setValue(identificado.getContrasena());
	}

	public void Guardar_cambios() {
		int id = this.identificado.getId();
		String nombre = this.getTextfieldnombreconfigurarperfil().getValue();
		String apellidos = this.getTextfieldapellidosconfigurarperfil().getValue();
		String nick = this.getTextfieldapodoconfigurarperfil().getValue();
		String email = this.getTextfieldemailconfigurarperfil().getValue();
		String contrasena = this.getPasswordfieldcontrasenaconfigurarperfil().getValue();
		String url_foto_perfil = this.getTextfieldurlimagenconfigurarperfil().getValue();
		String telefono = this.getTextfieldtelefonoconfigurarperfil().getValue();
		String num_tarjeta = "";
		boolean validos = true;
		if (_identificado instanceof Usuario_Suscrito) {
			num_tarjeta = this.getTextfieldntarjetaconfigurarperfil().getValue();
			if (num_tarjeta.isBlank()) {
				this.getLabelerrordatosconfigurarperfil().setText("Debe rellenar todos los campos");
				validos = false;
			}
		}

		if (email.isBlank() || nombre.isBlank() || apellidos.isBlank() || nick.isBlank() || telefono.isBlank()) {
			this.getLabelerrordatosconfigurarperfil().setText("Debe rellenar todos los campos");
			validos = false;
		}

		int num_telefono = 0;
		try {
			num_telefono = Integer.parseInt(telefono);
		} catch (NumberFormatException e) {
			this.getLabelerrordatosconfigurarperfil().setText("Numero de teléfono no válido");
			validos = false;
		}

		if (contrasena.length() < 8 && validos) {
			this.getLabelerrordatosconfigurarperfil().setText("La contraseña debe tener al menos 8 caracteres");
			validos = false;
		}

		boolean hasDigit = false;
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;

		for (char c : contrasena.toCharArray()) {
			if (Character.isDigit(c))
				hasDigit = true;
			else if (Character.isUpperCase(c))
				hasUpperCase = true;
			else if (Character.isLowerCase(c))
				hasLowerCase = true;
		}

		if (!(hasDigit && hasUpperCase && hasLowerCase) && validos) {
			this.getLabelerrordatosconfigurarperfil()
					.setText("La contraseña debe tener al menos un número, una mayúscula, y una minúscula");
			validos = false;
		}

		basededatos.Identificado nuevo_identificado = null;
		if (validos) {
			try {
				nuevo_identificado = this.iidentificado.Guardar_cambios(id, nombre, apellidos, nick, email, contrasena,
						url_foto_perfil, num_telefono, num_tarjeta);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			if (nuevo_identificado == null) {
				this.getLabelerrordatosconfigurarperfil().setText("Correo electrónico / nick ya está en uso");
			} else {
				// Refrescar pagina
				this._identificado.identificado = nuevo_identificado;
			
				if (nuevo_identificado instanceof basededatos.Usuario_suscrito) {
					this._identificado.mainview._usuario_suscrito = new Usuario_Suscrito(this._identificado.mainview, (basededatos.Usuario_suscrito) nuevo_identificado);
					this._identificado.mainview.removeAll();
					this._identificado.mainview.add(this._identificado.mainview._usuario_suscrito);
				}
				else if (nuevo_identificado instanceof basededatos.Periodista) {
					this._identificado.mainview._periodista = new Periodista(this._identificado.mainview, (basededatos.Periodista) nuevo_identificado);
					this._identificado.mainview.removeAll();
					this._identificado.mainview.add(this._identificado.mainview._periodista);
				}
				else if (nuevo_identificado instanceof basededatos.Editor) {
					this._identificado.mainview._editor = new Editor(this._identificado.mainview, (basededatos.Editor) nuevo_identificado);
					this._identificado.mainview.removeAll();
					this._identificado.mainview.add(this._identificado.mainview._editor);
				}
				this._identificado.Configurar_perfil();
			}
		}
	}
}