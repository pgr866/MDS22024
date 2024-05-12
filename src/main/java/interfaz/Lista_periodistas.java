package interfaz;

import java.util.Vector;

import vistas.VistaListaperiodistas;

public class Lista_periodistas extends VistaListaperiodistas {
	
	public Baja_Alta_Periodistas _baja_Alta_Periodistas;
	public Vector<Lista_periodistas_item> _item = new Vector<Lista_periodistas_item>();
	
	public Lista_periodistas(Baja_Alta_Periodistas _baja_Alta_Periodistas) {
		super();
		this._baja_Alta_Periodistas = _baja_Alta_Periodistas;
	}
}