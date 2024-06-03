package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import base_de_datos.BDPrincipal;
import base_de_datos.iEditor;

public class Baja_Alta_Periodistas extends vistas.VistaBajaaltaperiodistas {
	
//	private event _alta_periodista;
//	private event _baja_periodista;
//	private Label _nombre;
//	private TextArea _introducir_nombre;
//	private Label _apellidos;
//	private TextArea _introducir__apellidos;
//	private Label _nick;
//	private TextArea _introducir_nick;
//	private Label _dni;
//	private TextArea _introducir_dni;
//	private Label _email;
//	private TextArea _introducir_email;
//	private Label _telefono;
//	private TextArea _introducir_telefono;
//	private Label _dar_de_alta_periodista;
//	private Label _dar_de_baja_periodista;
//	private Label _busqueda_periodista;
	iEditor ieditor = new BDPrincipal();
	public Editor _editor;
	public Lista_periodistas _lista_periodistas;
	
	public Baja_Alta_Periodistas(Editor _editor) {
		super();
		this._editor = _editor;
		this._lista_periodistas = new Lista_periodistas(this);
		Lista_periodistas();
		this.getButtondaraltaperiodista().addClickListener(event->Alta_periodista());
		this.getButtondarbajaperiodista().addClickListener(event->Baja_periodista());
	}

	public void Lista_periodistas() {
		this.getLayoutbuscarperiodistabajaaltaperiodistas().as(VerticalLayout.class).add(_lista_periodistas);
	}
	
	public void Alta_periodista() {
		String nombre = this.getTextfieldnombredaraltaperiodista().getValue();
		String apellidos = this.getTextfieldapellidosdaraltaperiodista().getValue();
		String nick = this.getTextfieldnickdaraltaperiodista().getValue();
		String contrasena = this.getTextfieldcontrasenadaraltaperiodista().getValue();
		String dni = this.getTextfielddnidaraltaperiodista().getValue();
		String email = this.getTextfieldemaildaraltaperiodista().getValue();
		int telefono = Integer.parseInt(this.getTextfieldtelefonodaraltaperiodista().getValue());
		String fecha_nacimiento = this.getTextfieldfechanacimientodaraltaperiodista().getValue();
		int id_editor = this._editor.identificado.getId();
		try {
			ieditor.Alta_periodista(nombre, apellidos, nick, contrasena, dni, email, telefono, fecha_nacimiento, id_editor);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		this._editor.Baja_Alta_Periodistas(); // Refrescar pagina
	}
	
	public void Baja_periodista() {
		String nick = this._lista_periodistas.getComboboxlistaperiodistas().getValue();
		int id_editor = this._editor.identificado.getId();
		try {
			ieditor.Baja_Periodista(nick, id_editor);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		this._editor.Baja_Alta_Periodistas(); // Refrescar pagina
	}
	
}