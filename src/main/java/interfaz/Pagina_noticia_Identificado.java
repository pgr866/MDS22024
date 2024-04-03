package interfaz;

public class Pagina_noticia_Identificado extends Pagina_Noticia {

	//	private event _valorar_noticia;
	public Listado_noticias_portada_Identificado_item _listado_noticias_portada_Identificado;
	public Listado_noticias_busqueda_Identificado_item _listado_noticias_busqueda_Identificado;
	public Mostrar_noticia_extendida _mostrar_noticia_extendida;
	public Seccion_comentarios_Identificado _seccion_comentarios_Identificado;

	public Pagina_noticia_Identificado(interfaz.Mostrar_valoracion_noticia _mostrar_valoracion_noticia,
			Listado_noticias_portada_Identificado_item _listado_noticias_portada_Identificado,
			Listado_noticias_busqueda_Identificado_item _listado_noticias_busqueda_Identificado,
			interfaz.Mostrar_noticia_extendida _mostrar_noticia_extendida,
			interfaz.Seccion_comentarios_Identificado _seccion_comentarios_Identificado) {
		super(_mostrar_valoracion_noticia);
		this._listado_noticias_portada_Identificado = _listado_noticias_portada_Identificado;
		this._listado_noticias_busqueda_Identificado = _listado_noticias_busqueda_Identificado;
		this._mostrar_noticia_extendida = _mostrar_noticia_extendida;
		this._seccion_comentarios_Identificado = _seccion_comentarios_Identificado;
	}
	
	public void Valorar_noticia() {
		throw new UnsupportedOperationException();
	}

	public void Mostrar_noticia_extendida() {
		throw new UnsupportedOperationException();
	}

	public void Seccion_comentarios_Identificado() {
		throw new UnsupportedOperationException();
	}
}