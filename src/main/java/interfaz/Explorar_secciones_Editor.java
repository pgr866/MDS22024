package interfaz;

import org.orm.PersistentException;

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
		basededatos.Seccion nueva_seccion = new basededatos.Seccion();
		nueva_seccion.setTitulo_seccion(this.getTextfieldnombreexplorarsecciones().getValue());
		nueva_seccion.setEsEliminada(false);
		nueva_seccion.setCrea_seccion((basededatos.Editor) this._editor.identificado);
		this._editor.Explorar_secciones_Editor(); // Refrescar pagina
	}

	public void Borrar_seccion() {
		String titulo_seccion = (String) this._secciones.getDesplegablesecciones().getValue();
		try {
			basededatos.Seccion[] consulta = basededatos.SeccionDAO.listSeccionByQuery(
					"Titulo_seccion = '" + titulo_seccion + "'", "");
			if (consulta.length > 0) {
				consulta[0].setElimina((basededatos.Editor) this._editor.identificado);
				consulta[0].setEsEliminada(true);
			}
			this._editor.Explorar_secciones_Editor(); // Refrescar pagina
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}