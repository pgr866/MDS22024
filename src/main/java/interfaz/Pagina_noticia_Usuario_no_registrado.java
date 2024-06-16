package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Pagina_noticia_Usuario_no_registrado extends Pagina_Noticia {

//	private Panel _panel_publicidad;
//	private ImageButton _imagen_publicidad;
	public Listado_noticias_portada_Usuario_no_registrado_item _listado_noticias_portada_Usuario_no_registrado;
	public Noticias_en_seccion_Usuario_no_registrado_item _noticias_en_seccion_Usuario_no_registrado;
	public Listado_noticias_busqueda_Usuario_no_registrado_item _listado_noticias_busqueda_Usuario_no_registrado;
	public Seccion_comentarios_Usuario_no_registrado _seccion_comentarios_Usuario_no_registrado;
	public Mostrar_noticia_resumida _mostrar_noticia_resumida;
		
	public Pagina_noticia_Usuario_no_registrado(Listado_noticias_portada_Usuario_no_registrado_item _listado_noticias_portada_Usuario_no_registrado,
				basededatos.Noticia noticia) {
		super(noticia);
		this._listado_noticias_portada_Usuario_no_registrado = _listado_noticias_portada_Usuario_no_registrado;
		this.getLayoutcomentarioseccioncomentarios().setWidth("100%");
		this._mostrar_noticia_resumida = new Mostrar_noticia_resumida(this, noticia);
		this._seccion_comentarios_Usuario_no_registrado = new Seccion_comentarios_Usuario_no_registrado(this);
		Seccion_comentarios_Usuario_no_registrado();
		Mostrar_noticia_resumida();
		this._mostrar_valoracion_noticia.getMegustamostrarvaloracionnoticia().addClickListener(event -> Notification.show("Inicia sesión o Registrate para desbloquear nuevas funcionalidades"));
		this._mostrar_valoracion_noticia.getNomegustamostrarvaloracionnoticia().addClickListener(event -> Notification.show("Inicia sesión o Registrate para desbloquear nuevas funcionalidades"));
		this.getBotonanadircomentarioseccioncomentarios().addClickListener(event -> Notification.show("Inicia sesión o Registrate para desbloquear nuevas funcionalidades"));
	}
	
	public Pagina_noticia_Usuario_no_registrado(Listado_noticias_busqueda_Usuario_no_registrado_item _listado_noticias_busqueda_Usuario_no_registrado,
			basededatos.Noticia noticia) {
	super(noticia);
	this._listado_noticias_busqueda_Usuario_no_registrado = _listado_noticias_busqueda_Usuario_no_registrado;
	this.getLayoutcomentarioseccioncomentarios().setWidth("100%");
	this._mostrar_noticia_resumida = new Mostrar_noticia_resumida(this, noticia);
	this._seccion_comentarios_Usuario_no_registrado = new Seccion_comentarios_Usuario_no_registrado(this);
	Seccion_comentarios_Usuario_no_registrado();
	Mostrar_noticia_resumida();		
	this._mostrar_valoracion_noticia.getMegustamostrarvaloracionnoticia().addClickListener(event -> Notification.show("Inicia sesión o Registrate para desbloquear nuevas funcionalidades"));
	this._mostrar_valoracion_noticia.getNomegustamostrarvaloracionnoticia().addClickListener(event -> Notification.show("Inicia sesión o Registrate para desbloquear nuevas funcionalidades"));
	this.getBotonanadircomentarioseccioncomentarios().addClickListener(event -> Notification.show("Inicia sesión o Registrate para desbloquear nuevas funcionalidades"));
	}
	
	public Pagina_noticia_Usuario_no_registrado(Noticias_en_seccion_Usuario_no_registrado_item _noticias_en_seccion_Usuario_no_registrado,
			basededatos.Noticia noticia) {
	super(noticia);
	this._noticias_en_seccion_Usuario_no_registrado =_noticias_en_seccion_Usuario_no_registrado;
	this.getLayoutcomentarioseccioncomentarios().setWidth("100%");
	this._mostrar_noticia_resumida = new Mostrar_noticia_resumida(this, noticia);
	this._seccion_comentarios_Usuario_no_registrado = new Seccion_comentarios_Usuario_no_registrado(this);
	Seccion_comentarios_Usuario_no_registrado();
	Mostrar_noticia_resumida();		
	this._mostrar_valoracion_noticia.getMegustamostrarvaloracionnoticia().addClickListener(event -> Notification.show("Inicia sesión o Registrate para desbloquear nuevas funcionalidades"));
	this._mostrar_valoracion_noticia.getNomegustamostrarvaloracionnoticia().addClickListener(event -> Notification.show("Inicia sesión o Registrate para desbloquear nuevas funcionalidades"));
	this.getBotonanadircomentarioseccioncomentarios().addClickListener(event -> Notification.show("Inicia sesión o Registrate para desbloquear nuevas funcionalidades"));
	}

	public void Seccion_comentarios_Usuario_no_registrado() {
		this.getLayoutseccioncomentariospaginanoticia().as(VerticalLayout.class).removeAll();
		this.getLayoutseccioncomentariospaginanoticia().as(VerticalLayout.class).add(_seccion_comentarios_Usuario_no_registrado);
	}

	public void Mostrar_noticia_resumida() {
		this.getMostrarnoticiaresumidayextendidapaginanoticia().add(_mostrar_noticia_resumida);
	}
}