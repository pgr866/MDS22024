package interfaz;

import java.util.Vector;

import vistas.VistaSecciones;

public class Secciones extends VistaSecciones{
	
	public Explorar_secciones _explorar_secciones;
	public Revisar_noticias _revisar_noticias;
	public Vector<Secciones_item> _item = new Vector<Secciones_item>();
	
	public Secciones(Explorar_secciones _explorar_secciones) {
		super();
		this._explorar_secciones = _explorar_secciones;
	}
	
	public Secciones(Revisar_noticias _revisar_noticias) {
		super();
		this._revisar_noticias = _revisar_noticias;
	}
}