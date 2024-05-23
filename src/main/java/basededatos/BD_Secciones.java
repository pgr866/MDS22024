package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import basededatos.Seccion;

public class BD_Secciones {
	
	public java.util.Vector<Seccion> _contiene_secciones = new Vector<Seccion>();
	public BDPrincipal _bd_main_seccion;

	public Seccion[] Cargar_secciones() {
		throw new UnsupportedOperationException();
	}

	public Seccion Anadir_seccion(String aNombre, int aId_editor) {
		throw new UnsupportedOperationException();
	}

	public void Borrar_seccion(String aNombre, int aId_editor) {
		throw new UnsupportedOperationException();
	}
}