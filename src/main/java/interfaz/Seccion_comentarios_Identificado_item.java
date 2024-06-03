package interfaz;

import org.orm.PersistentException;

import base_de_datos.BDPrincipal;
import base_de_datos.iIdentificado;

public class Seccion_comentarios_Identificado_item extends Seccion_comentarios_item {

//	private event _valorar_comentario;
//	private Button _me_gusta;
//	private Button _no_me_gusta;
	iIdentificado iidentificado = new BDPrincipal();
	basededatos.Identificado identificado;

	public Seccion_comentarios_Identificado_item(Seccion_comentarios _seccion_comentarios,
			basededatos.Identificado identificado, basededatos.Comentario comentario) {
		super(_seccion_comentarios, comentario);
		this.identificado = identificado;
		this._mostrar_valoracion_comentario.getMegustaseccioncomentariositem()
				.addClickListener(event -> Valorar_comentario(true));
		this._mostrar_valoracion_comentario.getNomegustaseccioncomentariositem()
				.addClickListener(event -> Valorar_comentario(false));
	}

	public void Valorar_comentario(boolean positiva) {
		int id_comentario = this.comentario.getId_comentario();
		int id_identificado = this.identificado.getId();
		try {
			basededatos.Noticia noticia = iidentificado.Valorar_comentario(id_comentario, id_identificado, positiva);
			// Refrescar pagina
			if (identificado instanceof basededatos.Editor) {
				((Seccion_comentarios_Editor) this._seccion_comentarios)._pagina_noticia_Editor.noticia = noticia;
				this._seccion_comentarios = new Seccion_comentarios_Identificado(((Seccion_comentarios_Editor) this._seccion_comentarios)._pagina_noticia_Editor);
				((Seccion_comentarios_Editor) this._seccion_comentarios)._pagina_noticia_Editor.Seccion_comentarios_Editor();
			} else {
				((Seccion_comentarios_Identificado) this._seccion_comentarios)._pagina_noticia_Identificado.noticia = noticia;
				this._seccion_comentarios = new Seccion_comentarios_Identificado(((Seccion_comentarios_Identificado) this._seccion_comentarios)._pagina_noticia_Identificado);
				((Seccion_comentarios_Identificado) this._seccion_comentarios)._pagina_noticia_Identificado.Seccion_comentarios_Identificado();
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}