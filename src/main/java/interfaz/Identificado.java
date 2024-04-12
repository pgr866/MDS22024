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
		this._log_out.getButtonlogout().addClickListener(event->{
			mainview.remove(this);
			mainview.add(mainview._usuario_no_registrado);
		});
		this.getExplorarseccionesidentificado().addClickListener(event->Explorar_secciones_Identificado());
		this.getConfigurarperfilidentificado().addClickListener(event->Configurar_perfil());
		this._log_out.getButtonlogout().addClickListener(event->
		{
			this.mainview.remove(this);
			this.mainview.add(mainview._usuario_no_registrado);
		});
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
		_configurar_perfil = new Configurar_perfil(this);
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_configurar_perfil);
	}
}