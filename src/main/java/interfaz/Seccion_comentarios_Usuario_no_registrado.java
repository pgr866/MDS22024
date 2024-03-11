package interfaz;

import java.util.Vector;

public class Seccion_comentarios_Usuario_no_registrado extends Seccion_comentarios {
	public Pagina_noticia_Usuario_no_registrado _pagina_noticia_Usuario_no_registrado;
	public Vector<Seccion_comentarios_Usuario_no_registrado_item> _item = new Vector<Seccion_comentarios_Usuario_no_registrado_item>();
	
	public Seccion_comentarios_Usuario_no_registrado(Pagina_noticia_Usuario_no_registrado _pagina_noticia_Usuario_no_registrado) {
		super();
		this._pagina_noticia_Usuario_no_registrado = _pagina_noticia_Usuario_no_registrado;
	}
}