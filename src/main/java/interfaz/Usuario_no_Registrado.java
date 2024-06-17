package interfaz;

import vistas.VistaUsuarionoregistrado;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.MainView;

//import basededatos.iUsuario_no_Registrado;

public class Usuario_no_Registrado extends VistaUsuarionoregistrado {
	
//	public iUsuario_no_Registrado _iUsuario_no_Registrado;
	public Iniciar_Sesion _iniciar_Sesion;
	public Listado_noticias_portada_Usuario_no_registrado _listado_noticias_portada_Usuario_no_registrado;
	public Explorar_secciones_Usuario_no_registrado _explorar_secciones_Usuario_no_registrado;
	public Mostrar_publicidad _mostrar_publicidad;
	public Listado_noticias_busqueda_Usuario_no_registrado _listado_noticias_busqueda_Usuario_no_registrado;
	
	public MainView mainview;
	
	public Usuario_no_Registrado(MainView mainview) {
		this.mainview = mainview;
		this._listado_noticias_portada_Usuario_no_registrado = new Listado_noticias_portada_Usuario_no_registrado(this);
		this._mostrar_publicidad = new Mostrar_publicidad(this);
		this._listado_noticias_busqueda_Usuario_no_registrado = new Listado_noticias_busqueda_Usuario_no_registrado(this);
		Listado_noticias_portada_Usuario_no_registrado();
		Mostrar_publicidad();
		Listado_noticias_busqueda_Usuario_no_registrado();
		this.getIniciarsesion().addClickListener(event->Iniciar_Sesion());
		this.getLogonoregistrado().addClickListener(event->{
			this._listado_noticias_portada_Usuario_no_registrado = new Listado_noticias_portada_Usuario_no_registrado(this);
			this.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).removeAll();
			Listado_noticias_portada_Usuario_no_registrado();
		});
		this.getExplorarseccionesnoregistrado().addClickListener(event->Explorar_secciones_Usuario_no_registrado());
	}

	public void Iniciar_Sesion() {
		this.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).removeAll();
		_iniciar_Sesion = new Iniciar_Sesion(this);
		this.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).add(_iniciar_Sesion);
	}

	public void Listado_noticias_portada_Usuario_no_registrado() {
		this.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).add(_listado_noticias_portada_Usuario_no_registrado);
	}

	public void Explorar_secciones_Usuario_no_registrado() {
		this.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).removeAll();
		_explorar_secciones_Usuario_no_registrado = new Explorar_secciones_Usuario_no_registrado(this);
		this.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).add(_explorar_secciones_Usuario_no_registrado);
	}

	public void Mostrar_publicidad() {
		this.getLayoutanuncioizquierdausuarionoregistrado().as(VerticalLayout.class).add(_mostrar_publicidad);
		Mostrar_publicidad _mostrar_publicidad2 = new Mostrar_publicidad(this);
		this.getLayoutanuncioderechausuarionoregistrado().as(VerticalLayout.class).add(_mostrar_publicidad2);
	}

	public void Listado_noticias_busqueda_Usuario_no_registrado() {
		this.getBarrabusquedanoregistrado().add(_listado_noticias_busqueda_Usuario_no_registrado);
	}
}