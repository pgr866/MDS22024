package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import basededatos.Comentario;

public class BD_Comentarios {
	public BDPrincipal _bd_main_comentario;
	public Vector<Comentario> _contiene_comentarios = new Vector<Comentario>();

	public void Comentar(int aAId_identificado, int aAId_noticia, String aAContenido) {
		throw new UnsupportedOperationException();
	}

	public void Valorar_comentario(int aAId_comentario, int aAId_identificado, boolean aAPositiva) {
		throw new UnsupportedOperationException();
	}
	
	public void Eliminar_comentario(int aAId_comentario, int aAId_editor) {
		throw new UnsupportedOperationException();
	}
}