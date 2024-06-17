package interfaz;

import java.text.ParseException;
import java.text.SimpleDateFormat;

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
		this.getButtondaraltaperiodista().addClickListener(event -> Alta_periodista());
		this.getButtondarbajaperiodista().addClickListener(event -> Baja_periodista());
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
		String telefono = this.getTextfieldtelefonodaraltaperiodista().getValue();
		String fecha_nacimiento = this.getTextfieldfechanacimientodaraltaperiodista().getValue();
		int id_editor = this._editor.identificado.getId();

		boolean validos = true;

		if (email.isBlank() || nombre.isBlank() || apellidos.isBlank() || fecha_nacimiento.isBlank() || nick.isBlank()
				|| dni.isBlank() || telefono.isBlank()) {
			this.getLabelerrordatosaltaperiodista().setText("Debe rellenar todos los campos");
			validos = false;
		}
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(fecha_nacimiento);
        } catch (ParseException e) {
        	if (validos) this.getLabelerrordatosaltaperiodista().setText("La fecha de nacimiento debe seguir el formato DD-MM-AAAA");
			validos = false;
        }

		int num_telefono = 0;
		try {
			num_telefono = Integer.parseInt(telefono);
		} catch (NumberFormatException e) {
			if (validos) this.getLabelerrordatosaltaperiodista().setText("Numero de teléfono no válido");
			validos = false;
		}

		if (contrasena.length() < 8 && validos) {
			this.getLabelerrordatosaltaperiodista().setText("La contraseña debe tener al menos 8 caracteres");
			validos = false;
		}

		boolean hasDigit = false;
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;

		for (char c : contrasena.toCharArray()) {
			if (Character.isDigit(c))
				hasDigit = true;
			else if (Character.isUpperCase(c))
				hasUpperCase = true;
			else if (Character.isLowerCase(c))
				hasLowerCase = true;
		}

		if (!(hasDigit && hasUpperCase && hasLowerCase) && validos) {
			this.getLabelerrordatosaltaperiodista()
					.setText("La contraseña debe tener al menos un número, una mayúscula, y una minúscula");
			validos = false;
		}
		
		basededatos.Periodista nuevo_periodista = null;
		if (validos) {
			try {
				nuevo_periodista = ieditor.Alta_periodista(nombre, apellidos, nick, contrasena, dni, email, num_telefono, fecha_nacimiento,
						id_editor);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			if (nuevo_periodista == null) {
				this.getLabelerrordatosaltaperiodista().setText("Correo electrónico / nick ya está en uso");
			} else {
				this._editor.Baja_Alta_Periodistas(); // Refrescar pagina
			}
		}
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