package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import vistas.VistaListadonoticiasportadausuarionoregistrado;
import base_de_datos.BDPrincipal;
import base_de_datos.iUsuario_no_Registrado;

public class Listado_noticias_portada_Usuario_no_registrado extends VistaListadonoticiasportadausuarionoregistrado {

//	private Panel _panel_publicidad;
//	private ImageButton _imagen_publicidad;
	iUsuario_no_Registrado iusuario_no_registrado = new BDPrincipal();
	public Vector<Listado_noticias_portada_Usuario_no_registrado_item> _item = new Vector<Listado_noticias_portada_Usuario_no_registrado_item>();
	public Usuario_no_Registrado _usuario_no_Registrado;

	public Listado_noticias_portada_Usuario_no_registrado(Usuario_no_Registrado _usuario_no_Registrado) {
		super();
		this._usuario_no_Registrado = _usuario_no_Registrado;
		try {
			basededatos.Noticia[] noticias = iusuario_no_registrado.Cargar_noticias();
			Vector<Listado_noticias_portada_Usuario_no_registrado_item> aux = new Vector<Listado_noticias_portada_Usuario_no_registrado_item>();
			for (int i = 0; i < noticias.length; i++) {
				if (noticias[i].getPortada_contiene_noticias() != null) {
					aux.add(new Listado_noticias_portada_Usuario_no_registrado_item(this, noticias[i]));
					_item.add(null);
				}
			}
			
			for (Listado_noticias_portada_Usuario_no_registrado_item noticia : aux)
				_item.set(noticia.noticia.getPosicion_portada(), noticia);

			for (Listado_noticias_portada_Usuario_no_registrado_item item : _item)
				this.getLayoutlistadonoticiasportadausuarionoregistrado().add(item);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}