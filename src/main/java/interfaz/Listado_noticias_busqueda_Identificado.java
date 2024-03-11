package interfaz;

import java.util.Vector;

import vistas.VistaListadonoticiasbusquedaidentificado;

public class Listado_noticias_busqueda_Identificado extends VistaListadonoticiasbusquedaidentificado {
	public Buscar_Identificado _buscar_Identificado;
	public Vector<Listado_noticias_busqueda_Identificado_item> _item = new Vector<Listado_noticias_busqueda_Identificado_item>();
	
	public Listado_noticias_busqueda_Identificado(Buscar_Identificado _buscar_Identificado) {
		super();
		this._buscar_Identificado = _buscar_Identificado;
	}
}