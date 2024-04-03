package interfaz;

public class Buscar_Identificado extends Buscar {

	public Identificado _identificado;
	public Listado_noticias_busqueda_Identificado _listado_noticias_busqueda_Identificado;

	public Buscar_Identificado(Identificado _identificado,
			interfaz.Listado_noticias_busqueda_Identificado _listado_noticias_busqueda_Identificado) {
		super();
		this._identificado = _identificado;
		this._listado_noticias_busqueda_Identificado = _listado_noticias_busqueda_Identificado;
		this.getBusquedanoticiasusuarionoregistrado().setVisible(false);
	}
	
	public void Listado_noticias_busqueda_Identificado() {
		throw new UnsupportedOperationException();
	}
}