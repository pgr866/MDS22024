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
			basededatos.Portada lbasededatosPortada = basededatos.PortadaDAO.createPortada();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ordena
			basededatos.PortadaDAO.save(lbasededatosPortada);
			basededatos.Seccion lbasededatosSeccion = basededatos.SeccionDAO.createSeccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : titulo_seccion, crea_seccion
			basededatos.SeccionDAO.save(lbasededatosSeccion);
			basededatos.Tematica lbasededatosTematica = basededatos.TematicaDAO.createTematica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene, titulo_tematica
			basededatos.TematicaDAO.save(lbasededatosTematica);
			basededatos.Noticia lbasededatosNoticia = basededatos.NoticiaDAO.createNoticia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : pertenece_a_noticia, valora_negativa, pertenece_a, valora_positiva, posicion_portada, valoraciones_negativas, valoraciones_positivas, contenido, lugar, fecha, url_imagen_noticia, titulo, crea
			basededatos.NoticiaDAO.save(lbasededatosNoticia);
			basededatos.Comentario lbasededatosComentario = basededatos.ComentarioDAO.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : valora_negativamente, valora_positivamente, valoraciones_negativas, valoraciones_positivas, contenido, noticia_contiene_comentarios, escribe
			basededatos.ComentarioDAO.save(lbasededatosComentario);
			basededatos.Identificado lbasededatosIdentificado = basededatos.IdentificadoDAO.createIdentificado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_valorada_negativa_por, es_valorada_positiva_por, es_valorado_negativa, es_valorado_positiva, pertenece_a_identificado, telefono, fecha_nacimiento, contrasena, email, nick_apodo, apellidos, nombre, dni
			basededatos.IdentificadoDAO.save(lbasededatosIdentificado);
			basededatos.Editor lbasededatosEditor = basededatos.EditorDAO.createEditor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_dado_de_alta, es_ordenada, es_creada_por
			basededatos.EditorDAO.save(lbasededatosEditor);
			basededatos.Periodista lbasededatosPeriodista = basededatos.PeriodistaDAO.createPeriodista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_creada, da_de_alta
			basededatos.PeriodistaDAO.save(lbasededatosPeriodista);
			basededatos.Usuario_suscrito lbasededatosUsuario_suscrito = basededatos.Usuario_suscritoDAO.createUsuario_suscrito();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : esEliminado, num_tarjeta
			basededatos.Usuario_suscritoDAO.save(lbasededatosUsuario_suscrito);
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
