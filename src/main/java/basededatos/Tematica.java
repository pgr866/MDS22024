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
@Table(name="Tematica")
public class Tematica implements Serializable {
	public Tematica() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TEMATICA_CONTIENE) {
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
	@GeneratedValue(generator="BASEDEDATOS_TEMATICA_ID_TEMATICA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_TEMATICA_ID_TEMATICA_GENERATOR", strategy="native")	
	private int id_tematica;
	
	@Column(name="Titulo_tematica", nullable=false, length=255)	
	private String titulo_tematica;
	
	@ManyToMany(mappedBy="ORM_pertenece_a", targetEntity=basededatos.Noticia.class)	
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
	
	private void setORM_Contiene(java.util.Set value) {
		this.ORM_contiene = value;
	}
	
	private java.util.Set getORM_Contiene() {
		return ORM_contiene;
	}
	
	@Transient	
	public final basededatos.NoticiaSetCollection contiene = new basededatos.NoticiaSetCollection(this, _ormAdapter, ORMConstants.KEY_TEMATICA_CONTIENE, ORMConstants.KEY_NOTICIA_PERTENECE_A, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_tematica());
	}
	
}
