package interfaz;

public class Mostrar_comentario extends vistas.VistaMostrarcomentario {

	public Seccion_comentarios_item _seccion_comentarios;
	basededatos.Comentario comentario;
	
	public Mostrar_comentario(Seccion_comentarios_item _seccion_comentarios, basededatos.Comentario comentario) {
		super();
		this._seccion_comentarios = _seccion_comentarios;
		this.comentario = comentario;
		this.getTextareacontenidocomentario().setValue(comentario.getContenido());
		this.getTextareacontenidocomentario().getElement().executeJs(
	            "this.shadowRoot.querySelector('[part=\"input-field\"]').style.border = 'none';" +
	            "this.shadowRoot.querySelector('[part=\"input-field\"]').style.boxShadow = 'none';"
	        );
		this.getTextareacontenidocomentario().getElement().executeJs(
	            "var textArea = this;" +
	            "textArea.style.height = 'auto';" +
	            "textArea.style.height = textArea.scrollHeight + 'px';"
	        );
	}
}