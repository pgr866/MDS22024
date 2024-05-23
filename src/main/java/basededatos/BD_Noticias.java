package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import basededatos.Noticia;

public class BD_Noticias {
	
	public java.util.Vector<Noticia> _contiene_noticias = new Vector<Noticia>();
	public BDPrincipal _bd_main_noticia;

	public Noticia Crear_noticia(String aAATitulo, String aAAUrl_imagen, String aAAContenido, String aAAFecha, String aAALugar, String aAATematicas, int aAAId_periodista) {
		throw new UnsupportedOperationException();
	}

	public void Valorar_noticia(int aAAId_noticia, int aAAId_identificado, boolean aAAPositiva) {
		throw new UnsupportedOperationException();
	}

	public Noticia[] Cargar_noticias() {
		throw new UnsupportedOperationException();
	}

	public Noticia[] Cargar_noticias_portada() {
		throw new UnsupportedOperationException();
	}

	public Noticia[] Cargar_noticias_revisar() {
		throw new UnsupportedOperationException();
	}

	public void Publicar_noticia(String aAANombre_seccion, String aAAContenido, int aAAId_noticia, int aAAId_editor) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_noticia(int aAAId_noticia, int aAAId_editor) {
		throw new UnsupportedOperationException();
	}

	public void Cambiar_orden_noticias_portada(String aATitulo_noticia, int aAPosicion_portada) {
		throw new UnsupportedOperationException();
	}
}