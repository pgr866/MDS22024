package interfaz;

public class Seccion_comentarios_Usuario_no_registrado_item extends Seccion_comentarios_item {
	
	public Seccion_comentarios_Usuario_no_registrado_item(Seccion_comentarios _seccion_comentarios, basededatos.Comentario comentario) {
		super(_seccion_comentarios, comentario);
		this._mostrar_valoracion_comentario.getMegustaseccioncomentariositem().setDisableOnClick(true);
		this._mostrar_valoracion_comentario.getNomegustaseccioncomentariositem().setDisableOnClick(true);
		this.getLayoutborrarcomentarioseccioncomentariositem().setVisible(false);   
	}
}