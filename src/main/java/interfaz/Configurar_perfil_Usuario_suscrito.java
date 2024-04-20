package interfaz;

import java.util.ArrayList;

public class Configurar_perfil_Usuario_suscrito extends Configurar_perfil {

	//	private event _eliminar_cuenta;
	public Usuario_Suscrito _usuario_Suscrito;
	
	public Configurar_perfil_Usuario_suscrito(Usuario_Suscrito _usuario_Suscrito) {
		super(_usuario_Suscrito);
		this._usuario_Suscrito = _usuario_Suscrito;
		this.getLayoutntarjetaconfigurarperfil().setVisible(true);
		this.getButtoneliminarcuentaconfigurarperfil().setVisible(true);
		this.getButtoneliminarcuentaconfigurarperfil().addClickListener(event->Eliminar_cuenta());
	}

	public void Eliminar_cuenta() {
//		this._usuario_Suscrito.mainview.remove(this._usuario_Suscrito);
//		this._usuario_Suscrito.mainview.add(this._usuario_Suscrito.mainview._usuario_no_registrado);
//		// eliminar usuario suscrito BD
	}
}