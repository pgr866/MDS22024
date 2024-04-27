package interfaz;

public class Mostrar_comentario extends vistas.VistaMostrarcomentario {

	public Seccion_comentarios_item _seccion_comentarios;
	basededatos.Comentario comentario;
	
	public Mostrar_comentario(Seccion_comentarios_item _seccion_comentarios, basededatos.Comentario comentario) {
		super();
		this._seccion_comentarios = _seccion_comentarios;
		this.comentario = comentario;
		this.getTextareacontenidocomentario().setValue(comentario.getContenido());;
	}
}