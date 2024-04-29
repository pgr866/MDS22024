package interfaz; //DINAMICO

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listado_noticias_portada_Editor_item extends Listado_noticias_portada_Identificado_item {
	
//	private event _cambiar_orden_noticias_portada;
	public Pagina_noticia_Editor _pagina_noticia_Editor;
	
	public Listado_noticias_portada_Editor_item(Listado_noticias_portada_Editor _listado_noticias_portada,
			basededatos.Noticia noticia) {
		super(_listado_noticias_portada, noticia);
		this.getTitulolistadonoticiasportada().setVisible(false);
		this.getComboboxtitulolistadonoticiasportada().setVisible(true);
		this.getButtonimagenlistadonoticiasportada().addClickListener(event->Pagina_noticia_Editor());
		this.getComboboxtitulolistadonoticiasportada().addValueChangeListener(event->Cambiar_orden_noticias_portada());
		
	}

	public void Cambiar_orden_noticias_portada() {
		try {
			basededatos.Noticia[] consulta = basededatos.NoticiaDAO.listNoticiaByQuery(
					"Titulo = '" + this.getComboboxtitulolistadonoticiasportada().getValue() + "'", "");
			if (consulta.length > 0) {
				consulta[0].setPortada_contiene_noticias(this.noticia.getPortada_contiene_noticias());
				this.noticia.setPortada_contiene_noticias(null);
				((Listado_noticias_portada_Editor) this._listado_noticias_portada)._editor.Listado_noticias_portada_Editor(); // Refrescar pagina
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void Pagina_noticia_Editor() {
		((Listado_noticias_portada_Editor) this._listado_noticias_portada)._editor.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		this._pagina_noticia_Editor = new Pagina_noticia_Editor(this, noticia);
		((Listado_noticias_portada_Editor) this._listado_noticias_portada)._editor.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(this._pagina_noticia_Editor);
	}
}

