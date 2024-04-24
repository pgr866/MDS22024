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
@Table(name="Portada")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Portada")
@PrimaryKeyJoinColumn(name="SeccionId_seccion", referencedColumnName="Id_seccion")
public class Portada extends base_de_datos.Seccion implements Serializable {
	public Portada() {
	}
	
	public static Portada loadPortadaByORMID(int id_seccion) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadPortadaByORMID(session, id_seccion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada getPortadaByORMID(int id_seccion) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getPortadaByORMID(session, id_seccion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada loadPortadaByORMID(int id_seccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadPortadaByORMID(session, id_seccion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada getPortadaByORMID(int id_seccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getPortadaByORMID(session, id_seccion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada loadPortadaByORMID(PersistentSession session, int id_seccion) throws PersistentException {
		try {
			return (Portada) session.load(base_de_datos.Portada.class, Integer.valueOf(id_seccion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada getPortadaByORMID(PersistentSession session, int id_seccion) throws PersistentException {
		try {
			return (Portada) session.get(base_de_datos.Portada.class, Integer.valueOf(id_seccion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada loadPortadaByORMID(PersistentSession session, int id_seccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Portada) session.load(base_de_datos.Portada.class, Integer.valueOf(id_seccion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada getPortadaByORMID(PersistentSession session, int id_seccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Portada) session.get(base_de_datos.Portada.class, Integer.valueOf(id_seccion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPortada(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryPortada(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPortada(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryPortada(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada[] listPortadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listPortadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada[] listPortadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listPortadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPortada(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Portada as Portada");
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
		StringBuffer sb = new StringBuffer("From base_de_datos.Portada as Portada");
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
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadPortadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portada loadPortadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
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
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iteratePortadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePortadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iteratePortadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePortadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Portada as Portada");
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
		StringBuffer sb = new StringBuffer("From base_de_datos.Portada as Portada");
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
	
	public static Portada createPortada() {
		return new base_de_datos.Portada();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getOrdena() != null) {
				getOrdena().setEs_ordenada(null);
			}
			
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
			if(getOrdena() != null) {
				getOrdena().setEs_ordenada(null);
			}
			
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
	
	@OneToOne(optional=false, targetEntity=base_de_datos.Editor.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EditorIdentificadoId", referencedColumnName="IdentificadoId", nullable=false) }, foreignKey=@ForeignKey(name="FKPortada628279"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private base_de_datos.Editor ordena;
	
	public void setOrdena(base_de_datos.Editor value) {
		if (this.ordena != value) {
			base_de_datos.Editor lordena = this.ordena;
			this.ordena = value;
			if (value != null) {
				ordena.setEs_ordenada(this);
			}
			if (lordena != null && lordena.getEs_ordenada() == this) {
				lordena.setEs_ordenada(null);
			}
		}
	}
	
	public base_de_datos.Editor getOrdena() {
		return ordena;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
