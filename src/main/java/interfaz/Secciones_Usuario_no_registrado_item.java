package interfaz;

import vistas.VistaSeccionesusuarionoregistrado_item;

public class Secciones_Usuario_no_registrado_item extends VistaSeccionesusuarionoregistrado_item{
	
	public Secciones_Usuario_no_registrado _secciones_Usuario_no_registrado;
	basededatos.Seccion seccion;
	
	public Secciones_Usuario_no_registrado_item(Secciones_Usuario_no_registrado _secciones_Usuario_no_registrado, basededatos.Seccion seccion) {
		super();
		this._secciones_Usuario_no_registrado = _secciones_Usuario_no_registrado;
		this.seccion = seccion;
	    this.getItemseccionesusuarionoregistrado().setText(seccion.getTitulo_seccion());
	}
}