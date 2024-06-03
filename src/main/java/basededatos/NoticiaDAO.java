/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Pablo(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class NoticiaDAO {
	public static Noticia loadNoticiaByORMID(int id_noticia) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadNoticiaByORMID(session, id_noticia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(int id_noticia) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getNoticiaByORMID(session, id_noticia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByORMID(int id_noticia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadNoticiaByORMID(session, id_noticia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(int id_noticia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getNoticiaByORMID(session, id_noticia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByORMID(PersistentSession session, int id_noticia) throws PersistentException {
		try {
			return (Noticia) session.load(basededatos.Noticia.class, Integer.valueOf(id_noticia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(PersistentSession session, int id_noticia) throws PersistentException {
		try {
			return (Noticia) session.get(basededatos.Noticia.class, Integer.valueOf(id_noticia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByORMID(PersistentSession session, int id_noticia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Noticia) session.load(basededatos.Noticia.class, Integer.valueOf(id_noticia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(PersistentSession session, int id_noticia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Noticia) session.get(basededatos.Noticia.class, Integer.valueOf(id_noticia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryNoticia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryNoticia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Noticia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryNoticia(session, condition, orderBy);
			return (Noticia[]) list.toArray(new Noticia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryNoticia(session, condition, orderBy, lockMode);
			return (Noticia[]) list.toArray(new Noticia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Noticia[] noticias = listNoticiaByQuery(session, condition, orderBy);
		if (noticias != null && noticias.length > 0)
			return noticias[0];
		else
			return null;
	}
	
	public static Noticia loadNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Noticia[] noticias = listNoticiaByQuery(session, condition, orderBy, lockMode);
		if (noticias != null && noticias.length > 0)
			return noticias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Noticia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia createNoticia() {
		return new basededatos.Noticia();
	}
	
	public static boolean save(basededatos.Noticia noticia) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().saveObject(noticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Noticia noticia) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().deleteObject(noticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Noticia noticia)throws PersistentException {
		try {
			if (noticia.getPortada_contiene_noticias() != null) {
				noticia.getPortada_contiene_noticias().aparece_en_portada.remove(noticia);
			}
			
			if (noticia.getPublica() != null) {
				noticia.getPublica().es_publicada_por.remove(noticia);
			}
			
			if (noticia.getElimina_noticia() != null) {
				noticia.getElimina_noticia().noticia_es_eliminada_por_.remove(noticia);
			}
			
			if (noticia.getSeccion_contiene_noticias() != null) {
				noticia.getSeccion_contiene_noticias().aparece_en.remove(noticia);
			}
			
			if (noticia.getCrea() != null) {
				noticia.getCrea().es_creada.remove(noticia);
			}
			
			basededatos.Identificado[] lValora_positivas = noticia.valora_positiva.toArray();
			for(int i = 0; i < lValora_positivas.length; i++) {
				lValora_positivas[i].es_valorada_positiva_por.remove(noticia);
			}
			basededatos.Tematica[] lPertenece_as = noticia.pertenece_a.toArray();
			for(int i = 0; i < lPertenece_as.length; i++) {
				lPertenece_as[i].contiene.remove(noticia);
			}
			basededatos.Identificado[] lValora_negativas = noticia.valora_negativa.toArray();
			for(int i = 0; i < lValora_negativas.length; i++) {
				lValora_negativas[i].es_valorada_negativa_por.remove(noticia);
			}
			basededatos.Comentario[] lPertenece_a_noticias = noticia.pertenece_a_noticia.toArray();
			for(int i = 0; i < lPertenece_a_noticias.length; i++) {
				lPertenece_a_noticias[i].setNoticia_contiene_comentarios(null);
			}
			return delete(noticia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Noticia noticia, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (noticia.getPortada_contiene_noticias() != null) {
				noticia.getPortada_contiene_noticias().aparece_en_portada.remove(noticia);
			}
			
			if (noticia.getPublica() != null) {
				noticia.getPublica().es_publicada_por.remove(noticia);
			}
			
			if (noticia.getElimina_noticia() != null) {
				noticia.getElimina_noticia().noticia_es_eliminada_por_.remove(noticia);
			}
			
			if (noticia.getSeccion_contiene_noticias() != null) {
				noticia.getSeccion_contiene_noticias().aparece_en.remove(noticia);
			}
			
			if (noticia.getCrea() != null) {
				noticia.getCrea().es_creada.remove(noticia);
			}
			
			basededatos.Identificado[] lValora_positivas = noticia.valora_positiva.toArray();
			for(int i = 0; i < lValora_positivas.length; i++) {
				lValora_positivas[i].es_valorada_positiva_por.remove(noticia);
			}
			basededatos.Tematica[] lPertenece_as = noticia.pertenece_a.toArray();
			for(int i = 0; i < lPertenece_as.length; i++) {
				lPertenece_as[i].contiene.remove(noticia);
			}
			basededatos.Identificado[] lValora_negativas = noticia.valora_negativa.toArray();
			for(int i = 0; i < lValora_negativas.length; i++) {
				lValora_negativas[i].es_valorada_negativa_por.remove(noticia);
			}
			basededatos.Comentario[] lPertenece_a_noticias = noticia.pertenece_a_noticia.toArray();
			for(int i = 0; i < lPertenece_a_noticias.length; i++) {
				lPertenece_a_noticias[i].setNoticia_contiene_comentarios(null);
			}
			try {
				session.delete(noticia);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(basededatos.Noticia noticia) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().getSession().refresh(noticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Noticia noticia) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().getSession().evict(noticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByCriteria(NoticiaCriteria noticiaCriteria) {
		Noticia[] noticias = listNoticiaByCriteria(noticiaCriteria);
		if(noticias == null || noticias.length == 0) {
			return null;
		}
		return noticias[0];
	}
	
	public static Noticia[] listNoticiaByCriteria(NoticiaCriteria noticiaCriteria) {
		return noticiaCriteria.listNoticia();
	}
}
