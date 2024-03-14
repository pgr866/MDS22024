package interfaz;

public class Listado_noticias_portada_Identificado_item extends Listado_noticias_portada_item {
	public Listado_noticias_portada_Identificado _listado_noticias_portada_Identificado;
	public Pagina_noticia_Identificado _pagina_noticia_Identificado;
	
	public Listado_noticias_portada_Identificado_item(Listado_noticias_portada _listado_noticias_portada) {
		super(_listado_noticias_portada);
		this.getComboboxtitulolistadonoticiasportada().setVisible(false);
	}

	public void Pagina_noticia_Identificado() {
		throw new UnsupportedOperationException();
	}
}