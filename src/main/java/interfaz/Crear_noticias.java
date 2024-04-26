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

	public void Crear_noticia() {
		String titulo = this.getTextfieldtitulocrearnoticias().getValue();
		String url = this.getTextfieldurlimagenescrearnoticias().getValue();
		String contenido = this.getTextareacontenidocrearnoticias().getValue();
		String fecha = this.getTextfieldfechacrearnoticias().getValue();
		String lugar = this.getTextfiedlugarcrearnoticias().getValue();
		String tematica = this.getTextfieldtematicacrearnoticias().getValue();
		// crear tematica BD si no existe
		// crear tematica_noticia BD
		// crear noticia a revisar BD
		this._periodista.Crear_noticias(); // Refrescar pagina
	}
}