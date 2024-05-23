package interfaz;

import java.util.Vector;
import vistas.VistaSeccionesusuarionoregistrado;
import base_de_datos.BDPrincipal;
import base_de_datos.iUsuario_no_Registrado;

public class Secciones_Usuario_no_registrado extends VistaSeccionesusuarionoregistrado{
	
	iUsuario_no_Registrado iusuario_no_registrado = new BDPrincipal();
	public Explorar_secciones_Usuario_no_registrado _explorar_secciones_Usuario_no_registrado;
	public Vector<Secciones_Usuario_no_registrado_item> _item = new Vector<Secciones_Usuario_no_registrado_item>();
	
	public Secciones_Usuario_no_registrado(Explorar_secciones_Usuario_no_registrado _explorar_secciones_Usuario_no_registrado) {
		super();
		this._explorar_secciones_Usuario_no_registrado = _explorar_secciones_Usuario_no_registrado;
		basededatos.Seccion[] secciones = iusuario_no_registrado.Cargar_secciones();
		Vector<String> titulos = new Vector<String>();
		for (int i=0;i<secciones.length;i++){
			Secciones_Usuario_no_registrado_item item = new Secciones_Usuario_no_registrado_item(this, secciones[i]);
			this._item.add(item);
			titulos.add(secciones[i].getTitulo_seccion());
		}
		this.getDesplegableseccionesusuarionoregistrado().setItems(titulos); // si no funciona probar con _item
	}
}