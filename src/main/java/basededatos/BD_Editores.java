package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import basededatos.Editor;

public class BD_Editores {
	public BDPrincipal _bd_main_editor;
	public Vector<Editor> _contiene_editores = new Vector<Editor>();

	public Editor Login(String aAEmail, String aAContrasena) {
		throw new UnsupportedOperationException();
	}

	public void Guardar_cambios(int aAId, String aANombre, String aANick, String aAEmail, String aAContrasena, String aAUrl_foto_perfil) {
		throw new UnsupportedOperationException();
	}
}