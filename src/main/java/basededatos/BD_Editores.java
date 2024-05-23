package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import basededatos.Editor;

public class BD_Editores {
	
	public java.util.Vector<Editor> _contiene_editores = new Vector<Editor>();
	public BDPrincipal _bd_main_editor;

	public Editor Login(String aAAEmail, String aAAContrasena) {
		throw new UnsupportedOperationException();
	}

	public void Guardar_cambios(int aAAId, String aAANombre, String aAANick, String aAAEmail, String aAAContrasena, String aAAUrl_foto_perfil) {
		throw new UnsupportedOperationException();
	}
}