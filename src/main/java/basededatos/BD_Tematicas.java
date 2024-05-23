package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import basededatos.Tematica;

public class BD_Tematicas {
	
	public java.util.Vector<Tematica> _contiene_tematicas = new Vector<Tematica>();
	public BDPrincipal _bd_main_tematica;

	public Tematica[] Cargar_tematicas(String aAATematicas) {
		throw new UnsupportedOperationException();
	}
}