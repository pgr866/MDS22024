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
	
	public Revisar_noticias(Noticias_a_revisar_item _noticias_a_revisar) {
		super();
		this._noticias_a_revisar = _noticias_a_revisar;
		this.getTextfieldtitulonoticiarevisarnoticias().setValue(_noticias_a_revisar.getLayouttituloitemnoticiasarevisar().getText());
		this.getTextfieldurlimagenesrevisarnoticias().setValue(_noticias_a_revisar.getLayouturlitemnoticiasarevisar().getText());
		this.getTextareacontenidonoticiarevisarnoticias().setValue(_noticias_a_revisar.getLayoutcontenidoitemnoticiasarevisar().getText());
		this.getTextfieldfecharevisarnoticias().setValue(_noticias_a_revisar.getLayoutfechaitemnoticiasarevisar().getText());
		this.getTextfieldlugarrevisarnoticias().setValue(_noticias_a_revisar.getLayoutlugaritemnoticiasarevisar().getText());
		this.getTextfieldtematicarevisarnoticias().setValue(_noticias_a_revisar.getLayouttematicaitemnoticiasarevisar().getText());
		this.getEliminarrevisarnoticia().addClickListener(event->Eliminar_noticia());
		this.getPublicarrevisarnoticia().addClickListener(event->Publicar_noticia());
	}

	public void Eliminar_noticia() {
		String titulo = this.getTextfieldtitulonoticiarevisarnoticias().getValue();
		// eliminar noticia a revisar BD
		this._noticias_a_revisar._noticias_a_revisar.getListboxnoticiasarevisar().as(MultiSelectListBox.class).remove(this._noticias_a_revisar);
		this._noticias_a_revisar._noticias_a_revisar._item.remove(this._noticias_a_revisar);
		this._noticias_a_revisar._noticias_a_revisar._editor.Listado_noticias_portada_Editor(); // Refrescar pagina
	}

	public void Publicar_noticia() {
		// añadir a todas las listas de noticias...
	}

	public void Realizar_resumen() {
		// borrar
	}

	public void Asignar_noticia_en_seccion() {
		// borrar
	}
}