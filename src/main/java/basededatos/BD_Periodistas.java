package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import basededatos.Periodista;

public class BD_Periodistas {
	
	public java.util.Vector<Periodista> _contiene_periodistas = new Vector<Periodista>();
	public BDPrincipal _bd_main_periodista;

	public Periodista Login(String aAAEmail, String aAAContrasena) {
		throw new UnsupportedOperationException();
	}

	public void Guardar_cambios(int aAAId, String aAANombre, String aAANick, String aAAEmail, String aAAContrasena, String aAAUrl_foto_perfil) {
		throw new UnsupportedOperationException();
	}

	public Periodista Alta_periodista(String aAANombre, String aAAApellidos, String aAANick, String aAAContrasena, String aAADni, String aAAEmail, int aAATelefono, String aAAFecha_nacimiento, int aAAId_editor) {
		throw new UnsupportedOperationException();
	}

	public Periodista[] Cargar_periodistas() {
		throw new UnsupportedOperationException();
	}

	public void Baja_Periodista(String aAANick, int aAAId_editor) {
		throw new UnsupportedOperationException();
	}
}