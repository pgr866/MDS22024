package base_de_datos;

import basededatos.BD_Usuarios_suscritos;
import basededatos.BD_Noticias;
import basededatos.BD_Periodistas;
import basededatos.BD_Editores;
import basededatos.BD_Secciones;
import basededatos.BD_Comentarios;
import basededatos.BD_Tematicas;
import basededatos.Seccion;
import basededatos.Noticia;
// import basededatos.Periodista;
// import basededatos.Identificado;
import interfaz.Editor;
// import interfaz.Identificado;
import interfaz.Gestor_de_correo;
import interfaz.Gestor_de_pago;
import interfaz.Gestor_de_publicidad;
import interfaz.Usuario_Suscrito;
import interfaz.Usuario_no_Registrado;
// import interfaz.Periodista;

public class BDPrincipal implements iEditor, iGestor_de_correo, iGestor_de_pago, iGestor_de_publicidad, iUsuario_Suscrito, iUsuario_no_Registrado, iIdentificado, iPeriodista {
	public BD_Usuarios_suscritos _bd_usuarios_suscritos;
	public BD_Noticias _bd_noticias;
	public BD_Periodistas _bd_periodistas;
	public BD_Editores _bd_main_editor;
	public BD_Secciones _bd_secciones;
	public BD_Comentarios _bd_comentarios;
	public BD_Tematicas _bd_tematicas;

	public Seccion Anadir_seccion(String aNombre, int aId_editor) {
		throw new UnsupportedOperationException();
	}

	public void Borrar_seccion(String aNombre, int aId_editor) {
		throw new UnsupportedOperationException();
	}

	public Noticia[] Cargar_noticias_revisar() {
		throw new UnsupportedOperationException();
	}

	public void Publicar_noticia(String aNombre_seccion, String aResumen, int aId_noticia, int aId_editor) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_noticia(int aId_noticia, int aId_editor) {
		throw new UnsupportedOperationException();
	}

	public basededatos.Periodista Alta_periodista(String aNombre, String aApellidos, String aNick, String aContrasena, String aDni, String aEmail, int aTelefono, String aFecha_nacimiento, int aId_editor) {
		throw new UnsupportedOperationException();
	}

	public basededatos.Periodista[] Cargar_periodistas() {
		throw new UnsupportedOperationException();
	}

	public void Baja_Periodista(String aNick, int aId_editor) {
		throw new UnsupportedOperationException();
	}

	public void Guardar_cambios(int aId, String aNombre, String aNick, String aEmail, String aContrasena, String aUrl_foto_perfil, String aNum_tarjeta) {
		throw new UnsupportedOperationException();
	}

	public void Comentar(int aId_identificado, int aId_noticia, String aContenido) {
		throw new UnsupportedOperationException();
	}

	public void Valorar_comentario(int aId_comentario, int aId_identificado, boolean aPositiva) {
		throw new UnsupportedOperationException();
	}

	public void Valorar_noticia(int aId_noticia, int aId_identificado, boolean aPositiva) {
		throw new UnsupportedOperationException();
	}

	public Seccion[] Cargar_secciones() {
		throw new UnsupportedOperationException();
	}

	public Noticia[] Cargar_noticias() {
		throw new UnsupportedOperationException();
	}

	public Noticia[] Cargar_noticias_portada() {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_cuenta(int aId) {
		throw new UnsupportedOperationException();
	}

	public basededatos.Identificado Login(String aEmail, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void Registrarse(String aEmail, String aNombre, String aApellidos, String aFecha_nacimiento, String aNick, String aDni, String aNum_tarjeta, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public Noticia Crear_noticia(String aTitulo, String aUrl_imagen, String aContenido, String aFecha, String aLugar, String aTematicas, int aId_periodista) {
		throw new UnsupportedOperationException();
	}

	public Editor get_Editor() {
		throw new UnsupportedOperationException();
	}

	public interfaz.Identificado get_Identificado() {
		throw new UnsupportedOperationException();
	}

	public Gestor_de_correo get_Gestor_de_correo() {
		throw new UnsupportedOperationException();
	}

	public Gestor_de_pago get_Gestor_de_pago() {
		throw new UnsupportedOperationException();
	}

	public Gestor_de_publicidad get_Gestor_de_publicidad() {
		throw new UnsupportedOperationException();
	}

	public Usuario_Suscrito get_Usuario_Suscrito() {
		throw new UnsupportedOperationException();
	}

	public Usuario_no_Registrado get_Usuario_no_Registrado() {
		throw new UnsupportedOperationException();
	}

	public interfaz.Periodista get_Periodista() {
		throw new UnsupportedOperationException();
	}
}