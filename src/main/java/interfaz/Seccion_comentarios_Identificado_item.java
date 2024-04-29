package interfaz;

public class Seccion_comentarios_Identificado_item extends Seccion_comentarios_item {
	
//	private event _valorar_comentario;
//	private Button _me_gusta;
//	private Button _no_me_gusta;
	public Seccion_comentarios_Identificado _seccion_comentarios_Identificado;

	public Seccion_comentarios_Identificado_item(Seccion_comentarios _seccion_comentarios, basededatos.Identificado identificado,
			basededatos.Comentario comentario) {
		super(_seccion_comentarios, identificado, comentario);
		this._mostrar_valoracion_comentario.getMegustaseccioncomentariositem().addClickListener(event->Valorar_comentario(true));
		this._mostrar_valoracion_comentario.getNomegustaseccioncomentariositem().addClickListener(event->Valorar_comentario(false));
	}
	
	public void Valorar_comentario(boolean positiva) {
		int mg = this.comentario.getValoraciones_positivas();
		int nmg = this.comentario.getValoraciones_negativas();
		if (positiva) {
			if (this.comentario.valora_positivamente.contains(this.identificado)) {
				this.comentario.valora_positivamente.remove(this.identificado);
				mg--;
			} else {
				this.comentario.valora_positivamente.add(this.identificado);
				mg++;
			}
			this.comentario.setValoraciones_positivas(mg);
			this._mostrar_valoracion_comentario.getNumeromegustamostrarvaloracioncomentario().setText(String.valueOf(mg));
		} else {
			if (this.comentario.valora_negativamente.contains(this.identificado)) {
				this.comentario.valora_negativamente.remove(this.identificado);
				nmg--;
			} else {
				this.comentario.valora_negativamente.add(this.identificado);
				nmg++;
			}
			this.comentario.setValoraciones_negativas(nmg);
			this._mostrar_valoracion_comentario.getNumeronomegustamostrarvaloracioncomentario().setText(String.valueOf(nmg));
		}
	}
}