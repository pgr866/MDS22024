package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNoticiasarevisar;

public class Noticias_a_revisar extends VistaNoticiasarevisar {
	public Editor _editor;
	public Vector<Noticias_a_revisar_item> _item = new Vector<Noticias_a_revisar_item>();
	
	public Noticias_a_revisar(Editor _editor) {
		super();
		this._editor = _editor;
	}
}