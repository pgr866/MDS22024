package interfaz;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Pagina_Noticia extends vistas.VistaPaginanoticia {
	
//	private Label _titulo;
//	private Label _autor;
//	private Label _fecha;
//	private Label _hora;
//	private Label _resumen;
//	private Image _imagen_noticia;
//	private label _hashtags;
	public Mostrar_valoracion_noticia _mostrar_valoracion_noticia;
	public Seccion_comentarios _seccion_comentarios;
	basededatos.Noticia noticia;

	public Pagina_Noticia(basededatos.Noticia noticia) {
		super();
		this.noticia = noticia;
		this._mostrar_valoracion_noticia = new Mostrar_valoracion_noticia(this, noticia);
		this._seccion_comentarios = new Seccion_comentarios(this);
		if (!(this instanceof Pagina_noticia_Editor)) this.getLayouteliminarpaginanoticia().setVisible(false);
		Mostrar_valoracion_noticia();
		Seccion_comentarios();
	    this.getLabeltitulonoticiapaginanoticia().setText(noticia.getTitulo());
	    String tematicas = "";
	    for (basededatos.Tematica tematica : noticia.pertenece_a.toArray()) {
	    	tematicas += tematica.getTitulo_tematica() + ", ";
	    }
	    this.getLabeltitulotematicapaginanoticia().setText(tematicas.substring(0, tematicas.length() - 2));
	    
	    Image foto = new Image(noticia.getUrl_imagen_noticia(), "imagenpaginanoticia");
		foto.setSizeFull();
		this.getLayoutimagennoticiapaginanoticia().as(VerticalLayout.class).removeAll();
		this.getLayoutimagennoticiapaginanoticia().as(VerticalLayout.class).add(foto);
	    
	    this.getLayoutfechapaginanoticia().setText(noticia.getFecha());
	    this.getLayoutautorpaginanoticia().setText(noticia.getCrea().getNombre() + " " + noticia.getCrea().getApellidos());
	    this.getLayoutlugarpaginanoticia().setText(noticia.getLugar());
	}

	public void Mostrar_valoracion_noticia() {
		this.getMostrarvaloracionnoticiapaginanoticia().add(_mostrar_valoracion_noticia);
	}
	
	public void Seccion_comentarios() {
		this.getLayoutseccioncomentariospaginanoticia().as(VerticalLayout.class).removeAll();
		this.getLayoutseccioncomentariospaginanoticia().as(VerticalLayout.class).add(_seccion_comentarios);
	}
}