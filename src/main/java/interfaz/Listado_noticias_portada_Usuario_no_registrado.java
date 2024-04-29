package interfaz;

import java.util.Vector;

public class Listado_noticias_portada_Usuario_no_registrado extends Listado_noticias_portada {
	
//	private Panel _panel_publicidad;
//	private ImageButton _imagen_publicidad;
	public Usuario_no_Registrado _usuario_no_Registrado;
	public Vector<Listado_noticias_portada_Usuario_no_registrado_item> _item = new Vector<Listado_noticias_portada_Usuario_no_registrado_item>();
	
	public Listado_noticias_portada_Usuario_no_registrado(Usuario_no_Registrado _usuario_no_Registrado) {
		super();
		this._usuario_no_Registrado = _usuario_no_Registrado;
	}
}