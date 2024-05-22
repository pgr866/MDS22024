package interfaz;

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
		this.getCancelarregistrarse().addClickListener(event->this._iniciar_Sesion._usuario_no_Registrado.Iniciar_Sesion());
		this.getEnviarregistrarse().addClickListener(event->Enviar());
	}

	public void Gestionar_correo() {
		throw new UnsupportedOperationException();
	}

	public void Enviar() {
		String email = this.getTextfieldemailregistrarse().getValue();
		String nombre = this.getTextfieldnombreregistrarse().getValue();
		String apellidos = this.getTextfieldapellidosregistrarse().getValue();
		String fecha_nacimiento = this.getTextfieldfechanacimientoregistrarse().getValue();
		String nick = this.getTextfieldregistrarse().getValue();
		String dni = this.getTextfielddniregistrarse().getValue();
		String num_tarjeta = this.getTextfieldntarjetaregistrarse().getValue();
		String contrasena = this.getPasswordfieldcontrasenaregistrarse().getValue();
		String repetir_contrasena = this.getPasswordfieldrepetircontrasenaregistrarse().getValue();
		
		boolean validos = true;

		if (contrasena != repetir_contrasena && validos) {
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
        	this.getLabelerrordatosregistrarse().setText("La contraseña debe tener al menos un número, una mayúscula, y una minúscula");
			validos = false;
        }
        
        if (validos) {
        	basededatos.Usuario_suscrito suscrito = iusuario_no_registrado.Registrarse(email, nombre, apellidos, fecha_nacimiento, nick, dni, num_tarjeta, contrasena);
    		this._iniciar_Sesion._usuario_no_Registrado.mainview._usuario_suscrito = new Usuario_Suscrito(this._iniciar_Sesion._usuario_no_Registrado.mainview, suscrito);
    		this._iniciar_Sesion._usuario_no_Registrado.mainview.removeAll();
    		this._iniciar_Sesion._usuario_no_Registrado.mainview.add(this._iniciar_Sesion._usuario_no_Registrado.mainview._usuario_suscrito);
        }
	}

	public void Gestionar_pagos() {
		throw new UnsupportedOperationException();
	}
}