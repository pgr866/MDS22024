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
@Table(name="Editor")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Editor")
@PrimaryKeyJoinColumn(name="IdentificadoId", referencedColumnName="Id")
public class Editor extends basededatos.Identificado implements Serializable {
	public Editor() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_EDITOR_ES_ELIMINADO_POR) {
			return ORM_es_eliminado_por;
		}
		else if (key == ORMConstants.KEY_EDITOR_ES_ELIMINADA_POR_EDITOR) {
			return ORM_es_eliminada_por_editor;
		}
		else if (key == ORMConstants.KEY_EDITOR_ES_CREADA_POR) {
			return ORM_es_creada_por;
		}
		else if (key == ORMConstants.KEY_EDITOR_ES_ELIMINADA_POR) {
			return ORM_es_eliminada_por;
		}
		else if (key == ORMConstants.KEY_EDITOR_ES_PUBLICADA_POR) {
			return ORM_es_publicada_por;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EDITOR_ES_ORDENADA) {
			this.es_ordenada = (basededatos.Portada) owner;
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
	
	@OneToMany(mappedBy="elimina", targetEntity=basededatos.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_eliminado_por = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Noticia_Editor", joinColumns={ @JoinColumn(name="EditorIdentificadoId") }, inverseJoinColumns={ @JoinColumn(name="NoticiaId_noticia") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_eliminada_por_editor = new java.util.HashSet();
	
	@OneToMany(mappedBy="crea", targetEntity=basededatos.Seccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_creada_por = new java.util.HashSet();
	
	@OneToMany(mappedBy="elimina", targetEntity=basededatos.Seccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_eliminada_por = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_publica", targetEntity=basededatos.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_publicada_por = new java.util.HashSet();
	
	@OneToOne(mappedBy="ordena", targetEntity=basededatos.Portada.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Portada es_ordenada;
	
	private void setORM_Es_eliminado_por(java.util.Set value) {
		this.ORM_es_eliminado_por = value;
	}
	
	private java.util.Set getORM_Es_eliminado_por() {
		return ORM_es_eliminado_por;
	}
	
	@Transient	
	public final basededatos.ComentarioSetCollection es_eliminado_por = new basededatos.ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_EDITOR_ES_ELIMINADO_POR, ORMConstants.KEY_COMENTARIO_ELIMINA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_eliminada_por_editor(java.util.Set value) {
		this.ORM_es_eliminada_por_editor = value;
	}
	
	private java.util.Set getORM_Es_eliminada_por_editor() {
		return ORM_es_eliminada_por_editor;
	}
	
	@Transient	
	public final basededatos.NoticiaSetCollection es_eliminada_por_editor = new basededatos.NoticiaSetCollection(this, _ormAdapter, ORMConstants.KEY_EDITOR_ES_ELIMINADA_POR_EDITOR, ORMConstants.KEY_NOTICIA_ELIMINA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_creada_por(java.util.Set value) {
		this.ORM_es_creada_por = value;
	}
	
	private java.util.Set getORM_Es_creada_por() {
		return ORM_es_creada_por;
	}
	
	@Transient	
	public final basededatos.SeccionSetCollection es_creada_por = new basededatos.SeccionSetCollection(this, _ormAdapter, ORMConstants.KEY_EDITOR_ES_CREADA_POR, ORMConstants.KEY_SECCION_CREA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_eliminada_por(java.util.Set value) {
		this.ORM_es_eliminada_por = value;
	}
	
	private java.util.Set getORM_Es_eliminada_por() {
		return ORM_es_eliminada_por;
	}
	
	@Transient	
	public final basededatos.SeccionSetCollection es_eliminada_por = new basededatos.SeccionSetCollection(this, _ormAdapter, ORMConstants.KEY_EDITOR_ES_ELIMINADA_POR, ORMConstants.KEY_SECCION_ELIMINA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_publicada_por(java.util.Set value) {
		this.ORM_es_publicada_por = value;
	}
	
	private java.util.Set getORM_Es_publicada_por() {
		return ORM_es_publicada_por;
	}
	
	@Transient	
	public final basededatos.NoticiaSetCollection es_publicada_por = new basededatos.NoticiaSetCollection(this, _ormAdapter, ORMConstants.KEY_EDITOR_ES_PUBLICADA_POR, ORMConstants.KEY_NOTICIA_PUBLICA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setEs_ordenada(basededatos.Portada value) {
		if (this.es_ordenada != value) {
			basededatos.Portada les_ordenada = this.es_ordenada;
			this.es_ordenada = value;
			if (value != null) {
				es_ordenada.setOrdena(this);
			}
			if (les_ordenada != null && les_ordenada.getOrdena() == this) {
				les_ordenada.setOrdena(null);
			}
		}
	}
	
	public basededatos.Portada getEs_ordenada() {
		return es_ordenada;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
