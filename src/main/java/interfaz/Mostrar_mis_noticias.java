package interfaz;

import java.util.Vector;

public class Mostrar_mis_noticias extends vistas.VistaMostrarmisnoticias {

	public Periodista _periodista;
	public Vector<Mostrar_mis_noticias_item> _item = new Vector<Mostrar_mis_noticias_item>();
	
	public Mostrar_mis_noticias(Periodista _periodista) {
		super();
		this._periodista = _periodista;
	}
}