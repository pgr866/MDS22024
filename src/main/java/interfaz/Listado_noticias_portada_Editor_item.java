package interfaz; //DINAMICO

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listado_noticias_portada_Editor_item extends Listado_noticias_portada_Identificado_item {
//	private event _cambiar_orden_noticias_portada;
	public Pagina_noticia_Editor _pagina_noticia_Editor;
	
	public Listado_noticias_portada_Editor_item(Listado_noticias_portada_Editor _listado_noticias_portada,
			basededatos.Noticia noticia) {
		super(_listado_noticias_portada, noticia);
		this.getTitulolistadonoticiasportada().setVisible(false);
		this.getComboboxtitulolistadonoticiasportada().setVisible(true);
		this.getTitulolistadonoticiasportada().addClickListener(event->Pagina_noticia_Editor());
	}

	public void Cambiar_orden_noticias_portada() {
		throw new UnsupportedOperationException();
	}

	public void Pagina_noticia_Editor() {
		((Listado_noticias_portada_Editor) this._listado_noticias_portada)._editor.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		this._pagina_noticia_Editor = new Pagina_noticia_Editor(this, noticia);
		((Listado_noticias_portada_Editor) this._listado_noticias_portada)._editor.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(this._pagina_noticia_Editor);
	}
}

