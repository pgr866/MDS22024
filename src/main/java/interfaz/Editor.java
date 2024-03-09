package interfaz;

import proyectoMDS.MainView;


//import basededatos.iEditor;

public class Editor extends Identificado {
//	public iEditor _iEditor;
	public Listado_noticias_portada_Editor _listado_noticias_portada_Editor;
	public Noticias_a_revisar _noticias_a_revisar;
	public Baja_Alta_Periodistas _baja_Alta_Periodistas;
	public Explorar_secciones_Editor _explorar_secciones_Editor;
	
	public Editor (MainView mainview) {
		super(mainview);
	}

	public void Listado_noticias_portada_Editor() {
		throw new UnsupportedOperationException();
	}

	public void Noticias_a_revisar() {
		throw new UnsupportedOperationException();
	}

	public void Baja_Alta_Periodistas() {
		throw new UnsupportedOperationException();
	}

	public void Explorar_secciones_Editor() {
		throw new UnsupportedOperationException();
	}
}