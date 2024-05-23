package interfaz;

import java.util.Vector;
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
		basededatos.Noticia[] noticias = iusuario_no_registrado.Cargar_noticias_portada();
		for (int i=0;i<noticias.length;i++){
			Listado_noticias_portada_Usuario_no_registrado_item item = new Listado_noticias_portada_Usuario_no_registrado_item(this,noticias[i]);
			this._item.add(item);
			this.getLayoutlistadonoticiasportadausuarionoregistrado().add(item);
		}
	}
}