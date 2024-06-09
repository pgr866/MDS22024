package interfaz;

public class Mostrar_noticia_resumida extends vistas.VistaMostrarnoticiaresumida {

	public Pagina_noticia_Usuario_no_registrado _pagina_noticia_Usuario_no_registrado;
	basededatos.Noticia noticia;
	
	public Mostrar_noticia_resumida(Pagina_noticia_Usuario_no_registrado _pagina_noticia_Usuario_no_registrado, basededatos.Noticia noticia) {
		super();
		this._pagina_noticia_Usuario_no_registrado = _pagina_noticia_Usuario_no_registrado;
		this.noticia = noticia;
		this.getTextarearesumenmostrarnoticiaresumida().setValue(noticia.getResumen());
		this.getTextarearesumenmostrarnoticiaresumida().getElement().executeJs(
	            "this.shadowRoot.querySelector('[part=\"input-field\"]').style.border = 'none';" +
	            "this.shadowRoot.querySelector('[part=\"input-field\"]').style.boxShadow = 'none';"
	        );
		this.getTextarearesumenmostrarnoticiaresumida().getElement().executeJs(
	            "var textArea = this;" +
	            "textArea.style.height = 'auto';" +
	            "textArea.style.height = textArea.scrollHeight + 'px';"
	        );
	}
}