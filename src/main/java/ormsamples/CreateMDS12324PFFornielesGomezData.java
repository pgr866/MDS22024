/**
 * Licensee: Pablo(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS12324PFFornielesGomezData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			base_de_datos.Seccion base_de_datosSeccion = base_de_datos.Seccion.createSeccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : pertenece_a_seccion, aparece_en, crea, elimina
			base_de_datosSeccion.save();
			base_de_datos.Portada base_de_datosPortada = base_de_datos.Portada.createPortada();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ordena
			base_de_datosPortada.save();
			base_de_datos.Tematica base_de_datosTematica = base_de_datos.Tematica.createTematica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene, seccion_contiene_tematicas
			base_de_datosTematica.save();
			base_de_datos.Noticia base_de_datosNoticia = base_de_datos.Noticia.createNoticia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : elimina, pertenece_a_noticia, seccion_contiene_noticias, pertenece_a, valora, crea, valoraciones_negativas, valoraciones_positivas, publicada, publica
			base_de_datosNoticia.save();
			base_de_datos.Comentario base_de_datosComentario = base_de_datos.Comentario.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : valora, valoraciones_negativas, valoraciones_positivas, noticia_contiene_comentarios, elimina, escribe
			base_de_datosComentario.save();
			base_de_datos.Identificado base_de_datosIdentificado = base_de_datos.Identificado.createIdentificado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_valorada_por, es_valorado_por, pertenece_a_identificado, telefono, dni
			base_de_datosIdentificado.save();
			base_de_datos.Editor base_de_datosEditor = base_de_datos.Editor.createEditor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_ordenada, es_publicada_por, es_eliminada_por, es_creada_por, es_eliminada_por_editor, es_eliminado_por
			base_de_datosEditor.save();
			base_de_datos.Periodista base_de_datosPeriodista = base_de_datos.Periodista.createPeriodista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_creada
			base_de_datosPeriodista.save();
			base_de_datos.Usuario_suscrito base_de_datosUsuario_suscrito = base_de_datos.Usuario_suscrito.createUsuario_suscrito();
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
				base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
