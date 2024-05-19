package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import basededatos.Usuario_suscrito;

public class BD_Usuarios_suscritos {
	public BDPrincipal _bd_main_usuario_suscrito;
	public Vector<Usuario_suscrito> _contiene_usuario_suscrito = new Vector<Usuario_suscrito>();

	public Usuario_suscrito Login(String aEmail, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void Guardar_cambios(int aId, String aNombre, String aNick, String aEmail, String aContrasena, String aUrl_foto_perfil, String aNum_tarjeta) {
		throw new UnsupportedOperationException();
	}

	public Usuario_suscrito Registrarse(String aEmail, String aNombre, String aApellidos, Object aFecha_nacimiento, String aNick, String aDni, String aNum_tarjeta, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_cuenta(int aId) {
		throw new UnsupportedOperationException();
	}
}