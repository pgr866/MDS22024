package interfaz;

import vistas.VistaUsuarionoregistrado;
import proyectoMDS.MainView;

//import basededatos.iUsuario_no_Registrado;

public class Usuario_no_Registrado extends VistaUsuarionoregistrado {
//	public iUsuario_no_Registrado _iUsuario_no_Registrado;
	public Iniciar_Sesion _iniciar_Sesion;
	public Listado_noticias_portada_Usuario_no_registrado _listado_noticias_portada_Usuario_no_registrado;
	public Explorar_secciones_Usuario_no_registrado _explorar_secciones_Usuario_no_registrado;
	public Mostrar_publicidad _mostrar_publicidad;
	public Buscar_Usuario_no_registrado _buscar_Usuario_no_registrado;
	
	public MainView mainview;
	public Usuario_no_Registrado(MainView mainview) {
		this.mainview = mainview;
	}

	public void Iniciar_Sesion() {
		throw new UnsupportedOperationException();
	}

	public void Listado_noticias_portada_Usuario_no_registrado() {
		throw new UnsupportedOperationException();
	}

	public void Explorar_secciones_Usuario_no_registrado() {
		throw new UnsupportedOperationException();
	}

	public void Mostrar_publicidad() {
		throw new UnsupportedOperationException();
	}

	public void Buscar_Usuario_no_registrado() {
		throw new UnsupportedOperationException();
	}
}