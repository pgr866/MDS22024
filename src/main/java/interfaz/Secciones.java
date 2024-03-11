package interfaz;

import java.util.Vector;
import vistas.VistaSecciones;

public class Secciones extends VistaSecciones{
	public Explorar_secciones _explorar_secciones;
	public Identificado identificado;
	public Usuario_no_Registrado usuario_no_registrado;
	public Vector<Secciones_item> _item = new Vector<Secciones_item>();
	
	public Secciones(Identificado identificado, Usuario_no_Registrado usuario_no_registrado) {
		super();
		this.identificado = identificado;
		this.usuario_no_registrado = usuario_no_registrado;
	}
	
}