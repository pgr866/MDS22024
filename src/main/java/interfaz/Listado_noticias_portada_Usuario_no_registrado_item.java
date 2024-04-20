package interfaz; //DINAMICO

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listado_noticias_portada_Usuario_no_registrado_item extends Listado_noticias_portada_item {
	public Pagina_noticia_Usuario_no_registrado _pagina_noticia_Usuario_no_registrado;
	
	public Listado_noticias_portada_Usuario_no_registrado_item(Listado_noticias_portada _listado_noticias_portada) {
		super(_listado_noticias_portada);
		this.getTitulolistadonoticiasportada().addClickListener(event->Pagina_noticia_Usuario_no_registrado());
	}

	public void Pagina_noticia_Usuario_no_registrado() {
		((Listado_noticias_portada_Usuario_no_registrado) this._listado_noticias_portada)._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).removeAll();
		this._pagina_noticia_Usuario_no_registrado = new Pagina_noticia_Usuario_no_registrado(this, null, null);
		((Listado_noticias_portada_Usuario_no_registrado) this._listado_noticias_portada)._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).add(this._pagina_noticia_Usuario_no_registrado);
	}
}