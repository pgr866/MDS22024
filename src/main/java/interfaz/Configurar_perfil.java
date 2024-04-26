package interfaz;

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
		String nombre = this.getTextfieldnombreconfigurarperfil().getValue();
		String apodo = this.getTextfieldapodoconfigurarperfil().getValue();
		String email = this.getTextfieldemailconfigurarperfil().getValue();
		String contrasena = this.getPasswordfieldcontrasenaconfigurarperfil().getValue();
		String url_imagen = this.getTextfieldurlimagenconfigurarperfil().getValue();
		String tarjeta;
		if (this.getLabelntarjetaconfigurarperfil().isVisible())
			tarjeta = this.getTextfieldntarjetaconfigurarperfil().getValue();
		// update usuario BD
		this._identificado.Configurar_perfil(); // Refrescar pagina
	}
}