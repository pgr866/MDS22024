package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaExplorarseccionesusuarionoregistrado;

public class Explorar_secciones_Usuario_no_registrado extends VistaExplorarseccionesusuarionoregistrado {
	
	//	private Label _nombre_seccion;
	//	private ComboBox _seleccionar_seccion;
	//	private Button _pagina_seccion;
	//	private Panel _panel_publicidad;
	//	private ImageButton _imagen_publicidad;
	public Usuario_no_Registrado _usuario_no_Registrado;
	public Secciones_Usuario_no_registrado _secciones_Usuario_no_registrado;
	public Noticias_en_seccion_Usuario_no_registrado _noticias_en_seccion_Usuario_no_registrado;

	public Explorar_secciones_Usuario_no_registrado(Usuario_no_Registrado _usuario_no_Registrado) {
		super();
		this._usuario_no_Registrado = _usuario_no_Registrado;
		this._secciones_Usuario_no_registrado = new Secciones_Usuario_no_registrado(this);
		Secciones_Usuario_no_registrado();
		this._noticias_en_seccion_Usuario_no_registrado = new Noticias_en_seccion_Usuario_no_registrado(this);
		Noticias_en_seccion_Usuario_no_registrado();
	}
	
	public void Noticias_en_seccion_Usuario_no_registrado() {
		this.getLayoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado().as(VerticalLayout.class).removeAll();
		this.getLayoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado().as(VerticalLayout.class).add(_noticias_en_seccion_Usuario_no_registrado);
	}
	
	public void Secciones_Usuario_no_registrado() {
		this.getLayoutseccionesexplorarseccionesusuarionoregistrado().as(VerticalLayout.class).add(_secciones_Usuario_no_registrado);
	}
}