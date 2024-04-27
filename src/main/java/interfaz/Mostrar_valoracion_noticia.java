package interfaz;

public class Mostrar_valoracion_noticia extends vistas.VistaMostrarvaloracionnoticia {

	public Pagina_Noticia _pagina_Noticia;
	basededatos.Noticia noticia;
	
	public Mostrar_valoracion_noticia(Pagina_Noticia _pagina_Noticia, basededatos.Noticia noticia) {
		super();
		this._pagina_Noticia = _pagina_Noticia;
		this.noticia = noticia;
		this.getNumeromegustamostrarvaloracionnoticia().setText(String.valueOf(noticia.getValoraciones_positivas()));
		this.getNumeronomegustamostrarvaloracionnoticia().setText(String.valueOf(noticia.getValoraciones_negativas()));
	}
}