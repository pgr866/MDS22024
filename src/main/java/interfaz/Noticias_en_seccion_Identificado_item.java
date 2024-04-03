package interfaz;

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
	
	public Noticias_en_seccion_Identificado_item(Noticias_en_seccion_Identificado _noticias_en_seccion_Identificado,
			Pagina_noticia_Identificado _pagina_noticia_Identificado) {
		super();
		this._noticias_en_seccion_Identificado = _noticias_en_seccion_Identificado;
		this._pagina_noticia_Identificado = _pagina_noticia_Identificado;
	}
}