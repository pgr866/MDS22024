package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Buscar_Usuario_no_registrado extends vistas.VistaBuscarusuarionoregistrado {

	public Usuario_no_Registrado _usuario_no_Registrado;
	public Listado_noticias_busqueda_Usuario_no_registrado _listado_noticias_busqueda_Usuario_no_registrado;

	public Buscar_Usuario_no_registrado(Usuario_no_Registrado _usuario_no_Registrado) {
		super();
		this._usuario_no_Registrado = _usuario_no_Registrado;
		this._listado_noticias_busqueda_Usuario_no_registrado = new Listado_noticias_busqueda_Usuario_no_registrado(this);
		Listado_noticias_busqueda_Usuario_no_registrado();
	}
	
	public void Listado_noticias_busqueda_Usuario_no_registrado() {
		this.getLayoutvistasbuscarusuarionoregistrado().as(VerticalLayout.class).add(_listado_noticias_busqueda_Usuario_no_registrado);
	}
}