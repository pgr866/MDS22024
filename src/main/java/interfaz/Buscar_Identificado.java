package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Buscar_Identificado extends Buscar {

	public Identificado _identificado;
	public Listado_noticias_busqueda_Identificado _listado_noticias_busqueda_Identificado;

	public Buscar_Identificado(Identificado _identificado) {
		super();
		this._identificado = _identificado;
		this._listado_noticias_busqueda_Identificado = new Listado_noticias_busqueda_Identificado(this);
		Listado_noticias_busqueda_Identificado();
	}
	
	public void Listado_noticias_busqueda_Identificado() {
		this.getLayoutvistasbuscar().as(VerticalLayout.class).add(_listado_noticias_busqueda_Identificado);
	}
}