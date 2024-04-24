package interfaz;

import java.util.ArrayList;

public class Configurar_perfil_Usuario_suscrito extends Configurar_perfil {

	//	private event _eliminar_cuenta;
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
		this._usuario_Suscrito.mainview.removeAll();
		this._usuario_Suscrito.mainview.add(this._usuario_Suscrito.mainview._usuario_no_registrado);
//		// eliminar usuario suscrito BD
	}
}