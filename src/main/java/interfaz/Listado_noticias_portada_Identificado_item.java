package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListadonoticiasportadaidentificado_item;

public class Listado_noticias_portada_Identificado_item extends VistaListadonoticiasportadaidentificado_item {
	
	public Listado_noticias_portada_Identificado _listado_noticias_portada_Identificado;
	public Pagina_noticia_Identificado _pagina_noticia_Identificado;
	basededatos.Noticia noticia;
			
	public Listado_noticias_portada_Identificado_item(Listado_noticias_portada_Identificado _listado_noticias_portada_Identificado,
			basededatos.Noticia noticia) {
		super();
		this._listado_noticias_portada_Identificado = _listado_noticias_portada_Identificado;
		this.getLayouttitulonoticiaordenarportadaidentificado().setVisible(false);
		this.noticia = noticia;
		this.getTitulolistadonoticiasportadaidentificado().setText(noticia.getTitulo());
		this.getImagenlistadonoticiasportadaidentificado().setSrc(noticia.getUrl_imagen_noticia());
		this.getLabelfechalistadonoticiasportadaidentificado().setText(noticia.getFecha());
		this.getLabelautorlistadonoticiasportadaidentificado().setText(noticia.getCrea().getNombre() + " " + noticia.getCrea().getApellidos());
		this.getLabellugarlistadonoticiasportadaidentificado().setText(noticia.getLugar());
		this.getTextarearesumenlistadonoticiasportadaidentificado().setValue(noticia.getResumen());
		this.getTitulolistadonoticiasportadaidentificado().addClickListener(event->Pagina_noticia_Identificado());
	}

	public void Pagina_noticia_Identificado() {
		this._listado_noticias_portada_Identificado._identificado.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		this._pagina_noticia_Identificado = new Pagina_noticia_Identificado(this, noticia);
		this._listado_noticias_portada_Identificado._identificado.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(this._pagina_noticia_Identificado);
	}
}