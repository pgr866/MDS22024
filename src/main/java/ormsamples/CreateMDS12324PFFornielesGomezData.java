/**
 * Licensee: Pablo(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS12324PFFornielesGomezData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Seccion base_de_datosSeccion = basededatos.Seccion.createSeccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : pertenece_a_seccion, aparece_en, crea, elimina
			base_de_datosSeccion.save();
			basededatos.Portada base_de_datosPortada = basededatos.Portada.createPortada();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ordena
			base_de_datosPortada.save();
			basededatos.Tematica base_de_datosTematica = basededatos.Tematica.createTematica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene, seccion_contiene_tematicas
			base_de_datosTematica.save();
			basededatos.Noticia base_de_datosNoticia = basededatos.Noticia.createNoticia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : elimina, pertenece_a_noticia, seccion_contiene_noticias, pertenece_a, valora, publica, valoraciones_negativas, valoraciones_positivas, publicada, crea
			base_de_datosNoticia.save();
			basededatos.Comentario base_de_datosComentario = basededatos.Comentario.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : valora, valoraciones_negativas, valoraciones_positivas, noticia_contiene_comentarios, elimina, escribe
			base_de_datosComentario.save();
			basededatos.Identificado base_de_datosIdentificado = basededatos.Identificado.createIdentificado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_valorada_por, es_valorado_por, pertenece_a_identificado, telefono, dni
			base_de_datosIdentificado.save();
			basededatos.Editor base_de_datosEditor = basededatos.Editor.createEditor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_ordenada, es_publicada_por, es_eliminada_por, es_creada_por, es_eliminada_por_editor, es_eliminado_por
			base_de_datosEditor.save();
			basededatos.Periodista base_de_datosPeriodista = basededatos.Periodista.createPeriodista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_creada, esEliminado
			base_de_datosPeriodista.save();
			basededatos.Usuario_suscrito base_de_datosUsuario_suscrito = basededatos.Usuario_suscrito.createUsuario_suscrito();
			// Initialize the properties of the persistent object here
			base_de_datosUsuario_suscrito.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateMDS12324PFFornielesGomezData createMDS12324PFFornielesGomezData = new CreateMDS12324PFFornielesGomezData();
			try {
				createMDS12324PFFornielesGomezData.createTestData();
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
