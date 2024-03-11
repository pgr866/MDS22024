package interfaz;

import java.util.Vector;

public class Listado_noticias_portada_Editor extends Listado_noticias_portada_Identificado {
//	private ImageButton _lupa;
	public Editor _editor;
	public Vector<Listado_noticias_portada_Editor_item> _item = new Vector<Listado_noticias_portada_Editor_item>();
	
	public Listado_noticias_portada_Editor(Editor _editor) {
		super(_editor);
		this._editor = _editor;
	}
}