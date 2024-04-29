package interfaz;

import java.util.Vector;

import vistas.VistaNoticiasenseccionusuarionoregistrado;

public class Noticias_en_seccion_Usuario_no_registrado extends VistaNoticiasenseccionusuarionoregistrado {
	
	public Explorar_secciones_Usuario_no_registrado _explorar_secciones_Usuario_no_registrado;
	public Vector<Noticias_en_seccion_Usuario_no_registrado_item> _item = new Vector<Noticias_en_seccion_Usuario_no_registrado_item>();
	
	public Noticias_en_seccion_Usuario_no_registrado(Explorar_secciones_Usuario_no_registrado _explorar_secciones_Usuario_no_registrado) {
		super();
		this._explorar_secciones_Usuario_no_registrado = _explorar_secciones_Usuario_no_registrado;
	}
}