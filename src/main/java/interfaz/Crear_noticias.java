package interfaz;

import java.util.ArrayList;

import com.vaadin.flow.component.listbox.MultiSelectListBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Crear_noticias extends vistas.VistaCrearnoticias {

//	private event _asignar_tematicas;
//	private event _crear_noticia;
//	private event _rellenar_noticia;
//	private Label _titulo_noticia;
//	private TextArea _introducir_titulo_noticia;
//	private Label _url_imagenes;
//	private TextArea _introducir_url_imagenes;
//	private Label _contenido;
//	private TextArea _introducir_contenido;
//	private Label _fecha;
//	private TextArea _introducir_fecha;
//	private Label _lugar;
//	private TextArea _introducir_lugar;
	public Periodista _periodista;
	
	public Crear_noticias(Periodista _periodista) {
		super();
		this._periodista = _periodista;
	}

	public void Asignar_tematicas() {
//		borrar
	}

	public void Crear_noticia() {
		String titulo = this.getTextfieldtitulocrearnoticias().getValue();
		String url = this.getTextfieldurlimagenescrearnoticias().getValue();
		String contenido = this.getTextareacontenidocrearnoticias().getValue();
		String fecha = this.getTextfieldfechacrearnoticias().getValue();
		String lugar = this.getTextfiedlugarcrearnoticias().getValue();
		String tematica = this.getTextfieldtematicacrearnoticias().getValue();
		// crear noticia a revisar BD
		Noticias_a_revisar_item nueva_noticia = new Noticias_a_revisar_item(this._periodista.mainview._editor._noticias_a_revisar);
		nueva_noticia.getLayouttituloitemnoticiasarevisar().setText(titulo);
		nueva_noticia.getLayouturlitemnoticiasarevisar().setText(url);
		nueva_noticia.getLayoutcontenidoitemnoticiasarevisar().setText(contenido);
		nueva_noticia.getLayoutfechaitemnoticiasarevisar().setText(fecha);
		nueva_noticia.getLayoutlugaritemnoticiasarevisar().setText(lugar);
		nueva_noticia.getLayouttematicaitemnoticiasarevisar().setText(tematica);
		this._periodista.mainview._editor._noticias_a_revisar._item.add(nueva_noticia);
		this._periodista.mainview._editor._noticias_a_revisar.getListboxnoticiasarevisar().as(MultiSelectListBox.class).add(nueva_noticia);
		this._periodista.Crear_noticias(); // Refrescar pagina
	}

	public void Rellenar_noticia() {
//		borrar
	}
}