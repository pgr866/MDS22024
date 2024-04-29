package interfaz;

import java.util.Vector;

import vistas.VistaListadonoticiasbusquedausuarionoregistrado;

public class Listado_noticias_busqueda_Usuario_no_registrado extends VistaListadonoticiasbusquedausuarionoregistrado {
	
	public Buscar_Usuario_no_registrado _buscar_Usuario_no_registrado;
	public Vector<Listado_noticias_busqueda_Usuario_no_registrado_item> _item = new Vector<Listado_noticias_busqueda_Usuario_no_registrado_item>();
	
	public Listado_noticias_busqueda_Usuario_no_registrado(Buscar_Usuario_no_registrado _buscar_Usuario_no_registrado) {
		super();
		this._buscar_Usuario_no_registrado = _buscar_Usuario_no_registrado;
	}
}