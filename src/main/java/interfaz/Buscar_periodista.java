package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Buscar_periodista extends vistas.VistaBuscarperiodista {

	public Baja_Alta_Periodistas _baja_Alta_Periodistas;
	public Lista_periodistas _lista_periodistas;
	
	public Buscar_periodista(Baja_Alta_Periodistas _baja_Alta_Periodistas) {
		super();
		this._baja_Alta_Periodistas = _baja_Alta_Periodistas;
		this._lista_periodistas = new Lista_periodistas(this);
	}
	
	public void Lista_periodistas() {
		this.getLayoutbuscarperiodista().as(VerticalLayout.class).add(_lista_periodistas);
	}
}