package interfaz;

public class Buscar_Usuario_no_registrado extends Buscar {

	public Usuario_no_Registrado _usuario_no_Registrado;
	public Listado_noticias_busqueda_Usuario_no_registrado _listado_noticias_busqueda_Usuario_no_registrado;

	public Buscar_Usuario_no_registrado(Usuario_no_Registrado _usuario_no_Registrado,
			interfaz.Listado_noticias_busqueda_Usuario_no_registrado _listado_noticias_busqueda_Usuario_no_registrado) {
		super();
		this._usuario_no_Registrado = _usuario_no_Registrado;
		this._listado_noticias_busqueda_Usuario_no_registrado = _listado_noticias_busqueda_Usuario_no_registrado;
		this.getBusquedanoticiasidentificado().setVisible(false);

	}
	
	public void Listado_noticias_busqueda_Usuario_no_registrado() {
		throw new UnsupportedOperationException();
	}
}