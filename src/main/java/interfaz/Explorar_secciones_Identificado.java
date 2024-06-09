package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaExplorarseccionesidentificado;

public class Explorar_secciones_Identificado extends VistaExplorarseccionesidentificado {

	//	private Label _nombre_seccion;
	//	private ComboBox _seleccionar_seccion;
	//	private Button _pagina_seccion;
	public Identificado _identificado;
	public Secciones_Identificado _secciones_Identificado;
	public Noticias_en_seccion_Identificado _noticias_en_seccion_Identificado;

	public Explorar_secciones_Identificado(Identificado _identificado) {
		super();
		this._identificado = _identificado;
		this._secciones_Identificado = new Secciones_Identificado(this);
		Secciones_Identificado();
		this._noticias_en_seccion_Identificado = new Noticias_en_seccion_Identificado(this);
		this.getLayoutnombrebotonesexplorarseccionesidentificado().setVisible(false);
		Noticias_en_seccion_Identificado();
	}
	
	public void Noticias_en_seccion_Identificado() {
		this.getLayoutvistasnoticiasenseccionexplorarseccionesidentificado().removeAll();
		this.getLayoutvistasnoticiasenseccionexplorarseccionesidentificado().add(_noticias_en_seccion_Identificado);
	}
	
	public void Secciones_Identificado() {
		this.getLayoutseccionesexplorarseccionesidentificado().as(VerticalLayout.class).add(_secciones_Identificado);
	}
}