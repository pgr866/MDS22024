package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import vistas.VistaListadonoticiasordenarportada;
import base_de_datos.BDPrincipal;
import base_de_datos.iEditor;

public class Listado_noticias_ordenar_portada extends VistaListadonoticiasordenarportada {
	
	iEditor ieditor = new BDPrincipal();
	public Listado_noticias_portada_Editor_item _listado_noticias_portada_Editor;
	public Vector<Listado_noticias_ordenar_portada_item> _item = new Vector<Listado_noticias_ordenar_portada_item>();
	
	public Listado_noticias_ordenar_portada(Listado_noticias_portada_Editor_item _listado_noticias_portada_Editor) {
		super();
		this._listado_noticias_portada_Editor = _listado_noticias_portada_Editor;
		try {
			basededatos.Noticia[] noticias = ieditor.Cargar_noticias();
			Vector<String> titulos = new Vector<String>();
			for (int i=0;i<noticias.length;i++){
				Listado_noticias_ordenar_portada_item item = new Listado_noticias_ordenar_portada_item(this,noticias[i]);
				this._item.add(item);
				titulos.add(noticias[i].getTitulo());
			}
			this.getComboboxlistadonoticiasordenarportada().setItems(titulos);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}