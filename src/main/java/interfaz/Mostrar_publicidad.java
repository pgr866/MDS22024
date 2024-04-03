package interfaz;

public class Mostrar_publicidad extends vistas.VistaMostrarpublicidad {
	public Usuario_no_Registrado _usuario_no_Registrado;
	public Gestionar_publicidad _gestionar_publicidad;
	
	public Mostrar_publicidad(Usuario_no_Registrado _usuario_no_Registrado,
			Gestionar_publicidad _gestionar_publicidad) {
		super();
		this._usuario_no_Registrado = _usuario_no_Registrado;
		this._gestionar_publicidad = _gestionar_publicidad;
	}
}