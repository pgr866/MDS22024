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

public class PeriodistaDAO {
	public static Periodista loadPeriodistaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadPeriodistaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista getPeriodistaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getPeriodistaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadPeriodistaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista getPeriodistaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getPeriodistaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Periodista) session.load(basededatos.Periodista.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista getPeriodistaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Periodista) session.get(basededatos.Periodista.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Periodista) session.load(basededatos.Periodista.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista getPeriodistaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Periodista) session.get(basededatos.Periodista.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodista(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryPeriodista(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodista(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryPeriodista(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista[] listPeriodistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listPeriodistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista[] listPeriodistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listPeriodistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodista(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Periodista as Periodista");
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
	
	public static List queryPeriodista(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Periodista as Periodista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Periodista", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista[] listPeriodistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPeriodista(session, condition, orderBy);
			return (Periodista[]) list.toArray(new Periodista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista[] listPeriodistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPeriodista(session, condition, orderBy, lockMode);
			return (Periodista[]) list.toArray(new Periodista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadPeriodistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadPeriodistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Periodista[] periodistas = listPeriodistaByQuery(session, condition, orderBy);
		if (periodistas != null && periodistas.length > 0)
			return periodistas[0];
		else
			return null;
	}
	
	public static Periodista loadPeriodistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Periodista[] periodistas = listPeriodistaByQuery(session, condition, orderBy, lockMode);
		if (periodistas != null && periodistas.length > 0)
			return periodistas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePeriodistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iteratePeriodistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePeriodistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iteratePeriodistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePeriodistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Periodista as Periodista");
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
	
	public static java.util.Iterator iteratePeriodistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Periodista as Periodista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Periodista", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista createPeriodista() {
		return new basededatos.Periodista();
	}
	
	public static boolean save(basededatos.Periodista periodista) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().saveObject(periodista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Periodista periodista) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().deleteObject(periodista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Periodista periodista)throws PersistentException {
		try {
			if (periodista.getDa_de_baja() != null) {
				periodista.getDa_de_baja().es_dado_de_baja.remove(periodista);
			}
			
			if (periodista.getDa_de_alta() != null) {
				periodista.getDa_de_alta().es_dado_de_alta.remove(periodista);
			}
			
			basededatos.Noticia[] lEs_creadas = periodista.es_creada.toArray();
			for(int i = 0; i < lEs_creadas.length; i++) {
				lEs_creadas[i].setCrea(null);
			}
			basededatos.Comentario[] lPertenece_a_identificados = periodista.pertenece_a_identificado.toArray();
			for(int i = 0; i < lPertenece_a_identificados.length; i++) {
				lPertenece_a_identificados[i].setEscribe(null);
			}
			basededatos.Comentario[] lEs_valorado_positivas = periodista.es_valorado_positiva.toArray();
			for(int i = 0; i < lEs_valorado_positivas.length; i++) {
				lEs_valorado_positivas[i].valora_positivamente.remove(periodista);
			}
			basededatos.Comentario[] lEs_valorado_negativas = periodista.es_valorado_negativa.toArray();
			for(int i = 0; i < lEs_valorado_negativas.length; i++) {
				lEs_valorado_negativas[i].valora_negativamente.remove(periodista);
			}
			basededatos.Noticia[] lEs_valorada_positiva_pors = periodista.es_valorada_positiva_por.toArray();
			for(int i = 0; i < lEs_valorada_positiva_pors.length; i++) {
				lEs_valorada_positiva_pors[i].valora_positiva.remove(periodista);
			}
			basededatos.Noticia[] lEs_valorada_negativa_pors = periodista.es_valorada_negativa_por.toArray();
			for(int i = 0; i < lEs_valorada_negativa_pors.length; i++) {
				lEs_valorada_negativa_pors[i].valora_negativa.remove(periodista);
			}
			return delete(periodista);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Periodista periodista, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (periodista.getDa_de_baja() != null) {
				periodista.getDa_de_baja().es_dado_de_baja.remove(periodista);
			}
			
			if (periodista.getDa_de_alta() != null) {
				periodista.getDa_de_alta().es_dado_de_alta.remove(periodista);
			}
			
			basededatos.Noticia[] lEs_creadas = periodista.es_creada.toArray();
			for(int i = 0; i < lEs_creadas.length; i++) {
				lEs_creadas[i].setCrea(null);
			}
			basededatos.Comentario[] lPertenece_a_identificados = periodista.pertenece_a_identificado.toArray();
			for(int i = 0; i < lPertenece_a_identificados.length; i++) {
				lPertenece_a_identificados[i].setEscribe(null);
			}
			basededatos.Comentario[] lEs_valorado_positivas = periodista.es_valorado_positiva.toArray();
			for(int i = 0; i < lEs_valorado_positivas.length; i++) {
				lEs_valorado_positivas[i].valora_positivamente.remove(periodista);
			}
			basededatos.Comentario[] lEs_valorado_negativas = periodista.es_valorado_negativa.toArray();
			for(int i = 0; i < lEs_valorado_negativas.length; i++) {
				lEs_valorado_negativas[i].valora_negativamente.remove(periodista);
			}
			basededatos.Noticia[] lEs_valorada_positiva_pors = periodista.es_valorada_positiva_por.toArray();
			for(int i = 0; i < lEs_valorada_positiva_pors.length; i++) {
				lEs_valorada_positiva_pors[i].valora_positiva.remove(periodista);
			}
			basededatos.Noticia[] lEs_valorada_negativa_pors = periodista.es_valorada_negativa_por.toArray();
			for(int i = 0; i < lEs_valorada_negativa_pors.length; i++) {
				lEs_valorada_negativa_pors[i].valora_negativa.remove(periodista);
			}
			try {
				session.delete(periodista);
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
	
	public static boolean refresh(basededatos.Periodista periodista) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().getSession().refresh(periodista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Periodista periodista) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().getSession().evict(periodista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Periodista loadPeriodistaByCriteria(PeriodistaCriteria periodistaCriteria) {
		Periodista[] periodistas = listPeriodistaByCriteria(periodistaCriteria);
		if(periodistas == null || periodistas.length == 0) {
			return null;
		}
		return periodistas[0];
	}
	
	public static Periodista[] listPeriodistaByCriteria(PeriodistaCriteria periodistaCriteria) {
		return periodistaCriteria.listPeriodista();
	}
}
