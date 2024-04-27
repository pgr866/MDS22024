package interfaz;

import com.vaadin.flow.component.listbox.MultiSelectListBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Pagina_noticia_Identificado extends Pagina_Noticia {

	//	private event _valorar_noticia;
	public Listado_noticias_portada_Identificado_item _listado_noticias_portada_Identificado;
	public Listado_noticias_busqueda_Identificado_item _listado_noticias_busqueda_Identificado;
	public Noticias_en_seccion_Identificado_item _noticias_en_seccion_Identificado;
	public Mostrar_mis_noticias_item _mostrar_mis_noticias;
	public Mostrar_noticia_extendida _mostrar_noticia_extendida;
	public Seccion_comentarios_Identificado _seccion_comentarios_Identificado;

	public Pagina_noticia_Identificado(Listado_noticias_portada_Identificado_item _listado_noticias_portada_Identificado,
			basededatos.Noticia noticia) {
		super(noticia);
		this._listado_noticias_portada_Identificado = _listado_noticias_portada_Identificado;
		this._mostrar_noticia_extendida = new Mostrar_noticia_extendida(this, noticia);
		this._seccion_comentarios_Identificado = new Seccion_comentarios_Identificado(this);
		Mostrar_noticia_extendida();
		Seccion_comentarios_Identificado();
		this._seccion_comentarios_Identificado.getBotonanadircomentarioseccioncomentarios().addClickListener(event->Comentar(((Listado_noticias_portada_Identificado) this._listado_noticias_portada_Identificado._listado_noticias_portada)._identificado.identificado));
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
		this._seccion_comentarios_Identificado.getBotonanadircomentarioseccioncomentarios().addClickListener(event->Comentar(this._listado_noticias_busqueda_Identificado._listado_noticias_busqueda_Identificado._buscar_Identificado._identificado.identificado));
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
		this._seccion_comentarios_Identificado.getBotonanadircomentarioseccioncomentarios().addClickListener(event->Comentar(this._noticias_en_seccion_Identificado._noticias_en_seccion_Identificado._explorar_secciones_Identificado._identificado.identificado));
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
		this._seccion_comentarios_Identificado.getBotonanadircomentarioseccioncomentarios().addClickListener(event->Comentar(this._mostrar_mis_noticias._mostrar_mis_noticias._periodista.identificado));
		this._mostrar_valoracion_noticia.getMegustamostrarvaloracionnoticia().addClickListener(event->Valorar_noticia(true));
		this._mostrar_valoracion_noticia.getNomegustamostrarvaloracionnoticia().addClickListener(event->Valorar_noticia(false));
	}
	
	public void Valorar_noticia(boolean positiva) {
		int mg = noticia.getValoraciones_positivas();
		int nmg = noticia.getValoraciones_negativas();
		// update noticia BD, tratar cuando se ha dado ya mg o nmg
		if (positiva) {
			mg++;
		} else {
			nmg++;
		}
		this.noticia.setValoraciones_positivas(mg);
		this._mostrar_valoracion_noticia.getNumeromegustamostrarvaloracionnoticia().setText(String.valueOf(mg));
		this.noticia.setValoraciones_negativas(nmg);
		this._mostrar_valoracion_noticia.getNumeronomegustamostrarvaloracionnoticia().setText(String.valueOf(nmg));
	}

	public void Mostrar_noticia_extendida() {
		this.getMostrarnoticiaresumidayextendidapaginanoticia().add(_mostrar_noticia_extendida);
	}

	public void Seccion_comentarios_Identificado() {
		this.getLayoutseccioncomentariospaginanoticia().as(VerticalLayout.class).add(_seccion_comentarios_Identificado);
	}
	
	public void Comentar(basededatos.Identificado identificado) {
		String contenido_comentario = (String) this._seccion_comentarios_Identificado.getTextareacomentarioseccioncomentarios().getValue();
		String mi_nick = identificado.getNick_apodo();
		String mi_img = identificado.getUrl_foto_perfil();
		// crear comentario BD
		Seccion_comentarios_Identificado_item nuevo_comentario_Identificado = new Seccion_comentarios_Identificado_item(this._seccion_comentarios_Identificado, identificado);
		this._seccion_comentarios_Identificado.getLayoutvistaseccioncomentarios().as(VerticalLayout.class).add(nuevo_comentario_Identificado);
		this._seccion_comentarios_Identificado._item.add(nuevo_comentario_Identificado);
	}
}