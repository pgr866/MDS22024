package base_de_datos;

import basededatos.Noticia;
import basededatos.Seccion;

public interface iPeriodista extends iIdentificado {

	public Noticia Crear_noticia(String aTitulo, String aUrl_imagen, String aContenido, String aFecha, String aLugar, String aTematicas, int aId_periodista);

	public void Guardar_cambios(int aId, String aNombre, String aApellidos, String aNick, String aEmail, String aContrasena, String aUrl_foto_perfil, String aNum_tarjeta);

	public void Comentar(int aId_identificado, int aId_noticia, String aContenido);

	public void Valorar_comentario(int aId_comentario, int aId_identificado, boolean aPositiva);

	public void Valorar_noticia(int aId_noticia, int aId_identificado, boolean aPositiva);

	public Seccion[] Cargar_secciones();

	public Noticia[] Cargar_noticias();

	public Noticia[] Cargar_noticias_portada();
}