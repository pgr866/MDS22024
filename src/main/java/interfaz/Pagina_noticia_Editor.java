package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import base_de_datos.BDPrincipal;
import base_de_datos.iEditor;

public class Pagina_noticia_Editor extends Pagina_noticia_Identificado {
	
//	private event _comentar;
	iEditor ieditor = new BDPrincipal();
	public Listado_noticias_portada_Editor_item _listado_noticias_portada_Editor;
	public Listado_noticias_busqueda_Editor_item _listado_noticias_busqueda_Editor_item;
	public Noticias_en_seccion_Editor_item _noticias_en_seccion_Editor_item;
	public Seccion_comentarios_Editor _seccion_comentarios_Editor;

	public Pagina_noticia_Editor(Listado_noticias_portada_Editor_item _listado_noticias_portada_Editor, basededatos.Noticia noticia) {
		super(_listado_noticias_portada_Editor, noticia);
		this._listado_noticias_portada_Editor = _listado_noticias_portada_Editor;
		this._seccion_comentarios_Editor = new Seccion_comentarios_Editor(this);
		Seccion_comentarios_Editor();
	}
	
	public Pagina_noticia_Editor(Listado_noticias_busqueda_Editor_item _listado_noticias_busqueda_Editor_item, basededatos.Noticia noticia) {
		super(_listado_noticias_busqueda_Editor_item, noticia);
		this._listado_noticias_busqueda_Editor_item = _listado_noticias_busqueda_Editor_item;
		this._seccion_comentarios_Editor = new Seccion_comentarios_Editor(this);
		Seccion_comentarios_Editor();
	}
	
	public Pagina_noticia_Editor(Noticias_en_seccion_Editor_item _noticias_en_seccion_Editor_item, basededatos.Noticia noticia) {
		super(_noticias_en_seccion_Editor_item, noticia);
		this._noticias_en_seccion_Editor_item = _noticias_en_seccion_Editor_item;
		this._seccion_comentarios_Editor = new Seccion_comentarios_Editor(this);
		Seccion_comentarios_Editor();
	}
	
	public void Seccion_comentarios_Editor() {
		this.getLayoutseccioncomentariospaginanoticia().as(VerticalLayout.class).removeAll();
		this.getLayoutseccioncomentariospaginanoticia().as(VerticalLayout.class).add(_seccion_comentarios_Editor);
	}
	
	public void Eliminar_noticia_publicada() {
		int id_noticia = this.noticia.getId_noticia();
		int id_editor = this.identificado.getId();
		this.ieditor.Eliminar_noticia(id_noticia, id_editor);
		if (this._listado_noticias_portada_Editor != null) // Refrescar pagina
			((Listado_noticias_portada_Editor) this._listado_noticias_portada_Editor._listado_noticias_portada_Identificado)._editor.Listado_noticias_portada_Editor();
		else if (this._listado_noticias_busqueda_Identificado != null)
			((Listado_noticias_busqueda_Editor) this._listado_noticias_busqueda_Identificado._listado_noticias_busqueda_Identificado)._editor.Listado_noticias_busqueda_Editor();
		else if (this._noticias_en_seccion_Identificado != null)
			((Noticias_en_seccion_Editor) this._noticias_en_seccion_Editor_item._noticias_en_seccion_Identificado)._explorar_secciones_Editor._editor.Listado_noticias_busqueda_Editor();
	}
}