package interfaz;

public class Listado_noticias_portada_Editor extends Listado_noticias_portada_Identificado {
	
//	private ImageButton _lupa;
	public Editor _editor;
	
	public Listado_noticias_portada_Editor(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		Listado_noticias_portada_Editor_item anadir_noticia = new Listado_noticias_portada_Editor_item(this, null);
		_item.add(anadir_noticia);
		this.getLayoutlistadonoticiasportadaidentificado().add(anadir_noticia);
	}
}