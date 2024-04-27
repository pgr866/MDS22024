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
		String nombre = this.getTextfieldnombredaraltaperiodista().getValue();
		String apellidos = this.getTextfieldapellidosdaraltaperiodista().getValue();
		String nick = this.getTextfieldnickdaraltaperiodista().getValue();
		String dni = this.getTextfielddnidaraltaperiodista().getValue();
		String email = this.getTextfieldemaildaraltaperiodista().getValue();
		String telefono = this.getTextfieldtelefonodaraltaperiodista().getValue();
		String contrasena = this.getTextfieldcontrasenadaraltaperiodista().getValue();
		String fecha_nacimiento = this.getTextfieldfechanacimientodaraltaperiodista().getValue();
		// crear periodista BD
		
//		Lista_periodistas_item nuevo_periodista = new Lista_periodistas_item(this._buscar_periodista._lista_periodistas);
//		nuevo_periodista.getLayoutlistaperiodistaitem().setText(nombre);
//		this._buscar_periodista._lista_periodistas._item.add(nuevo_periodista);
//		ArrayList<String> items = new ArrayList<String>();
//		for (Lista_periodistas_item periodista : this._buscar_periodista._lista_periodistas._item)
//			items.add(periodista.getLayoutlistaperiodistaitem().getText());
//		this._buscar_periodista._lista_periodistas.getComboboxlistaperiodistas().setItems(items);
		this._editor.Baja_Alta_Periodistas(); // Refrescar pagina
	}
}