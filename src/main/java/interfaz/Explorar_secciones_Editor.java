package interfaz;

import com.vaadin.flow.component.listbox.MultiSelectListBox;

public class Explorar_secciones_Editor extends Explorar_secciones_Identificado {
	
	//	private event _anadir_seccion;
	//	private event _borrar_seccion;
	public Editor _editor;
	
	public Explorar_secciones_Editor(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		this.getLayoutnombrebotonesexplorarsecciones().setVisible(true);
		this.getButtonanadirseccionexplorarsecciones().addClickListener(event->Anadir_seccion());
		this.getButtoneliminarexplorarsecciones().addClickListener(event->Borrar_seccion());
	}

	public void Anadir_seccion() {
		String nombre_seccion = (String) this.getTextfieldnombreexplorarsecciones().getValue();
		// crear seccion BD
		this._editor.Explorar_secciones_Editor(); // Refrescar pagina
	}

	public void Borrar_seccion() {
		String nombre_seccion = (String) this._secciones.getDesplegablesecciones().getValue();
		// eliminar seccion BD
		this._editor.Explorar_secciones_Editor(); // Refrescar pagina
	}
}