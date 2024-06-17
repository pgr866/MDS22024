package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNoticiasarevisar_item;

public class Noticias_a_revisar_item extends VistaNoticiasarevisar_item {
	
	public Noticias_a_revisar _noticias_a_revisar;
	public Revisar_noticias _revisar_noticias;
	basededatos.Noticia noticia;
	
	public Noticias_a_revisar_item(Noticias_a_revisar _noticias_a_revisar, basededatos.Noticia noticia) {
		super();
		this._noticias_a_revisar = _noticias_a_revisar;
		this.noticia = noticia;
		this.getItemnoticiasarevisar().setText(noticia.getTitulo());
	}

	public void Revisar_noticias() {
		this._noticias_a_revisar._editor.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		_revisar_noticias = new Revisar_noticias(this, this.noticia);
		this._noticias_a_revisar._editor.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_revisar_noticias);
	}
}