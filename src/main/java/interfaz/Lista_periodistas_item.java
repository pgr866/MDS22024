package interfaz;

import java.util.ArrayList;

import vistas.VistaListaperiodistas_item;

public class Lista_periodistas_item extends VistaListaperiodistas_item {
//	private event _baja_periodista;
	public Lista_periodistas _lista_periodistas;
	
	public Lista_periodistas_item(Lista_periodistas _lista_periodistas) {
		super();
		this._lista_periodistas = _lista_periodistas;
		this._lista_periodistas._buscar_periodista._baja_Alta_Periodistas.getButtondarbajaperiodista().addClickListener(event->Baja_periodista());
	}

	public void Baja_periodista() {
		String nombre_periodista = this._lista_periodistas.getComboboxlistaperiodistas().getValue();
		// eliminar periodista BD
		this._lista_periodistas._item.remove(this);
		ArrayList<String> items = new ArrayList<String>();
		for (Lista_periodistas_item periodista : this._lista_periodistas._item)
			items.add(periodista.getLayoutlistaperiodistaitem().getText());
		this._lista_periodistas.getComboboxlistaperiodistas().setItems(items);
		this._lista_periodistas._buscar_periodista._baja_Alta_Periodistas._editor.Baja_Alta_Periodistas(); // Refrescar pagina
	}
}