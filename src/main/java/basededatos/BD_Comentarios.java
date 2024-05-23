package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import basededatos.Comentario;

public class BD_Comentarios {
	
	public java.util.Vector<Comentario> _contiene_comentarios = new Vector<Comentario>();
	public BDPrincipal _bd_main_comentario;

	public void Comentar(int aId_identificado, int aId_noticia, String aContenido) {
		throw new UnsupportedOperationException();
	}

	public void Valorar_comentario(int aId_comentario, int aId_identificado, boolean aPositiva) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_comentario(int aId_comentario, int aId_editor) {
		throw new UnsupportedOperationException();
	}
}