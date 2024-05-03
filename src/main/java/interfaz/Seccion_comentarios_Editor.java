package interfaz;

public class Seccion_comentarios_Editor extends Seccion_comentarios_Identificado {
	
	public Pagina_noticia_Editor _pagina_noticia_Editor;
	
	public Seccion_comentarios_Editor(Pagina_noticia_Editor _pagina_noticia_Editor) {
		super(_pagina_noticia_Editor);
		this._pagina_noticia_Editor = _pagina_noticia_Editor;
	}
}