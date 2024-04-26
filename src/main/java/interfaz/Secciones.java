package interfaz;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import vistas.VistaSecciones;

public class Secciones extends VistaSecciones{
	public Explorar_secciones _explorar_secciones;
	public Vector<Secciones_item> _item = new Vector<Secciones_item>();
	
	public Secciones(Explorar_secciones _explorar_secciones) {
		super();
		this._explorar_secciones = _explorar_secciones;
//		try {
//			List secciones = basededatos.Seccion.querySeccion("", "");
//			for (Object seccion : secciones)
//				_item.add(new Secciones_item(this, (basededatos.Seccion) seccion));
//		} catch (PersistentException e) {
//			e.printStackTrace();
//		}
	}
}