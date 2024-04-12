package interfaz;

public class Configurar_perfil_Usuario_suscrito extends Configurar_perfil {

	//	private event _eliminar_cuenta;
	public Usuario_Suscrito _usuario_Suscrito;
	
	public Configurar_perfil_Usuario_suscrito(Usuario_Suscrito _usuario_Suscrito) {
		super(_usuario_Suscrito);
		this._usuario_Suscrito = _usuario_Suscrito;
		this.getLayoutntarjetaconfigurarperfil().setVisible(true);
		this.getButtoneliminarcuentaconfigurarperfil().setVisible(true);
	}

	public void Eliminar_cuenta() {
		throw new UnsupportedOperationException();
	}
}