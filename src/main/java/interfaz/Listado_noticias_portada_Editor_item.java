package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.BDPrincipal;
import base_de_datos.iEditor;

public class Listado_noticias_portada_Editor_item extends Listado_noticias_portada_Identificado_item {
	
//	private event _cambiar_orden_noticias_portada;
	iEditor ieditor = new BDPrincipal();
	public Listado_noticias_ordenar_portada _listado_noticias_ordenar_portada;
	public Pagina_noticia_Editor _pagina_noticia_Editor;
	
	public Listado_noticias_portada_Editor_item(Listado_noticias_portada_Editor _listado_noticias_portada,
			basededatos.Noticia noticia) {
		super(_listado_noticias_portada, noticia);
		this.getTitulolistadonoticiasportadaidentificado().setVisible(false);
		this.getLayouttitulonoticiaordenarportadaidentificado().setVisible(true);
		this._listado_noticias_ordenar_portada = new Listado_noticias_ordenar_portada(this);
		Listado_noticias_ordenar_portada();
		this._listado_noticias_ordenar_portada.getComboboxlistadonoticiasordenarportada().setValue(noticia.getTitulo());
		this.getButtonimagenlistadonoticiasportadaidentificado().addClickListener(event->Pagina_noticia_Editor());
		this._listado_noticias_ordenar_portada.getComboboxlistadonoticiasordenarportada().addValueChangeListener(event->Cambiar_orden_noticias_portada());	
	}
	
	public void Listado_noticias_ordenar_portada() {
		this.getLayouttitulonoticiaordenarportadaidentificado().as(VerticalLayout.class).add(_listado_noticias_ordenar_portada);
	}

	public void Cambiar_orden_noticias_portada() {
		String titulo_noticia = this._listado_noticias_ordenar_portada.getComboboxlistadonoticiasordenarportada().getValue();
		int posicion_portada = this._listado_noticias_portada_Identificado._item.indexOf(this);
		ieditor.Cambiar_orden_noticias_portada(titulo_noticia, posicion_portada);
		((Listado_noticias_portada_Editor) this._listado_noticias_portada_Identificado)._editor.Listado_noticias_portada_Editor(); // Refrescar pagina
	}

	public void Pagina_noticia_Editor() {
		((Listado_noticias_portada_Editor) this._listado_noticias_portada_Identificado)._editor.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		this._pagina_noticia_Editor = new Pagina_noticia_Editor(this, noticia);
		((Listado_noticias_portada_Editor) this._listado_noticias_portada_Identificado)._editor.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(this._pagina_noticia_Editor);
	}
}