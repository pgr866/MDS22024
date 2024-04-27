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
		this._mostrar_valoracion_noticia = new Mostrar_valoracion_noticia(this, this.noticia);
		Mostrar_valoracion_noticia();
	    this.getLabeltitulonoticiapaginanoticia().setText(noticia.getTitulo());
		basededatos.Tematica tematica = new basededatos.Tematica();
	    this.getLabeltitulotematicapaginanoticia().setText(tematica.getTitulo_tematica());
	    this.getImagennoticiapaginanoticia().setSrc(noticia.getUrl_imagen_noticia());
	    this.getLayoutfechapaginanoticia().setText(noticia.getFecha());
	    basededatos.Periodista periodista = new basededatos.Periodista();
	    this.getLayoutautorpaginanoticia().setText(periodista.getNombre() + " " + periodista.getApellidos());
	    this.getLayoutlugarpaginanoticia().setText(noticia.getLugar());
	}

	public void Mostrar_valoracion_noticia() {
		this.getMostrarvaloracionnoticiapaginanoticia().add(_mostrar_valoracion_noticia);
	}
}