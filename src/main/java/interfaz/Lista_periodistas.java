package interfaz;

import java.util.Vector;

import vistas.VistaListaperiodistas;

public class Lista_periodistas extends VistaListaperiodistas {
	
	public Buscar_periodista _buscar_periodista;
	public Vector<Lista_periodistas_item> _item = new Vector<Lista_periodistas_item>();
	
	public Lista_periodistas(Buscar_periodista _buscar_periodista) {
		super();
		this._buscar_periodista = _buscar_periodista;
	}
}