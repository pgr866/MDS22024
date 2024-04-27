package interfaz;

import vistas.VistaListadonoticiasportada_item;

public class Listado_noticias_portada_item extends VistaListadonoticiasportada_item {
	public Listado_noticias_portada _listado_noticias_portada;
	basededatos.Noticia noticia;
	
	public Listado_noticias_portada_item(Listado_noticias_portada _listado_noticias_portada,
			basededatos.Noticia noticia) {
		super();
		this._listado_noticias_portada = _listado_noticias_portada;
		this.getComboboxtitulolistadonoticiasportada().setVisible(false);
		this.noticia = noticia;
		this.getTitulolistadonoticiasportada().setText(noticia.getTitulo());
		this.getImagenlistadonoticiasportada().setSrc(noticia.getUrl_imagen_noticia());
		this.getLabelfechalistadonoticiasportada().setText(noticia.getFecha());
		basededatos.Periodista periodista = new basededatos.Periodista();
		this.getLabelautorlistadonoticiasportada().setText(periodista.getNombre() + " " + periodista.getApellidos());
		this.getLabellugarlistadonoticiasportada().setText(noticia.getLugar());
		this.getTextarearesumenlistadonoticiasportada().setValue(noticia.getResumen());
	}
}