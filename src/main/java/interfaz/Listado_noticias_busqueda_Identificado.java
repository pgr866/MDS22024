package interfaz;

import java.util.Vector;

import vistas.VistaListadonoticiasbusquedaidentificado;

public class Listado_noticias_busqueda_Identificado extends VistaListadonoticiasbusquedaidentificado {
	
	public Identificado _identificado;
	public Vector<Listado_noticias_busqueda_Identificado_item> _item = new Vector<Listado_noticias_busqueda_Identificado_item>();
	
	public Listado_noticias_busqueda_Identificado(Identificado _identificado) {
		super();
		this._identificado = _identificado;
		
	}
}