package interfaz;

import java.util.Vector;

import vistas.VistaNoticiasenseccionidentificado;

public class Noticias_en_seccion_Identificado extends VistaNoticiasenseccionidentificado {
	
	public Explorar_secciones_Identificado _explorar_secciones_Identificado;
	public Vector<Noticias_en_seccion_Identificado_item> _item = new Vector<Noticias_en_seccion_Identificado_item>();
	
	public Noticias_en_seccion_Identificado(Explorar_secciones_Identificado _explorar_secciones_Identificado) {
		super();
		this._explorar_secciones_Identificado = _explorar_secciones_Identificado;
	}
}