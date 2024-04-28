/**
 * Licensee: Pablo(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMDS12324PFFornielesGomezData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Portada lbasededatosPortada = basededatos.PortadaDAO.loadPortadaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.PortadaDAO.save(lbasededatosPortada);
			basededatos.Seccion lbasededatosSeccion = basededatos.SeccionDAO.loadSeccionByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.SeccionDAO.save(lbasededatosSeccion);
			basededatos.Tematica lbasededatosTematica = basededatos.TematicaDAO.loadTematicaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.TematicaDAO.save(lbasededatosTematica);
			basededatos.Noticia lbasededatosNoticia = basededatos.NoticiaDAO.loadNoticiaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.NoticiaDAO.save(lbasededatosNoticia);
			basededatos.Comentario lbasededatosComentario = basededatos.ComentarioDAO.loadComentarioByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ComentarioDAO.save(lbasededatosComentario);
			basededatos.Identificado lbasededatosIdentificado = basededatos.IdentificadoDAO.loadIdentificadoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.IdentificadoDAO.save(lbasededatosIdentificado);
			basededatos.Editor lbasededatosEditor = basededatos.EditorDAO.loadEditorByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.EditorDAO.save(lbasededatosEditor);
			basededatos.Periodista lbasededatosPeriodista = basededatos.PeriodistaDAO.loadPeriodistaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.PeriodistaDAO.save(lbasededatosPeriodista);
			basededatos.Usuario_suscrito lbasededatosUsuario_suscrito = basededatos.Usuario_suscritoDAO.loadUsuario_suscritoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Usuario_suscritoDAO.save(lbasededatosUsuario_suscrito);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Portada by PortadaCriteria");
		basededatos.PortadaCriteria lbasededatosPortadaCriteria = new basededatos.PortadaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosPortadaCriteria.id_portada.eq();
		System.out.println(lbasededatosPortadaCriteria.uniquePortada());
		
		System.out.println("Retrieving Seccion by SeccionCriteria");
		basededatos.SeccionCriteria lbasededatosSeccionCriteria = new basededatos.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosSeccionCriteria.id_seccion.eq();
		System.out.println(lbasededatosSeccionCriteria.uniqueSeccion());
		
		System.out.println("Retrieving Tematica by TematicaCriteria");
		basededatos.TematicaCriteria lbasededatosTematicaCriteria = new basededatos.TematicaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosTematicaCriteria.id_tematica.eq();
		System.out.println(lbasededatosTematicaCriteria.uniqueTematica());
		
		System.out.println("Retrieving Noticia by NoticiaCriteria");
		basededatos.NoticiaCriteria lbasededatosNoticiaCriteria = new basededatos.NoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosNoticiaCriteria.id_noticia.eq();
		System.out.println(lbasededatosNoticiaCriteria.uniqueNoticia());
		
		System.out.println("Retrieving Comentario by ComentarioCriteria");
		basededatos.ComentarioCriteria lbasededatosComentarioCriteria = new basededatos.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosComentarioCriteria.id_comentario.eq();
		System.out.println(lbasededatosComentarioCriteria.uniqueComentario());
		
		System.out.println("Retrieving Identificado by IdentificadoCriteria");
		basededatos.IdentificadoCriteria lbasededatosIdentificadoCriteria = new basededatos.IdentificadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosIdentificadoCriteria.id.eq();
		System.out.println(lbasededatosIdentificadoCriteria.uniqueIdentificado());
		
		System.out.println("Retrieving Editor by EditorCriteria");
		basededatos.EditorCriteria lbasededatosEditorCriteria = new basededatos.EditorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosEditorCriteria.id.eq();
		System.out.println(lbasededatosEditorCriteria.uniqueEditor());
		
		System.out.println("Retrieving Periodista by PeriodistaCriteria");
		basededatos.PeriodistaCriteria lbasededatosPeriodistaCriteria = new basededatos.PeriodistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosPeriodistaCriteria.id.eq();
		System.out.println(lbasededatosPeriodistaCriteria.uniquePeriodista());
		
		System.out.println("Retrieving Usuario_suscrito by Usuario_suscritoCriteria");
		basededatos.Usuario_suscritoCriteria lbasededatosUsuario_suscritoCriteria = new basededatos.Usuario_suscritoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosUsuario_suscritoCriteria.id.eq();
		System.out.println(lbasededatosUsuario_suscritoCriteria.uniqueUsuario_suscrito());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMDS12324PFFornielesGomezData retrieveAndUpdateMDS12324PFFornielesGomezData = new RetrieveAndUpdateMDS12324PFFornielesGomezData();
			try {
				retrieveAndUpdateMDS12324PFFornielesGomezData.retrieveAndUpdateTestData();
				//retrieveAndUpdateMDS12324PFFornielesGomezData.retrieveByCriteria();
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
