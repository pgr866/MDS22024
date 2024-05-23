package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import basededatos.Usuario_suscrito;

public class BD_Usuarios_suscritos {
	
	public java.util.Vector<Usuario_suscrito> _contiene_usuario_suscrito = new Vector<Usuario_suscrito>();
	public BDPrincipal _bd_main_usuario_suscrito;

	public Usuario_suscrito Login(String aAAEmail, String aAAContrasena) {
		throw new UnsupportedOperationException();
	}

	public void Guardar_cambios(int aAAId, String aAANombre, String aAANick, String aAAEmail, String aAAContrasena, String aAAUrl_foto_perfil, String aAANum_tarjeta) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_cuenta(int aAAId) {
		throw new UnsupportedOperationException();
	}

	public Usuario_suscrito Registrarse(String aAAEmail, String aAANombre, String aAAApellidos, Object aAAFecha_nacimiento, String aAANick, String aAADni, String aAANum_tarjeta, String aAAContrasena) {
		throw new UnsupportedOperationException();
	}
}