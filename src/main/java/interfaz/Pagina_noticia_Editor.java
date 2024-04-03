package interfaz;

public class Pagina_noticia_Editor extends Pagina_noticia_Identificado {

	public Listado_noticias_portada_Editor_item _listado_noticias_portada_Editor;
	public Seccion_comentarios_Editor _seccion_comentarios_Editor;

	public Pagina_noticia_Editor(interfaz.Mostrar_valoracion_noticia _mostrar_valoracion_noticia,
			Listado_noticias_portada_Editor_item _listado_noticias_portada_Editor,
			Listado_noticias_busqueda_Identificado_item _listado_noticias_busqueda_Identificado,
			interfaz.Mostrar_noticia_extendida _mostrar_noticia_extendida,
			interfaz.Seccion_comentarios_Editor _seccion_comentarios_Editor) {
		super(_mostrar_valoracion_noticia, _listado_noticias_portada_Editor,
				_listado_noticias_busqueda_Identificado, _mostrar_noticia_extendida, _seccion_comentarios_Editor);
		this._listado_noticias_portada_Editor = _listado_noticias_portada_Editor;
		this._seccion_comentarios_Editor = _seccion_comentarios_Editor;
	}
	
	public void Seccion_comentarios_Editor() {
		throw new UnsupportedOperationException();
	}
}