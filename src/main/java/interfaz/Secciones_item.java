package interfaz;

import vistas.VistaSecciones_item;

public class Secciones_item extends VistaSecciones_item{
	
	public Secciones _secciones;
	basededatos.Seccion seccion;
	
	public Secciones_item(Secciones _secciones, basededatos.Seccion seccion) {
		super();
		this._secciones = _secciones;
		this.seccion = seccion;
	    this.getItemsecciones().setText(seccion.getTitulo_seccion());
	}
}