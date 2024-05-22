package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import basededatos.Usuario_suscrito;

public class BD_Usuarios_suscritos {
	public BDPrincipal _bd_main_usuario_suscrito;
	public Vector<Usuario_suscrito> _contiene_usuario_suscrito = new Vector<Usuario_suscrito>();

	public Usuario_suscrito Login(String aAEmail, String aAContrasena) {
		throw new UnsupportedOperationException();
	}

	public void Guardar_cambios(int aAId, String aANombre, String aANick, String aAEmail, String aAContrasena, String aAUrl_foto_perfil, String aANum_tarjeta) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_cuenta(int aAId) {
		throw new UnsupportedOperationException();
	}

	public Usuario_suscrito Registrarse(String aAEmail, String aANombre, String aAApellidos, Object aAFecha_nacimiento, String aANick, String aADni, String aANum_tarjeta, String aAContrasena) {
		throw new UnsupportedOperationException();
	}
}