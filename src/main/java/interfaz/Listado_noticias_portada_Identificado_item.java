package interfaz;

public class Listado_noticias_portada_Identificado_item extends Listado_noticias_portada_item {
	public Listado_noticias_portada_Identificado _listado_noticias_portada_Identificado;
	public Pagina_noticia_Identificado _pagina_noticia_Identificado;
			
	public Listado_noticias_portada_Identificado_item(Listado_noticias_portada_Identificado _listado_noticias_portada_Identificado,
			interfaz.Pagina_noticia_Identificado _pagina_noticia_Identificado) {
		super(_listado_noticias_portada_Identificado);
		this._listado_noticias_portada_Identificado = _listado_noticias_portada_Identificado;
		this._pagina_noticia_Identificado = _pagina_noticia_Identificado;
	}

	public void Pagina_noticia_Identificado() {
		throw new UnsupportedOperationException();
	}
}