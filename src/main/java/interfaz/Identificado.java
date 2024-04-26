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
	basededatos.Identificado identificado;
	
	public MainView mainview;
	public Identificado(MainView mainview, basededatos.Identificado identificado) {
		this.mainview = mainview;
		this._listado_noticias_portada_Identificado = new Listado_noticias_portada_Identificado(this);
		this._buscar_Identificado = new Buscar_Identificado(this);
		this._log_out = new Log_out(this);
		Listado_noticias_portada_Identificado();
		Buscar_Identificado();
		Log_out();
		this.getExplorarseccionesidentificado().addClickListener(event->Explorar_secciones_Identificado());
		this.getConfigurarperfilidentificado().addClickListener(event->Configurar_perfil());
		this._log_out.getButtonlogout().addClickListener(event->
		{
			this.mainview.removeAll();
			this.mainview.add(this.mainview._usuario_no_registrado);
		});
		this.identificado = identificado;
	}

	public void Listado_noticias_portada_Identificado() {
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_listado_noticias_portada_Identificado);
	}

	public void Buscar_Identificado() {
		this.getLayoutvistabuscaridentificado().add(_buscar_Identificado);
	}

	public void Explorar_secciones_Identificado() {
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		_explorar_secciones_Identificado = new Explorar_secciones_Identificado(this);
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_explorar_secciones_Identificado);
	}

	public void Log_out() {
		this.getOpcionescuentaidentificado().as(VerticalLayout.class).add(_log_out);
	}

	public void Configurar_perfil() {
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		_configurar_perfil = new Configurar_perfil(this, identificado);
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_configurar_perfil);
	}
}