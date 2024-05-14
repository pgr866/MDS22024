package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
		nuevo_periodista.setDa_de_alta((basededatos.Editor) this._editor.identificado);;
		nuevo_periodista.setUrl_foto_perfil("https://i.postimg.cc/m25GMKm4/foto.png");
		this._editor.Baja_Alta_Periodistas(); // Refrescar pagina
	}
	
	public void Baja_periodista() {
		this._lista_periodistas.getComboboxlistaperiodistas().getValue();
//		periodista.setEsEliminado(true);
//		periodista.setContrasena("");
//		periodista.setDni("");
//		periodista.setEmail("");
//		periodista.setFecha_nacimiento("");
//		periodista.setTelefono(-1);
//		periodista.setUrl_foto_perfil("");
//		periodista.setDa_de_baja((basededatos.Editor) this._lista_periodistas._baja_Alta_Periodistas._editor.identificado);;
		this._lista_periodistas._baja_Alta_Periodistas._editor.Baja_Alta_Periodistas(); // Refrescar pagina
	}
	
}