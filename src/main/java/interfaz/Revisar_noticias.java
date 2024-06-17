package interfaz;

import org.orm.PersistentException;

import base_de_datos.BDPrincipal;
import base_de_datos.iEditor;

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
	iEditor ieditor = new BDPrincipal();
	public Noticias_a_revisar_item _noticias_a_revisar;
	public Secciones_Identificado _secciones_Identificado;
	basededatos.Noticia noticia;
	
	public Revisar_noticias(Noticias_a_revisar_item _noticias_a_revisar, basededatos.Noticia noticia) {
		super();
		this._secciones_Identificado = new Secciones_Identificado(this);
		Secciones();
		this._noticias_a_revisar = _noticias_a_revisar;
		this.getTextfieldtitulonoticiarevisarnoticias().setValue(_noticias_a_revisar.getItemnoticiasarevisar().getText());
		this.getEliminarrevisarnoticia().addClickListener(event->Eliminar_noticia());
		this.getPublicarrevisarnoticia().addClickListener(event->Publicar_noticia());
		this.noticia = noticia;
	    this.getTextfieldtitulonoticiarevisarnoticias().setValue(noticia.getTitulo());
	    this.getTextfieldurlimagenesrevisarnoticias().setValue(noticia.getUrl_imagen_noticia());
	    this.getTextareacontenidonoticiarevisarnoticias().setValue(noticia.getContenido());
	    this.getTextfieldfecharevisarnoticias().setValue(noticia.getFecha());
	    this.getTextfieldlugarrevisarnoticias().setValue(noticia.getLugar());
	    String tematicas = "";
	    for (basededatos.Tematica tematica : noticia.pertenece_a.toArray()) {
	    	tematicas += tematica.getTitulo_tematica() + ", ";
	    }
	    this.getTextfieldtematicarevisarnoticias().setValue(tematicas.substring(0, tematicas.length() - 2));
	    this.getPublicarrevisarnoticia().addClickListener(event -> Publicar_noticia());
	    this.getEliminarrevisarnoticia().addClickListener(event -> Eliminar_noticia());
	}
	
	public void Secciones() {
		this.getLayoutvistaseccionessrevisarnoticias().add(_secciones_Identificado);
	}

	public void Eliminar_noticia() {
		int id_noticia = this.noticia.getId_noticia();
		int id_editor = this._noticias_a_revisar._noticias_a_revisar._editor.identificado.getId();
		try {
			ieditor.Eliminar_noticia(id_noticia, id_editor);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		// Refrescar pagina
		this._noticias_a_revisar._noticias_a_revisar._editor.mainview._editor = new Editor(this._noticias_a_revisar._noticias_a_revisar._editor.mainview, (basededatos.Editor) this._noticias_a_revisar._noticias_a_revisar._editor.identificado);
		this._noticias_a_revisar._noticias_a_revisar._editor.mainview.removeAll();
		this._noticias_a_revisar._noticias_a_revisar._editor.mainview.add(this._noticias_a_revisar._noticias_a_revisar._editor.mainview._editor);
	}

	public void Publicar_noticia() {
		String nombre_seccion = (String) this._secciones_Identificado.getComboboxseccionesidentificado().getValue();
		String resumen = this.getTextfieldresumenrevisarnoticias().getValue();
		int id_noticia = this.noticia.getId_noticia();
		int id_editor = this._noticias_a_revisar._noticias_a_revisar._editor.identificado.getId();
		
		if (nombre_seccion == null || resumen.isBlank()) {
			this.getLabelmensajeerrorrevisarnoticias().setText("Debe rellenar el resumen y la sección");
		} else {
			try {
				ieditor.Publicar_noticia(nombre_seccion, resumen, id_noticia, id_editor);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			// Refrescar pagina
			this._noticias_a_revisar._noticias_a_revisar._editor.mainview._editor = new Editor(this._noticias_a_revisar._noticias_a_revisar._editor.mainview, (basededatos.Editor) this._noticias_a_revisar._noticias_a_revisar._editor.identificado);
			this._noticias_a_revisar._noticias_a_revisar._editor.mainview.removeAll();
			this._noticias_a_revisar._noticias_a_revisar._editor.mainview.add(this._noticias_a_revisar._noticias_a_revisar._editor.mainview._editor);
		}
	}
}