/**
 * Licensee: Pablo(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListMDS12324PFFornielesGomezData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Portada...");
		basededatos.Portada[] basededatosPortadas = basededatos.PortadaDAO.listPortadaByQuery(null, null);
		int length = Math.min(basededatosPortadas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosPortadas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Seccion...");
		basededatos.Seccion[] basededatosSeccions = basededatos.SeccionDAO.listSeccionByQuery(null, null);
		length = Math.min(basededatosSeccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosSeccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tematica...");
		basededatos.Tematica[] basededatosTematicas = basededatos.TematicaDAO.listTematicaByQuery(null, null);
		length = Math.min(basededatosTematicas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosTematicas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Noticia...");
		basededatos.Noticia[] basededatosNoticias = basededatos.NoticiaDAO.listNoticiaByQuery(null, null);
		length = Math.min(basededatosNoticias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosNoticias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentario...");
		basededatos.Comentario[] basededatosComentarios = basededatos.ComentarioDAO.listComentarioByQuery(null, null);
		length = Math.min(basededatosComentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosComentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Identificado...");
		basededatos.Identificado[] basededatosIdentificados = basededatos.IdentificadoDAO.listIdentificadoByQuery(null, null);
		length = Math.min(basededatosIdentificados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosIdentificados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Editor...");
		basededatos.Editor[] basededatosEditors = basededatos.EditorDAO.listEditorByQuery(null, null);
		length = Math.min(basededatosEditors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosEditors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Periodista...");
		basededatos.Periodista[] basededatosPeriodistas = basededatos.PeriodistaDAO.listPeriodistaByQuery(null, null);
		length = Math.min(basededatosPeriodistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosPeriodistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_suscrito...");
		basededatos.Usuario_suscrito[] basededatosUsuario_suscritos = basededatos.Usuario_suscritoDAO.listUsuario_suscritoByQuery(null, null);
		length = Math.min(basededatosUsuario_suscritos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosUsuario_suscritos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Portada by Criteria...");
		basededatos.PortadaCriteria lbasededatosPortadaCriteria = new basededatos.PortadaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosPortadaCriteria.id_portada.eq();
		lbasededatosPortadaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Portada[] basededatosPortadas = lbasededatosPortadaCriteria.listPortada();
		int length =basededatosPortadas== null ? 0 : Math.min(basededatosPortadas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosPortadas[i]);
		}
		System.out.println(length + " Portada record(s) retrieved."); 
		
		System.out.println("Listing Seccion by Criteria...");
		basededatos.SeccionCriteria lbasededatosSeccionCriteria = new basededatos.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosSeccionCriteria.id_seccion.eq();
		lbasededatosSeccionCriteria.setMaxResults(ROW_COUNT);
		basededatos.Seccion[] basededatosSeccions = lbasededatosSeccionCriteria.listSeccion();
		length =basededatosSeccions== null ? 0 : Math.min(basededatosSeccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosSeccions[i]);
		}
		System.out.println(length + " Seccion record(s) retrieved."); 
		
		System.out.println("Listing Tematica by Criteria...");
		basededatos.TematicaCriteria lbasededatosTematicaCriteria = new basededatos.TematicaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosTematicaCriteria.id_tematica.eq();
		lbasededatosTematicaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Tematica[] basededatosTematicas = lbasededatosTematicaCriteria.listTematica();
		length =basededatosTematicas== null ? 0 : Math.min(basededatosTematicas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosTematicas[i]);
		}
		System.out.println(length + " Tematica record(s) retrieved."); 
		
		System.out.println("Listing Noticia by Criteria...");
		basededatos.NoticiaCriteria lbasededatosNoticiaCriteria = new basededatos.NoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosNoticiaCriteria.id_noticia.eq();
		lbasededatosNoticiaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Noticia[] basededatosNoticias = lbasededatosNoticiaCriteria.listNoticia();
		length =basededatosNoticias== null ? 0 : Math.min(basededatosNoticias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosNoticias[i]);
		}
		System.out.println(length + " Noticia record(s) retrieved."); 
		
		System.out.println("Listing Comentario by Criteria...");
		basededatos.ComentarioCriteria lbasededatosComentarioCriteria = new basededatos.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosComentarioCriteria.id_comentario.eq();
		lbasededatosComentarioCriteria.setMaxResults(ROW_COUNT);
		basededatos.Comentario[] basededatosComentarios = lbasededatosComentarioCriteria.listComentario();
		length =basededatosComentarios== null ? 0 : Math.min(basededatosComentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosComentarios[i]);
		}
		System.out.println(length + " Comentario record(s) retrieved."); 
		
		System.out.println("Listing Identificado by Criteria...");
		basededatos.IdentificadoCriteria lbasededatosIdentificadoCriteria = new basededatos.IdentificadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosIdentificadoCriteria.id.eq();
		lbasededatosIdentificadoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Identificado[] basededatosIdentificados = lbasededatosIdentificadoCriteria.listIdentificado();
		length =basededatosIdentificados== null ? 0 : Math.min(basededatosIdentificados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosIdentificados[i]);
		}
		System.out.println(length + " Identificado record(s) retrieved."); 
		
		System.out.println("Listing Editor by Criteria...");
		basededatos.EditorCriteria lbasededatosEditorCriteria = new basededatos.EditorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosEditorCriteria.id.eq();
		lbasededatosEditorCriteria.setMaxResults(ROW_COUNT);
		basededatos.Editor[] basededatosEditors = lbasededatosEditorCriteria.listEditor();
		length =basededatosEditors== null ? 0 : Math.min(basededatosEditors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosEditors[i]);
		}
		System.out.println(length + " Editor record(s) retrieved."); 
		
		System.out.println("Listing Periodista by Criteria...");
		basededatos.PeriodistaCriteria lbasededatosPeriodistaCriteria = new basededatos.PeriodistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosPeriodistaCriteria.id.eq();
		lbasededatosPeriodistaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Periodista[] basededatosPeriodistas = lbasededatosPeriodistaCriteria.listPeriodista();
		length =basededatosPeriodistas== null ? 0 : Math.min(basededatosPeriodistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosPeriodistas[i]);
		}
		System.out.println(length + " Periodista record(s) retrieved."); 
		
		System.out.println("Listing Usuario_suscrito by Criteria...");
		basededatos.Usuario_suscritoCriteria lbasededatosUsuario_suscritoCriteria = new basededatos.Usuario_suscritoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosUsuario_suscritoCriteria.id.eq();
		lbasededatosUsuario_suscritoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Usuario_suscrito[] basededatosUsuario_suscritos = lbasededatosUsuario_suscritoCriteria.listUsuario_suscrito();
		length =basededatosUsuario_suscritos== null ? 0 : Math.min(basededatosUsuario_suscritos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosUsuario_suscritos[i]);
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
