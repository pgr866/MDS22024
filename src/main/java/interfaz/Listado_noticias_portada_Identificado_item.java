package interfaz; //DINAMICO

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listado_noticias_portada_Identificado_item extends Listado_noticias_portada_item {
	public Pagina_noticia_Identificado _pagina_noticia_Identificado;
			
	public Listado_noticias_portada_Identificado_item(Listado_noticias_portada_Identificado _listado_noticias_portada) {
		super(_listado_noticias_portada);
		this.getTitulolistadonoticiasportada().addClickListener(event->Pagina_noticia_Identificado());
	}

	public void Pagina_noticia_Identificado() {
		((Listado_noticias_portada_Identificado) this._listado_noticias_portada)._identificado.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		this._pagina_noticia_Identificado = new Pagina_noticia_Identificado(this, null, null, null);
		((Listado_noticias_portada_Identificado) this._listado_noticias_portada)._identificado.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(this._pagina_noticia_Identificado);
	}
}