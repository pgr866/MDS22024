/**
 * Licensee: Pablo(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMDS12324PFFornielesGomezData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			base_de_datos.Seccion base_de_datosSeccion = base_de_datos.Seccion.loadSeccionByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosSeccion.save();
			base_de_datos.Portada base_de_datosPortada = base_de_datos.Portada.loadPortadaByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosPortada.save();
			base_de_datos.Tematica base_de_datosTematica = base_de_datos.Tematica.loadTematicaByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosTematica.save();
			base_de_datos.Noticia base_de_datosNoticia = base_de_datos.Noticia.loadNoticiaByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosNoticia.save();
			base_de_datos.Comentario base_de_datosComentario = base_de_datos.Comentario.loadComentarioByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosComentario.save();
			base_de_datos.Identificado base_de_datosIdentificado = base_de_datos.Identificado.loadIdentificadoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosIdentificado.save();
			base_de_datos.Editor base_de_datosEditor = base_de_datos.Editor.loadEditorByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosEditor.save();
			base_de_datos.Periodista base_de_datosPeriodista = base_de_datos.Periodista.loadPeriodistaByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datosPeriodista.save();
			base_de_datos.Usuario_suscrito base_de_datosUsuario_suscrito = base_de_datos.Usuario_suscrito.loadUsuario_suscritoByQuery(null, null);
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
		base_de_datos.SeccionCriteria base_de_datosSeccionCriteria = new base_de_datos.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosSeccionCriteria.id_seccion.eq();
		System.out.println(base_de_datosSeccionCriteria.uniqueSeccion());
		
		System.out.println("Retrieving Portada by PortadaCriteria");
		base_de_datos.PortadaCriteria base_de_datosPortadaCriteria = new base_de_datos.PortadaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosPortadaCriteria.id_seccion.eq();
		System.out.println(base_de_datosPortadaCriteria.uniquePortada());
		
		System.out.println("Retrieving Tematica by TematicaCriteria");
		base_de_datos.TematicaCriteria base_de_datosTematicaCriteria = new base_de_datos.TematicaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosTematicaCriteria.id_tematica.eq();
		System.out.println(base_de_datosTematicaCriteria.uniqueTematica());
		
		System.out.println("Retrieving Noticia by NoticiaCriteria");
		base_de_datos.NoticiaCriteria base_de_datosNoticiaCriteria = new base_de_datos.NoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosNoticiaCriteria.id_noticia.eq();
		System.out.println(base_de_datosNoticiaCriteria.uniqueNoticia());
		
		System.out.println("Retrieving Comentario by ComentarioCriteria");
		base_de_datos.ComentarioCriteria base_de_datosComentarioCriteria = new base_de_datos.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosComentarioCriteria.id_comentario.eq();
		System.out.println(base_de_datosComentarioCriteria.uniqueComentario());
		
		System.out.println("Retrieving Identificado by IdentificadoCriteria");
		base_de_datos.IdentificadoCriteria base_de_datosIdentificadoCriteria = new base_de_datos.IdentificadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosIdentificadoCriteria.dni.eq();
		System.out.println(base_de_datosIdentificadoCriteria.uniqueIdentificado());
		
		System.out.println("Retrieving Editor by EditorCriteria");
		base_de_datos.EditorCriteria base_de_datosEditorCriteria = new base_de_datos.EditorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosEditorCriteria.dni.eq();
		System.out.println(base_de_datosEditorCriteria.uniqueEditor());
		
		System.out.println("Retrieving Periodista by PeriodistaCriteria");
		base_de_datos.PeriodistaCriteria base_de_datosPeriodistaCriteria = new base_de_datos.PeriodistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosPeriodistaCriteria.dni.eq();
		System.out.println(base_de_datosPeriodistaCriteria.uniquePeriodista());
		
		System.out.println("Retrieving Usuario_suscrito by Usuario_suscritoCriteria");
		base_de_datos.Usuario_suscritoCriteria base_de_datosUsuario_suscritoCriteria = new base_de_datos.Usuario_suscritoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosUsuario_suscritoCriteria.dni.eq();
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
				base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
