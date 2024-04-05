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
@Table(name="Comentario")
public class Comentario implements Serializable {
	public Comentario() {
	}
	
	public static Comentario loadComentarioByORMID(int id_comentario) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadComentarioByORMID(session, id_comentario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario getComentarioByORMID(int id_comentario) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getComentarioByORMID(session, id_comentario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByORMID(int id_comentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadComentarioByORMID(session, id_comentario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario getComentarioByORMID(int id_comentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getComentarioByORMID(session, id_comentario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByORMID(PersistentSession session, int id_comentario) throws PersistentException {
		try {
			return (Comentario) session.load(base_de_datos.Comentario.class, Integer.valueOf(id_comentario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario getComentarioByORMID(PersistentSession session, int id_comentario) throws PersistentException {
		try {
			return (Comentario) session.get(base_de_datos.Comentario.class, Integer.valueOf(id_comentario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByORMID(PersistentSession session, int id_comentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Comentario) session.load(base_de_datos.Comentario.class, Integer.valueOf(id_comentario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario getComentarioByORMID(PersistentSession session, int id_comentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Comentario) session.get(base_de_datos.Comentario.class, Integer.valueOf(id_comentario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComentario(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryComentario(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComentario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryComentario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario[] listComentarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listComentarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario[] listComentarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listComentarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComentario(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Comentario as Comentario");
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
	
	public static List queryComentario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Comentario as Comentario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Comentario", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario[] listComentarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryComentario(session, condition, orderBy);
			return (Comentario[]) list.toArray(new Comentario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario[] listComentarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryComentario(session, condition, orderBy, lockMode);
			return (Comentario[]) list.toArray(new Comentario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadComentarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadComentarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Comentario[] comentarios = listComentarioByQuery(session, condition, orderBy);
		if (comentarios != null && comentarios.length > 0)
			return comentarios[0];
		else
			return null;
	}
	
	public static Comentario loadComentarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Comentario[] comentarios = listComentarioByQuery(session, condition, orderBy, lockMode);
		if (comentarios != null && comentarios.length > 0)
			return comentarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateComentarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateComentarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateComentarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateComentarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateComentarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Comentario as Comentario");
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
	
	public static java.util.Iterator iterateComentarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Comentario as Comentario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Comentario", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByCriteria(ComentarioCriteria comentarioCriteria) {
		Comentario[] comentarios = listComentarioByCriteria(comentarioCriteria);
		if(comentarios == null || comentarios.length == 0) {
			return null;
		}
		return comentarios[0];
	}
	
	public static Comentario[] listComentarioByCriteria(ComentarioCriteria comentarioCriteria) {
		return comentarioCriteria.listComentario();
	}
	
	public static Comentario createComentario() {
		return new base_de_datos.Comentario();
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
			if(getEscribe() != null) {
				getEscribe().pertenece_a_identificado.remove(this);
			}
			
			if(getElimina() != null) {
				getElimina().es_eliminado_por.remove(this);
			}
			
			if(getNoticia_contiene_comentarios() != null) {
				getNoticia_contiene_comentarios().pertenece_a_noticia.remove(this);
			}
			
			base_de_datos.Identificado[] lValoras = valora.toArray();
			for(int i = 0; i < lValoras.length; i++) {
				lValoras[i].es_valorado_por.remove(this);
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
			if(getEscribe() != null) {
				getEscribe().pertenece_a_identificado.remove(this);
			}
			
			if(getElimina() != null) {
				getElimina().es_eliminado_por.remove(this);
			}
			
			if(getNoticia_contiene_comentarios() != null) {
				getNoticia_contiene_comentarios().pertenece_a_noticia.remove(this);
			}
			
			base_de_datos.Identificado[] lValoras = valora.toArray();
			for(int i = 0; i < lValoras.length; i++) {
				lValoras[i].es_valorado_por.remove(this);
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
		if (key == base_de_datos.ORMConstants.KEY_COMENTARIO_VALORA) {
			return ORM_valora;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == base_de_datos.ORMConstants.KEY_COMENTARIO_NOTICIA_CONTIENE_COMENTARIOS) {
			this.noticia_contiene_comentarios = (base_de_datos.Noticia) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_COMENTARIO_ESCRIBE) {
			this.escribe = (base_de_datos.Identificado) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_COMENTARIO_ELIMINA) {
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
	
	@Column(name="Id_comentario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_COMENTARIO_ID_COMENTARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_COMENTARIO_ID_COMENTARIO_GENERATOR", strategy="native")	
	private int id_comentario;
	
	@ManyToOne(targetEntity=base_de_datos.Identificado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="IdentificadoDni2", referencedColumnName="Dni", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario293811"))	
	private base_de_datos.Identificado escribe;
	
	@ManyToOne(targetEntity=base_de_datos.Editor.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="IdentificadoDni", referencedColumnName="Dni", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario118654"))	
	private base_de_datos.Editor elimina;
	
	@ManyToOne(targetEntity=base_de_datos.Noticia.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="NoticiaId_noticia", referencedColumnName="Id_noticia", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario796228"))	
	private base_de_datos.Noticia noticia_contiene_comentarios;
	
	@Column(name="Propietario", nullable=true, length=255)	
	private String propietario;
	
	@Column(name="Contenido", nullable=true, length=255)	
	private String contenido;
	
	@Column(name="Valoraciones_positivas", nullable=false, length=10)	
	private int valoraciones_positivas;
	
	@Column(name="Valoraciones_negativas", nullable=false, length=10)	
	private int valoraciones_negativas;
	
	@ManyToMany(mappedBy="ORM_es_valorado_por", targetEntity=base_de_datos.Identificado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_valora = new java.util.HashSet();
	
	private void setId_comentario(int value) {
		this.id_comentario = value;
	}
	
	public int getId_comentario() {
		return id_comentario;
	}
	
	public int getORMID() {
		return getId_comentario();
	}
	
	public void setPropietario(String value) {
		this.propietario = value;
	}
	
	public String getPropietario() {
		return propietario;
	}
	
	public void setContenido(String value) {
		this.contenido = value;
	}
	
	public String getContenido() {
		return contenido;
	}
	
	public void setValoraciones_positivas(int value) {
		this.valoraciones_positivas = value;
	}
	
	public int getValoraciones_positivas() {
		return valoraciones_positivas;
	}
	
	public void setValoraciones_negativas(int value) {
		this.valoraciones_negativas = value;
	}
	
	public int getValoraciones_negativas() {
		return valoraciones_negativas;
	}
	
	public void setNoticia_contiene_comentarios(base_de_datos.Noticia value) {
		if (noticia_contiene_comentarios != null) {
			noticia_contiene_comentarios.pertenece_a_noticia.remove(this);
		}
		if (value != null) {
			value.pertenece_a_noticia.add(this);
		}
	}
	
	public base_de_datos.Noticia getNoticia_contiene_comentarios() {
		return noticia_contiene_comentarios;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Noticia_contiene_comentarios(base_de_datos.Noticia value) {
		this.noticia_contiene_comentarios = value;
	}
	
	private base_de_datos.Noticia getORM_Noticia_contiene_comentarios() {
		return noticia_contiene_comentarios;
	}
	
	public void setEscribe(base_de_datos.Identificado value) {
		if (escribe != null) {
			escribe.pertenece_a_identificado.remove(this);
		}
		if (value != null) {
			value.pertenece_a_identificado.add(this);
		}
	}
	
	public base_de_datos.Identificado getEscribe() {
		return escribe;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Escribe(base_de_datos.Identificado value) {
		this.escribe = value;
	}
	
	private base_de_datos.Identificado getORM_Escribe() {
		return escribe;
	}
	
	public void setElimina(base_de_datos.Editor value) {
		if (elimina != null) {
			elimina.es_eliminado_por.remove(this);
		}
		if (value != null) {
			value.es_eliminado_por.add(this);
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
	
	private void setORM_Valora(java.util.Set value) {
		this.ORM_valora = value;
	}
	
	private java.util.Set getORM_Valora() {
		return ORM_valora;
	}
	
	@Transient	
	public final base_de_datos.IdentificadoSetCollection valora = new base_de_datos.IdentificadoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_COMENTARIO_VALORA, base_de_datos.ORMConstants.KEY_IDENTIFICADO_ES_VALORADO_POR, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_comentario());
	}
	
}
