package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import base_de_datos.BDPrincipal;
import base_de_datos.iEditor;

public class Pagina_noticia_Editor extends Pagina_noticia_Identificado {
	
//	private event _comentar;
	iEditor ieditor = new BDPrincipal();
	public Listado_noticias_portada_Editor_item _listado_noticias_portada_Editor;
	public Listado_noticias_busqueda_Editor_item _listado_noticias_busqueda_Editor;
	public Noticias_en_seccion_Editor_item _noticias_en_seccion_Editor;
	public Seccion_comentarios_Editor _seccion_comentarios_Editor;

	public Pagina_noticia_Editor(Listado_noticias_portada_Editor_item _listado_noticias_portada_Editor, basededatos.Noticia noticia) {
		super(_listado_noticias_portada_Editor, noticia);
		this.getLayouteliminarpaginanoticia().setVisible(true);
		this._listado_noticias_portada_Editor = _listado_noticias_portada_Editor;
		this._seccion_comentarios_Editor = new Seccion_comentarios_Editor(this);
		Seccion_comentarios_Editor();
		this.getButtoneliminarpaginanoticia().addClickListener(event -> Eliminar_noticia_publicada());
	}
	
	public Pagina_noticia_Editor(Listado_noticias_busqueda_Editor_item _listado_noticias_busqueda_Editor, basededatos.Noticia noticia) {
		super(_listado_noticias_busqueda_Editor, noticia);
		this.getLayouteliminarpaginanoticia().setVisible(true);
		this._listado_noticias_busqueda_Editor = _listado_noticias_busqueda_Editor;
		this._seccion_comentarios_Editor = new Seccion_comentarios_Editor(this);
		Seccion_comentarios_Editor();
		this.getButtoneliminarpaginanoticia().addClickListener(event -> Eliminar_noticia_publicada());
	}
	
	public Pagina_noticia_Editor(Noticias_en_seccion_Editor_item _noticias_en_seccion_Editor, basededatos.Noticia noticia) {
		super(_noticias_en_seccion_Editor, noticia);
		this.getLayouteliminarpaginanoticia().setVisible(true);
		this._noticias_en_seccion_Editor = _noticias_en_seccion_Editor;
		this._seccion_comentarios_Editor = new Seccion_comentarios_Editor(this);
		Seccion_comentarios_Editor();
		this.getButtoneliminarpaginanoticia().addClickListener(event -> Eliminar_noticia_publicada());
	}
	
	public void Seccion_comentarios_Editor() {
		this.getLayoutseccioncomentariospaginanoticia().as(VerticalLayout.class).removeAll();
		this.getLayoutseccioncomentariospaginanoticia().as(VerticalLayout.class).add(_seccion_comentarios_Editor);
	}
	
	public void Eliminar_noticia_publicada() {
		int id_noticia = this.noticia.getId_noticia();
		int id_editor = this.identificado.getId();
		try {
			this.ieditor.Eliminar_noticia(id_noticia, id_editor);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		// Refrescar pagina
		if (this._listado_noticias_portada_Editor != null) {
			((Listado_noticias_portada_Editor) this._listado_noticias_portada_Editor._listado_noticias_portada_Identificado)._editor.mainview._editor = new Editor(((Listado_noticias_portada_Editor) this._listado_noticias_portada_Editor._listado_noticias_portada_Identificado)._editor.mainview, (basededatos.Editor) ((Listado_noticias_portada_Editor) this._listado_noticias_portada_Editor._listado_noticias_portada_Identificado)._editor.identificado);
			((Listado_noticias_portada_Editor) this._listado_noticias_portada_Editor._listado_noticias_portada_Identificado)._editor.mainview.removeAll();
			((Listado_noticias_portada_Editor) this._listado_noticias_portada_Editor._listado_noticias_portada_Identificado)._editor.mainview.add(((Listado_noticias_portada_Editor) this._listado_noticias_portada_Editor._listado_noticias_portada_Identificado)._editor.mainview._editor);
		} else if (this._listado_noticias_busqueda_Identificado != null) {
			((Listado_noticias_busqueda_Editor) this._listado_noticias_busqueda_Identificado._listado_noticias_busqueda_Identificado)._editor.mainview._editor = new Editor(((Listado_noticias_busqueda_Editor) this._listado_noticias_busqueda_Identificado._listado_noticias_busqueda_Identificado)._editor.mainview, (basededatos.Editor) ((Listado_noticias_busqueda_Editor) this._listado_noticias_busqueda_Identificado._listado_noticias_busqueda_Identificado)._editor.identificado);
			((Listado_noticias_busqueda_Editor) this._listado_noticias_busqueda_Identificado._listado_noticias_busqueda_Identificado)._editor.mainview.removeAll();
			((Listado_noticias_busqueda_Editor) this._listado_noticias_busqueda_Identificado._listado_noticias_busqueda_Identificado)._editor.mainview.add(((Listado_noticias_busqueda_Editor) this._listado_noticias_busqueda_Identificado._listado_noticias_busqueda_Identificado)._editor.mainview._editor);
		} else if (this._noticias_en_seccion_Identificado != null) {
			((Noticias_en_seccion_Identificado) this._noticias_en_seccion_Editor._noticias_en_seccion_Identificado)._explorar_secciones_Identificado._identificado.mainview._editor = new Editor(((Noticias_en_seccion_Identificado) this._noticias_en_seccion_Editor._noticias_en_seccion_Identificado)._explorar_secciones_Identificado._identificado.mainview, (basededatos.Editor) ((Noticias_en_seccion_Identificado) this._noticias_en_seccion_Editor._noticias_en_seccion_Identificado)._explorar_secciones_Identificado._identificado.identificado);
			((Noticias_en_seccion_Identificado) this._noticias_en_seccion_Editor._noticias_en_seccion_Identificado)._explorar_secciones_Identificado._identificado.mainview.removeAll();
			((Noticias_en_seccion_Identificado) this._noticias_en_seccion_Editor._noticias_en_seccion_Identificado)._explorar_secciones_Identificado._identificado.mainview.add(((Noticias_en_seccion_Identificado) this._noticias_en_seccion_Editor._noticias_en_seccion_Identificado)._explorar_secciones_Identificado._identificado.mainview._editor);
		}
	}
}