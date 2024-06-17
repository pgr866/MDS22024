package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import vistas.VistaSeccionesusuarionoregistrado;
import base_de_datos.BDPrincipal;
import base_de_datos.iUsuario_no_Registrado;

public class Secciones_Usuario_no_registrado extends VistaSeccionesusuarionoregistrado {

	iUsuario_no_Registrado iusuario_no_registrado = new BDPrincipal();
	public Explorar_secciones_Usuario_no_registrado _explorar_secciones_Usuario_no_registrado;
	public Vector<Secciones_Usuario_no_registrado_item> _item = new Vector<Secciones_Usuario_no_registrado_item>();

	public Secciones_Usuario_no_registrado(
			Explorar_secciones_Usuario_no_registrado _explorar_secciones_Usuario_no_registrado) {
		super();
		this._explorar_secciones_Usuario_no_registrado = _explorar_secciones_Usuario_no_registrado;
		try {
			basededatos.Seccion[] secciones = iusuario_no_registrado.Cargar_secciones();
			Vector<String> titulos = new Vector<String>();
			for (int i = 0; i < secciones.length; i++) {
				Secciones_Usuario_no_registrado_item item = new Secciones_Usuario_no_registrado_item(this,
						secciones[i]);
				this._item.add(item);
				titulos.add(secciones[i].getTitulo_seccion());
			}
			this.getComboboxseccionesusuarionoregistrado().setItems(titulos);
			this.getComboboxseccionesusuarionoregistrado().addValueChangeListener(event -> {
				this._explorar_secciones_Usuario_no_registrado._noticias_en_seccion_Usuario_no_registrado = new Noticias_en_seccion_Usuario_no_registrado(this._explorar_secciones_Usuario_no_registrado);
				this._explorar_secciones_Usuario_no_registrado.Noticias_en_seccion_Usuario_no_registrado();
			});
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}