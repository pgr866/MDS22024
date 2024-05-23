package base_de_datos;

import basededatos.Identificado;
import basededatos.Usuario_suscrito;
import basededatos.Seccion;
import basededatos.Noticia;

public interface iUsuario_no_Registrado {

	public Identificado Login(String aAEmail, String aAContrasena);

	public Usuario_suscrito Registrarse(String aAEmail, String aANombre, String aAApellidos, String aAFecha_nacimiento, String aANick, String aADni, String aANum_tarjeta, String aAContrasena);

	public Seccion[] Cargar_secciones();

	public Noticia[] Cargar_noticias();

	public Noticia[] Cargar_noticias_portada();
}