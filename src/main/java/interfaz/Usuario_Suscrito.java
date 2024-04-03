package interfaz;

import proyectoMDS.MainView;

//import basededatos.iUsuario_Suscrito;

public class Usuario_Suscrito extends Identificado {
//	public iUsuario_Suscrito _iUsuario_Suscrito;
	public Configurar_perfil_Usuario_suscrito _configurar_perfil_Usuario_suscrito;
	
	public Usuario_Suscrito (MainView mainview) {
		super(mainview);
		this.getLayoutvermisnoticiasidentificado().setVisible(false);
		this.getLayoutcrearnuevanoticiaidentificado().setVisible(false);
		this.getLayoutvistanoticiasarevisaridentificado().setVisible(false);
		this.getLayoutdaraltabajaperiodistaidentificado().setVisible(false);
	}

	public void Configurar_perfil_Usuario_suscrito() {
		throw new UnsupportedOperationException();
	}
	
	public void Buscar () {
		//this.getBucarLayout().as(VerticalLayout.class).add(-buscar);
	}
	
	public void Log_out() {
		//Mainview.remove(this);
		//MainView.add(Mainview.usuario_no_registrado);
	}
}