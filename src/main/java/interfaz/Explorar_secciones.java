package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Explorar_secciones extends vistas.VistaExplorarsecciones {

//	private Label _nombre_seccion;
//	private ComboBox _seleccionar_seccion;
//	private Button _pagina_seccion;
	public Secciones _secciones;
	
	public Explorar_secciones() {
		super();
		this._secciones = new Secciones(this);
		Secciones();
	}

	public void Secciones() {
		this.getLayoutseccionesexplorarsecciones().as(VerticalLayout.class).add(_secciones);
	}
}