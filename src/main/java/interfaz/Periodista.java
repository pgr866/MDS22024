package interfaz;

import proyectoMDS.MainView;

//import basededatos.iPeriodista;

public class Periodista extends Identificado {
//	public iPeriodista _iPeriodista;
	public Crear_noticias _crear_noticias;
	public Mostrar_mis_noticias _mostrar_mis_noticias;
	
	public Periodista (MainView mainview) {
		super(mainview);
		this.getLayoutrevisarnoticia().setVisible(false);
		this.getLayoutdaraltabajaperiodista().setVisible(false);
	}

	public void Crear_noticias() {
		throw new UnsupportedOperationException();
	}

	public void Mostrar_mis_noticias() {
		throw new UnsupportedOperationException();
	}
}