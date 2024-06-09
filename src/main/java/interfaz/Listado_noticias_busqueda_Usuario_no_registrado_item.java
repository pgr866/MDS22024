package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListadonoticiasbusquedausuarionoregistrado_item;

public class Listado_noticias_busqueda_Usuario_no_registrado_item extends VistaListadonoticiasbusquedausuarionoregistrado_item {
	
	public Listado_noticias_busqueda_Usuario_no_registrado _listado_noticias_busqueda_Usuario_no_registrado;
	public Pagina_noticia_Usuario_no_registrado _pagina_noticia_Usuario_no_registrado;
	basededatos.Noticia noticia;

	public Listado_noticias_busqueda_Usuario_no_registrado_item(
			Listado_noticias_busqueda_Usuario_no_registrado _listado_noticias_busqueda_Usuario_no_registrado,
			basededatos.Noticia noticia) {
		super();
		this._listado_noticias_busqueda_Usuario_no_registrado = _listado_noticias_busqueda_Usuario_no_registrado;
		this.noticia = noticia;
		this.getLayoutlistadonoticiasbusquedausuarionoregistradoitem().setText(noticia.getTitulo());
	}

	public void Pagina_noticia_Usuario_no_registrado() {
		this._listado_noticias_busqueda_Usuario_no_registrado._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).removeAll();
		this._pagina_noticia_Usuario_no_registrado = new Pagina_noticia_Usuario_no_registrado(this, noticia);
		this._listado_noticias_busqueda_Usuario_no_registrado._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).add(this._pagina_noticia_Usuario_no_registrado);
	}
}