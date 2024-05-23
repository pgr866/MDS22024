package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Usuarios_suscritos {
	
	public java.util.Vector<Usuario_suscrito> _contiene_usuario_suscrito = new Vector<Usuario_suscrito>();
	public BDPrincipal _bd_main_usuario_suscrito;

	public Usuario_suscrito Login(String aEmail, String aContrasena) throws PersistentException {
		Usuario_suscrito usuario_suscrito = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			usuario_suscrito = Usuario_suscritoDAO.loadUsuario_suscritoByQuery("Email = '" + aEmail + "' AND Contrasena = '" + aContrasena + "'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return usuario_suscrito;
	}

	public void Guardar_cambios(int aId, String aNombre, String aApellidos, String aNick, String aEmail, String aContrasena, String aUrl_foto_perfil, String aNum_tarjeta) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_cuenta(int aId) {
		throw new UnsupportedOperationException();
	}

	public Usuario_suscrito Registrarse(String aEmail, String aNombre, String aApellidos, Object aFecha_nacimiento, String aNick, String aDni, String aNum_tarjeta, String aContrasena) {
		throw new UnsupportedOperationException();
	}
}