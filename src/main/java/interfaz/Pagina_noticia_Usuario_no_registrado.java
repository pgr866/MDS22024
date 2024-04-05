package interfaz;

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
				Listado_noticias_busqueda_Usuario_no_registrado_item _listado_noticias_busqueda_Usuario_no_registrado,
				Noticias_en_seccion_Usuario_no_registrado_item _noticias_en_seccion_Usuario_no_registrado) {
		super();
		this._listado_noticias_portada_Usuario_no_registrado = _listado_noticias_portada_Usuario_no_registrado;
		this._listado_noticias_busqueda_Usuario_no_registrado = _listado_noticias_busqueda_Usuario_no_registrado;
		this._noticias_en_seccion_Usuario_no_registrado =_noticias_en_seccion_Usuario_no_registrado;
		this._mostrar_noticia_resumida = new Mostrar_noticia_resumida(this);
		this._seccion_comentarios_Usuario_no_registrado = new Seccion_comentarios_Usuario_no_registrado(this);
		Seccion_comentarios_Usuario_no_registrado();
		Mostrar_noticia_resumida();		
		this._mostrar_valoracion_noticia.getMegustamostrarvaloracionnoticia().setDisableOnClick(true);
		this._mostrar_valoracion_noticia.getNomegustamostrarvaloracionnoticia().setDisableOnClick(true);
	}

	public void Seccion_comentarios_Usuario_no_registrado() {
		this.getLayoutseccioncomentariospaginanoticia().as(VerticalLayout.class).add(_seccion_comentarios_Usuario_no_registrado);
	}

	public void Mostrar_noticia_resumida() {
		this.getMostrarnoticiaresumidayextendidapaginanoticia().add(_mostrar_noticia_resumida);
	}
}