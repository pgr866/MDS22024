package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Revisar_noticias extends vistas.VistaRevisarnoticias {
//	private event _eliminar_noticia;
//	private event _publicar_noticia;
//	private event _realizar_resumen;
//	private event _asignar_noticia_en_seccion;
//	private Label _titulo_noticia;
//	private Label _url_imagenes;
//	private Label _contenido;
//	private Label _fecha;
//	private Label _lugar;
//	private TextArea _resumen;
	public Noticias_a_revisar_item _noticias_a_revisar;
	
	public Revisar_noticias(Noticias_a_revisar_item _noticias_a_revisar) {
		super();
		this._noticias_a_revisar = _noticias_a_revisar;
		this.getEliminarrevisarnoticia().addClickListener(event->Eliminar_noticia());
	}

	public void Eliminar_noticia() {
//		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
//		_baja_Alta_Periodistas = new Baja_Alta_Periodistas(this);
//		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_baja_Alta_Periodistas);	}

	public void Publicar_noticia() {
		throw new UnsupportedOperationException();
	}

	public void Realizar_resumen() {
		//borrar
		throw new UnsupportedOperationException();
	}

	public void Asignar_noticia_en_seccion() {
		throw new UnsupportedOperationException();
	}
}