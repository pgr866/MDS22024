package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;

import vistas.VistaListadonoticiasbusquedausuarionoregistrado;

public class Listado_noticias_busqueda_Usuario_no_registrado extends VistaListadonoticiasbusquedausuarionoregistrado {
	
	public Usuario_no_Registrado _usuario_no_Registrado;
	public Vector<Listado_noticias_busqueda_Usuario_no_registrado_item> _item = new Vector<Listado_noticias_busqueda_Usuario_no_registrado_item>();
	
	public Listado_noticias_busqueda_Usuario_no_registrado(Usuario_no_Registrado _usuario_no_Registrado) {
		super();
		this._usuario_no_Registrado = _usuario_no_Registrado;
		this.getComboboxlistadonoticiasbusquedausuarionoregistrado().addValueChangeListener(event-> Notification.show(event.getValue()));
	}
}