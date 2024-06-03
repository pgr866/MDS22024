package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import vistas.VistaListadonoticiasbusquedaidentificado;
import base_de_datos.BDPrincipal;
import base_de_datos.iIdentificado;

public class Listado_noticias_busqueda_Identificado extends VistaListadonoticiasbusquedaidentificado {
	
	iIdentificado iidentificado = new BDPrincipal();
	public Identificado _identificado;
	public Vector<Listado_noticias_busqueda_Identificado_item> _item = new Vector<Listado_noticias_busqueda_Identificado_item>();
	
	public Listado_noticias_busqueda_Identificado(Identificado _identificado) {
		super();
		this._identificado = _identificado;
		try {
			basededatos.Noticia[] noticias = iidentificado.Cargar_noticias();
			Vector<String> titulos = new Vector<String>();
			for (int i=0;i<noticias.length;i++){
				Listado_noticias_busqueda_Identificado_item item = new Listado_noticias_busqueda_Identificado_item(this,noticias[i]);
				this._item.add(item);
				titulos.add(noticias[i].getTitulo());
			}
			this.getComboboxlistadonoticiasbusquedaidentificado().setItems(titulos);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}