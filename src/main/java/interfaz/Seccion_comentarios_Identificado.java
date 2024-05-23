package interfaz;

public class Seccion_comentarios_Identificado extends Seccion_comentarios {
	
//	private Button _anadir_nuevo_comentario;
//	private comentario___TexArea _nuevo;
	public Pagina_noticia_Identificado _pagina_noticia_Identificado;
	
	public Seccion_comentarios_Identificado(Pagina_noticia_Identificado _pagina_noticia_Identificado) {
		super(_pagina_noticia_Identificado);
		this._pagina_noticia_Identificado = _pagina_noticia_Identificado;
	}
}