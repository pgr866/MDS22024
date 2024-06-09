package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaMostrarmisnoticias_item;

public class Mostrar_mis_noticias_item extends VistaMostrarmisnoticias_item {

	public Mostrar_mis_noticias _mostrar_mis_noticias;
	public Pagina_noticia_Identificado _pagina_noticia_Identificado;
	basededatos.Noticia noticia;

	public Mostrar_mis_noticias_item(Mostrar_mis_noticias _mostrar_mis_noticias, basededatos.Noticia noticia) {
		super();
		this._mostrar_mis_noticias = _mostrar_mis_noticias;
		this._mostrar_mis_noticias.getComboboxmostrarmisnoticias()
				.addValueChangeListener(event -> Pagina_noticia_Identificado());
		this.noticia = noticia;
		this.getLayoutmostrarmisnoticiasitem().setText(noticia.getTitulo());
	}

	public void Pagina_noticia_Identificado() {
		this._mostrar_mis_noticias._periodista.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class)
				.removeAll();
		this._pagina_noticia_Identificado = new Pagina_noticia_Identificado(this, noticia);
		this._mostrar_mis_noticias._periodista.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class)
				.add(_pagina_noticia_Identificado);
	}
}