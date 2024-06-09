package base_de_datos;

import org.orm.PersistentException;

import basededatos.Identificado;
import basededatos.Usuario_suscrito;
import basededatos.Seccion;
import basededatos.Noticia;

public interface iUsuario_no_Registrado {

	public Identificado Login(String aEmail, String aContrasena) throws PersistentException;

	public Usuario_suscrito Registrarse(String aEmail, String aNombre, String aApellidos, String aFecha_nacimiento, String aNick, String aDni, String aNum_tarjeta, int aTelefono, String aContrasena) throws PersistentException;

	public Seccion[] Cargar_secciones() throws PersistentException;

	public Noticia[] Cargar_noticias() throws PersistentException;
}