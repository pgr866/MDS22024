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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Periodista")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Periodista")
@PrimaryKeyJoinColumn(name="IdentificadoId", referencedColumnName="Id")
public class Periodista extends basededatos.Identificado implements Serializable {
	public Periodista() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PERIODISTA_ES_CREADA) {
			return ORM_es_creada;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PERIODISTA_DA_DE_ALTA) {
			this.da_de_alta = (basededatos.Editor) owner;
		}
		
		else if (key == ORMConstants.KEY_PERIODISTA_DA_DE_BAJA) {
			this.da_de_baja = (basededatos.Editor) owner;
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
	
	@ManyToOne(targetEntity=basededatos.Editor.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EditorIdentificadoId2", referencedColumnName="IdentificadoId") }, foreignKey=@ForeignKey(name="FKPeriodista296958"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Editor da_de_baja;
	
	@ManyToOne(targetEntity=basededatos.Editor.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EditorIdentificadoId", referencedColumnName="IdentificadoId", nullable=false) }, foreignKey=@ForeignKey(name="FKPeriodista428834"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Editor da_de_alta;
	
	@OneToMany(mappedBy="crea", targetEntity=basededatos.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_creada = new java.util.HashSet();
	
	public void setDa_de_alta(basededatos.Editor value) {
		if (da_de_alta != null) {
			da_de_alta.es_dado_de_alta.remove(this);
		}
		if (value != null) {
			value.es_dado_de_alta.add(this);
		}
	}
	
	public basededatos.Editor getDa_de_alta() {
		return da_de_alta;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Da_de_alta(basededatos.Editor value) {
		this.da_de_alta = value;
	}
	
	private basededatos.Editor getORM_Da_de_alta() {
		return da_de_alta;
	}
	
	public void setDa_de_baja(basededatos.Editor value) {
		if (da_de_baja != null) {
			da_de_baja.es_dado_de_baja.remove(this);
		}
		if (value != null) {
			value.es_dado_de_baja.add(this);
		}
	}
	
	public basededatos.Editor getDa_de_baja() {
		return da_de_baja;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Da_de_baja(basededatos.Editor value) {
		this.da_de_baja = value;
	}
	
	private basededatos.Editor getORM_Da_de_baja() {
		return da_de_baja;
	}
	
	private void setORM_Es_creada(java.util.Set value) {
		this.ORM_es_creada = value;
	}
	
	private java.util.Set getORM_Es_creada() {
		return ORM_es_creada;
	}
	
	@Transient	
	public final basededatos.NoticiaSetCollection es_creada = new basededatos.NoticiaSetCollection(this, _ormAdapter, ORMConstants.KEY_PERIODISTA_ES_CREADA, ORMConstants.KEY_NOTICIA_CREA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
