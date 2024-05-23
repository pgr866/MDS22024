package base_de_datos;

import basededatos.Noticia;
import basededatos.Seccion;

public interface iPeriodista extends iIdentificado {

	public Noticia Crear_noticia(String aATitulo, String aAUrl_imagen, String aAContenido, String aAFecha, String aALugar, String aATematicas, int aAId_periodista);

	public void Guardar_cambios(int aAId, String aANombre, String aANick, String aAEmail, String aAContrasena, String aAUrl_foto_perfil, String aANum_tarjeta);

	public void Comentar(int aAId_identificado, int aAId_noticia, String aAContenido);

	public void Valorar_comentario(int aAId_comentario, int aAId_identificado, boolean aAPositiva);

	public void Valorar_noticia(int aAId_noticia, int aAId_identificado, boolean aAPositiva);

	public Seccion[] Cargar_secciones();

	public Noticia[] Cargar_noticias();

	public Noticia[] Cargar_noticias_portada();
}