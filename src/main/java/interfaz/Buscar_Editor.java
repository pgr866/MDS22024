package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Buscar_Editor extends Buscar_Identificado {
	
	public Editor _editor;
	public Listado_noticias_busqueda_Editor _listado_noticias_busqueda_Editor;

	public Buscar_Editor(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		this.getLayoutvistasbuscareditor().setVisible(true);
		this.getLayoutvistasbuscaridentificado().setVisible(false);
		this._listado_noticias_busqueda_Editor = new Listado_noticias_busqueda_Editor(this);
		Listado_noticias_busqueda_Editor();
	}
	
	public void Listado_noticias_busqueda_Editor() {
		this.getLayoutvistasbuscareditor().as(VerticalLayout.class).add(_listado_noticias_busqueda_Editor);
	}
}