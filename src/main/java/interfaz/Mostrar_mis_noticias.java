package interfaz;

import java.util.Vector;
import basededatos.Noticia;

public class Mostrar_mis_noticias extends vistas.VistaMostrarmisnoticias {

	public Periodista _periodista;
	public Vector<Mostrar_mis_noticias_item> _item = new Vector<Mostrar_mis_noticias_item>();

	public Mostrar_mis_noticias(Periodista _periodista) {
		super();
		this._periodista = _periodista;
		Noticia[] mis_noticias = ((basededatos.Periodista) this._periodista.identificado).es_creada.toArray();
		Vector<String> titulos = new Vector<String>();
		for (int i = 0; i < mis_noticias.length; i++) {
			if (mis_noticias[i].getElimina_noticia() == null && mis_noticias[i].getPublica() != null) {
				Mostrar_mis_noticias_item item = new Mostrar_mis_noticias_item(this, mis_noticias[i]);
				this._item.add(item);
				titulos.add(mis_noticias[i].getTitulo());
			}
		}
		this.getComboboxmostrarmisnoticias().setItems(titulos);
	}
}