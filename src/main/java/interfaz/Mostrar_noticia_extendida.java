package interfaz;

public class Mostrar_noticia_extendida extends vistas.VistaMostrarnoticiaextendida {
	
	public Pagina_noticia_Identificado _pagina_noticia_Identificado;
	basededatos.Noticia noticia;
	
	public Mostrar_noticia_extendida(Pagina_noticia_Identificado _pagina_noticia_Identificado, basededatos.Noticia noticia) {
		super();
		this._pagina_noticia_Identificado = _pagina_noticia_Identificado;
		this.noticia = noticia;
		this.getTextareamostrarnoticiaextendida().setValue(noticia.getContenido());
	}
}