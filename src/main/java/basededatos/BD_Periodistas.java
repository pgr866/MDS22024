package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import basededatos.Periodista;

public class BD_Periodistas {
	public BDPrincipal _bd_main_periodista;
	public Vector<Periodista> _contiene_periodistas = new Vector<Periodista>();

	public Periodista Login(String aAEmail, String aAContrasena) {
		throw new UnsupportedOperationException();
	}

	public void Guardar_cambios(int aAId, String aANombre, String aANick, String aAEmail, String aAContrasena, String aAUrl_foto_perfil) {
		throw new UnsupportedOperationException();
	}

	public Periodista Alta_periodista(String aANombre, String aAApellidos, String aANick, String aAContrasena, String aADni, String aAEmail, int aATelefono, String aAFecha_nacimiento, int aAId_editor) {
		throw new UnsupportedOperationException();
	}

	public Periodista[] Cargar_periodistas() {
		throw new UnsupportedOperationException();
	}

	public void Baja_Periodista(String aANick, int aAId_editor) {
		throw new UnsupportedOperationException();
	}
}