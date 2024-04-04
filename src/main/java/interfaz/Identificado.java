package interfaz;

import vistas.VistaIdentificado;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.MainView;

//import basededatos.iIdentificado;

public class Identificado extends VistaIdentificado {
//	public iIdentificado _iIdentificado;
	public Listado_noticias_portada_Identificado _listado_noticias_portada_Identificado;
	public Buscar_Identificado _buscar_Identificado;
	public Explorar_secciones_Identificado _explorar_secciones_Identificado;
	public Log_out _log_out;
	public Configurar_perfil _configurar_perfil;
	
	public MainView mainview;
	public Identificado(MainView mainview) {
		this.mainview = mainview;
		_log_out = new Log_out(this);
		Log_out();
	}

	public void Listado_noticias_portada_Identificado() {
		throw new UnsupportedOperationException();
	}

	public void Buscar_Identificado() {
		throw new UnsupportedOperationException();
	}

	public void Explorar_secciones_Identificado() {
		throw new UnsupportedOperationException();
	}

	public void Log_out() {
		this.getOpcionescuentaidentificado().as(VerticalLayout.class).add(_log_out);
	}

	public void Configurar_perfil() {
		throw new UnsupportedOperationException();
	}
}