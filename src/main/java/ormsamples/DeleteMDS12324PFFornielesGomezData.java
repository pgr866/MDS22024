/**
 * Licensee: Pablo(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteMDS12324PFFornielesGomezData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Portada lbasededatosPortada = basededatos.PortadaDAO.loadPortadaByQuery(null, null);
			// Delete the persistent object
			basededatos.PortadaDAO.delete(lbasededatosPortada);
			basededatos.Seccion lbasededatosSeccion = basededatos.SeccionDAO.loadSeccionByQuery(null, null);
			// Delete the persistent object
			basededatos.SeccionDAO.delete(lbasededatosSeccion);
			basededatos.Tematica lbasededatosTematica = basededatos.TematicaDAO.loadTematicaByQuery(null, null);
			// Delete the persistent object
			basededatos.TematicaDAO.delete(lbasededatosTematica);
			basededatos.Noticia lbasededatosNoticia = basededatos.NoticiaDAO.loadNoticiaByQuery(null, null);
			// Delete the persistent object
			basededatos.NoticiaDAO.delete(lbasededatosNoticia);
			basededatos.Comentario lbasededatosComentario = basededatos.ComentarioDAO.loadComentarioByQuery(null, null);
			// Delete the persistent object
			basededatos.ComentarioDAO.delete(lbasededatosComentario);
			basededatos.Identificado lbasededatosIdentificado = basededatos.IdentificadoDAO.loadIdentificadoByQuery(null, null);
			// Delete the persistent object
			basededatos.IdentificadoDAO.delete(lbasededatosIdentificado);
			basededatos.Editor lbasededatosEditor = basededatos.EditorDAO.loadEditorByQuery(null, null);
			// Delete the persistent object
			basededatos.EditorDAO.delete(lbasededatosEditor);
			basededatos.Periodista lbasededatosPeriodista = basededatos.PeriodistaDAO.loadPeriodistaByQuery(null, null);
			// Delete the persistent object
			basededatos.PeriodistaDAO.delete(lbasededatosPeriodista);
			basededatos.Usuario_suscrito lbasededatosUsuario_suscrito = basededatos.Usuario_suscritoDAO.loadUsuario_suscritoByQuery(null, null);
			// Delete the persistent object
			basededatos.Usuario_suscritoDAO.delete(lbasededatosUsuario_suscrito);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteMDS12324PFFornielesGomezData deleteMDS12324PFFornielesGomezData = new DeleteMDS12324PFFornielesGomezData();
			try {
				deleteMDS12324PFFornielesGomezData.deleteTestData();
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
