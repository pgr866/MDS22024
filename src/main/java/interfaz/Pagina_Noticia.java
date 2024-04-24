package interfaz;

import org.orm.PersistentException;

public class Pagina_Noticia extends vistas.VistaPaginanoticia {
//	private Label _titulo;
//	private Label _autor;
//	private Label _fecha;
//	private Label _hora;
//	private Label _resumen;
//	private Image _imagen_noticia;
//	private label _hashtags;
	public Mostrar_valoracion_noticia _mostrar_valoracion_noticia;
	basededatos.Noticia noticia;

	public Pagina_Noticia(basededatos.Noticia noticia) {
		super();
		this._mostrar_valoracion_noticia = new Mostrar_valoracion_noticia(this);
		Mostrar_valoracion_noticia();
		
		this.noticia = noticia;
	   
	    String nombre_autor;
	    try {
	    	nombre_autor = basededatos.Periodista.getPeriodistaByORMID(noticia.getAutor()).getNombre(); 
		} catch (PersistentException e) {
			nombre_autor = "Desconocido";
		}
	    
	    this.getLabeltitulonoticiapaginanoticia().setText(noticia.getTitulo());
	    //this.getLabeltitulotematicapaginanoticia().setText(noticia.getTematica());
	    this.getImagennoticiapaginanoticia().setSrc(noticia.getUrl_imagen_noticia());
	    this.getLayoutfechapaginanoticia().setText(noticia.getFecha());
	    this.getLayoutautorpaginanoticia().setText(nombre_autor);
	    this.getLayoutlugarpaginanoticia().setText(noticia.getLugar());
	}

	public void Mostrar_valoracion_noticia() {
		this.getMostrarvaloracionnoticiapaginanoticia().add(_mostrar_valoracion_noticia);
	}
}