package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListadonoticiasportadausuarionoregistrado_item;

public class Listado_noticias_portada_Usuario_no_registrado_item extends VistaListadonoticiasportadausuarionoregistrado_item {
	
	public Listado_noticias_portada_Usuario_no_registrado _listado_noticias_portada_Usuario_no_registrado;
	public Pagina_noticia_Usuario_no_registrado _pagina_noticia_Usuario_no_registrado;
	basededatos.Noticia noticia;
	
	public Listado_noticias_portada_Usuario_no_registrado_item(Listado_noticias_portada_Usuario_no_registrado _listado_noticias_portada_Usuario_no_registrado,
			basededatos.Noticia noticia) {
		super();
		this._listado_noticias_portada_Usuario_no_registrado = _listado_noticias_portada_Usuario_no_registrado;
		this.getLayouttitulonoticiaordenarportadausuarionoregistrado().setVisible(false);
		this.noticia = noticia;
		this.getTitulolistadonoticiasportadausuarionoregistrado().setText(noticia.getTitulo());
		this.getImagenlistadonoticiasportadausuarionoregistrado().setSrc(noticia.getUrl_imagen_noticia());
		this.getLabelfechalistadonoticiasportadausuarionoregistrado().setText(noticia.getFecha());
		this.getLabelautorlistadonoticiasportadausuarionoregistrado().setText(noticia.getCrea().getNombre() + " " + noticia.getCrea().getApellidos());
		this.getLabellugarlistadonoticiasportadausuarionoregistrado().setText(noticia.getLugar());
		this.getTextarearesumenlistadonoticiasportadausuarionoregistrado().setValue(noticia.getResumen());
		this.getTitulolistadonoticiasportadausuarionoregistrado().addClickListener(event->Pagina_noticia_Usuario_no_registrado());
	}

	public void Pagina_noticia_Usuario_no_registrado() {
		this._listado_noticias_portada_Usuario_no_registrado._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).removeAll();
		this._pagina_noticia_Usuario_no_registrado = new Pagina_noticia_Usuario_no_registrado(this, noticia);
		this._listado_noticias_portada_Usuario_no_registrado._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).add(this._pagina_noticia_Usuario_no_registrado);
	}
}