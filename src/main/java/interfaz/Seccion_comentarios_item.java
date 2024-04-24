package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaSeccioncomentarios_item;

public class Seccion_comentarios_item extends VistaSeccioncomentarios_item {
	public Seccion_comentarios _seccion_comentarios;
	public Mostrar_comentario _mostrar_comentario;
	public Mostrar_valoracion_comentario _mostrar_valoracion_comentario;
	basededatos.Comentario comentario;
	
	public Seccion_comentarios_item(Seccion_comentarios _seccion_comentarios,  basededatos.Comentario comentario) {
		super();
		this._seccion_comentarios = _seccion_comentarios;
		this._mostrar_comentario = new Mostrar_comentario(this);
		this._mostrar_valoracion_comentario = new Mostrar_valoracion_comentario(this);
		this.getLayoutborrarcomentarioseccioncomentariositem().setVisible(false);
		Mostrar_comentario();
		Mostrar_valoracion_comentario();
		
		this.comentario = comentario;
		String url_imagen;
		String nick;
		try {
			url_imagen = basededatos.Identificado.getIdentificadoByORMID(comentario.getPropietario()).getUrl_foto_perfil();
			nick = basededatos.Identificado.getIdentificadoByORMID(comentario.getPropietario()).getNick_apodo();
		} catch (PersistentException e) {
			url_imagen = "https://www.researchgate.net/publication/315108532/figure/fig1/AS:472492935520261@1489662502634/Figura-2-Avatar-que-aparece-por-defecto-en-Facebook.png";
			nick = "Usuario desconocido";
		}
	    this.getFotousuarioseccioncomentariositem().setSrc(url_imagen);
	    this.getLabelnickusuarioseccioncomentariositem().setText(nick);
	    this.getLayoutvistamostrarvaloracioncomentarioseccioncomentariositem().setText(String.valueOf(comentario.getValoraciones_positivas()));	    
	    this.getLayoutvistamostrarvaloracioncomentarioseccioncomentariositem().setText(String.valueOf(comentario.getValoraciones_negativas()));
	    this.getLayoutvistamostrarvaloracioncomentarioseccioncomentariositem().setText(comentario.getContenido());
	}

	public void Mostrar_comentario() {
		this.getLayoutvistamostrarcomentarioseccioncomentariositem().as(VerticalLayout.class).add(_mostrar_comentario);
	}

	public void Mostrar_valoracion_comentario() {
		this.getLayoutvistamostrarvaloracioncomentarioseccioncomentariositem().as(VerticalLayout.class).add(_mostrar_valoracion_comentario);
	}
}