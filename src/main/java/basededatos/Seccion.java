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
@Table(name="Seccion")
public class Seccion implements Serializable {
	public Seccion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_SECCION_APARECE_EN) {
			return ORM_aparece_en;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_SECCION_CREA_SECCION) {
			this.crea_seccion = (basededatos.Editor) owner;
		}
		
		else if (key == ORMConstants.KEY_SECCION_ELIMINA) {
			this.elimina = (basededatos.Editor) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_SECCION_ID_SECCION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_SECCION_ID_SECCION_GENERATOR", strategy="native")	
	private int id_seccion;
	
	@ManyToOne(targetEntity=basededatos.Editor.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EditorIdentificadoId2", referencedColumnName="IdentificadoId") }, foreignKey=@ForeignKey(name="FKSeccion718434"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Editor elimina;
	
	@ManyToOne(targetEntity=basededatos.Editor.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EditorIdentificadoId", referencedColumnName="IdentificadoId", nullable=false) }, foreignKey=@ForeignKey(name="FKSeccion472636"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Editor crea_seccion;
	
	@Column(name="Titulo_seccion", nullable=false, length=255)	
	private String titulo_seccion;
	
	@OneToMany(mappedBy="seccion_contiene_noticias", targetEntity=basededatos.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_aparece_en = new java.util.HashSet();
	
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
	public final basededatos.NoticiaSetCollection aparece_en = new basededatos.NoticiaSetCollection(this, _ormAdapter, ORMConstants.KEY_SECCION_APARECE_EN, ORMConstants.KEY_NOTICIA_SECCION_CONTIENE_NOTICIAS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setCrea_seccion(basededatos.Editor value) {
		if (crea_seccion != null) {
			crea_seccion.es_creada_por.remove(this);
		}
		if (value != null) {
			value.es_creada_por.add(this);
		}
	}
	
	public basededatos.Editor getCrea_seccion() {
		return crea_seccion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Crea_seccion(basededatos.Editor value) {
		this.crea_seccion = value;
	}
	
	private basededatos.Editor getORM_Crea_seccion() {
		return crea_seccion;
	}
	
	public void setElimina(basededatos.Editor value) {
		if (elimina != null) {
			elimina.es_eliminada_por.remove(this);
		}
		if (value != null) {
			value.es_eliminada_por.add(this);
		}
	}
	
	public basededatos.Editor getElimina() {
		return elimina;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Elimina(basededatos.Editor value) {
		this.elimina = value;
	}
	
	private basededatos.Editor getORM_Elimina() {
		return elimina;
	}
	
	public String toString() {
		return String.valueOf(getId_seccion());
	}
	
}
