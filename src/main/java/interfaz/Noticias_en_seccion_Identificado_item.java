package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNoticiasenseccionidentificado_item;

public class Noticias_en_seccion_Identificado_item extends VistaNoticiasenseccionidentificado_item {
	
//	private Label _titulo;
//	private Label _autor;
//	private Label _fecha;
//	private Label _resumen;
//	private Image _imagen_noticia;
//	private Label _lugar;
	public Noticias_en_seccion_Identificado _noticias_en_seccion_Identificado;
	public Pagina_noticia_Identificado _pagina_noticia_Identificado;
	basededatos.Noticia noticia;
	
	public Noticias_en_seccion_Identificado_item(Noticias_en_seccion_Identificado _noticias_en_seccion_Identificado,
			basededatos.Noticia noticia) {
		super();
		this._noticias_en_seccion_Identificado = _noticias_en_seccion_Identificado;
		this.getTitulonoticiasenseccionidentificado().addClickListener(event->Pagina_noticia_Identificado());
		this.noticia = noticia;
		this.getTitulonoticiasenseccionidentificado().setText(noticia.getTitulo());;
		this.getImagennoticiasenseccionidentificado().setSrc(noticia.getUrl_imagen_noticia());
		this.getFechanoticiasenseccionidentificado().setText(noticia.getFecha());
		this.getAutornoticiasenseccionidentificado().setText(noticia.getCrea().getNombre() + " " + noticia.getCrea().getApellidos());
		this.getLugarnoticiasenseccionidentificado().setText(noticia.getLugar());
		this.getContenidonoticiasenseccionidentificado().setValue(noticia.getResumen());;
	}
	
	public void Pagina_noticia_Identificado() {
		this._noticias_en_seccion_Identificado._explorar_secciones_Identificado._identificado.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		this._pagina_noticia_Identificado = new Pagina_noticia_Identificado(this, noticia);
		this._noticias_en_seccion_Identificado._explorar_secciones_Identificado._identificado.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_pagina_noticia_Identificado);
	}
}