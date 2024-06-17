package interfaz;

import vistas.VistaIdentificado;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.MainView;

//import basededatos.iIdentificado;

public class Identificado extends VistaIdentificado {

//	public iIdentificado _iIdentificado;
	public Listado_noticias_portada_Identificado _listado_noticias_portada_Identificado;
	public Listado_noticias_busqueda_Identificado _listado_noticias_busqueda_Identificado;
	public Explorar_secciones_Identificado _explorar_secciones_Identificado;
	public Log_out _log_out;
	public Configurar_perfil _configurar_perfil;
	basededatos.Identificado identificado;

	public MainView mainview;

	public Identificado(MainView mainview, basededatos.Identificado identificado) {
		this.mainview = mainview;
		this.getLayoutbuscareditor().setVisible(false);
		this._listado_noticias_portada_Identificado = new Listado_noticias_portada_Identificado(this);
		this._listado_noticias_busqueda_Identificado = new Listado_noticias_busqueda_Identificado(this);
		this._log_out = new Log_out(this);
		Listado_noticias_portada_Identificado();
		Listado_noticias_busqueda_Identificado();
		Log_out();
		this.identificado = identificado;
		
		Image foto = new Image(identificado.getUrl_foto_perfil(), "fotoconfigurarperfil");
		foto.setWidth("50px");
		foto.setHeight("50px");
		this.getConfigurarperfilidentificado().getElement().removeAllChildren();
		this.getConfigurarperfilidentificado().getElement().appendChild(foto.getElement());
		
		this.getExplorarseccionesidentificado().addClickListener(event -> Explorar_secciones_Identificado());
		this.getConfigurarperfilidentificado().addClickListener(event -> Configurar_perfil());
		this.getButtonlogoidentificado().addClickListener(event -> {
			this._listado_noticias_portada_Identificado = new Listado_noticias_portada_Identificado(this);
			Listado_noticias_portada_Identificado();
		});
	}

	public void Listado_noticias_portada_Identificado() {
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class)
				.add(_listado_noticias_portada_Identificado);
	}

	public void Listado_noticias_busqueda_Identificado() {
		this.getLayoutvistabuscaridentificado().removeAll();
		this.getLayoutvistabuscaridentificado().add(_listado_noticias_busqueda_Identificado);
	}

	public void Explorar_secciones_Identificado() {
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		_explorar_secciones_Identificado = new Explorar_secciones_Identificado(this);
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_explorar_secciones_Identificado);
	}

	public void Log_out() {
		this.getLogoutopcionescuentaidentificado().as(VerticalLayout.class).add(_log_out);
	}

	public void Configurar_perfil() {
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		_configurar_perfil = new Configurar_perfil(this, identificado);
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_configurar_perfil);
	}
}