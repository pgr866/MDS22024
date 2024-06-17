package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import vistas.VistaSeccionesidentificado;
import base_de_datos.BDPrincipal;
import base_de_datos.iIdentificado;

public class Secciones_Identificado extends VistaSeccionesidentificado {

	iIdentificado iidentificado = new BDPrincipal();
	public Explorar_secciones_Identificado _explorar_secciones_Identificado;
	public Revisar_noticias _revisar_noticias;
	public Vector<Secciones_Identificado_item> _item = new Vector<Secciones_Identificado_item>();

	public Secciones_Identificado(Explorar_secciones_Identificado _explorar_secciones_Identificado) {
		super();
		this._explorar_secciones_Identificado = _explorar_secciones_Identificado;
		try {
			basededatos.Seccion[] secciones = iidentificado.Cargar_secciones();
			Vector<String> titulos = new Vector<String>();
			for (int i = 0; i < secciones.length; i++) {
				Secciones_Identificado_item item = new Secciones_Identificado_item(this, secciones[i]);
				this._item.add(item);
				titulos.add(secciones[i].getTitulo_seccion());
			}
			this.getComboboxseccionesidentificado().setItems(titulos);
			this.getComboboxseccionesidentificado().addValueChangeListener(event -> {
				this._explorar_secciones_Identificado._noticias_en_seccion_Identificado = new Noticias_en_seccion_Identificado(this._explorar_secciones_Identificado);
				this._explorar_secciones_Identificado.Noticias_en_seccion_Identificado();
			});
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public Secciones_Identificado(Revisar_noticias _revisar_noticias) {
		super();
		this._revisar_noticias = _revisar_noticias;
		try {
			basededatos.Seccion[] secciones = iidentificado.Cargar_secciones();
			Vector<String> titulos = new Vector<String>();
			for (int i = 0; i < secciones.length; i++) {
				Secciones_Identificado_item item = new Secciones_Identificado_item(this, secciones[i]);
				this._item.add(item);
				titulos.add(secciones[i].getTitulo_seccion());
			}
			this.getComboboxseccionesidentificado().setItems(titulos);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}