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
@Table(name="Identificado")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Discriminator", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Identificado")
public class Identificado implements Serializable {
	public Identificado() {
	}
	
	public static Identificado loadIdentificadoByORMID(String dni) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadIdentificadoByORMID(session, dni);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado getIdentificadoByORMID(String dni) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getIdentificadoByORMID(session, dni);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado loadIdentificadoByORMID(String dni, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadIdentificadoByORMID(session, dni, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado getIdentificadoByORMID(String dni, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getIdentificadoByORMID(session, dni, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado loadIdentificadoByORMID(PersistentSession session, String dni) throws PersistentException {
		try {
			return (Identificado) session.load(base_de_datos.Identificado.class, dni);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado getIdentificadoByORMID(PersistentSession session, String dni) throws PersistentException {
		try {
			return (Identificado) session.get(base_de_datos.Identificado.class, dni);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado loadIdentificadoByORMID(PersistentSession session, String dni, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Identificado) session.load(base_de_datos.Identificado.class, dni, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado getIdentificadoByORMID(PersistentSession session, String dni, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Identificado) session.get(base_de_datos.Identificado.class, dni, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIdentificado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryIdentificado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIdentificado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryIdentificado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado[] listIdentificadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listIdentificadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado[] listIdentificadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listIdentificadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIdentificado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Identificado as Identificado");
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
		StringBuffer sb = new StringBuffer("From base_de_datos.Identificado as Identificado");
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
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadIdentificadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Identificado loadIdentificadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
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
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateIdentificadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateIdentificadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateIdentificadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateIdentificadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Identificado as Identificado");
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
		StringBuffer sb = new StringBuffer("From base_de_datos.Identificado as Identificado");
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
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Identificado))
			return false;
		Identificado identificado = (Identificado)aObj;
		if ((getDni() != null && !getDni().equals(identificado.getDni())) || (getDni() == null && identificado.getDni() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getDni() == null ? 0 : getDni().hashCode());
		return hashcode;
	}
	
	public static Identificado createIdentificado() {
		return new base_de_datos.Identificado();
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
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_IDENTIFICADO_PERTENECE_A_IDENTIFICADO) {
			return ORM_pertenece_a_identificado;
		}
		else if (key == base_de_datos.ORMConstants.KEY_IDENTIFICADO_ES_VALORADO_POR) {
			return ORM_es_valorado_por;
		}
		else if (key == base_de_datos.ORMConstants.KEY_IDENTIFICADO_ES_VALORADA_POR) {
			return ORM_es_valorada_por;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Dni", nullable=false, length=255)	
	@Id	
	private String dni;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Apellidos", nullable=true, length=255)	
	private String apellidos;
	
	@Column(name="Nick_apodo", nullable=true, length=255)	
	private String nick_apodo;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Contrasena", nullable=true, length=255)	
	private String contrasena;
	
	@Column(name="Fecha_nacimiento", nullable=true, length=255)	
	private String fecha_nacimiento;
	
	@Column(name="Telefono", nullable=false, length=10)	
	private int telefono;
	
	@Column(name="Url_foto_perfil", nullable=true, length=255)	
	private String url_foto_perfil;
	
	@OneToMany(mappedBy="escribe", targetEntity=base_de_datos.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pertenece_a_identificado = new java.util.HashSet();
	
	@ManyToMany(targetEntity=base_de_datos.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Comentario_Identificado", joinColumns={ @JoinColumn(name="IdentificadoDni") }, inverseJoinColumns={ @JoinColumn(name="ComentarioId_comentario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_valorado_por = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_valora", targetEntity=base_de_datos.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_valorada_por = new java.util.HashSet();
	
	public void setDni(String value) {
		this.dni = value;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getORMID() {
		return getDni();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellidos(String value) {
		this.apellidos = value;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setNick_apodo(String value) {
		this.nick_apodo = value;
	}
	
	public String getNick_apodo() {
		return nick_apodo;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setContrasena(String value) {
		this.contrasena = value;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setFecha_nacimiento(String value) {
		this.fecha_nacimiento = value;
	}
	
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	
	public void setTelefono(int value) {
		this.telefono = value;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public void setUrl_foto_perfil(String value) {
		this.url_foto_perfil = value;
	}
	
	public String getUrl_foto_perfil() {
		return url_foto_perfil;
	}
	
	private void setORM_Pertenece_a_identificado(java.util.Set value) {
		this.ORM_pertenece_a_identificado = value;
	}
	
	private java.util.Set getORM_Pertenece_a_identificado() {
		return ORM_pertenece_a_identificado;
	}
	
	@Transient	
	public final base_de_datos.ComentarioSetCollection pertenece_a_identificado = new base_de_datos.ComentarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_IDENTIFICADO_PERTENECE_A_IDENTIFICADO, base_de_datos.ORMConstants.KEY_COMENTARIO_ESCRIBE, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_valorado_por(java.util.Set value) {
		this.ORM_es_valorado_por = value;
	}
	
	private java.util.Set getORM_Es_valorado_por() {
		return ORM_es_valorado_por;
	}
	
	@Transient	
	public final base_de_datos.ComentarioSetCollection es_valorado_por = new base_de_datos.ComentarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_IDENTIFICADO_ES_VALORADO_POR, base_de_datos.ORMConstants.KEY_COMENTARIO_VALORA, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_valorada_por(java.util.Set value) {
		this.ORM_es_valorada_por = value;
	}
	
	private java.util.Set getORM_Es_valorada_por() {
		return ORM_es_valorada_por;
	}
	
	@Transient	
	public final base_de_datos.NoticiaSetCollection es_valorada_por = new base_de_datos.NoticiaSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_IDENTIFICADO_ES_VALORADA_POR, base_de_datos.ORMConstants.KEY_NOTICIA_VALORA, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getDni());
	}
	
}
