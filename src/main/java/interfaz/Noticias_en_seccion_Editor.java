package interfaz;

import java.util.Vector;

public class Noticias_en_seccion_Editor extends Noticias_en_seccion_Identificado {
	
	public Explorar_secciones_Editor _explorar_secciones_Editor;
	public Vector<Noticias_en_seccion_Editor_item> _item = new Vector<Noticias_en_seccion_Editor_item>();
	
	public Noticias_en_seccion_Editor(Explorar_secciones_Editor _explorar_secciones_Editor) {
		super(_explorar_secciones_Editor);
		this._explorar_secciones_Editor = _explorar_secciones_Editor;
	}
}