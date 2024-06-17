package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import vistas.VistaListadonoticiasportadaidentificado;
import base_de_datos.BDPrincipal;
import base_de_datos.iIdentificado;

public class Listado_noticias_portada_Identificado extends VistaListadonoticiasportadaidentificado {

	iIdentificado iidentificado = new BDPrincipal();
	public Vector<Listado_noticias_portada_Identificado_item> _item = new Vector<Listado_noticias_portada_Identificado_item>();
	public Identificado _identificado;

	public Listado_noticias_portada_Identificado(Identificado _identificado) {
		super();
		this._identificado = _identificado;
		try {
			basededatos.Noticia[] noticias = iidentificado.Cargar_noticias();
			Vector<Listado_noticias_portada_Identificado_item> aux = new Vector<Listado_noticias_portada_Identificado_item>();
			for (int i = 0; i < noticias.length; i++) {
				if (noticias[i].getPortada_contiene_noticias() != null) {
					if (_identificado instanceof Editor)
						aux.add(new Listado_noticias_portada_Editor_item(this, noticias[i]));
					else
						aux.add(new Listado_noticias_portada_Identificado_item(this, noticias[i]));
					_item.add(null);
				}
			}

			for (Listado_noticias_portada_Identificado_item noticia : aux)
				_item.set(noticia.noticia.getPosicion_portada(), noticia);

			for (Listado_noticias_portada_Identificado_item item : _item)
				this.getLayoutlistadonoticiasportadaidentificado().add(item);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}