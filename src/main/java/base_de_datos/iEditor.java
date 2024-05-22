package base_de_datos;

import basededatos.Seccion;
import basededatos.Noticia;
import basededatos.Periodista;

public interface iEditor extends iIdentificado {

	public Seccion Anadir_seccion(String aNombre, int aId_editor);

	public void Borrar_seccion(String aNombre, int aId_editor);

	public Noticia[] Cargar_noticias_revisar();

	public void Publicar_noticia(String aNombre_seccion, String aResumen, int aId_noticia, int aId_editor);

	public void Eliminar_noticia(int aId_noticia, int aId_editor);

	public Periodista Alta_periodista(String aNombre, String aApellidos, String aNick, String aContrasena, String aDni, String aEmail, int aTelefono, String aFecha_nacimiento, int aId_editor);

	public Periodista[] Cargar_periodistas();

	public void Baja_Periodista(String aNick, int aId_editor);

	public void Eliminar_comentario(int aId_comentario, int aId_editor);

	public void Cambiar_orden_noticias_portada(String aTitulo_noticia, int aPosicion_portada);
}