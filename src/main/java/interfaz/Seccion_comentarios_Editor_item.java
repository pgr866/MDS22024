package interfaz;

import org.orm.PersistentException;

import base_de_datos.BDPrincipal;
import base_de_datos.iEditor;

public class Seccion_comentarios_Editor_item extends Seccion_comentarios_Identificado_item {
	
//	private event _eliminar_comentario;
	iEditor ieditor = new BDPrincipal();

	public Seccion_comentarios_Editor_item(Seccion_comentarios _seccion_comentarios,
			basededatos.Editor editor, basededatos.Comentario comentario) {
	super(_seccion_comentarios, editor, comentario);
	this.getButtonborrarcomentario().addClickListener(event->Eliminar_comentario());
}

	public void Eliminar_comentario() {
		int id_comentario = this.comentario.getId_comentario();
		int id_editor = this.identificado.getId();
		try {
			((Seccion_comentarios_Editor) this._seccion_comentarios)._pagina_noticia_Editor.noticia = this.ieditor.Eliminar_comentario(id_comentario, id_editor);
			// Refrescar pagina
			((Seccion_comentarios_Editor) this._seccion_comentarios)._pagina_noticia_Editor._seccion_comentarios_Editor = new Seccion_comentarios_Editor(((Seccion_comentarios_Editor) this._seccion_comentarios)._pagina_noticia_Editor);
			((Seccion_comentarios_Editor) this._seccion_comentarios)._pagina_noticia_Editor.Seccion_comentarios_Editor();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}
