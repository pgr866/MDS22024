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

public class IdentificadoDAO {
	public static Identificado loadIdentificadoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadIdentificadoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado getIdentificadoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getIdentificadoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado loadIdentificadoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadIdentificadoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado getIdentificadoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getIdentificadoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado loadIdentificadoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Identificado) session.load(basededatos.Identificado.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado getIdentificadoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Identificado) session.get(basededatos.Identificado.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado loadIdentificadoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Identificado) session.load(basededatos.Identificado.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado getIdentificadoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Identificado) session.get(basededatos.Identificado.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIdentificado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryIdentificado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIdentificado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryIdentificado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado[] listIdentificadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listIdentificadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado[] listIdentificadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listIdentificadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIdentificado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Identificado as Identificado");
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
	
	public static List queryIdentificado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Identificado as Identificado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Identificado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado[] listIdentificadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryIdentificado(session, condition, orderBy);
			return (Identificado[]) list.toArray(new Identificado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado[] listIdentificadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryIdentificado(session, condition, orderBy, lockMode);
			return (Identificado[]) list.toArray(new Identificado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado loadIdentificadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadIdentificadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado loadIdentificadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadIdentificadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado loadIdentificadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Identificado[] identificados = listIdentificadoByQuery(session, condition, orderBy);
		if (identificados != null && identificados.length > 0)
			return identificados[0];
		else
			return null;
	}
	
	public static Identificado loadIdentificadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Identificado[] identificados = listIdentificadoByQuery(session, condition, orderBy, lockMode);
		if (identificados != null && identificados.length > 0)
			return identificados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateIdentificadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateIdentificadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateIdentificadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateIdentificadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateIdentificadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Identificado as Identificado");
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
	
	public static java.util.Iterator iterateIdentificadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Identificado as Identificado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Identificado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado createIdentificado() {
		return new basededatos.Identificado();
	}
	
	public static boolean save(basededatos.Identificado identificado) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().saveObject(identificado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Identificado identificado) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().deleteObject(identificado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Identificado identificado)throws PersistentException {
		if (identificado instanceof basededatos.Editor) {
			return basededatos.EditorDAO.deleteAndDissociate((basededatos.Editor) identificado);
		}
		
		if (identificado instanceof basededatos.Periodista) {
			return basededatos.PeriodistaDAO.deleteAndDissociate((basededatos.Periodista) identificado);
		}
		
		if (identificado instanceof basededatos.Usuario_suscrito) {
			return basededatos.Usuario_suscritoDAO.deleteAndDissociate((basededatos.Usuario_suscrito) identificado);
		}
		
		try {
			basededatos.Comentario[] lPertenece_a_identificados = identificado.pertenece_a_identificado.toArray();
			for(int i = 0; i < lPertenece_a_identificados.length; i++) {
				lPertenece_a_identificados[i].setEscribe(null);
			}
			basededatos.Comentario[] lEs_valorado_positivas = identificado.es_valorado_positiva.toArray();
			for(int i = 0; i < lEs_valorado_positivas.length; i++) {
				lEs_valorado_positivas[i].valora_positivamente.remove(identificado);
			}
			basededatos.Comentario[] lEs_valorado_negativas = identificado.es_valorado_negativa.toArray();
			for(int i = 0; i < lEs_valorado_negativas.length; i++) {
				lEs_valorado_negativas[i].valora_negativamente.remove(identificado);
			}
			basededatos.Noticia[] lEs_valorada_positiva_pors = identificado.es_valorada_positiva_por.toArray();
			for(int i = 0; i < lEs_valorada_positiva_pors.length; i++) {
				lEs_valorada_positiva_pors[i].valora_positiva.remove(identificado);
			}
			basededatos.Noticia[] lEs_valorada_negativa_pors = identificado.es_valorada_negativa_por.toArray();
			for(int i = 0; i < lEs_valorada_negativa_pors.length; i++) {
				lEs_valorada_negativa_pors[i].valora_negativa.remove(identificado);
			}
			return delete(identificado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Identificado identificado, org.orm.PersistentSession session)throws PersistentException {
		if (identificado instanceof basededatos.Editor) {
			return basededatos.EditorDAO.deleteAndDissociate((basededatos.Editor) identificado, session);
		}
		
		if (identificado instanceof basededatos.Periodista) {
			return basededatos.PeriodistaDAO.deleteAndDissociate((basededatos.Periodista) identificado, session);
		}
		
		if (identificado instanceof basededatos.Usuario_suscrito) {
			return basededatos.Usuario_suscritoDAO.deleteAndDissociate((basededatos.Usuario_suscrito) identificado, session);
		}
		
		try {
			basededatos.Comentario[] lPertenece_a_identificados = identificado.pertenece_a_identificado.toArray();
			for(int i = 0; i < lPertenece_a_identificados.length; i++) {
				lPertenece_a_identificados[i].setEscribe(null);
			}
			basededatos.Comentario[] lEs_valorado_positivas = identificado.es_valorado_positiva.toArray();
			for(int i = 0; i < lEs_valorado_positivas.length; i++) {
				lEs_valorado_positivas[i].valora_positivamente.remove(identificado);
			}
			basededatos.Comentario[] lEs_valorado_negativas = identificado.es_valorado_negativa.toArray();
			for(int i = 0; i < lEs_valorado_negativas.length; i++) {
				lEs_valorado_negativas[i].valora_negativamente.remove(identificado);
			}
			basededatos.Noticia[] lEs_valorada_positiva_pors = identificado.es_valorada_positiva_por.toArray();
			for(int i = 0; i < lEs_valorada_positiva_pors.length; i++) {
				lEs_valorada_positiva_pors[i].valora_positiva.remove(identificado);
			}
			basededatos.Noticia[] lEs_valorada_negativa_pors = identificado.es_valorada_negativa_por.toArray();
			for(int i = 0; i < lEs_valorada_negativa_pors.length; i++) {
				lEs_valorada_negativa_pors[i].valora_negativa.remove(identificado);
			}
			try {
				session.delete(identificado);
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
	
	public static boolean refresh(basededatos.Identificado identificado) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().getSession().refresh(identificado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Identificado identificado) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().getSession().evict(identificado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado loadIdentificadoByCriteria(IdentificadoCriteria identificadoCriteria) {
		Identificado[] identificados = listIdentificadoByCriteria(identificadoCriteria);
		if(identificados == null || identificados.length == 0) {
			return null;
		}
		return identificados[0];
	}
	
	public static Identificado[] listIdentificadoByCriteria(IdentificadoCriteria identificadoCriteria) {
		return identificadoCriteria.listIdentificado();
	}
}
