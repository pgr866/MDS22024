package interfaz;

import java.util.Vector;
import vistas.VistaListadonoticiasbusquedausuarionoregistrado;
import base_de_datos.BDPrincipal;
import base_de_datos.iUsuario_no_Registrado;

public class Listado_noticias_busqueda_Usuario_no_registrado extends VistaListadonoticiasbusquedausuarionoregistrado {
	
	iUsuario_no_Registrado iusuario_no_registrado = new BDPrincipal();
	public Usuario_no_Registrado _usuario_no_Registrado;
	public Vector<Listado_noticias_busqueda_Usuario_no_registrado_item> _item = new Vector<Listado_noticias_busqueda_Usuario_no_registrado_item>();
	
	public Listado_noticias_busqueda_Usuario_no_registrado(Usuario_no_Registrado _usuario_no_Registrado) {
		super();
		this._usuario_no_Registrado = _usuario_no_Registrado;
		basededatos.Noticia[] noticias = iusuario_no_registrado.Cargar_noticias();
		Vector<String> titulos = new Vector<String>();
		for (int i=0;i<noticias.length;i++){
			Listado_noticias_busqueda_Usuario_no_registrado_item item = new Listado_noticias_busqueda_Usuario_no_registrado_item(this,noticias[i]);
			this._item.add(item);
			titulos.add(noticias[i].getTitulo());
		}
		this.getComboboxlistadonoticiasbusquedausuarionoregistrado().setItems(titulos);
		
		this.getComboboxlistadonoticiasbusquedausuarionoregistrado().addValueChangeListener(event-> event.getValue());
	}
}