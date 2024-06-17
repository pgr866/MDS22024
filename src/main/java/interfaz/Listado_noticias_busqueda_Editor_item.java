package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listado_noticias_busqueda_Editor_item extends Listado_noticias_busqueda_Identificado_item {

	public Listado_noticias_busqueda_Editor_item(
			Listado_noticias_busqueda_Identificado _listado_noticias_busqueda_Identificado,
			basededatos.Noticia noticia) {
		super(_listado_noticias_busqueda_Identificado, noticia);
		this._listado_noticias_busqueda_Identificado.getComboboxlistadonoticiasbusquedaidentificado().addValueChangeListener(event->Pagina_noticia_Editor());
		this.getLayoutlistadonoticiasbusquedaidentificadoitem().setText(noticia.getTitulo());
	}

	public void Pagina_noticia_Editor() {
		this._listado_noticias_busqueda_Identificado._identificado.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		this._pagina_noticia_Identificado = new Pagina_noticia_Editor(this, noticia);
		this._listado_noticias_busqueda_Identificado._identificado.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(this._pagina_noticia_Identificado);
	}
}