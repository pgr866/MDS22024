package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Editores {
	
	public java.util.Vector<Editor> _contiene_editores = new Vector<Editor>();
	public BDPrincipal _bd_main_editor;

	public Editor Login(String aEmail, String aContrasena) throws PersistentException {
		Editor editor = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			editor = EditorDAO.loadEditorByQuery("Email = '" + aEmail + "' AND Contrasena = '" + aContrasena + "'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return editor;
	}

	public void Guardar_cambios(int aId, String aNombre, String aApellidos, String aNick, String aEmail, String aContrasena, String aUrl_foto_perfil) {
		throw new UnsupportedOperationException();
	}
}