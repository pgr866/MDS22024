/**
 * Licensee: Pablo(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteMDS12324PFFornielesGomezData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			base_de_datos.Seccion base_de_datosSeccion = base_de_datos.Seccion.loadSeccionByQuery(null, null);
			base_de_datosSeccion.delete();
			base_de_datos.Portada base_de_datosPortada = base_de_datos.Portada.loadPortadaByQuery(null, null);
			base_de_datosPortada.delete();
			base_de_datos.Tematica base_de_datosTematica = base_de_datos.Tematica.loadTematicaByQuery(null, null);
			base_de_datosTematica.delete();
			base_de_datos.Noticia base_de_datosNoticia = base_de_datos.Noticia.loadNoticiaByQuery(null, null);
			base_de_datosNoticia.delete();
			base_de_datos.Comentario base_de_datosComentario = base_de_datos.Comentario.loadComentarioByQuery(null, null);
			base_de_datosComentario.delete();
			base_de_datos.Identificado base_de_datosIdentificado = base_de_datos.Identificado.loadIdentificadoByQuery(null, null);
			base_de_datosIdentificado.delete();
			base_de_datos.Editor base_de_datosEditor = base_de_datos.Editor.loadEditorByQuery(null, null);
			base_de_datosEditor.delete();
			base_de_datos.Periodista base_de_datosPeriodista = base_de_datos.Periodista.loadPeriodistaByQuery(null, null);
			base_de_datosPeriodista.delete();
			base_de_datos.Usuario_suscrito base_de_datosUsuario_suscrito = base_de_datos.Usuario_suscrito.loadUsuario_suscritoByQuery(null, null);
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
				base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
