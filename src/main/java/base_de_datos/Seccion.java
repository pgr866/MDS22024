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
@Table(name="Seccion")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Seccion")
public class Seccion implements Serializable {
	public Seccion() {
	}
	
	public static Seccion loadSeccionByORMID(int id_seccion) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadSeccionByORMID(session, id_seccion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion getSeccionByORMID(int id_seccion) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getSeccionByORMID(session, id_seccion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByORMID(int id_seccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadSeccionByORMID(session, id_seccion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion getSeccionByORMID(int id_seccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getSeccionByORMID(session, id_seccion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByORMID(PersistentSession session, int id_seccion) throws PersistentException {
		try {
			return (Seccion) session.load(base_de_datos.Seccion.class, Integer.valueOf(id_seccion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion getSeccionByORMID(PersistentSession session, int id_seccion) throws PersistentException {
		try {
			return (Seccion) session.get(base_de_datos.Seccion.class, Integer.valueOf(id_seccion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByORMID(PersistentSession session, int id_seccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Seccion) session.load(base_de_datos.Seccion.class, Integer.valueOf(id_seccion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion getSeccionByORMID(PersistentSession session, int id_seccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Seccion) session.get(base_de_datos.Seccion.class, Integer.valueOf(id_seccion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySeccion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return querySeccion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySeccion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return querySeccion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion[] listSeccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listSeccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion[] listSeccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listSeccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySeccion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Seccion as Seccion");
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
	
	public static List querySeccion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Seccion as Seccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Seccion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion[] listSeccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySeccion(session, condition, orderBy);
			return (Seccion[]) list.toArray(new Seccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion[] listSeccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySeccion(session, condition, orderBy, lockMode);
			return (Seccion[]) list.toArray(new Seccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadSeccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadSeccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Seccion[] seccions = listSeccionByQuery(session, condition, orderBy);
		if (seccions != null && seccions.length > 0)
			return seccions[0];
		else
			return null;
	}
	
	public static Seccion loadSeccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Seccion[] seccions = listSeccionByQuery(session, condition, orderBy, lockMode);
		if (seccions != null && seccions.length > 0)
			return seccions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSeccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateSeccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSeccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateSeccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSeccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Seccion as Seccion");
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
	
	public static java.util.Iterator iterateSeccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Seccion as Seccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Seccion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByCriteria(SeccionCriteria seccionCriteria) {
		Seccion[] seccions = listSeccionByCriteria(seccionCriteria);
		if(seccions == null || seccions.length == 0) {
			return null;
		}
		return seccions[0];
	}
	
	public static Seccion[] listSeccionByCriteria(SeccionCriteria seccionCriteria) {
		return seccionCriteria.listSeccion();
	}
	
	public static Seccion createSeccion() {
		return new base_de_datos.Seccion();
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
			if(getElimina() != null) {
				getElimina().es_eliminada_por.remove(this);
			}
			
			if(getCrea() != null) {
				getCrea().es_creada_por.remove(this);
			}
			
			base_de_datos.Noticia[] lAparece_ens = aparece_en.toArray();
			for(int i = 0; i < lAparece_ens.length; i++) {
				lAparece_ens[i].seccion_contiene_noticias.remove(this);
			}
			base_de_datos.Tematica[] lPertenece_a_seccions = pertenece_a_seccion.toArray();
			for(int i = 0; i < lPertenece_a_seccions.length; i++) {
				lPertenece_a_seccions[i].seccion_contiene_tematicas.remove(this);
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
			if(getElimina() != null) {
				getElimina().es_eliminada_por.remove(this);
			}
			
			if(getCrea() != null) {
				getCrea().es_creada_por.remove(this);
			}
			
			base_de_datos.Noticia[] lAparece_ens = aparece_en.toArray();
			for(int i = 0; i < lAparece_ens.length; i++) {
				lAparece_ens[i].seccion_contiene_noticias.remove(this);
			}
			base_de_datos.Tematica[] lPertenece_a_seccions = pertenece_a_seccion.toArray();
			for(int i = 0; i < lPertenece_a_seccions.length; i++) {
				lPertenece_a_seccions[i].seccion_contiene_tematicas.remove(this);
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
		if (key == base_de_datos.ORMConstants.KEY_SECCION_APARECE_EN) {
			return ORM_aparece_en;
		}
		else if (key == base_de_datos.ORMConstants.KEY_SECCION_PERTENECE_A_SECCION) {
			return ORM_pertenece_a_seccion;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == base_de_datos.ORMConstants.KEY_SECCION_CREA) {
			this.crea = (base_de_datos.Editor) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_SECCION_ELIMINA) {
			this.elimina = (base_de_datos.Editor) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_seccion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_SECCION_ID_SECCION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_SECCION_ID_SECCION_GENERATOR", strategy="native")	
	private int id_seccion;
	
	@ManyToOne(targetEntity=base_de_datos.Editor.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EditorIdentificadoId2", referencedColumnName="IdentificadoId", nullable=false) }, foreignKey=@ForeignKey(name="FKSeccion718434"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private base_de_datos.Editor elimina;
	
	@ManyToOne(targetEntity=base_de_datos.Editor.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EditorIdentificadoId", referencedColumnName="IdentificadoId", nullable=false) }, foreignKey=@ForeignKey(name="FKSeccion472636"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private base_de_datos.Editor crea;
	
	@Column(name="Titulo_seccion", nullable=true, length=255)	
	private String titulo_seccion;
	
	@ManyToMany(targetEntity=base_de_datos.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Noticia_Seccion", joinColumns={ @JoinColumn(name="SeccionId_seccion") }, inverseJoinColumns={ @JoinColumn(name="NoticiaId_noticia") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_aparece_en = new java.util.HashSet();
	
	@ManyToMany(targetEntity=base_de_datos.Tematica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Tematica_Seccion", joinColumns={ @JoinColumn(name="SeccionId_seccion") }, inverseJoinColumns={ @JoinColumn(name="TematicaId_tematica") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pertenece_a_seccion = new java.util.HashSet();
	
	private void setId_seccion(int value) {
		this.id_seccion = value;
	}
	
	public int getId_seccion() {
		return id_seccion;
	}
	
	public int getORMID() {
		return getId_seccion();
	}
	
	public void setTitulo_seccion(String value) {
		this.titulo_seccion = value;
	}
	
	public String getTitulo_seccion() {
		return titulo_seccion;
	}
	
	private void setORM_Aparece_en(java.util.Set value) {
		this.ORM_aparece_en = value;
	}
	
	private java.util.Set getORM_Aparece_en() {
		return ORM_aparece_en;
	}
	
	@Transient	
	public final base_de_datos.NoticiaSetCollection aparece_en = new base_de_datos.NoticiaSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_SECCION_APARECE_EN, base_de_datos.ORMConstants.KEY_NOTICIA_SECCION_CONTIENE_NOTICIAS, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setCrea(base_de_datos.Editor value) {
		if (crea != null) {
			crea.es_creada_por.remove(this);
		}
		if (value != null) {
			value.es_creada_por.add(this);
		}
	}
	
	public base_de_datos.Editor getCrea() {
		return crea;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Crea(base_de_datos.Editor value) {
		this.crea = value;
	}
	
	private base_de_datos.Editor getORM_Crea() {
		return crea;
	}
	
	public void setElimina(base_de_datos.Editor value) {
		if (elimina != null) {
			elimina.es_eliminada_por.remove(this);
		}
		if (value != null) {
			value.es_eliminada_por.add(this);
		}
	}
	
	public base_de_datos.Editor getElimina() {
		return elimina;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Elimina(base_de_datos.Editor value) {
		this.elimina = value;
	}
	
	private base_de_datos.Editor getORM_Elimina() {
		return elimina;
	}
	
	private void setORM_Pertenece_a_seccion(java.util.Set value) {
		this.ORM_pertenece_a_seccion = value;
	}
	
	private java.util.Set getORM_Pertenece_a_seccion() {
		return ORM_pertenece_a_seccion;
	}
	
	@Transient	
	public final base_de_datos.TematicaSetCollection pertenece_a_seccion = new base_de_datos.TematicaSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_SECCION_PERTENECE_A_SECCION, base_de_datos.ORMConstants.KEY_TEMATICA_SECCION_CONTIENE_TEMATICAS, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_seccion());
	}
	
}
