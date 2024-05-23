package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import basededatos.Comentario;

public class BD_Comentarios {
	
	public java.util.Vector<Comentario> _contiene_comentarios = new Vector<Comentario>();
	public BDPrincipal _bd_main_comentario;

	public void Comentar(int aAAId_identificado, int aAAId_noticia, String aAAContenido) {
		throw new UnsupportedOperationException();
	}

	public void Valorar_comentario(int aAAId_comentario, int aAAId_identificado, boolean aAAPositiva) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_comentario(int aAAId_comentario, int aAAId_editor) {
		throw new UnsupportedOperationException();
	}
}