package interfaz;

import com.vaadin.flow.component.UI;

import vistas.VistaMostrarpublicidad;

public class Mostrar_publicidad extends VistaMostrarpublicidad {
	
	public Usuario_no_Registrado _usuario_no_Registrado;
	public Gestionar_publicidad _gestionar_publicidad;
	
	public Mostrar_publicidad(Usuario_no_Registrado _usuario_no_Registrado) {
		super();
		this._usuario_no_Registrado = _usuario_no_Registrado;
		Gestionar_publicidad();
    }
	
	public void Gestionar_publicidad() {
		this._gestionar_publicidad = new Gestionar_publicidad(this);
	}
}