package interfaz;

public class Mostrar_valoracion_comentario extends vistas.VistaMostrarvaloracioncomentario {

	public Seccion_comentarios_item _seccion_comentarios;
	basededatos.Comentario comentario;
	
	public Mostrar_valoracion_comentario(Seccion_comentarios_item _seccion_comentarios, basededatos.Comentario comentario) {
		super();
		this._seccion_comentarios = _seccion_comentarios;
		this.comentario = comentario;
		this.getNumeromegustamostrarvaloracioncomentario().setText(String.valueOf(comentario.getValoraciones_positivas()));
		this.getNumeronomegustamostrarvaloracioncomentario().setText(String.valueOf(comentario.getValoraciones_negativas()));
	}
}