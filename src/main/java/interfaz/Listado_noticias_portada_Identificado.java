package interfaz;

import java.util.Vector;
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
		basededatos.Noticia[] noticias = iidentificado.Cargar_noticias_portada();
		for (int i=0;i<noticias.length;i++){
			Listado_noticias_portada_Identificado_item item = new Listado_noticias_portada_Identificado_item(this,noticias[i]);
			this._item.add(item);
			this.getLayoutlistadonoticiasportadaidentificado().add(item);
		}
	}
}