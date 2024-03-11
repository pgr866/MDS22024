package interfaz;

import vistas.VistaListaperiodistas_item;

public class Lista_periodistas_item extends VistaListaperiodistas_item {
//	private event _baja_periodista;
	public Lista_periodistas _lista_periodistas;
	
	public Lista_periodistas_item(Lista_periodistas _lista_periodistas) {
		super();
		this._lista_periodistas = _lista_periodistas;
	}

	public void Baja_periodista() {
		throw new UnsupportedOperationException();
	}
}