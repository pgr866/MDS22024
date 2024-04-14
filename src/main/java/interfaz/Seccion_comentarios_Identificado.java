package interfaz;

import java.util.Vector;

public class Seccion_comentarios_Identificado extends Seccion_comentarios {
//	private Button _anadir_nuevo_comentario;
//	private comentario___TexArea _nuevo;
	public Pagina_noticia_Identificado _pagina_noticia_Identificado;
	public Vector<Seccion_comentarios_Identificado_item> _item = new Vector<Seccion_comentarios_Identificado_item>();
	
	public Seccion_comentarios_Identificado(Pagina_noticia_Identificado _pagina_noticia_Identificado) {
		super();
		this._pagina_noticia_Identificado = _pagina_noticia_Identificado;
	}
}