package interfaz;

public class Seccion_comentarios_Identificado_item extends Seccion_comentarios_item {
//	private event _valorar_comentario;
//	private event _comentar;
//	private Button _me_gusta;
//	private Button _no_me_gusta;
	public Seccion_comentarios_Identificado _seccion_comentarios_Identificado;
	
	public Seccion_comentarios_Identificado_item(Seccion_comentarios _seccion_comentarios) {
		super(_seccion_comentarios);
		this.getLayoutborrarcomentario().setVisible(false);
	}

	public void Valorar_comentario() {
		throw new UnsupportedOperationException();
	}

	public void Comentar() {
		throw new UnsupportedOperationException();
	}
}