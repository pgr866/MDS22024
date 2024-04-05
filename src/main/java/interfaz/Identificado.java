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
		_buscar_Identificado = new Buscar_Identificado(this);
		_log_out = new Log_out(this);
		Buscar_Identificado();
		Log_out();
	}

	public void Listado_noticias_portada_Identificado() {
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_listado_noticias_portada_Identificado);
	}

	public void Buscar_Identificado() {
		this.getLayoutvistabuscaridentificado().add(_buscar_Identificado);
	}

	public void Explorar_secciones_Identificado() {
		throw new UnsupportedOperationException();
	}

	public void Log_out() {
		this.getOpcionescuentaidentificado().as(VerticalLayout.class).add(_log_out);
//		mainview.remove(this);
//		MainView.add(mainview.usuario_no_registrado);
	}

	public void Configurar_perfil() {
		throw new UnsupportedOperationException();
	}
}