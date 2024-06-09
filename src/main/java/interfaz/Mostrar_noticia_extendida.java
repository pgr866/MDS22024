package interfaz;

public class Mostrar_noticia_extendida extends vistas.VistaMostrarnoticiaextendida {
	
	public Pagina_noticia_Identificado _pagina_noticia_Identificado;
	basededatos.Noticia noticia;
	
	public Mostrar_noticia_extendida(Pagina_noticia_Identificado _pagina_noticia_Identificado, basededatos.Noticia noticia) {
		super();
		this._pagina_noticia_Identificado = _pagina_noticia_Identificado;
		this.noticia = noticia;
		this.getTextareamostrarnoticiaextendida().setValue(noticia.getContenido());
		this.getTextareamostrarnoticiaextendida().getElement().executeJs(
	            "this.shadowRoot.querySelector('[part=\"input-field\"]').style.border = 'none';" +
	            "this.shadowRoot.querySelector('[part=\"input-field\"]').style.boxShadow = 'none';"
	        );
		this.getTextareamostrarnoticiaextendida().getElement().executeJs(
	            "var textArea = this;" +
	            "textArea.style.height = 'auto';" +
	            "textArea.style.height = textArea.scrollHeight + 'px';"
	        );
	}
}