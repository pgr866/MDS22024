package interfaz;

import java.util.Vector;

import vistas.VistaSecciones;

public class Secciones extends VistaSecciones{
	
	public Explorar_secciones _explorar_secciones;
	public Vector<Secciones_item> _item = new Vector<Secciones_item>();
	
	public Secciones(Explorar_secciones _explorar_secciones) {
		super();
		this._explorar_secciones = _explorar_secciones;
	}
}