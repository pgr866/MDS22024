package interfaz;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNoticiasenseccionusuarionoregistrado_item;

public class Noticias_en_seccion_Usuario_no_registrado_item extends VistaNoticiasenseccionusuarionoregistrado_item {
	
//	private Label _titulo;
//	private Label _autor;
//	private Label _fecha;
//	private Label _hora;
//	private Label _resumen;
//	private Image _imagen_noticia;
	public Noticias_en_seccion_Usuario_no_registrado _noticias_en_seccion_Usuario_no_registrado;
	public Pagina_noticia_Usuario_no_registrado _pagina_noticia_Usuario_no_registrado;
	basededatos.Noticia noticia;

	public Noticias_en_seccion_Usuario_no_registrado_item(
			Noticias_en_seccion_Usuario_no_registrado _noticias_en_seccion_Usuario_no_registrado,
			basededatos.Noticia noticia) {
		super();
		this._noticias_en_seccion_Usuario_no_registrado = _noticias_en_seccion_Usuario_no_registrado;
		this.getTitulonoticiasenseccionusuarionoregistrado().addClickListener(event->Pagina_noticia_Usuario_no_registrado());
		this.noticia = noticia;
		this.getTitulonoticiasenseccionusuarionoregistrado().setText(noticia.getTitulo());
		
		Image foto = new Image(noticia.getUrl_imagen_noticia(), "fotonoticiaseccion");
		foto.setWidth("380px");
		foto.setHeight("250px");
		this.getLayoutimagennoticiasenseccionusuarionoregistrado().removeAll();
		this.getLayoutimagennoticiasenseccionusuarionoregistrado().add(foto);
		
		this.getFechanoticiasenseccionusuarionoregistrado().setText(noticia.getFecha());
		this.getAutornoticiasenseccionusuarionoregistrado().setText(noticia.getCrea().getNombre() + " " + noticia.getCrea().getApellidos());
		this.getLugarnoticiasenseccionusuarionoregistrado().setText(noticia.getLugar());
	}

	public void Pagina_noticia_Usuario_no_registrado() {
		this._noticias_en_seccion_Usuario_no_registrado._explorar_secciones_Usuario_no_registrado._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).removeAll();
		this._pagina_noticia_Usuario_no_registrado = new Pagina_noticia_Usuario_no_registrado(this, noticia);
		this._noticias_en_seccion_Usuario_no_registrado._explorar_secciones_Usuario_no_registrado._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).add(_pagina_noticia_Usuario_no_registrado);
	}
}