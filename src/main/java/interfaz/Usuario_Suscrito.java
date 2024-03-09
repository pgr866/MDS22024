package interfaz;

import proyectoMDS.MainView;

//import basededatos.iUsuario_Suscrito;

public class Usuario_Suscrito extends Identificado {
//	public iUsuario_Suscrito _iUsuario_Suscrito;
	public Configurar_perfil_Usuario_suscrito _configurar_perfil_Usuario_suscrito;
	
	public Usuario_Suscrito (MainView mainview) {
		super(mainview);
	}

	public void Configurar_perfil_Usuario_suscrito() {
		throw new UnsupportedOperationException();
	}
}