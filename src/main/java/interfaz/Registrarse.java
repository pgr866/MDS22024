package interfaz;

import org.orm.PersistentException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import base_de_datos.BDPrincipal;
import base_de_datos.iUsuario_no_Registrado;

public class Registrarse extends vistas.VistaRegistrarse {

//	private event _cancelar;
//	private event _enviar;
//	private Label _email;
//	private Label _nombre;
//	private Label _apellidos;
//	private Label _fecha_naciemiento;
//	private Label _apodo;
//	private Label _dni;
//	private Label _num_tarjeta;
//	private Label _contrasena;
//	private Label _repetir_contrasena;
	iUsuario_no_Registrado iusuario_no_registrado = new BDPrincipal();
	public Iniciar_Sesion _iniciar_Sesion;
	public Gestionar_correo _gestionar_correo;
	public Gestionar_pagos _gestionar_pagos;

	public Registrarse(Iniciar_Sesion _iniciar_Sesion) {
		super();
		this._iniciar_Sesion = _iniciar_Sesion;
		this.getCancelarregistrarse()
				.addClickListener(event -> this._iniciar_Sesion._usuario_no_Registrado.Iniciar_Sesion());
		this.getEnviarregistrarse().addClickListener(event -> Enviar());
	}

	public void Gestionar_correo() {
		this._gestionar_correo = new Gestionar_correo(this);
	}

	public void Enviar() {
		String email = this.getTextfieldemailregistrarse().getValue();
		String nombre = this.getTextfieldnombreregistrarse().getValue();
		String apellidos = this.getTextfieldapellidosregistrarse().getValue();
		String fecha_nacimiento = this.getTextfieldfechanacimientoregistrarse().getValue();
		String nick = this.getTextfieldregistrarse().getValue();
		String dni = this.getTextfielddniregistrarse().getValue();
		String num_tarjeta = this.getTextfieldntarjetaregistrarse().getValue();
		String telefono = this.getTextfieldtelefonoregistrarse().getValue();
		String contrasena = this.getPasswordfieldcontrasenaregistrarse().getValue();
		String repetir_contrasena = this.getPasswordfieldrepetircontrasenaregistrarse().getValue();

		boolean validos = true;

		if (email.isBlank() || nombre.isBlank() || apellidos.isBlank() || fecha_nacimiento.isBlank() || nick.isBlank()
				|| dni.isBlank() || num_tarjeta.isBlank() || telefono.isBlank()) {
			this.getLabelerrordatosregistrarse().setText("Debe rellenar todos los campos");
			validos = false;
		}

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(fecha_nacimiento);
        } catch (ParseException e) {
        	if (validos) this.getLabelerrordatosregistrarse().setText("La fecha de nacimiento debe seguir el formato DD-MM-AAAA");
			validos = false;
        }
		
		int num_telefono = 0;
		try {
			num_telefono = Integer.parseInt(telefono);
		} catch (NumberFormatException e) {
			if (validos) this.getLabelerrordatosregistrarse().setText("Numero de teléfono no válido");
			validos = false;
		}

		if (!contrasena.equals(repetir_contrasena) && validos) {
			this.getLabelerrordatosregistrarse().setText("Las contraseñas no coinciden");
			validos = false;
		}

		if (contrasena.length() < 8 && validos) {
			this.getLabelerrordatosregistrarse().setText("La contraseña debe tener al menos 8 caracteres");
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
			this.getLabelerrordatosregistrarse()
					.setText("La contraseña debe tener al menos un número, una mayúscula, y una minúscula");
			validos = false;
		}

		basededatos.Usuario_suscrito suscrito = null;
		if (validos) {
			try {
				suscrito = iusuario_no_registrado.Registrarse(email, nombre, apellidos, fecha_nacimiento, nick, dni,
						num_tarjeta, num_telefono, contrasena);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			
			if (suscrito == null)
				this.getLabelerrordatosregistrarse().setText("Correo electrónico / nick ya está en uso");
			else {
				this._iniciar_Sesion._usuario_no_Registrado.mainview._usuario_suscrito = new Usuario_Suscrito(
						this._iniciar_Sesion._usuario_no_Registrado.mainview, suscrito);
				this._iniciar_Sesion._usuario_no_Registrado.mainview.removeAll();
				this._iniciar_Sesion._usuario_no_Registrado.mainview
						.add(this._iniciar_Sesion._usuario_no_Registrado.mainview._usuario_suscrito);
				Gestionar_correo();
				Gestionar_pagos();
			}
		}
	}

	public void Gestionar_pagos() {
		this._gestionar_pagos = new Gestionar_pagos(this);
	}
}