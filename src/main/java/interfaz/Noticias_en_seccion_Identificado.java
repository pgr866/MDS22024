package interfaz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

import basededatos.Noticia;
import vistas.VistaNoticiasenseccionidentificado;

public class Noticias_en_seccion_Identificado extends VistaNoticiasenseccionidentificado {

	public Explorar_secciones_Identificado _explorar_secciones_Identificado;
	public Vector<Noticias_en_seccion_Identificado_item> _item = new Vector<Noticias_en_seccion_Identificado_item>();

	public Noticias_en_seccion_Identificado(Explorar_secciones_Identificado _explorar_secciones_Identificado) {
		super();
		this._explorar_secciones_Identificado = _explorar_secciones_Identificado;

		basededatos.Noticia[] noticias_seccion = new basededatos.Noticia[0];
		for (Secciones_Identificado_item seccion : this._explorar_secciones_Identificado._secciones_Identificado._item) {
			if (seccion.seccion.getTitulo_seccion() == this._explorar_secciones_Identificado._secciones_Identificado
					.getComboboxseccionesidentificado().getValue()) {
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
				Noticias_en_seccion_Identificado_item item;
				if (this._explorar_secciones_Identificado._identificado instanceof Editor)
					item = new Noticias_en_seccion_Editor_item(this, noticias_seccion[i]);
				else
					item = new Noticias_en_seccion_Identificado_item(this, noticias_seccion[i]);
				this._item.add(item);
				this.getNoticiasenseccionidentificado().add(item);
			}
		}
	}
}