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
@Table(name="Portada")
public class Portada implements Serializable {
	public Portada() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PORTADA_APARECE_EN_PORTADA) {
			return ORM_aparece_en_portada;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_portada", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_PORTADA_ID_PORTADA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_PORTADA_ID_PORTADA_GENERATOR", strategy="native")	
	private int id_portada;
	
	@OneToOne(optional=false, targetEntity=basededatos.Editor.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EditorIdentificadoId", referencedColumnName="IdentificadoId", nullable=false) }, foreignKey=@ForeignKey(name="FKPortada628279"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Editor ordena;
	
	@OneToMany(mappedBy="portada_contiene_noticias", targetEntity=basededatos.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_aparece_en_portada = new java.util.HashSet();
	
	private void setId_portada(int value) {
		this.id_portada = value;
	}
	
	public int getId_portada() {
		return id_portada;
	}
	
	public int getORMID() {
		return getId_portada();
	}
	
	public void setOrdena(basededatos.Editor value) {
		if (this.ordena != value) {
			basededatos.Editor lordena = this.ordena;
			this.ordena = value;
			if (value != null) {
				ordena.setEs_ordenada(this);
			}
			if (lordena != null && lordena.getEs_ordenada() == this) {
				lordena.setEs_ordenada(null);
			}
		}
	}
	
	public basededatos.Editor getOrdena() {
		return ordena;
	}
	
	private void setORM_Aparece_en_portada(java.util.Set value) {
		this.ORM_aparece_en_portada = value;
	}
	
	private java.util.Set getORM_Aparece_en_portada() {
		return ORM_aparece_en_portada;
	}
	
	@Transient	
	public final basededatos.NoticiaSetCollection aparece_en_portada = new basededatos.NoticiaSetCollection(this, _ormAdapter, ORMConstants.KEY_PORTADA_APARECE_EN_PORTADA, ORMConstants.KEY_NOTICIA_PORTADA_CONTIENE_NOTICIAS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_portada());
	}
	
}
