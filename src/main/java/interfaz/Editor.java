package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.MainView;

//import basededatos.iEditor;

public class Editor extends Identificado {
	
//	public iEditor _iEditor;
	public Listado_noticias_portada_Editor _listado_noticias_portada_Editor;
	public Listado_noticias_busqueda_Editor _listado_noticias_busqueda_Editor;
	public Noticias_a_revisar _noticias_a_revisar;
	public Baja_Alta_Periodistas _baja_Alta_Periodistas;
	public Explorar_secciones_Editor _explorar_secciones_Editor;
	
	public Editor (MainView mainview, basededatos.Editor editor) {
		super(mainview, editor);
		this.getLayoutbuscaridentificado().setVisible(false);
		this.getLayoutbuscareditor().setVisible(true);
		this.getLayoutvistavermisnoticiasidentificado().setVisible(false);
		this.getLayoutcrearnuevanoticiaidentificado().setVisible(false);
		this._listado_noticias_portada_Editor = new Listado_noticias_portada_Editor(this);
		this._listado_noticias_busqueda_Editor = new Listado_noticias_busqueda_Editor(this);
		this._noticias_a_revisar = new Noticias_a_revisar(this);
		Listado_noticias_portada_Editor();
		Listado_noticias_busqueda_Editor();
		Noticias_a_revisar();
		this.getExplorarseccionesidentificado().addClickListener(event->Explorar_secciones_Editor());
		this.getButtondaraltabajaperiodistaidentificado().addClickListener(event->Baja_Alta_Periodistas());
		this.getButtonlogoidentificado().addClickListener(event -> {
			this._listado_noticias_portada_Editor = new Listado_noticias_portada_Editor(this);
			Listado_noticias_portada_Editor();
		});
	}

	public void Listado_noticias_portada_Editor() {
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_listado_noticias_portada_Editor);
	}
	
	public void Listado_noticias_busqueda_Editor() {
		this.getLayoutvistabuscareditor().removeAll();
		this.getLayoutvistabuscareditor().add(_listado_noticias_busqueda_Editor);
	}

	public void Noticias_a_revisar() {
		this.getLayoutvistanoticiasarevisaridentificado().as(VerticalLayout.class).add(_noticias_a_revisar);
	}

	public void Baja_Alta_Periodistas() {
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		_baja_Alta_Periodistas = new Baja_Alta_Periodistas(this);
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_baja_Alta_Periodistas);
	}

	public void Explorar_secciones_Editor() {
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		_explorar_secciones_Editor = new Explorar_secciones_Editor(this);
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_explorar_secciones_Editor);
	}
}