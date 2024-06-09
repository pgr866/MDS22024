package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import proyectoMDS.MainView;

//import basededatos.iUsuario_Suscrito;

public class Usuario_Suscrito extends Identificado {
	
//	public iUsuario_Suscrito _iUsuario_Suscrito;
	public Configurar_perfil_Usuario_suscrito _configurar_perfil_Usuario_suscrito;
	
	public Usuario_Suscrito (MainView mainview, basededatos.Usuario_suscrito usuario_suscrito) {
		super(mainview, usuario_suscrito);
		this.getLayoutvistavermisnoticiasidentificado().setVisible(false);
		this.getLayoutcrearnuevanoticiaidentificado().setVisible(false);
		this.getLayoutnoticiasarevisaridentificado().setVisible(false);
		this.getLayoutdaraltabajaperiodistaidentificado().setVisible(false);
		this.getLayoutexplorarseccionesidentificado().as(VerticalLayout.class).setWidthFull();
		this.getConfigurarperfilidentificado().addClickListener(event->Configurar_perfil_Usuario_suscrito());
	}

	public void Configurar_perfil_Usuario_suscrito() {
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
		_configurar_perfil_Usuario_suscrito = new Configurar_perfil_Usuario_suscrito(this, (basededatos.Usuario_suscrito) this.identificado);
		this.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_configurar_perfil_Usuario_suscrito);
	}
}