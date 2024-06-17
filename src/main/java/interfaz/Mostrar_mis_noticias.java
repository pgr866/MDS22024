package interfaz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

import basededatos.Comentario;
import basededatos.Noticia;

public class Mostrar_mis_noticias extends vistas.VistaMostrarmisnoticias {

	public Periodista _periodista;
	public Vector<Mostrar_mis_noticias_item> _item = new Vector<Mostrar_mis_noticias_item>();

	public Mostrar_mis_noticias(Periodista _periodista) {
		super();
		this._periodista = _periodista;
		Vector<String> titulos = new Vector<String>();
		for (Listado_noticias_busqueda_Identificado_item noticia : this._periodista._listado_noticias_busqueda_Identificado._item) {
			if (noticia.noticia.getCrea().getId() == this._periodista.identificado.getId() && noticia.noticia.getPublica() != null && noticia.noticia.getElimina_noticia() == null) {
				Mostrar_mis_noticias_item item = new Mostrar_mis_noticias_item(this, noticia.noticia);
				this._item.add(item);
				titulos.add(noticia.noticia.getTitulo());
			}
		}
		this.getComboboxmostrarmisnoticias().setItems(titulos);
		this.getComboboxmostrarmisnoticias().addValueChangeListener(event -> {
			_periodista._listado_noticias_busqueda_Identificado = new Listado_noticias_busqueda_Identificado(_periodista);
			_periodista.Listado_noticias_busqueda_Identificado();
			_periodista._mostrar_mis_noticias = new Mostrar_mis_noticias(_periodista);
			_periodista.Mostrar_mis_noticias();
			_periodista._mostrar_mis_noticias._item.stream().filter(item -> item.noticia.getTitulo().equals(event.getValue()))
			.findFirst().ifPresent(item -> item.Pagina_noticia_Identificado());
		});
	}
}