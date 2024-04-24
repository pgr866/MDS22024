/**
 * Licensee: Pablo(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListMDS12324PFFornielesGomezData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Seccion...");
		basededatos.Seccion[] base_de_datosSeccions = basededatos.Seccion.listSeccionByQuery(null, null);
		int length = Math.min(base_de_datosSeccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosSeccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Portada...");
		basededatos.Portada[] base_de_datosPortadas = basededatos.Portada.listPortadaByQuery(null, null);
		length = Math.min(base_de_datosPortadas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosPortadas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tematica...");
		basededatos.Tematica[] base_de_datosTematicas = basededatos.Tematica.listTematicaByQuery(null, null);
		length = Math.min(base_de_datosTematicas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosTematicas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Noticia...");
		basededatos.Noticia[] base_de_datosNoticias = basededatos.Noticia.listNoticiaByQuery(null, null);
		length = Math.min(base_de_datosNoticias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosNoticias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentario...");
		basededatos.Comentario[] base_de_datosComentarios = basededatos.Comentario.listComentarioByQuery(null, null);
		length = Math.min(base_de_datosComentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosComentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Identificado...");
		basededatos.Identificado[] base_de_datosIdentificados = basededatos.Identificado.listIdentificadoByQuery(null, null);
		length = Math.min(base_de_datosIdentificados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosIdentificados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Editor...");
		basededatos.Editor[] base_de_datosEditors = basededatos.Editor.listEditorByQuery(null, null);
		length = Math.min(base_de_datosEditors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosEditors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Periodista...");
		basededatos.Periodista[] base_de_datosPeriodistas = basededatos.Periodista.listPeriodistaByQuery(null, null);
		length = Math.min(base_de_datosPeriodistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosPeriodistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_suscrito...");
		basededatos.Usuario_suscrito[] base_de_datosUsuario_suscritos = basededatos.Usuario_suscrito.listUsuario_suscritoByQuery(null, null);
		length = Math.min(base_de_datosUsuario_suscritos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosUsuario_suscritos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Seccion by Criteria...");
		basededatos.SeccionCriteria base_de_datosSeccionCriteria = new basededatos.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_datosSeccionCriteria.id_seccion.eq();
		base_de_datosSeccionCriteria.setMaxResults(ROW_COUNT);
		basededatos.Seccion[] base_de_datosSeccions = base_de_datosSeccionCriteria.listSeccion();
		int length =base_de_datosSeccions== null ? 0 : Math.min(base_de_datosSeccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosSeccions[i]);
		}
		System.out.println(length + " Seccion record(s) retrieved."); 
		
		System.out.println("Listing Portada by Criteria...");
		basededatos.PortadaCriteria base_de_datosPortadaCriteria = new basededatos.PortadaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_datosPortadaCriteria.id_seccion.eq();
		base_de_datosPortadaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Portada[] base_de_datosPortadas = base_de_datosPortadaCriteria.listPortada();
		length =base_de_datosPortadas== null ? 0 : Math.min(base_de_datosPortadas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosPortadas[i]);
		}
		System.out.println(length + " Portada record(s) retrieved."); 
		
		System.out.println("Listing Tematica by Criteria...");
		basededatos.TematicaCriteria base_de_datosTematicaCriteria = new basededatos.TematicaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_datosTematicaCriteria.id_tematica.eq();
		base_de_datosTematicaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Tematica[] base_de_datosTematicas = base_de_datosTematicaCriteria.listTematica();
		length =base_de_datosTematicas== null ? 0 : Math.min(base_de_datosTematicas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosTematicas[i]);
		}
		System.out.println(length + " Tematica record(s) retrieved."); 
		
		System.out.println("Listing Noticia by Criteria...");
		basededatos.NoticiaCriteria base_de_datosNoticiaCriteria = new basededatos.NoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_datosNoticiaCriteria.id_noticia.eq();
		base_de_datosNoticiaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Noticia[] base_de_datosNoticias = base_de_datosNoticiaCriteria.listNoticia();
		length =base_de_datosNoticias== null ? 0 : Math.min(base_de_datosNoticias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosNoticias[i]);
		}
		System.out.println(length + " Noticia record(s) retrieved."); 
		
		System.out.println("Listing Comentario by Criteria...");
		basededatos.ComentarioCriteria base_de_datosComentarioCriteria = new basededatos.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_datosComentarioCriteria.id_comentario.eq();
		base_de_datosComentarioCriteria.setMaxResults(ROW_COUNT);
		basededatos.Comentario[] base_de_datosComentarios = base_de_datosComentarioCriteria.listComentario();
		length =base_de_datosComentarios== null ? 0 : Math.min(base_de_datosComentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosComentarios[i]);
		}
		System.out.println(length + " Comentario record(s) retrieved."); 
		
		System.out.println("Listing Identificado by Criteria...");
		basededatos.IdentificadoCriteria base_de_datosIdentificadoCriteria = new basededatos.IdentificadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_datosIdentificadoCriteria.id.eq();
		base_de_datosIdentificadoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Identificado[] base_de_datosIdentificados = base_de_datosIdentificadoCriteria.listIdentificado();
		length =base_de_datosIdentificados== null ? 0 : Math.min(base_de_datosIdentificados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosIdentificados[i]);
		}
		System.out.println(length + " Identificado record(s) retrieved."); 
		
		System.out.println("Listing Editor by Criteria...");
		basededatos.EditorCriteria base_de_datosEditorCriteria = new basededatos.EditorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_datosEditorCriteria.id.eq();
		base_de_datosEditorCriteria.setMaxResults(ROW_COUNT);
		basededatos.Editor[] base_de_datosEditors = base_de_datosEditorCriteria.listEditor();
		length =base_de_datosEditors== null ? 0 : Math.min(base_de_datosEditors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosEditors[i]);
		}
		System.out.println(length + " Editor record(s) retrieved."); 
		
		System.out.println("Listing Periodista by Criteria...");
		basededatos.PeriodistaCriteria base_de_datosPeriodistaCriteria = new basededatos.PeriodistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_datosPeriodistaCriteria.id.eq();
		base_de_datosPeriodistaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Periodista[] base_de_datosPeriodistas = base_de_datosPeriodistaCriteria.listPeriodista();
		length =base_de_datosPeriodistas== null ? 0 : Math.min(base_de_datosPeriodistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosPeriodistas[i]);
		}
		System.out.println(length + " Periodista record(s) retrieved."); 
		
		System.out.println("Listing Usuario_suscrito by Criteria...");
		basededatos.Usuario_suscritoCriteria base_de_datosUsuario_suscritoCriteria = new basededatos.Usuario_suscritoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_datosUsuario_suscritoCriteria.id.eq();
		base_de_datosUsuario_suscritoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Usuario_suscrito[] base_de_datosUsuario_suscritos = base_de_datosUsuario_suscritoCriteria.listUsuario_suscrito();
		length =base_de_datosUsuario_suscritos== null ? 0 : Math.min(base_de_datosUsuario_suscritos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosUsuario_suscritos[i]);
		}
		System.out.println(length + " Usuario_suscrito record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListMDS12324PFFornielesGomezData listMDS12324PFFornielesGomezData = new ListMDS12324PFFornielesGomezData();
			try {
				listMDS12324PFFornielesGomezData.listTestData();
				//listMDS12324PFFornielesGomezData.listByCriteria();
			}
			finally {
				basededatos.MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
