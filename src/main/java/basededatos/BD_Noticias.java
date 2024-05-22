package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import basededatos.Noticia;

public class BD_Noticias {
	public BDPrincipal _bd_main_noticia;
	public Vector<Noticia> _contiene_noticias = new Vector<Noticia>();

	public Noticia Crear_noticia(String aATitulo, String aAUrl_imagen, String aAContenido, String aAFecha, String aALugar, String aATematicas, int aAId_periodista) {
		throw new UnsupportedOperationException();
	}

	public void Valorar_noticia(int aAId_noticia, int aAId_identificado, boolean aAPositiva) {
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

	public void Publicar_noticia(String aANombre_seccion, String aAContenido, int aAId_noticia, int aAId_editor) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_noticia(int aAId_noticia, int aAId_editor) {
		throw new UnsupportedOperationException();
	}

	public void Cambiar_orden_noticias_portada(String aTitulo_noticia, int aPosicion_portada) {
		throw new UnsupportedOperationException();
	}
}