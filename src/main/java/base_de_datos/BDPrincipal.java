package base_de_datos;

import basededatos.BD_Usuarios_suscritos;
import basededatos.BD_Noticias;
import basededatos.BD_Periodistas;
import basededatos.BD_Editores;
import basededatos.BD_Secciones;

import org.orm.PersistentException;

import basededatos.BD_Comentarios;
import basededatos.BD_Tematicas;
import basededatos.Seccion;
import basededatos.Noticia;
import basededatos.Periodista;
import basededatos.Identificado;
import basededatos.Usuario_suscrito;
import basededatos.Editor;
import interfaz.Gestor_de_correo;
import interfaz.Gestor_de_pago;
import interfaz.Gestor_de_publicidad;
import interfaz.Usuario_Suscrito;
import interfaz.Usuario_no_Registrado;

public class BDPrincipal implements iEditor, iGestor_de_correo, iGestor_de_pago, iGestor_de_publicidad, iUsuario_Suscrito, iUsuario_no_Registrado, iIdentificado, iPeriodista {
	public BD_Usuarios_suscritos _bd_usuarios_suscritos = new BD_Usuarios_suscritos();
	public BD_Noticias _bd_noticias = new BD_Noticias();
	public BD_Periodistas _bd_periodistas = new BD_Periodistas();
	public BD_Editores _bd_editores = new BD_Editores();
	public BD_Secciones _bd_secciones = new BD_Secciones();
	public BD_Comentarios _bd_comentarios = new BD_Comentarios();
	public BD_Tematicas _bd_tematicas = new BD_Tematicas();

	public Seccion Anadir_seccion(String aNombre, int aId_editor) throws PersistentException {
		return _bd_secciones.Anadir_seccion(aNombre, aId_editor);
	}

	public void Borrar_seccion(String aNombre, int aId_editor) throws PersistentException {
		_bd_secciones.Borrar_seccion(aNombre, aId_editor);
	}

	public Noticia[] Cargar_noticias_revisar() throws PersistentException {
		return _bd_noticias.Cargar_noticias_revisar();
	}

	public void Publicar_noticia(String aNombre_seccion, String aResumen, int aId_noticia, int aId_editor) throws PersistentException {
		_bd_noticias.Publicar_noticia(aNombre_seccion, aResumen, aId_noticia, aId_editor);
	}

	public void Eliminar_noticia(int aId_noticia, int aId_editor) throws PersistentException {
		_bd_noticias.Eliminar_noticia(aId_noticia, aId_editor);
	}

	public Periodista Alta_periodista(String aNombre, String aApellidos, String aNick, String aContrasena, String aDni, String aEmail, int aTelefono, String aFecha_nacimiento, int aId_editor) throws PersistentException {
		return _bd_periodistas.Alta_periodista(aNombre, aApellidos, aNick, aContrasena, aDni, aEmail, aTelefono, aFecha_nacimiento, aId_editor);
	}

	public Periodista[] Cargar_periodistas() throws PersistentException {
		return _bd_periodistas.Cargar_periodistas();
	}

	public void Baja_Periodista(String aNick, int aId_editor) throws PersistentException {
		_bd_periodistas.Baja_Periodista(aNick, aId_editor);
	}

	public Identificado Guardar_cambios(int aId, String aNombre, String aApellidos, String aNick, String aEmail, String aContrasena, String aUrl_foto_perfil, int aTelefono, String aNum_tarjeta) throws PersistentException {
		Usuario_suscrito suscrito = _bd_usuarios_suscritos.Guardar_cambios(aId, aNombre, aApellidos, aNick, aEmail, aContrasena, aUrl_foto_perfil, aTelefono, aNum_tarjeta);
		if (suscrito != null) return suscrito;
		Periodista periodista = _bd_periodistas.Guardar_cambios(aId, aNombre, aApellidos, aNick, aEmail, aContrasena, aUrl_foto_perfil, aTelefono); 
		if (periodista != null) return periodista;
		Editor editor =_bd_editores.Guardar_cambios(aId, aNombre, aApellidos, aNick, aEmail, aContrasena, aUrl_foto_perfil, aTelefono); 
		if (editor != null) return editor;
		return null;
	}

	public Noticia Comentar(int aId_identificado, int aId_noticia, String aContenido) throws PersistentException {
		return _bd_comentarios.Comentar(aId_identificado, aId_noticia, aContenido);
	}

	public Noticia Valorar_comentario(int aId_comentario, int aId_identificado, boolean aPositiva) throws PersistentException {
		return _bd_comentarios.Valorar_comentario(aId_comentario, aId_identificado, aPositiva);
	}

	public Noticia Valorar_noticia(int aId_noticia, int aId_identificado, boolean aPositiva) throws PersistentException {
		return _bd_noticias.Valorar_noticia(aId_noticia, aId_identificado, aPositiva);
	}

	public Seccion[] Cargar_secciones() throws PersistentException {
		return _bd_secciones.Cargar_secciones();
	}

	public Noticia[] Cargar_noticias() throws PersistentException {
		return _bd_noticias.Cargar_noticias();
	}

	public void Eliminar_cuenta(int aId) throws PersistentException {
		_bd_usuarios_suscritos.Eliminar_cuenta(aId);
	}

	public Identificado Login(String aEmail, String aContrasena) throws PersistentException {
		Usuario_suscrito suscrito = _bd_usuarios_suscritos.Login(aEmail, aContrasena);
		Periodista periodista = _bd_periodistas.Login(aEmail, aContrasena);
		Editor editor = _bd_editores.Login(aEmail, aContrasena);
		if (suscrito != null)
			return suscrito;
		if (periodista != null)
			return periodista;
		if (editor != null)
			return editor;
		return null;
	}

	public Usuario_suscrito Registrarse(String aEmail, String aNombre, String aApellidos, String aFecha_nacimiento, String aNick, String aDni, String aNum_tarjeta, int aTelefono, String aContrasena) throws PersistentException {
		return _bd_usuarios_suscritos.Registrarse(aEmail, aNombre, aApellidos, aFecha_nacimiento, aNick, aDni, aNum_tarjeta, aTelefono, aContrasena);
	}

	public Noticia Crear_noticia(String aTitulo, String aUrl_imagen, String aContenido, String aFecha, String aLugar, String aTematicas, int aId_periodista) throws PersistentException {
		return _bd_noticias.Crear_noticia(aTitulo, aUrl_imagen, aContenido, aFecha, aLugar, aTematicas, aId_periodista, _bd_tematicas);
	}

	public Noticia Eliminar_comentario(int aId_comentario, int aId_editor) throws PersistentException {
		return _bd_comentarios.Eliminar_comentario(aId_comentario, aId_editor);
	}

	public void Cambiar_orden_noticias_portada(String aTitulo_noticia, int aPosicion_portada) throws PersistentException {
		_bd_noticias.Cambiar_orden_noticias_portada(aTitulo_noticia, aPosicion_portada);
	}

	public Editor get_Editor() {
		throw new UnsupportedOperationException();
	}

	public Identificado get_Identificado() {
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

	public Periodista get_Periodista() {
		throw new UnsupportedOperationException();
	}
}