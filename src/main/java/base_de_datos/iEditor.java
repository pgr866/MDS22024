package base_de_datos;

import basededatos.Seccion;
import basededatos.Noticia;
import basededatos.Periodista;

public interface iEditor extends iIdentificado {

	public Seccion Anadir_seccion(String aANombre, int aAId_editor);

	public void Borrar_seccion(String aANombre, int aAId_editor);

	public Noticia[] Cargar_noticias_revisar();

	public void Publicar_noticia(String aANombre_seccion, String aAResumen, int aAId_noticia, int aAId_editor);

	public void Eliminar_noticia(int aAId_noticia, int aAId_editor);

	public Periodista Alta_periodista(String aANombre, String aAApellidos, String aANick, String aAContrasena, String aADni, String aAEmail, int aATelefono, String aAFecha_nacimiento, int aAId_editor);

	public Periodista[] Cargar_periodistas();

	public void Baja_Periodista(String aANick, int aAId_editor);

	public void Eliminar_comentario(int aAId_comentario, int aAId_editor);

	public void Cambiar_orden_noticias_portada(String aATitulo_noticia, int aAPosicion_portada);
}