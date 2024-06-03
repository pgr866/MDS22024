package interfaz;

import org.orm.PersistentException;

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
		this.getButtonguardarcambiosconfigurarperfil().addClickListener(event->Guardar_cambios());
		this.identificado = identificado;
		this.getFotoconfigurarperfil().setSrc(identificado.getUrl_foto_perfil());
		this.getTextfieldurlimagenconfigurarperfil().setValue(identificado.getUrl_foto_perfil());
		this.getTextfieldnombreconfigurarperfil().setValue(identificado.getNombre());
		this.getTextfieldapellidosconfigurarperfil().setValue(identificado.getApellidos());
		this.getTextfieldapodoconfigurarperfil().setValue(identificado.getNick_apodo());
		this.getTextfieldemailconfigurarperfil().setValue(identificado.getEmail());
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
		String num_tarjeta = "";
		if (_identificado instanceof Usuario_Suscrito) num_tarjeta = this.getTextfieldntarjetaconfigurarperfil().getValue();
		basededatos.Identificado nuevo_identificado = null;
		try {
			nuevo_identificado = this.iidentificado.Guardar_cambios(id, nombre, apellidos, nick, email, contrasena, url_foto_perfil, num_tarjeta);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		if (nuevo_identificado == null) {
			this.getLabelerrordatosconfigurarperfil().setText("Correo electrónico / nick ya está en uso");
		} else {
			// Refrescar pagina
			this._identificado.identificado = nuevo_identificado;
			this._identificado.getImagenconfigurarperfilidentificado().setSrc(this._identificado.identificado.getUrl_foto_perfil());
			this._identificado.Configurar_perfil(); 
		}
	}
}