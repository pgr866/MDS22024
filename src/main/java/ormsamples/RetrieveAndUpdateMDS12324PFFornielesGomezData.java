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
			basededatos.Seccion base_de_datosSeccion = basededatos.Seccion.loadSeccionByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosSeccion.save();
			basededatos.Portada base_de_datosPortada = basededatos.Portada.loadPortadaByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosPortada.save();
			basededatos.Tematica base_de_datosTematica = basededatos.Tematica.loadTematicaByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosTematica.save();
			basededatos.Noticia base_de_datosNoticia = basededatos.Noticia.loadNoticiaByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosNoticia.save();
			basededatos.Comentario base_de_datosComentario = basededatos.Comentario.loadComentarioByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosComentario.save();
			basededatos.Identificado base_de_datosIdentificado = basededatos.Identificado.loadIdentificadoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosIdentificado.save();
			basededatos.Editor base_de_datosEditor = basededatos.Editor.loadEditorByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosEditor.save();
			basededatos.Periodista base_de_datosPeriodista = basededatos.Periodista.loadPeriodistaByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosPeriodista.save();
			basededatos.Usuario_suscrito base_de_datosUsuario_suscrito = basededatos.Usuario_suscrito.loadUsuario_suscritoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosUsuario_suscrito.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Seccion by SeccionCriteria");
		basededatos.SeccionCriteria base_de_datosSeccionCriteria = new basededatos.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosSeccionCriteria.id_seccion.eq();
		System.out.println(base_de_datosSeccionCriteria.uniqueSeccion());
		
		System.out.println("Retrieving Portada by PortadaCriteria");
		basededatos.PortadaCriteria base_de_datosPortadaCriteria = new basededatos.PortadaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosPortadaCriteria.id_seccion.eq();
		System.out.println(base_de_datosPortadaCriteria.uniquePortada());
		
		System.out.println("Retrieving Tematica by TematicaCriteria");
		basededatos.TematicaCriteria base_de_datosTematicaCriteria = new basededatos.TematicaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosTematicaCriteria.id_tematica.eq();
		System.out.println(base_de_datosTematicaCriteria.uniqueTematica());
		
		System.out.println("Retrieving Noticia by NoticiaCriteria");
		basededatos.NoticiaCriteria base_de_datosNoticiaCriteria = new basededatos.NoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosNoticiaCriteria.id_noticia.eq();
		System.out.println(base_de_datosNoticiaCriteria.uniqueNoticia());
		
		System.out.println("Retrieving Comentario by ComentarioCriteria");
		basededatos.ComentarioCriteria base_de_datosComentarioCriteria = new basededatos.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosComentarioCriteria.id_comentario.eq();
		System.out.println(base_de_datosComentarioCriteria.uniqueComentario());
		
		System.out.println("Retrieving Identificado by IdentificadoCriteria");
		basededatos.IdentificadoCriteria base_de_datosIdentificadoCriteria = new basededatos.IdentificadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosIdentificadoCriteria.id.eq();
		System.out.println(base_de_datosIdentificadoCriteria.uniqueIdentificado());
		
		System.out.println("Retrieving Editor by EditorCriteria");
		basededatos.EditorCriteria base_de_datosEditorCriteria = new basededatos.EditorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosEditorCriteria.id.eq();
		System.out.println(base_de_datosEditorCriteria.uniqueEditor());
		
		System.out.println("Retrieving Periodista by PeriodistaCriteria");
		basededatos.PeriodistaCriteria base_de_datosPeriodistaCriteria = new basededatos.PeriodistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosPeriodistaCriteria.id.eq();
		System.out.println(base_de_datosPeriodistaCriteria.uniquePeriodista());
		
		System.out.println("Retrieving Usuario_suscrito by Usuario_suscritoCriteria");
		basededatos.Usuario_suscritoCriteria base_de_datosUsuario_suscritoCriteria = new basededatos.Usuario_suscritoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosUsuario_suscritoCriteria.id.eq();
		System.out.println(base_de_datosUsuario_suscritoCriteria.uniqueUsuario_suscrito());
		
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
