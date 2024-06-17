package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.MainView;

//import basededatos.iPeriodista;

public class Periodista extends Identificado {
	
//	public iPeriodista _iPeriodista;
	public Crear_noticias _crear_noticias;
	public Mostrar_mis_noticias _mostrar_mis_noticias;
	
	public Periodista (MainView mainview, basededatos.Periodista periodista) {
		super(mainview, periodista);
		this.getLayoutnoticiasarevisaridentificado().setVisible(false);
		this.getLayoutdaraltabajaperiodistaidentificado().setVisible(false);
		this._mostrar_mis_noticias = new Mostrar_mis_noticias(this);
		Mostrar_mis_noticias();
		this.getButtoncrearnuevanoticiaidentificado().addClickListener(event->Crear_noticias());
	}

	public void Crear_noticias() {
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		_crear_noticias = new Crear_noticias(this);
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_crear_noticias);
	}

	public void Mostrar_mis_noticias() {
		this.getLayoutvermisnoticiasidentificado().as(VerticalLayout.class).removeAll();
		this.getLayoutvermisnoticiasidentificado().as(VerticalLayout.class).add(_mostrar_mis_noticias);
	}
}