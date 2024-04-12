package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaMostrarmisnoticias_item;

public class Mostrar_mis_noticias_item extends VistaMostrarmisnoticias_item {
	public Mostrar_mis_noticias _mostrar_mis_noticias;
	public Pagina_noticia_Identificado _pagina_noticia_Identificado;

	public Mostrar_mis_noticias_item(Mostrar_mis_noticias _mostrar_mis_noticias) {
		super();
		this._mostrar_mis_noticias = _mostrar_mis_noticias;
		this._mostrar_mis_noticias.getComboboxmostrarmisnoticias().addValueChangeListener(event->Pagina_noticia_Identificado());
	}

	public void Pagina_noticia_Identificado() {
		if(this.getLayoutmostrarmisnoticiasitem().getText() == (String) this._mostrar_mis_noticias.getComboboxmostrarmisnoticias().getValue()) {
			this._mostrar_mis_noticias._periodista.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
			this._pagina_noticia_Identificado = new Pagina_noticia_Identificado(null, null, null, this);
			this._mostrar_mis_noticias._periodista.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_pagina_noticia_Identificado);
		}
	}
}