package interfaz; //DINAMICO

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNoticiasenseccionusuarionoregistrado_item;

public class Noticias_en_seccion_Usuario_no_registrado_item extends VistaNoticiasenseccionusuarionoregistrado_item {
//	private Label _titulo;
//	private Label _autor;
//	private Label _fecha;
//	private Label _hora;
//	private Label _resumen;
//	private Image _imagen_noticia;
	public Noticias_en_seccion_Usuario_no_registrado _noticias_en_seccion_Usuario_no_registrado;
	public Pagina_noticia_Usuario_no_registrado _pagina_noticia_Usuario_no_registrado;

	public Noticias_en_seccion_Usuario_no_registrado_item(
			Noticias_en_seccion_Usuario_no_registrado _noticias_en_seccion_Usuario_no_registrado) {
		super();
		this._noticias_en_seccion_Usuario_no_registrado = _noticias_en_seccion_Usuario_no_registrado;
	}

	public void Pagina_noticia_Usuario_no_registrado() {
		this._noticias_en_seccion_Usuario_no_registrado._explorar_secciones_Usuario_no_registrado._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).removeAll();
		this._pagina_noticia_Usuario_no_registrado = new Pagina_noticia_Usuario_no_registrado(null, null, this);
		this._noticias_en_seccion_Usuario_no_registrado._explorar_secciones_Usuario_no_registrado._usuario_no_Registrado.getLayoutnoticiasportadausuarionoregistrado().as(VerticalLayout.class).add(_pagina_noticia_Usuario_no_registrado);
	}
}