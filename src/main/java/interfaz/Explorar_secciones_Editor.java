package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;

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
		this.getLayoutnombrebotonesexplorarseccionesidentificado().setVisible(true);
		this.getButtonanadirseccionexplorarseccionesidentificado().addClickListener(event->Anadir_seccion());
		this.getButtoneliminarexplorarseccionesidentificado().addClickListener(event->Borrar_seccion());
	}

	public void Anadir_seccion() {
		String nombre = this.getTextfieldnombreexplorarseccionesidentificado().getValue();
		int id_editor = this._editor.identificado.getId();
		
		if (nombre.isBlank()) {
			Notification.show("Debe rellenar el título de la nueva sección");
		}
		else {
			try {
				ieditor.Anadir_seccion(nombre, id_editor);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			this._editor.Explorar_secciones_Editor(); // Refrescar pagina
		}
	}

	public void Borrar_seccion() {
		String nombre = (String) this._secciones_Identificado.getComboboxseccionesidentificado().getValue();
		int id_editor = this._editor.identificado.getId();
		try {
			ieditor.Borrar_seccion(nombre, id_editor);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		this._editor.Explorar_secciones_Editor(); // Refrescar pagina
	}
}