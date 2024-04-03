package interfaz;

import vistas.VistaListadonoticiasbusquedaidentificado_item;

public class Listado_noticias_busqueda_Identificado_item extends VistaListadonoticiasbusquedaidentificado_item {
	public Listado_noticias_busqueda_Identificado _listado_noticias_busqueda_Identificado;
	public Pagina_noticia_Identificado _pagina_noticia_Identificado;

	public Listado_noticias_busqueda_Identificado_item(
			Listado_noticias_busqueda_Identificado _listado_noticias_busqueda_Identificado,
			Pagina_noticia_Identificado _pagina_noticia_Identificado) {
		super();
		this._listado_noticias_busqueda_Identificado = _listado_noticias_busqueda_Identificado;
		this._pagina_noticia_Identificado = _pagina_noticia_Identificado;
	}

	public void Pagina_noticia_Identificado() {
		throw new UnsupportedOperationException();
	}
}