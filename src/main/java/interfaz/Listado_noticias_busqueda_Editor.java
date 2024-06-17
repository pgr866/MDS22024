package interfaz;

public class Listado_noticias_busqueda_Editor extends Listado_noticias_busqueda_Identificado {
	
	public Editor _editor;
	
	public Listado_noticias_busqueda_Editor(Editor _editor) {
		super(_editor);
		this._editor = _editor;
		this.getComboboxlistadonoticiasbusquedaidentificado().addValueChangeListener(event -> {
			_editor._listado_noticias_busqueda_Editor = new Listado_noticias_busqueda_Editor(_editor);
			_editor.Listado_noticias_busqueda_Editor();
			_editor._listado_noticias_busqueda_Editor._item.stream().filter(item -> item.noticia.getTitulo().equals(event.getValue()))
			.findFirst().ifPresent(item -> ((Listado_noticias_busqueda_Editor_item) item).Pagina_noticia_Editor());
		});
		
	}
}