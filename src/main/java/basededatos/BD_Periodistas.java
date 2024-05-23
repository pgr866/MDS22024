package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Periodistas {
	
	public java.util.Vector<Periodista> _contiene_periodistas = new Vector<Periodista>();
	public BDPrincipal _bd_main_periodista;

	public Periodista Login(String aEmail, String aContrasena) throws PersistentException {
		Periodista periodista = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			periodista = PeriodistaDAO.loadPeriodistaByQuery("Email = '" + aEmail + "' AND Contrasena = '" + aContrasena + "'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return periodista;
	}

	public void Guardar_cambios(int aId, String aNombre, String aApellidos, String aNick, String aEmail, String aContrasena, String aUrl_foto_perfil) {
		throw new UnsupportedOperationException();
	}

	public Periodista Alta_periodista(String aNombre, String aApellidos, String aNick, String aContrasena, String aDni, String aEmail, int aTelefono, String aFecha_nacimiento, int aId_editor) {
		throw new UnsupportedOperationException();
	}

	public Periodista[] Cargar_periodistas() {
		throw new UnsupportedOperationException();
	}

	public void Baja_Periodista(String aNick, int aId_editor) {
		throw new UnsupportedOperationException();
	}
}