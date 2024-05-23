package interfaz;

import vistas.VistaSeccionesidentificado_item;

public class Secciones_Identificado_item extends VistaSeccionesidentificado_item{
	
	public Secciones_Identificado _secciones_Identificado;
	basededatos.Seccion seccion;
	
	public Secciones_Identificado_item(Secciones_Identificado _secciones_Identificado, basededatos.Seccion seccion) {
		super();
		this._secciones_Identificado = _secciones_Identificado;
		this.seccion = seccion;
	    this.getItemseccionesidentificado().setText(seccion.getTitulo_seccion());
	}
}