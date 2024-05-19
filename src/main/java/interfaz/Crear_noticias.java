package interfaz;

import org.orm.PersistentException;

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
		basededatos.Noticia nueva_noticia = new basededatos.Noticia();
		nueva_noticia.setTitulo(this.getTextfieldtitulocrearnoticias().getValue());
		nueva_noticia.setUrl_imagen_noticia(this.getTextfieldurlimagenescrearnoticias().getValue());
		nueva_noticia.setContenido(this.getTextareacontenidocrearnoticias().getValue());
		nueva_noticia.setFecha(this.getTextfieldfechacrearnoticias().getValue());
		nueva_noticia.setLugar(this.getTextfiedlugarcrearnoticias().getValue());
		nueva_noticia.setCrea((basededatos.Periodista) this._periodista.identificado);
		nueva_noticia.setPublicada(false);
		nueva_noticia.setValoraciones_positivas(0);
		nueva_noticia.setValoraciones_negativas(0);
		
		String titulo_tematica = this.getTextfieldtematicacrearnoticias().getValue().toLowerCase();
		basededatos.Tematica tematica;
		try {
			basededatos.Tematica[] consulta = basededatos.TematicaDAO.listTematicaByQuery(
					"Titulo_tematica = '" + titulo_tematica + "'", "");
			if (consulta.length > 0) {
				tematica = consulta[0];
			} else {
				tematica = new basededatos.Tematica();
				tematica.setTitulo_tematica(titulo_tematica);
			}
			nueva_noticia.pertenece_a.add(tematica);
			this._periodista.Crear_noticias(); // Refrescar pagina
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}