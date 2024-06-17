package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNoticiasarevisar;
import base_de_datos.BDPrincipal;
import base_de_datos.iEditor;

public class Noticias_a_revisar extends VistaNoticiasarevisar {

	iEditor ieditor = new BDPrincipal();
	public Editor _editor;
	public Vector<Noticias_a_revisar_item> _item = new Vector<Noticias_a_revisar_item>();

	public Noticias_a_revisar(Editor _editor) {
		super();
		this._editor = _editor;
		try {
			basededatos.Noticia[] noticias_revisar = ieditor.Cargar_noticias_revisar();
			Vector<String> titulos = new Vector<String>();
			for (int i = 0; i < noticias_revisar.length; i++) {
				Noticias_a_revisar_item item = new Noticias_a_revisar_item(this, noticias_revisar[i]);
				this._item.add(item);
				titulos.add(noticias_revisar[i].getTitulo());
			}
			this.getComboboxnoticiasarevisar().setItems(titulos);
			this.getComboboxnoticiasarevisar().addValueChangeListener(event -> _item.stream()
					.filter(item -> item.noticia.getTitulo().equals(event.getValue())).findFirst().ifPresent(item -> {
						this._editor.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
						this._editor.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class)
								.add(new Revisar_noticias(item, item.noticia));
					}));
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}
