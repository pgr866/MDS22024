package basededatos;

import base_de_datos.BDPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Secciones {

	public Vector<Seccion> _contiene_secciones = new Vector<Seccion>();
	public BDPrincipal _bd_main_seccion;

	public Seccion[] Cargar_secciones() throws PersistentException {
		List<Seccion> secciones = new ArrayList<>();
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			secciones = SeccionDAO.querySeccion("EditorIdentificadoId2 IS NULL", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return secciones.toArray(new Seccion[0]);
	}

	public Seccion Anadir_seccion(String aNombre, int aId_editor) throws PersistentException {
		List<Seccion> secciones = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			secciones = SeccionDAO.querySeccion("EditorIdentificadoId2 IS NULL AND Titulo_seccion = '" + aNombre + "'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		Seccion seccion = null;
		if (secciones.isEmpty()) {
			t = MDS12324PFFornielesGomezPersistentManager.instance().getSession()
					.beginTransaction();
			try {
				seccion = SeccionDAO.createSeccion();
				seccion.setTitulo_seccion(aNombre);
				seccion.setORM_Crea_seccion(EditorDAO.getEditorByORMID(aId_editor));
				SeccionDAO.save(seccion);
				t.commit();
			} catch (Exception e) {
				t.rollback();
			}
			MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		}
		return seccion;
	}

	public void Borrar_seccion(String aNombre, int aId_editor) throws PersistentException {
		Seccion seccion = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			seccion = SeccionDAO.loadSeccionByQuery("EditorIdentificadoId2 IS NULL AND Titulo_seccion = '" + aNombre + "'", null);
			seccion.setORM_Elimina(EditorDAO.getEditorByORMID(aId_editor));
			SeccionDAO.save(seccion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
	}
}