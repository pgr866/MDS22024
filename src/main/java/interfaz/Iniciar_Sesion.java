package interfaz;

import vistas.VistaIniciarsesion;
import interfaz.Identificado;

public class Iniciar_Sesion extends VistaIniciarsesion {
//	private event _entrar;
//	private Label _usuario;
//	private Label _contrasena;
//	private TextArea _nombre_usuario;
//	private TextArea _introducir_contrasena;
	public Usuario_no_Registrado _usuario_no_Registrado;
	public Registrarse _registrarse;
	
	public Iniciar_Sesion(Usuario_no_Registrado u) {
		super();
		this._usuario_no_Registrado=u;
		
	}
//		
//		this.getBotonlogin().addClickListener(event->
//		{
//			if (this.getUsernamelogin().getValue().equals("Usuario")) {
//				this._usuario_no_Registrado.mainview.removeAll();
//				Identificado identificado = new Identificado(this._usuario_no_Registrado.mainview);
//				this._usuario_no_Registrado.mainview.add(identificado.mainview);
//			} else 
//				this._usuario_no_Registrado.mainview.removeAll();}
//		);
//			
//		
//	}

	public void Entrar() {
		throw new UnsupportedOperationException();
	}

	public void Validar_datos() {
		throw new UnsupportedOperationException();
	}

	public void Registrarse() {
		throw new UnsupportedOperationException();
	}
}