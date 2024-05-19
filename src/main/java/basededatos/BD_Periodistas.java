package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import basededatos.Periodista;

public class BD_Periodistas {
	public BDPrincipal _bd_main_periodista;
	public Vector<Periodista> _contiene_periodistas = new Vector<Periodista>();

	public Periodista Login(String aEmail, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void Guardar_cambios(int aId, String aNombre, String aNick, String aEmail, String aContrasena, String aUrl_foto_perfil) {
		throw new UnsupportedOperationException();
	}

	public Periodista Alta_periodistas(String aNombre, String aApellidos, String aNick, String aContrasena, String aDni, String aEmail, int aTelefono, String aFecha_nacimiento, int aId_editor) {
		throw new UnsupportedOperationException();
	}

	public Periodista[] Cargar_periodistas() {
		throw new UnsupportedOperationException();
	}

	public void Baja_Periodista(String aNick, int aId_editor) {
		throw new UnsupportedOperationException();
	}
}