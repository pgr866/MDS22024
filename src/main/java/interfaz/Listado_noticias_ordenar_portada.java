package interfaz;

import java.util.Vector;

import vistas.VistaListadonoticiasordenarportada;

public class Listado_noticias_ordenar_portada extends VistaListadonoticiasordenarportada {
	
	public Listado_noticias_portada_Editor_item _listado_noticias_portada_Editor;
	public Vector<Listado_noticias_ordenar_portada_item> _item = new Vector<Listado_noticias_ordenar_portada_item>();
	
	public Listado_noticias_ordenar_portada(Listado_noticias_portada_Editor_item _listado_noticias_portada_Editor) {
		super();
		this._listado_noticias_portada_Editor = _listado_noticias_portada_Editor;
	}
}