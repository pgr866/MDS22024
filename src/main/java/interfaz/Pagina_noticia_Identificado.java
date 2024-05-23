package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import base_de_datos.BDPrincipal;
import base_de_datos.iIdentificado;

public class Pagina_noticia_Identificado extends Pagina_Noticia {

	//	private event _valorar_noticia;
	iIdentificado iidentificado = new BDPrincipal();
	public Listado_noticias_portada_Identificado_item _listado_noticias_portada_Identificado;
	public Listado_noticias_busqueda_Identificado_item _listado_noticias_busqueda_Identificado;
	public Noticias_en_seccion_Identificado_item _noticias_en_seccion_Identificado;
	public Mostrar_mis_noticias_item _mostrar_mis_noticias;
	public Mostrar_noticia_extendida _mostrar_noticia_extendida;
	public Seccion_comentarios_Identificado _seccion_comentarios_Identificado;
	basededatos.Identificado identificado;

	public Pagina_noticia_Identificado(Listado_noticias_portada_Identificado_item _listado_noticias_portada_Identificado,
			basededatos.Noticia noticia) {
		super(noticia);
		this._listado_noticias_portada_Identificado = _listado_noticias_portada_Identificado;
		this._mostrar_noticia_extendida = new Mostrar_noticia_extendida(this, noticia);
		this._seccion_comentarios_Identificado = new Seccion_comentarios_Identificado(this);
		Mostrar_noticia_extendida();
		Seccion_comentarios_Identificado();
		this.identificado = this._listado_noticias_portada_Identificado._listado_noticias_portada_Identificado._identificado.identificado;
		this.getBotonanadircomentarioseccioncomentarios().addClickListener(event->Comentar());
		this._mostrar_valoracion_noticia.getMegustamostrarvaloracionnoticia().addClickListener(event->Valorar_noticia(true));
		this._mostrar_valoracion_noticia.getNomegustamostrarvaloracionnoticia().addClickListener(event->Valorar_noticia(false));
	}
	
	public Pagina_noticia_Identificado(Listado_noticias_busqueda_Identificado_item _listado_noticias_busqueda_Identificado,
			basededatos.Noticia noticia) {
		super(noticia);
		this._listado_noticias_busqueda_Identificado = _listado_noticias_busqueda_Identificado;
		this._mostrar_noticia_extendida = new Mostrar_noticia_extendida(this, noticia);
		this._seccion_comentarios_Identificado = new Seccion_comentarios_Identificado(this);
		Mostrar_noticia_extendida();
		Seccion_comentarios_Identificado();
		this.identificado = this._listado_noticias_busqueda_Identificado._listado_noticias_busqueda_Identificado._identificado.identificado;
		this.getBotonanadircomentarioseccioncomentarios().addClickListener(event->Comentar());
		this._mostrar_valoracion_noticia.getMegustamostrarvaloracionnoticia().addClickListener(event->Valorar_noticia(true));
		this._mostrar_valoracion_noticia.getNomegustamostrarvaloracionnoticia().addClickListener(event->Valorar_noticia(false));
	}
	
	public Pagina_noticia_Identificado(Noticias_en_seccion_Identificado_item _noticias_en_seccion_Identificado,
			basededatos.Noticia noticia) {
		super(noticia);
		this._noticias_en_seccion_Identificado =_noticias_en_seccion_Identificado;
		this._mostrar_noticia_extendida = new Mostrar_noticia_extendida(this, noticia);
		this._seccion_comentarios_Identificado = new Seccion_comentarios_Identificado(this);
		Mostrar_noticia_extendida();
		Seccion_comentarios_Identificado();
		this.identificado = this._noticias_en_seccion_Identificado._noticias_en_seccion_Identificado._explorar_secciones_Identificado._identificado.identificado;
		this.getBotonanadircomentarioseccioncomentarios().addClickListener(event->Comentar());
		this._mostrar_valoracion_noticia.getMegustamostrarvaloracionnoticia().addClickListener(event->Valorar_noticia(true));
		this._mostrar_valoracion_noticia.getNomegustamostrarvaloracionnoticia().addClickListener(event->Valorar_noticia(false));
	}
	
	public Pagina_noticia_Identificado(Mostrar_mis_noticias_item _mostrar_mis_noticias,
			basededatos.Noticia noticia) {
		super(noticia);
		this._mostrar_mis_noticias =_mostrar_mis_noticias;
		this._mostrar_noticia_extendida = new Mostrar_noticia_extendida(this, noticia);
		this._seccion_comentarios_Identificado = new Seccion_comentarios_Identificado(this);
		Mostrar_noticia_extendida();
		Seccion_comentarios_Identificado();
		this.identificado = this._mostrar_mis_noticias._mostrar_mis_noticias._periodista.identificado;
		this.getBotonanadircomentarioseccioncomentarios().addClickListener(event->Comentar());
		this._mostrar_valoracion_noticia.getMegustamostrarvaloracionnoticia().addClickListener(event->Valorar_noticia(true));
		this._mostrar_valoracion_noticia.getNomegustamostrarvaloracionnoticia().addClickListener(event->Valorar_noticia(false));
	}
	
	public void Valorar_noticia(boolean positiva) {
		int id_noticia = this.noticia.getId_noticia();
		int id_identificado = this.identificado.getId();
		iidentificado.Valorar_noticia(id_noticia, id_identificado, positiva);
		if (this._listado_noticias_portada_Identificado != null) // Refrescar pagina
			this._listado_noticias_portada_Identificado.Pagina_noticia_Identificado();
		else if (this._listado_noticias_busqueda_Identificado != null)
			this._listado_noticias_busqueda_Identificado.Pagina_noticia_Identificado();
		else if (this._noticias_en_seccion_Identificado != null)
			this._noticias_en_seccion_Identificado.Pagina_noticia_Identificado();
		else if (this._mostrar_mis_noticias != null)
			this._mostrar_mis_noticias.Pagina_noticia_Identificado();
	}

	public void Mostrar_noticia_extendida() {
		this.getMostrarnoticiaresumidayextendidapaginanoticia().add(_mostrar_noticia_extendida);
	}

	public void Seccion_comentarios_Identificado() {
		this.getLayoutseccioncomentariospaginanoticia().as(VerticalLayout.class).removeAll();
		this.getLayoutseccioncomentariospaginanoticia().as(VerticalLayout.class).add(_seccion_comentarios_Identificado);
	}
	
	public void Comentar() {
		int id_identificado = this.identificado.getId();
		int id_noticia = this.noticia.getId_noticia();
		String contenido = this.getTextareacomentarioseccioncomentarios().getValue();
		iidentificado.Comentar(id_identificado, id_noticia, contenido);
		if (this._listado_noticias_portada_Identificado != null) // Refrescar pagina
			this._listado_noticias_portada_Identificado.Pagina_noticia_Identificado();
		else if (this._listado_noticias_busqueda_Identificado != null)
			this._listado_noticias_busqueda_Identificado.Pagina_noticia_Identificado();
		else if (this._noticias_en_seccion_Identificado != null)
			this._noticias_en_seccion_Identificado.Pagina_noticia_Identificado();
		else if (this._mostrar_mis_noticias != null)
			this._mostrar_mis_noticias.Pagina_noticia_Identificado();
	}
}