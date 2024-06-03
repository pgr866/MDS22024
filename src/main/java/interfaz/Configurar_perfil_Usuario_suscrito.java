package interfaz;

import org.orm.PersistentException;

import base_de_datos.BDPrincipal;
import base_de_datos.iUsuario_Suscrito;

public class Configurar_perfil_Usuario_suscrito extends Configurar_perfil {

	//	private event _eliminar_cuenta;
	iUsuario_Suscrito iusuario_suscrito = new BDPrincipal();
	public Usuario_Suscrito _usuario_Suscrito;
	
	public Configurar_perfil_Usuario_suscrito(Usuario_Suscrito _usuario_Suscrito, basededatos.Usuario_suscrito usuario_suscrito) {
		super(_usuario_Suscrito, usuario_suscrito);
		this._usuario_Suscrito = _usuario_Suscrito;
		this.getLayoutntarjetaconfigurarperfil().setVisible(true);
		this.getButtoneliminarcuentaconfigurarperfil().setVisible(true);
		this.getButtoneliminarcuentaconfigurarperfil().addClickListener(event->Eliminar_cuenta());
		this.getTextfieldntarjetaconfigurarperfil().setValue(usuario_suscrito.getNum_tarjeta());
	}

	public void Eliminar_cuenta() {
		try {
			iusuario_suscrito.Eliminar_cuenta(this._identificado.identificado.getId());
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		// Refrescar pagina
		this._identificado.mainview.removeAll();
		this._identificado.mainview.add(this._identificado.mainview._usuario_no_registrado);
		this._identificado.mainview._usuario_suscrito = null;
	}
}