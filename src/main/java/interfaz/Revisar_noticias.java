package interfaz;

import com.vaadin.flow.component.listbox.MultiSelectListBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Revisar_noticias extends vistas.VistaRevisarnoticias {
//	private event _eliminar_noticia;
//	private event _publicar_noticia;
//	private event _realizar_resumen;
//	private event _asignar_noticia_en_seccion;
//	private Label _titulo_noticia;
//	private Label _url_imagenes;
//	private Label _contenido;
//	private Label _fecha;
//	private Label _lugar;
//	private TextArea _resumen;
	public Noticias_a_revisar_item _noticias_a_revisar;
	basededatos.Noticia noticia;
	
	public Revisar_noticias(Noticias_a_revisar_item _noticias_a_revisar, basededatos.Noticia noticia) {
		super();
		this._noticias_a_revisar = _noticias_a_revisar;
		this.getTextfieldtitulonoticiarevisarnoticias().setValue(_noticias_a_revisar.getItemnoticiasarevisar().getText());
		
		this.getEliminarrevisarnoticia().addClickListener(event->Eliminar_noticia());
		this.getPublicarrevisarnoticia().addClickListener(event->Publicar_noticia());
		
		this.noticia = noticia;
	    this.getTextfieldtitulonoticiarevisarnoticias().setValue(noticia.getTitulo());
	    this.getTextfieldurlimagenesrevisarnoticias().setValue(noticia.getUrl_imagen_noticia());
	    this.getTextareacontenidonoticiarevisarnoticias().setValue(noticia.getContenido());
	    this.getTextfieldfecharevisarnoticias().setValue(noticia.getFecha());
	    this.getTextfieldfecharevisarnoticias().setValue(noticia.getLugar());
	    // crear 
	}

	public void Eliminar_noticia() {
		String titulo = this.getTextfieldtitulonoticiarevisarnoticias().getValue();
		// eliminar noticia BD
		this._noticias_a_revisar._noticias_a_revisar.getListboxnoticiasarevisar().as(MultiSelectListBox.class).remove(this._noticias_a_revisar);
		this._noticias_a_revisar._noticias_a_revisar._item.remove(this._noticias_a_revisar);
		this._noticias_a_revisar._noticias_a_revisar._editor.Listado_noticias_portada_Editor(); // Refrescar pagina
	}

	public void Publicar_noticia() {
		// crear noticia BD
	}

}