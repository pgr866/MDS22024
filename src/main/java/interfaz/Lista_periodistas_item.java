package interfaz;

import vistas.VistaListaperiodistas_item;

public class Lista_periodistas_item extends VistaListaperiodistas_item {
	
	public Lista_periodistas _lista_periodistas;
	basededatos.Periodista periodista;
	
	public Lista_periodistas_item(Lista_periodistas _lista_periodistas, basededatos.Periodista periodista) {
		super();
		this._lista_periodistas = _lista_periodistas;
		this.periodista = periodista;
		this.getLayoutlistaperiodistaitem().setText(periodista.getNick_apodo());
	}
}