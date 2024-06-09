package basededatos;

import base_de_datos.BDPrincipal;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Usuarios_suscritos {

	public Vector<Usuario_suscrito> _contiene_usuario_suscrito = new Vector<Usuario_suscrito>();
	public BDPrincipal _bd_main_usuario_suscrito;

	public Usuario_suscrito Login(String aEmail, String aContrasena) throws PersistentException {
		Usuario_suscrito usuario_suscrito = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			usuario_suscrito = Usuario_suscritoDAO.loadUsuario_suscritoByQuery(
					"Email = '" + aEmail + "' AND Contrasena = '" + aContrasena + "' AND EsEliminado = false", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return usuario_suscrito;
	}

	public Usuario_suscrito Guardar_cambios(int aId, String aNombre, String aApellidos, String aNick, String aEmail,
			String aContrasena, String aUrl_foto_perfil, int aTelefono, String aNum_tarjeta) throws PersistentException {
		List<Identificado> identificados = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			identificados = IdentificadoDAO
					.queryIdentificado("(Email = '" + aEmail + "' OR Nick_apodo = '" + aNick + "') AND Id != " + aId, null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		Usuario_suscrito suscrito = null;
		if (identificados.isEmpty()) {
			t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
			try {
				suscrito = Usuario_suscritoDAO.getUsuario_suscritoByORMID(aId);
				suscrito.setNombre(aNombre);
				suscrito.setApellidos(aApellidos);
				suscrito.setNick_apodo(aNick);
				suscrito.setEmail(aEmail);
				suscrito.setContrasena(aContrasena);
				suscrito.setUrl_foto_perfil(aUrl_foto_perfil);
				suscrito.setTelefono(aTelefono);
				suscrito.setNum_tarjeta(aNum_tarjeta);
				Usuario_suscritoDAO.save(suscrito);
				t.commit();
			} catch (Exception e) {
				t.rollback();
			}
			MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		}
		return suscrito;
	}

	public void Eliminar_cuenta(int aId) throws PersistentException {
		Usuario_suscrito suscrito = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			suscrito = Usuario_suscritoDAO.getUsuario_suscritoByORMID(aId);
			suscrito.setEsEliminado(true);
			Usuario_suscritoDAO.save(suscrito);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
	}

	public Usuario_suscrito Registrarse(String aEmail, String aNombre, String aApellidos, String aFecha_nacimiento,
			String aNick, String aDni, String aNum_tarjeta, int aTelefono, String aContrasena) throws PersistentException {
		List<Identificado> identificados = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			identificados = IdentificadoDAO
					.queryIdentificado("Email = '" + aEmail + "' OR Nick_apodo = '" + aNick + "'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		Usuario_suscrito suscrito = null;
		if (identificados.isEmpty()) {
			t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
			try {
				suscrito = Usuario_suscritoDAO.createUsuario_suscrito();
				suscrito.setEmail(aEmail);
				suscrito.setNombre(aNombre);
				suscrito.setApellidos(aApellidos);
				suscrito.setFecha_nacimiento(aFecha_nacimiento);
				suscrito.setNick_apodo(aNick);
				suscrito.setDni(aDni);
				suscrito.setNum_tarjeta(aNum_tarjeta);
				suscrito.setTelefono(aTelefono);
				suscrito.setContrasena(aContrasena);
				suscrito.setEsEliminado(false);
				suscrito.setUrl_foto_perfil("https://i.postimg.cc/yNmSYfP8/foto.png");
				Usuario_suscritoDAO.save(suscrito);
				t.commit();
			} catch (Exception e) {
				t.rollback();
			}
			MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		}
		return suscrito;
	}
}