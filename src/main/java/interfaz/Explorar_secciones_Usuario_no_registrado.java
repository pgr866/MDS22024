package interfaz;

public class Explorar_secciones_Usuario_no_registrado extends Explorar_secciones {
	
	//	private Panel _panel_publicidad;
	//	private ImageButton _imagen_publicidad;
	public Usuario_no_Registrado _usuario_no_Registrado;
	public Noticias_en_seccion_Usuario_no_registrado _noticias_en_seccion_Usuario_no_registrado;

	public Explorar_secciones_Usuario_no_registrado(interfaz.Secciones _secciones,
			Usuario_no_Registrado _usuario_no_Registrado,
			interfaz.Noticias_en_seccion_Usuario_no_registrado _noticias_en_seccion_Usuario_no_registrado) {
		super(_secciones);
		this._usuario_no_Registrado = _usuario_no_Registrado;
		this._noticias_en_seccion_Usuario_no_registrado = _noticias_en_seccion_Usuario_no_registrado;
		this.getLayoutnombrebotonesexplorarsecciones().setVisible(false);

	}
	

	
	public void Noticias_en_seccion_Usuario_no_registrado() {
		throw new UnsupportedOperationException();
	}
}