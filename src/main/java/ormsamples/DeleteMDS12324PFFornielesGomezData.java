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
			basededatos.Seccion base_de_datosSeccion = basededatos.Seccion.loadSeccionByQuery(null, null);
			base_de_datosSeccion.delete();
			basededatos.Portada base_de_datosPortada = basededatos.Portada.loadPortadaByQuery(null, null);
			base_de_datosPortada.delete();
			basededatos.Tematica base_de_datosTematica = basededatos.Tematica.loadTematicaByQuery(null, null);
			base_de_datosTematica.delete();
			basededatos.Noticia base_de_datosNoticia = basededatos.Noticia.loadNoticiaByQuery(null, null);
			base_de_datosNoticia.delete();
			basededatos.Comentario base_de_datosComentario = basededatos.Comentario.loadComentarioByQuery(null, null);
			base_de_datosComentario.delete();
			basededatos.Identificado base_de_datosIdentificado = basededatos.Identificado.loadIdentificadoByQuery(null, null);
			base_de_datosIdentificado.delete();
			basededatos.Editor base_de_datosEditor = basededatos.Editor.loadEditorByQuery(null, null);
			base_de_datosEditor.delete();
			basededatos.Periodista base_de_datosPeriodista = basededatos.Periodista.loadPeriodistaByQuery(null, null);
			base_de_datosPeriodista.delete();
			basededatos.Usuario_suscrito base_de_datosUsuario_suscrito = basededatos.Usuario_suscrito.loadUsuario_suscritoByQuery(null, null);
			base_de_datosUsuario_suscrito.delete();
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
