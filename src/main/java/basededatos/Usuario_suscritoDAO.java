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

public class Usuario_suscritoDAO {
	public static Usuario_suscrito loadUsuario_suscritoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadUsuario_suscritoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito getUsuario_suscritoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getUsuario_suscritoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadUsuario_suscritoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito getUsuario_suscritoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getUsuario_suscritoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Usuario_suscrito) session.load(basededatos.Usuario_suscrito.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito getUsuario_suscritoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Usuario_suscrito) session.get(basededatos.Usuario_suscrito.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_suscrito) session.load(basededatos.Usuario_suscrito.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito getUsuario_suscritoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_suscrito) session.get(basededatos.Usuario_suscrito.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_suscrito(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryUsuario_suscrito(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_suscrito(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryUsuario_suscrito(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito[] listUsuario_suscritoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listUsuario_suscritoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito[] listUsuario_suscritoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listUsuario_suscritoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_suscrito(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_suscrito as Usuario_suscrito");
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
	
	public static List queryUsuario_suscrito(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_suscrito as Usuario_suscrito");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_suscrito", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito[] listUsuario_suscritoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_suscrito(session, condition, orderBy);
			return (Usuario_suscrito[]) list.toArray(new Usuario_suscrito[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito[] listUsuario_suscritoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_suscrito(session, condition, orderBy, lockMode);
			return (Usuario_suscrito[]) list.toArray(new Usuario_suscrito[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadUsuario_suscritoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadUsuario_suscritoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_suscrito[] usuario_suscritos = listUsuario_suscritoByQuery(session, condition, orderBy);
		if (usuario_suscritos != null && usuario_suscritos.length > 0)
			return usuario_suscritos[0];
		else
			return null;
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_suscrito[] usuario_suscritos = listUsuario_suscritoByQuery(session, condition, orderBy, lockMode);
		if (usuario_suscritos != null && usuario_suscritos.length > 0)
			return usuario_suscritos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_suscritoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateUsuario_suscritoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_suscritoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateUsuario_suscritoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_suscritoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_suscrito as Usuario_suscrito");
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
	
	public static java.util.Iterator iterateUsuario_suscritoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_suscrito as Usuario_suscrito");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_suscrito", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito createUsuario_suscrito() {
		return new basededatos.Usuario_suscrito();
	}
	
	public static boolean save(basededatos.Usuario_suscrito usuario_suscrito) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().saveObject(usuario_suscrito);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Usuario_suscrito usuario_suscrito) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().deleteObject(usuario_suscrito);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Usuario_suscrito usuario_suscrito)throws PersistentException {
		try {
			basededatos.Comentario[] lPertenece_a_identificados = usuario_suscrito.pertenece_a_identificado.toArray();
			for(int i = 0; i < lPertenece_a_identificados.length; i++) {
				lPertenece_a_identificados[i].setEscribe(null);
			}
			basededatos.Comentario[] lEs_valorado_positivas = usuario_suscrito.es_valorado_positiva.toArray();
			for(int i = 0; i < lEs_valorado_positivas.length; i++) {
				lEs_valorado_positivas[i].valora_positivamente.remove(usuario_suscrito);
			}
			basededatos.Comentario[] lEs_valorado_negativas = usuario_suscrito.es_valorado_negativa.toArray();
			for(int i = 0; i < lEs_valorado_negativas.length; i++) {
				lEs_valorado_negativas[i].valora_negativamente.remove(usuario_suscrito);
			}
			basededatos.Noticia[] lEs_valorada_positiva_pors = usuario_suscrito.es_valorada_positiva_por.toArray();
			for(int i = 0; i < lEs_valorada_positiva_pors.length; i++) {
				lEs_valorada_positiva_pors[i].valora_positiva.remove(usuario_suscrito);
			}
			basededatos.Noticia[] lEs_valorada_negativa_pors = usuario_suscrito.es_valorada_negativa_por.toArray();
			for(int i = 0; i < lEs_valorada_negativa_pors.length; i++) {
				lEs_valorada_negativa_pors[i].valora_negativa.remove(usuario_suscrito);
			}
			return delete(usuario_suscrito);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Usuario_suscrito usuario_suscrito, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Comentario[] lPertenece_a_identificados = usuario_suscrito.pertenece_a_identificado.toArray();
			for(int i = 0; i < lPertenece_a_identificados.length; i++) {
				lPertenece_a_identificados[i].setEscribe(null);
			}
			basededatos.Comentario[] lEs_valorado_positivas = usuario_suscrito.es_valorado_positiva.toArray();
			for(int i = 0; i < lEs_valorado_positivas.length; i++) {
				lEs_valorado_positivas[i].valora_positivamente.remove(usuario_suscrito);
			}
			basededatos.Comentario[] lEs_valorado_negativas = usuario_suscrito.es_valorado_negativa.toArray();
			for(int i = 0; i < lEs_valorado_negativas.length; i++) {
				lEs_valorado_negativas[i].valora_negativamente.remove(usuario_suscrito);
			}
			basededatos.Noticia[] lEs_valorada_positiva_pors = usuario_suscrito.es_valorada_positiva_por.toArray();
			for(int i = 0; i < lEs_valorada_positiva_pors.length; i++) {
				lEs_valorada_positiva_pors[i].valora_positiva.remove(usuario_suscrito);
			}
			basededatos.Noticia[] lEs_valorada_negativa_pors = usuario_suscrito.es_valorada_negativa_por.toArray();
			for(int i = 0; i < lEs_valorada_negativa_pors.length; i++) {
				lEs_valorada_negativa_pors[i].valora_negativa.remove(usuario_suscrito);
			}
			try {
				session.delete(usuario_suscrito);
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
	
	public static boolean refresh(basededatos.Usuario_suscrito usuario_suscrito) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().getSession().refresh(usuario_suscrito);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Usuario_suscrito usuario_suscrito) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().getSession().evict(usuario_suscrito);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByCriteria(Usuario_suscritoCriteria usuario_suscritoCriteria) {
		Usuario_suscrito[] usuario_suscritos = listUsuario_suscritoByCriteria(usuario_suscritoCriteria);
		if(usuario_suscritos == null || usuario_suscritos.length == 0) {
			return null;
		}
		return usuario_suscritos[0];
	}
	
	public static Usuario_suscrito[] listUsuario_suscritoByCriteria(Usuario_suscritoCriteria usuario_suscritoCriteria) {
		return usuario_suscritoCriteria.listUsuario_suscrito();
	}
}
