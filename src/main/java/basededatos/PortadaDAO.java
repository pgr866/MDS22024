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

public class PortadaDAO {
	public static Portada loadPortadaByORMID(int id_portada) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadPortadaByORMID(session, id_portada);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada getPortadaByORMID(int id_portada) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getPortadaByORMID(session, id_portada);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada loadPortadaByORMID(int id_portada, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadPortadaByORMID(session, id_portada, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada getPortadaByORMID(int id_portada, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getPortadaByORMID(session, id_portada, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada loadPortadaByORMID(PersistentSession session, int id_portada) throws PersistentException {
		try {
			return (Portada) session.load(basededatos.Portada.class, Integer.valueOf(id_portada));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada getPortadaByORMID(PersistentSession session, int id_portada) throws PersistentException {
		try {
			return (Portada) session.get(basededatos.Portada.class, Integer.valueOf(id_portada));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada loadPortadaByORMID(PersistentSession session, int id_portada, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Portada) session.load(basededatos.Portada.class, Integer.valueOf(id_portada), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada getPortadaByORMID(PersistentSession session, int id_portada, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Portada) session.get(basededatos.Portada.class, Integer.valueOf(id_portada), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPortada(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryPortada(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPortada(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryPortada(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada[] listPortadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listPortadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada[] listPortadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listPortadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPortada(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Portada as Portada");
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
	
	public static List queryPortada(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Portada as Portada");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Portada", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada[] listPortadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPortada(session, condition, orderBy);
			return (Portada[]) list.toArray(new Portada[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada[] listPortadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPortada(session, condition, orderBy, lockMode);
			return (Portada[]) list.toArray(new Portada[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada loadPortadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadPortadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada loadPortadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadPortadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada loadPortadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Portada[] portadas = listPortadaByQuery(session, condition, orderBy);
		if (portadas != null && portadas.length > 0)
			return portadas[0];
		else
			return null;
	}
	
	public static Portada loadPortadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Portada[] portadas = listPortadaByQuery(session, condition, orderBy, lockMode);
		if (portadas != null && portadas.length > 0)
			return portadas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePortadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iteratePortadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePortadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iteratePortadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePortadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Portada as Portada");
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
	
	public static java.util.Iterator iteratePortadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Portada as Portada");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Portada", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada createPortada() {
		return new basededatos.Portada();
	}
	
	public static boolean save(basededatos.Portada portada) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().saveObject(portada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Portada portada) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().deleteObject(portada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Portada portada)throws PersistentException {
		try {
			if (portada.getOrdena() != null) {
				portada.getOrdena().setEs_ordenada(null);
			}
			
			basededatos.Noticia[] lAparece_en_portadas = portada.aparece_en_portada.toArray();
			for(int i = 0; i < lAparece_en_portadas.length; i++) {
				lAparece_en_portadas[i].setPortada_contiene_noticias(null);
			}
			return delete(portada);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Portada portada, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (portada.getOrdena() != null) {
				portada.getOrdena().setEs_ordenada(null);
			}
			
			basededatos.Noticia[] lAparece_en_portadas = portada.aparece_en_portada.toArray();
			for(int i = 0; i < lAparece_en_portadas.length; i++) {
				lAparece_en_portadas[i].setPortada_contiene_noticias(null);
			}
			try {
				session.delete(portada);
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
	
	public static boolean refresh(basededatos.Portada portada) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().getSession().refresh(portada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Portada portada) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().getSession().evict(portada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada loadPortadaByCriteria(PortadaCriteria portadaCriteria) {
		Portada[] portadas = listPortadaByCriteria(portadaCriteria);
		if(portadas == null || portadas.length == 0) {
			return null;
		}
		return portadas[0];
	}
	
	public static Portada[] listPortadaByCriteria(PortadaCriteria portadaCriteria) {
		return portadaCriteria.listPortada();
	}
}
