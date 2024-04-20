package interfaz;

public class Seccion_comentarios_Identificado_item extends Seccion_comentarios_item {
//	private event _valorar_comentario;
//	private Button _me_gusta;
//	private Button _no_me_gusta;
	public Seccion_comentarios_Identificado _seccion_comentarios_Identificado;

	public Seccion_comentarios_Identificado_item(Seccion_comentarios _seccion_comentarios) {
		super(_seccion_comentarios);
		this._mostrar_valoracion_comentario.getMegustaseccioncomentariositem().addClickListener(event->Valorar_comentario(false));
		this._mostrar_valoracion_comentario.getNomegustaseccioncomentariositem().addClickListener(event->Valorar_comentario(true));
	}
	
	public void Valorar_comentario(boolean no_me_gusta) {
		// update comentario BD
		if (no_me_gusta) {
			int n = Integer.parseInt(this._mostrar_valoracion_comentario.getNumeronomegustamostrarvaloracioncomentario().getText());
			this._mostrar_valoracion_comentario.getNumeronomegustamostrarvaloracioncomentario().setText(String.valueOf(++n));
		} else {
			int n = Integer.parseInt(this._mostrar_valoracion_comentario.getNumeromegustamostrarvaloracioncomentario().getText());
			this._mostrar_valoracion_comentario.getNumeromegustamostrarvaloracioncomentario().setText(String.valueOf(++n));
		}		
	}
}