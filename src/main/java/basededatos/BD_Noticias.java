package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import basededatos.Noticia;

public class BD_Noticias {
	public BDPrincipal _bd_main_noticia;
	public Vector<Noticia> _contiene_noticias = new Vector<Noticia>();

	public Noticia Crear_noticia(String aTitulo, String aUrl_imagen, String aContenido, String aFecha, String aLugar, String aTematicas, int aId_periodista) {
		throw new UnsupportedOperationException();
	}

	public void Valorar_noticia(int aId_noticia, int aId_identificado, boolean aPositiva) {
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

	public void Publicar_noticia(String aNombre_seccion, String aContenido, int aId_noticia, int aId_editor) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_noticia(int aId_noticia, int aId_editor) {
		throw new UnsupportedOperationException();
	}
}