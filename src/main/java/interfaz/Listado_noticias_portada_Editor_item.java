package interfaz;

public class Listado_noticias_portada_Editor_item extends Listado_noticias_portada_Identificado_item {
//	private event _cambiar_orden_noticias_portada;
	public Listado_noticias_portada_Editor _listado_noticias_portada_Editor;
	public Pagina_noticia_Editor _pagina_noticia_Editor;
	
	public Listado_noticias_portada_Editor_item(Listado_noticias_portada _listado_noticias_portada) {
		super(_listado_noticias_portada);
		this.getTitulolistadonoticiasportada().setVisible(false);
		this.getComboboxtitulolistadonoticiasportada().setVisible(true);
	}

	public void Cambiar_orden_noticias_portada() {
		throw new UnsupportedOperationException();
	}

	public void Pagina_noticia_Editor() {
		throw new UnsupportedOperationException();
	}
}