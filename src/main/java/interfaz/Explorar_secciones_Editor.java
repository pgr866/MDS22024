package interfaz;

public class Explorar_secciones_Editor extends Explorar_secciones_Identificado {
	
	//	private event _anadir_seccion;
	//	private event _borrar_seccion;
	public Editor _editor;
	
	public Explorar_secciones_Editor(interfaz.Secciones _secciones, Identificado _identificado,
			interfaz.Noticias_en_seccion_Identificado _noticias_en_seccion_Identificado, Editor _editor) {
		super(_secciones, _identificado, _noticias_en_seccion_Identificado);
		this._editor = _editor;
		this.getLayoutnombrebotonesexplorarsecciones().setVisible(true);
	}


	public void Anadir_seccion() {
		throw new UnsupportedOperationException();
	}

	public void Borrar_seccion() {
		throw new UnsupportedOperationException();
	}
}