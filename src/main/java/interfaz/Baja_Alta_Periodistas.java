package interfaz;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Baja_Alta_Periodistas extends vistas.VistaBajaaltaperiodistas {
	
//	private event _alta_periodista;
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
	public Editor _editor;
	public Buscar_periodista _buscar_periodista;
	
	public Baja_Alta_Periodistas(Editor _editor) {
		super();
		this._editor = _editor;
		this._buscar_periodista = new Buscar_periodista(this);
		Buscar_periodista();
		this.getButtondaraltaperiodista().addClickListener(event->Alta_periodista());
	}

	public void Buscar_periodista() {
		this.getLayoutbuscarperiodistabajaaltaperiodistas().as(VerticalLayout.class).add(_buscar_periodista);
	}
	
	public void Alta_periodista() {
		// crear periodista BD
		basededatos.Periodista nuevo_periodista = new basededatos.Periodista();
		nuevo_periodista.setNombre(this.getTextfieldnombredaraltaperiodista().getValue());
		nuevo_periodista.setApellidos(this.getTextfieldapellidosdaraltaperiodista().getValue());
		nuevo_periodista.setNick_apodo(this.getTextfieldnickdaraltaperiodista().getValue());
		nuevo_periodista.setDni(this.getTextfielddnidaraltaperiodista().getValue());
		nuevo_periodista.setEmail(this.getTextfieldemaildaraltaperiodista().getValue());
		nuevo_periodista.setTelefono(Integer.parseInt(this.getTextfieldtelefonodaraltaperiodista().getValue()));
		nuevo_periodista.setContrasena(this.getTextfieldcontrasenadaraltaperiodista().getValue());
		nuevo_periodista.setFecha_nacimiento(this.getTextfieldfechanacimientodaraltaperiodista().getValue());
		nuevo_periodista.setEsEliminado(false);
		this._editor.Baja_Alta_Periodistas(); // Refrescar pagina
	}
}