package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.listbox.MultiSelectListBox;

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
//			Vector<String> titulos = new Vector<String>();
			for (int i = 0; i < noticias_revisar.length; i++) {
				Noticias_a_revisar_item item = new Noticias_a_revisar_item(this, noticias_revisar[i]);
				this._item.add(item);
				this.getListboxnoticiasarevisar().as(MultiSelectListBox.class).add(item);
//				titulos.add(noticias_revisar[i].getTitulo());
			}
//			this.getSelectnoticiasarevisar().setItems(titulos); // si no funciona probar con _item

			this.getSelectnoticiasarevisar().addValueChangeListener(event -> {
				Noticias_a_revisar_item nari = new Noticias_a_revisar_item(this,
						(basededatos.Noticia) event.getValue());
			});
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}
