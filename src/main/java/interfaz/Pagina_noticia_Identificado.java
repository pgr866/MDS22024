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
			Listado_noticias_busqueda_Identificado_item _listado_noticias_busqueda_Identificado,
			Noticias_en_seccion_Identificado_item _noticias_en_seccion_Identificado,
			Mostrar_mis_noticias_item _mostrar_mis_noticias, basededatos.Noticia noticia) {
		super(noticia);
		this._listado_noticias_portada_Identificado = _listado_noticias_portada_Identificado;
		this._listado_noticias_busqueda_Identificado = _listado_noticias_busqueda_Identificado;
		this._noticias_en_seccion_Identificado =_noticias_en_seccion_Identificado;
		this._mostrar_mis_noticias =_mostrar_mis_noticias;
		this._mostrar_noticia_extendida = new Mostrar_noticia_extendida(this);
		this._seccion_comentarios_Identificado = new Seccion_comentarios_Identificado(this);
		Mostrar_noticia_extendida();
		Seccion_comentarios_Identificado();
		this._seccion_comentarios_Identificado.getBotonanadircomentarioseccioncomentarios().addClickListener(event->Comentar());
	}
	
	public void Valorar_noticia() {
		// update noticia BD
	}

	public void Mostrar_noticia_extendida() {
		this.getMostrarnoticiaresumidayextendidapaginanoticia().add(_mostrar_noticia_extendida);
	}

	public void Seccion_comentarios_Identificado() {
		this.getLayoutseccioncomentariospaginanoticia().as(VerticalLayout.class).add(_seccion_comentarios_Identificado);
	}
	
	public void Comentar() {
		String contenido_comentario = (String) this._seccion_comentarios_Identificado.getTextareacomentarioseccioncomentarios().getValue();
		String mi_nick = null;
		String mi_img = null;
		// crear comentario BD
		Seccion_comentarios_Identificado_item nuevo_comentario_Identificado = new Seccion_comentarios_Identificado_item(this._seccion_comentarios_Identificado);
		nuevo_comentario_Identificado._mostrar_comentario.getTextareacontenidocomentario().setValue(contenido_comentario);
		nuevo_comentario_Identificado.getLabelnickusuarioseccioncomentariositem().setText(mi_nick);
		nuevo_comentario_Identificado.getFotousuarioseccioncomentariositem().setSrc(mi_img);
		this._seccion_comentarios_Identificado.getLayoutvistaseccioncomentarios().as(VerticalLayout.class).add(nuevo_comentario_Identificado);
		this._seccion_comentarios_Identificado._item.add(nuevo_comentario_Identificado);
		
		if (this._listado_noticias_portada_Identificado != null)
			this._listado_noticias_portada_Identificado.Pagina_noticia_Identificado(); // Refrescar pagina
		else if (this._listado_noticias_busqueda_Identificado != null)
			this._listado_noticias_busqueda_Identificado.Pagina_noticia_Identificado(); // Refrescar pagina
		else if (this._noticias_en_seccion_Identificado != null)
			this._noticias_en_seccion_Identificado.Pagina_noticia_Identificado(); // Refrescar pagina
		else if (this._mostrar_mis_noticias != null)
			this._mostrar_mis_noticias.Pagina_noticia_Identificado(); // Refrescar pagina
		
	}
}