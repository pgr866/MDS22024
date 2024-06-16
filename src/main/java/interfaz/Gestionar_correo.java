package interfaz;

import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;
import com.vaadin.flow.component.notification.Notification;

public class Gestionar_correo {

	public Gestor_de_correo _gestor_de_correo;
	public Registrarse _registrarse;

	public Gestionar_correo(Registrarse _registrarse) {
		super();
		this._registrarse = _registrarse;
		Enviar_correo_verificacion();
	}
	
	public void Enviar_correo_verificacion() {
		final String username = "lhnanoreply@gmail.com";
		final String password = "dlconcekeackjdiz";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(this._registrarse.getTextfieldemailregistrarse().getValue()));
			message.setSubject("Registro confirmado en Periódico Digital LHNA");
			message.setText("Se ha registrado correctamente en nuestro periódico digital LHNA con las siguientes credenciales:\nCorreo: " + String.valueOf(this._registrarse.getTextfieldemailregistrarse().getValue()) + "\nContraseña: " + String.valueOf(this._registrarse.getPasswordfieldcontrasenaregistrarse().getValue()) + "\nSi usted no se ha registrado, inicie sesión desde nuestra web y elimine su cuenta.");
			Transport.send(message);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		Notification.show("Correo verificado correctamente");
	}
}