package interfaz;

public class Listado_noticias_portada_Editor extends Listado_noticias_portada_Identificado {
	
//	private ImageButton _lupa;
	public Editor _editor;
	
	public Listado_noticias_portada_Editor(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		Listado_noticias_portada_Editor_item item = new Listado_noticias_portada_Editor_item(this, null); 
		_item.add(item);
		this.getLayoutlistadonoticiasportadaidentificado().add(item);
	}
}