package interfaz;

import java.util.Vector;

import vistas.VistaNoticiasenseccionidentificado;

public class Noticias_en_seccion_Identificado extends VistaNoticiasenseccionidentificado {
	
	public Explorar_secciones_Identificado _explorar_secciones_Identificado;
	public Vector<Noticias_en_seccion_Identificado_item> _item = new Vector<Noticias_en_seccion_Identificado_item>();
	
	public Noticias_en_seccion_Identificado(Explorar_secciones_Identificado _explorar_secciones_Identificado) {
		super();
		this._explorar_secciones_Identificado = _explorar_secciones_Identificado;
		
		basededatos.Noticia[] noticias_seccion = new basededatos.Noticia[0];
		for (Secciones_Identificado_item seccion : this._explorar_secciones_Identificado._secciones_Identificado._item) {
			if (seccion.seccion.getTitulo_seccion() == this._explorar_secciones_Identificado._secciones_Identificado.getDesplegableseccionesidentificado().getValue()) {
				noticias_seccion = seccion.seccion.aparece_en.toArray();
				break;
			}
		}
		
		for (int i=0;i<noticias_seccion.length;i++){
			Noticias_en_seccion_Identificado_item item = new Noticias_en_seccion_Identificado_item(this,noticias_seccion[i]);
			this._item.add(item);
			this.getNoticiasenseccionidentificado().add(item);
		}
	}
}