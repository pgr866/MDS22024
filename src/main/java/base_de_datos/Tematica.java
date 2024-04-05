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
@Table(name="Tematica")
public class Tematica implements Serializable {
	public Tematica() {
	}
	
	public static Tematica loadTematicaByORMID(int id_tematica) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadTematicaByORMID(session, id_tematica);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica getTematicaByORMID(int id_tematica) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getTematicaByORMID(session, id_tematica);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica loadTematicaByORMID(int id_tematica, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadTematicaByORMID(session, id_tematica, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica getTematicaByORMID(int id_tematica, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getTematicaByORMID(session, id_tematica, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica loadTematicaByORMID(PersistentSession session, int id_tematica) throws PersistentException {
		try {
			return (Tematica) session.load(base_de_datos.Tematica.class, Integer.valueOf(id_tematica));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica getTematicaByORMID(PersistentSession session, int id_tematica) throws PersistentException {
		try {
			return (Tematica) session.get(base_de_datos.Tematica.class, Integer.valueOf(id_tematica));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica loadTematicaByORMID(PersistentSession session, int id_tematica, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tematica) session.load(base_de_datos.Tematica.class, Integer.valueOf(id_tematica), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica getTematicaByORMID(PersistentSession session, int id_tematica, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tematica) session.get(base_de_datos.Tematica.class, Integer.valueOf(id_tematica), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTematica(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryTematica(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTematica(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryTematica(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica[] listTematicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listTematicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica[] listTematicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listTematicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTematica(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Tematica as Tematica");
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
	
	public static List queryTematica(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Tematica as Tematica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tematica", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica[] listTematicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTematica(session, condition, orderBy);
			return (Tematica[]) list.toArray(new Tematica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica[] listTematicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTematica(session, condition, orderBy, lockMode);
			return (Tematica[]) list.toArray(new Tematica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica loadTematicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadTematicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica loadTematicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadTematicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica loadTematicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tematica[] tematicas = listTematicaByQuery(session, condition, orderBy);
		if (tematicas != null && tematicas.length > 0)
			return tematicas[0];
		else
			return null;
	}
	
	public static Tematica loadTematicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tematica[] tematicas = listTematicaByQuery(session, condition, orderBy, lockMode);
		if (tematicas != null && tematicas.length > 0)
			return tematicas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTematicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateTematicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTematicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateTematicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTematicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Tematica as Tematica");
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
	
	public static java.util.Iterator iterateTematicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Tematica as Tematica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tematica", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tematica loadTematicaByCriteria(TematicaCriteria tematicaCriteria) {
		Tematica[] tematicas = listTematicaByCriteria(tematicaCriteria);
		if(tematicas == null || tematicas.length == 0) {
			return null;
		}
		return tematicas[0];
	}
	
	public static Tematica[] listTematicaByCriteria(TematicaCriteria tematicaCriteria) {
		return tematicaCriteria.listTematica();
	}
	
	public static Tematica createTematica() {
		return new base_de_datos.Tematica();
	}
	
	public boolean save() throws PersistentException {
		try {
			base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			base_de_datos.Seccion[] lSeccion_contiene_tematicass = seccion_contiene_tematicas.toArray();
			for(int i = 0; i < lSeccion_contiene_tematicass.length; i++) {
				lSeccion_contiene_tematicass[i].pertenece_a_seccion.remove(this);
			}
			base_de_datos.Noticia[] lContienes = contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].pertenece_a.remove(this);
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
			base_de_datos.Seccion[] lSeccion_contiene_tematicass = seccion_contiene_tematicas.toArray();
			for(int i = 0; i < lSeccion_contiene_tematicass.length; i++) {
				lSeccion_contiene_tematicass[i].pertenece_a_seccion.remove(this);
			}
			base_de_datos.Noticia[] lContienes = contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].pertenece_a.remove(this);
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
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_TEMATICA_SECCION_CONTIENE_TEMATICAS) {
			return ORM_seccion_contiene_tematicas;
		}
		else if (key == base_de_datos.ORMConstants.KEY_TEMATICA_CONTIENE) {
			return ORM_contiene;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_tematica", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_TEMATICA_ID_TEMATICA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_TEMATICA_ID_TEMATICA_GENERATOR", strategy="native")	
	private int id_tematica;
	
	@Column(name="Titulo_tematica", nullable=true, length=255)	
	private String titulo_tematica;
	
	@ManyToMany(mappedBy="ORM_pertenece_a_seccion", targetEntity=base_de_datos.Seccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seccion_contiene_tematicas = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_pertenece_a", targetEntity=base_de_datos.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene = new java.util.HashSet();
	
	private void setId_tematica(int value) {
		this.id_tematica = value;
	}
	
	public int getId_tematica() {
		return id_tematica;
	}
	
	public int getORMID() {
		return getId_tematica();
	}
	
	public void setTitulo_tematica(String value) {
		this.titulo_tematica = value;
	}
	
	public String getTitulo_tematica() {
		return titulo_tematica;
	}
	
	private void setORM_Seccion_contiene_tematicas(java.util.Set value) {
		this.ORM_seccion_contiene_tematicas = value;
	}
	
	private java.util.Set getORM_Seccion_contiene_tematicas() {
		return ORM_seccion_contiene_tematicas;
	}
	
	@Transient	
	public final base_de_datos.SeccionSetCollection seccion_contiene_tematicas = new base_de_datos.SeccionSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_TEMATICA_SECCION_CONTIENE_TEMATICAS, base_de_datos.ORMConstants.KEY_SECCION_PERTENECE_A_SECCION, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Contiene(java.util.Set value) {
		this.ORM_contiene = value;
	}
	
	private java.util.Set getORM_Contiene() {
		return ORM_contiene;
	}
	
	@Transient	
	public final base_de_datos.NoticiaSetCollection contiene = new base_de_datos.NoticiaSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_TEMATICA_CONTIENE, base_de_datos.ORMConstants.KEY_NOTICIA_PERTENECE_A, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_tematica());
	}
	
}
