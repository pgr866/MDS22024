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
package base_de_datos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Usuario_suscrito")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Usuario_suscrito")
@PrimaryKeyJoinColumn(name="IdentificadoId", referencedColumnName="Id")
public class Usuario_suscrito extends base_de_datos.Identificado implements Serializable {
	public Usuario_suscrito() {
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadUsuario_suscritoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito getUsuario_suscritoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getUsuario_suscritoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadUsuario_suscritoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito getUsuario_suscritoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getUsuario_suscritoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Usuario_suscrito) session.load(base_de_datos.Usuario_suscrito.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito getUsuario_suscritoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Usuario_suscrito) session.get(base_de_datos.Usuario_suscrito.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_suscrito) session.load(base_de_datos.Usuario_suscrito.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito getUsuario_suscritoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_suscrito) session.get(base_de_datos.Usuario_suscrito.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_suscrito(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryUsuario_suscrito(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_suscrito(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryUsuario_suscrito(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito[] listUsuario_suscritoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listUsuario_suscritoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito[] listUsuario_suscritoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listUsuario_suscritoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_suscrito(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Usuario_suscrito as Usuario_suscrito");
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
		StringBuffer sb = new StringBuffer("From base_de_datos.Usuario_suscrito as Usuario_suscrito");
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
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadUsuario_suscritoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_suscrito loadUsuario_suscritoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
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
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateUsuario_suscritoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_suscritoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateUsuario_suscritoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_suscritoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Usuario_suscrito as Usuario_suscrito");
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
		StringBuffer sb = new StringBuffer("From base_de_datos.Usuario_suscrito as Usuario_suscrito");
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
	
	public static Usuario_suscrito createUsuario_suscrito() {
		return new base_de_datos.Usuario_suscrito();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			base_de_datos.Comentario[] lPertenece_a_identificados = pertenece_a_identificado.toArray();
			for(int i = 0; i < lPertenece_a_identificados.length; i++) {
				lPertenece_a_identificados[i].setEscribe(null);
			}
			base_de_datos.Comentario[] lEs_valorado_pors = es_valorado_por.toArray();
			for(int i = 0; i < lEs_valorado_pors.length; i++) {
				lEs_valorado_pors[i].valora.remove(this);
			}
			base_de_datos.Noticia[] lEs_valorada_pors = es_valorada_por.toArray();
			for(int i = 0; i < lEs_valorada_pors.length; i++) {
				lEs_valorada_pors[i].valora.remove(this);
			}
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			base_de_datos.Comentario[] lPertenece_a_identificados = pertenece_a_identificado.toArray();
			for(int i = 0; i < lPertenece_a_identificados.length; i++) {
				lPertenece_a_identificados[i].setEscribe(null);
			}
			base_de_datos.Comentario[] lEs_valorado_pors = es_valorado_por.toArray();
			for(int i = 0; i < lEs_valorado_pors.length; i++) {
				lEs_valorado_pors[i].valora.remove(this);
			}
			base_de_datos.Noticia[] lEs_valorada_pors = es_valorada_por.toArray();
			for(int i = 0; i < lEs_valorada_pors.length; i++) {
				lEs_valorada_pors[i].valora.remove(this);
			}
			try {
				session.delete(this);
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
	
	@Column(name="Num_tarjeta", nullable=true, length=255)	
	private String num_tarjeta;
	
	public void setNum_tarjeta(String value) {
		this.num_tarjeta = value;
	}
	
	public String getNum_tarjeta() {
		return num_tarjeta;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
