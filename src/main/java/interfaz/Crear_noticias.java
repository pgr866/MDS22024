package interfaz;

import base_de_datos.BDPrincipal;
import base_de_datos.iPeriodista;

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
	iPeriodista iperiodista = new BDPrincipal();
	public Periodista _periodista;
	
	public Crear_noticias(Periodista _periodista) {
		super();
		this._periodista = _periodista;
	}

	public void Crear_noticia() {
		String titulo = this.getTextfieldtitulocrearnoticias().getValue();
		String url_imagen_noticia = this.getTextfieldurlimagenescrearnoticias().getValue();
		String contenido = this.getTextareacontenidocrearnoticias().getValue();
		String fecha = this.getTextfieldfechacrearnoticias().getValue();
		String lugar = this.getTextfiedlugarcrearnoticias().getValue();
		String tematicas = this.getTextfieldtematicacrearnoticias().getValue().toLowerCase();
		int id_periodista = this._periodista.identificado.getId(); 
		iperiodista.Crear_noticia(titulo, url_imagen_noticia, contenido, fecha, lugar, tematicas, id_periodista);
		this._periodista.Crear_noticias(); // Refrescar pagina
	}
}