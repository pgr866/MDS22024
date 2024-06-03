package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import vistas.VistaListaperiodistas;
import base_de_datos.BDPrincipal;
import base_de_datos.iEditor;

public class Lista_periodistas extends VistaListaperiodistas {
	
	iEditor ieditor = new BDPrincipal();
	public Baja_Alta_Periodistas _baja_Alta_Periodistas;
	public Vector<Lista_periodistas_item> _item = new Vector<Lista_periodistas_item>();
	
	public Lista_periodistas(Baja_Alta_Periodistas _baja_Alta_Periodistas) {
		super();
		this._baja_Alta_Periodistas = _baja_Alta_Periodistas;
		try {
			basededatos.Periodista[] periodistas = ieditor.Cargar_periodistas();
			Vector<String> nicks = new Vector<String>();
			for (int i=0;i<periodistas.length;i++){
				Lista_periodistas_item item = new Lista_periodistas_item(this,periodistas[i]);
				this._item.add(item);
				nicks.add(periodistas[i].getNick_apodo());
			}
			this.getComboboxlistaperiodistas().setItems(nicks);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}