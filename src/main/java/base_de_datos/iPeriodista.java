package base_de_datos;

import basededatos.Noticia;

public interface iPeriodista extends iIdentificado {

	public Noticia Crear_noticia(String aTitulo, String aUrl_imagen, String aContenido, String aFecha, String aLugar, String aTematicas, int aId_periodista);
}