package interfaz;

public class Seccion_comentarios_Usuario_no_registrado extends Seccion_comentarios {
	
	public Pagina_noticia_Usuario_no_registrado _pagina_noticia_Usuario_no_registrado;
	
	public Seccion_comentarios_Usuario_no_registrado(Pagina_noticia_Usuario_no_registrado _pagina_noticia_Usuario_no_registrado) {
		super(_pagina_noticia_Usuario_no_registrado);
		this._pagina_noticia_Usuario_no_registrado = _pagina_noticia_Usuario_no_registrado;
	}
}