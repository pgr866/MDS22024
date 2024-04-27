package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Pagina_noticia_Editor extends Pagina_noticia_Identificado {
//	private event _comentar;
	public Listado_noticias_portada_Editor_item _listado_noticias_portada_Editor;
	public Seccion_comentarios_Editor _seccion_comentarios_Editor;

	public Pagina_noticia_Editor(Listado_noticias_portada_Editor_item _listado_noticias_portada_Editor, basededatos.Noticia noticia) {
		super(_listado_noticias_portada_Editor, noticia);
		this._listado_noticias_portada_Editor = _listado_noticias_portada_Editor;
		this._seccion_comentarios_Editor = new Seccion_comentarios_Editor(this);
		Seccion_comentarios_Editor();
	}
	
	public void Seccion_comentarios_Editor() {
		this.getLayoutseccioncomentariospaginanoticia().as(VerticalLayout.class).remove(this._seccion_comentarios_Identificado);
		this.getLayoutseccioncomentariospaginanoticia().as(VerticalLayout.class).add(_seccion_comentarios_Editor);
	}
}