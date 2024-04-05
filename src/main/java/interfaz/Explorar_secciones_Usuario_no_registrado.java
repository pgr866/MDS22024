package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Explorar_secciones_Usuario_no_registrado extends Explorar_secciones {
	
	//	private Panel _panel_publicidad;
	//	private ImageButton _imagen_publicidad;
	public Usuario_no_Registrado _usuario_no_Registrado;
	public Noticias_en_seccion_Usuario_no_registrado _noticias_en_seccion_Usuario_no_registrado;

	public Explorar_secciones_Usuario_no_registrado(Usuario_no_Registrado _usuario_no_Registrado) {
		super();
		this._usuario_no_Registrado = _usuario_no_Registrado;
		this._noticias_en_seccion_Usuario_no_registrado = new Noticias_en_seccion_Usuario_no_registrado(this);
		this.getLayoutnombrebotonesexplorarsecciones().setVisible(false);
		Noticias_en_seccion_Usuario_no_registrado();
	}
	
	public void Noticias_en_seccion_Usuario_no_registrado() {
		this.getLayoutvistasnoticiasenseccionexplorarsecciones().add(_noticias_en_seccion_Usuario_no_registrado);
	}
}