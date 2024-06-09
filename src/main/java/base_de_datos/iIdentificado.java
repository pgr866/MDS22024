package base_de_datos;

import org.orm.PersistentException;

import basededatos.Seccion;
import basededatos.Identificado;
import basededatos.Noticia;

public interface iIdentificado {

	public Identificado Guardar_cambios(int aId, String aNombre, String aApellidos, String aNick, String aEmail, String aContrasena, String aUrl_foto_perfil, int aTelefono, String aNum_tarjeta) throws PersistentException;

	public Noticia Comentar(int aId_identificado, int aId_noticia, String aContenido) throws PersistentException;

	public Noticia Valorar_comentario(int aId_comentario, int aId_identificado, boolean aPositiva) throws PersistentException;

	public Noticia Valorar_noticia(int aId_noticia, int aId_identificado, boolean aPositiva) throws PersistentException;

	public Seccion[] Cargar_secciones() throws PersistentException;

	public Noticia[] Cargar_noticias() throws PersistentException;
}