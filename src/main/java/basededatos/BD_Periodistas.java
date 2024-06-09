package basededatos;

import base_de_datos.BDPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Periodistas {

	public Vector<Periodista> _contiene_periodistas = new Vector<Periodista>();
	public BDPrincipal _bd_main_periodista;

	public Periodista Login(String aEmail, String aContrasena) throws PersistentException {
		Periodista periodista = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			periodista = PeriodistaDAO.loadPeriodistaByQuery(
					"Email = '" + aEmail + "' AND Contrasena = '" + aContrasena + "' AND EditorIdentificadoId2 IS NULL",
					null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return periodista;
	}

	public Periodista Guardar_cambios(int aId, String aNombre, String aApellidos, String aNick, String aEmail,
			String aContrasena, String aUrl_foto_perfil, int aTelefono) throws PersistentException {
		List<Identificado> identificados = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			identificados = IdentificadoDAO
					.queryIdentificado("(Email = '" + aEmail + "' OR Nick_apodo = '" + aNick + "') AND Id != " + aId, null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		Periodista periodista = null;
		if (identificados.isEmpty()) {
			t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
			try {
				periodista = PeriodistaDAO.getPeriodistaByORMID(aId);
				periodista.setNombre(aNombre);
				periodista.setApellidos(aApellidos);
				periodista.setNick_apodo(aNick);
				periodista.setEmail(aEmail);
				periodista.setContrasena(aContrasena);
				periodista.setUrl_foto_perfil(aUrl_foto_perfil);
				periodista.setTelefono(aTelefono);
				PeriodistaDAO.save(periodista);
				t.commit();
			} catch (Exception e) {
				t.rollback();
			}
			MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		}
		return periodista;
	}

	public Periodista Alta_periodista(String aNombre, String aApellidos, String aNick, String aContrasena, String aDni,
			String aEmail, int aTelefono, String aFecha_nacimiento, int aId_editor) throws PersistentException {
		List<Identificado> identificados = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			identificados = IdentificadoDAO
					.queryIdentificado("Email = '" + aEmail + "' OR Nick_apodo = '" + aNick + "'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		Periodista periodista = null;
		if (identificados.isEmpty()) {
			t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
			try {
				periodista = PeriodistaDAO.createPeriodista();
				periodista.setNombre(aNombre);
				periodista.setApellidos(aApellidos);
				periodista.setNick_apodo(aNick);
				periodista.setContrasena(aContrasena);
				periodista.setEmail(aEmail);
				periodista.setDni(aDni);
				periodista.setTelefono(aTelefono);
				periodista.setFecha_nacimiento(aFecha_nacimiento);
				periodista.setUrl_foto_perfil("https://i.postimg.cc/yNmSYfP8/foto.png");
				periodista.setORM_Da_de_alta(EditorDAO.getEditorByORMID(aId_editor));
				PeriodistaDAO.save(periodista);
				t.commit();
			} catch (Exception e) {
				t.rollback();
			}
			MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		}
		return periodista;
	}

	public Periodista[] Cargar_periodistas() throws PersistentException {
		List<Periodista> periodistas = new ArrayList<>();
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			periodistas = PeriodistaDAO.queryPeriodista("EditorIdentificadoId2 IS NULL", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return periodistas.toArray(new Periodista[0]);
	}

	public void Baja_Periodista(String aNick, int aId_editor) throws PersistentException {
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		Periodista periodista = null;
		try {
			periodista = PeriodistaDAO.loadPeriodistaByQuery("Nick_apodo = '" + aNick + "'", null);
			periodista.setORM_Da_de_baja(EditorDAO.getEditorByORMID(aId_editor));
			PeriodistaDAO.save(periodista);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
	}
}