package interfaz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

import basededatos.Noticia;
import vistas.VistaNoticiasenseccionusuarionoregistrado;

public class Noticias_en_seccion_Usuario_no_registrado extends VistaNoticiasenseccionusuarionoregistrado {

	public Explorar_secciones_Usuario_no_registrado _explorar_secciones_Usuario_no_registrado;
	public Vector<Noticias_en_seccion_Usuario_no_registrado_item> _item = new Vector<Noticias_en_seccion_Usuario_no_registrado_item>();

	public Noticias_en_seccion_Usuario_no_registrado(
			Explorar_secciones_Usuario_no_registrado _explorar_secciones_Usuario_no_registrado) {
		super();
		this._explorar_secciones_Usuario_no_registrado = _explorar_secciones_Usuario_no_registrado;

		basededatos.Noticia[] noticias_seccion = new basededatos.Noticia[0];
		for (Secciones_Usuario_no_registrado_item seccion : this._explorar_secciones_Usuario_no_registrado._secciones_Usuario_no_registrado._item) {
			if (seccion.seccion
					.getTitulo_seccion() == this._explorar_secciones_Usuario_no_registrado._secciones_Usuario_no_registrado
							.getComboboxseccionesusuarionoregistrado().getValue()) {
				noticias_seccion = seccion.seccion.aparece_en.toArray();
				break;
			}
		}
		
		Arrays.sort(noticias_seccion, new Comparator<Noticia>() {
			@Override
			public int compare(Noticia c1, Noticia c2) {
				return Integer.compare(c2.getId_noticia(), c1.getId_noticia());
			}
		});

		for (int i = 0; i < noticias_seccion.length; i++) {
			if (noticias_seccion[i].getElimina_noticia() == null) {
				Noticias_en_seccion_Usuario_no_registrado_item item = new Noticias_en_seccion_Usuario_no_registrado_item(
						this, noticias_seccion[i]);
				this._item.add(item);
				this.getNoticiasenseccionusuarionoregistrado().add(item);
			}
		}
	}
}