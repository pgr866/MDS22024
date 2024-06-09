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
			if (noticia != null) { // Refrescar pagina
				for (basededatos.Comentario comentario : noticia.pertenece_a_noticia.toArray()) {
					if (comentario.getId_comentario() == this.comentario.getId_comentario()) {
						this._mostrar_valoracion_comentario.getNumeronomegustamostrarvaloracioncomentario().setText(String.valueOf(comentario.getValoraciones_negativas()));
						this._mostrar_valoracion_comentario.getNumeromegustamostrarvaloracioncomentario().setText(String.valueOf(comentario.getValoraciones_positivas()));
						break;
					}
				}
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}