package interfaz;

import vistas.VistaListadonoticiasordenarportada_item;

public class Listado_noticias_ordenar_portada_item extends VistaListadonoticiasordenarportada_item {
	
	public Listado_noticias_ordenar_portada _listado_noticias_ordenar_portada;
	basededatos.Noticia noticia;

	public Listado_noticias_ordenar_portada_item(
			Listado_noticias_ordenar_portada _listado_noticias_ordenar_portada,
			basededatos.Noticia noticia) {
		super();
		this._listado_noticias_ordenar_portada = _listado_noticias_ordenar_portada;
	}
}