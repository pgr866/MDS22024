package interfaz;

import java.util.Vector;

public class Listado_noticias_busqueda_Editor extends Listado_noticias_busqueda_Identificado {
	
	public Buscar_Editor _buscar_Editor;
	public Vector<Listado_noticias_busqueda_Editor_item> _item = new Vector<Listado_noticias_busqueda_Editor_item>();
	
	public Listado_noticias_busqueda_Editor(Buscar_Editor _buscar_Editor) {
		super(_buscar_Editor);
		this._buscar_Editor = _buscar_Editor;
	}
}