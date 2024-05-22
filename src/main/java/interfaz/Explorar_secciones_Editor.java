package interfaz;

import base_de_datos.BDPrincipal;
import base_de_datos.iEditor;

public class Explorar_secciones_Editor extends Explorar_secciones_Identificado {
	
	//	private event _anadir_seccion;
	//	private event _borrar_seccion;
	iEditor ieditor = new BDPrincipal();
	public Editor _editor;
	
	public Explorar_secciones_Editor(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		this.getLayoutnombrebotonesexplorarsecciones().setVisible(true);
		this.getButtonanadirseccionexplorarsecciones().addClickListener(event->Anadir_seccion());
		this.getButtoneliminarexplorarsecciones().addClickListener(event->Borrar_seccion());
	}

	public void Anadir_seccion() {
		String nombre = this.getTextfieldnombreexplorarsecciones().getValue();
		int id_editor = this._editor.identificado.getId();
		ieditor.Anadir_seccion(nombre, id_editor);
		this._editor.Explorar_secciones_Editor(); // Refrescar pagina
	}

	public void Borrar_seccion() {
		String nombre = (String) this._secciones.getDesplegablesecciones().getValue();
		int id_editor = this._editor.identificado.getId();
		ieditor.Borrar_seccion(nombre, id_editor);
		this._editor.Explorar_secciones_Editor(); // Refrescar pagina
	}
}