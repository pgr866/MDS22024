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
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="EsEliminado", nullable=false, length=1)	
	private boolean esEliminado;
	
	@OneToMany(mappedBy="crea", targetEntity=basededatos.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_creada = new java.util.HashSet();
	
	public void setEsEliminado(boolean value) {
		this.esEliminado = value;
	}
	
	public boolean getEsEliminado() {
		return esEliminado;
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
