package interfaz;

public class Mostrar_noticia_resumida extends vistas.VistaMostrarnoticiaresumida {

	public Pagina_noticia_Usuario_no_registrado _pagina_noticia_Usuario_no_registrado;
	basededatos.Noticia noticia;
	
	public Mostrar_noticia_resumida(Pagina_noticia_Usuario_no_registrado _pagina_noticia_Usuario_no_registrado, basededatos.Noticia noticia) {
		super();
		this._pagina_noticia_Usuario_no_registrado = _pagina_noticia_Usuario_no_registrado;
		this.noticia = noticia;
		this.getTextarearesumenmostrarnoticiaresumida().setValue(noticia.getResumen());
	}
}