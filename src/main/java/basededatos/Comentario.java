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
@Table(name="Comentario")
public class Comentario implements Serializable {
	public Comentario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_COMENTARIO_VALORA_POSITIVAMENTE) {
			return ORM_valora_positivamente;
		}
		else if (key == ORMConstants.KEY_COMENTARIO_VALORA_NEGATIVAMENTE) {
			return ORM_valora_negativamente;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_COMENTARIO_NOTICIA_CONTIENE_COMENTARIOS) {
			this.noticia_contiene_comentarios = (basededatos.Noticia) owner;
		}
		
		else if (key == ORMConstants.KEY_COMENTARIO_ESCRIBE) {
			this.escribe = (basededatos.Identificado) owner;
		}
		
		else if (key == ORMConstants.KEY_COMENTARIO_ELIMINA_COMENTARIO) {
			this.elimina_comentario = (basededatos.Editor) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_COMENTARIO_ID_COMENTARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_COMENTARIO_ID_COMENTARIO_GENERATOR", strategy="native")	
	private int id_comentario;
	
	@ManyToOne(targetEntity=basededatos.Identificado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="IdentificadoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario957219"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Identificado escribe;
	
	@ManyToOne(targetEntity=basededatos.Editor.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EditorIdentificadoId", referencedColumnName="IdentificadoId") }, foreignKey=@ForeignKey(name="FKComentario316609"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Editor elimina_comentario;
	
	@ManyToOne(targetEntity=basededatos.Noticia.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="NoticiaId_noticia", referencedColumnName="Id_noticia", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario796228"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Noticia noticia_contiene_comentarios;
	
	@Column(name="Contenido", nullable=false, length=255)	
	private String contenido;
	
	@Column(name="Valoraciones_positivas", nullable=false, length=10)	
	private int valoraciones_positivas;
	
	@Column(name="Valoraciones_negativas", nullable=false, length=10)	
	private int valoraciones_negativas;
	
	@ManyToMany(mappedBy="ORM_es_valorado_positiva", targetEntity=basededatos.Identificado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_valora_positivamente = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_es_valorado_negativa", targetEntity=basededatos.Identificado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_valora_negativamente = new java.util.HashSet();
	
	private void setId_comentario(int value) {
		this.id_comentario = value;
	}
	
	public int getId_comentario() {
		return id_comentario;
	}
	
	public int getORMID() {
		return getId_comentario();
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
	
	public void setNoticia_contiene_comentarios(basededatos.Noticia value) {
		if (noticia_contiene_comentarios != null) {
			noticia_contiene_comentarios.pertenece_a_noticia.remove(this);
		}
		if (value != null) {
			value.pertenece_a_noticia.add(this);
		}
	}
	
	public basededatos.Noticia getNoticia_contiene_comentarios() {
		return noticia_contiene_comentarios;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Noticia_contiene_comentarios(basededatos.Noticia value) {
		this.noticia_contiene_comentarios = value;
	}
	
	private basededatos.Noticia getORM_Noticia_contiene_comentarios() {
		return noticia_contiene_comentarios;
	}
	
	public void setEscribe(basededatos.Identificado value) {
		if (escribe != null) {
			escribe.pertenece_a_identificado.remove(this);
		}
		if (value != null) {
			value.pertenece_a_identificado.add(this);
		}
	}
	
	public basededatos.Identificado getEscribe() {
		return escribe;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Escribe(basededatos.Identificado value) {
		this.escribe = value;
	}
	
	private basededatos.Identificado getORM_Escribe() {
		return escribe;
	}
	
	public void setElimina_comentario(basededatos.Editor value) {
		if (elimina_comentario != null) {
			elimina_comentario.es_eliminado_por.remove(this);
		}
		if (value != null) {
			value.es_eliminado_por.add(this);
		}
	}
	
	public basededatos.Editor getElimina_comentario() {
		return elimina_comentario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Elimina_comentario(basededatos.Editor value) {
		this.elimina_comentario = value;
	}
	
	private basededatos.Editor getORM_Elimina_comentario() {
		return elimina_comentario;
	}
	
	private void setORM_Valora_positivamente(java.util.Set value) {
		this.ORM_valora_positivamente = value;
	}
	
	private java.util.Set getORM_Valora_positivamente() {
		return ORM_valora_positivamente;
	}
	
	@Transient	
	public final basededatos.IdentificadoSetCollection valora_positivamente = new basededatos.IdentificadoSetCollection(this, _ormAdapter, ORMConstants.KEY_COMENTARIO_VALORA_POSITIVAMENTE, ORMConstants.KEY_IDENTIFICADO_ES_VALORADO_POSITIVA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Valora_negativamente(java.util.Set value) {
		this.ORM_valora_negativamente = value;
	}
	
	private java.util.Set getORM_Valora_negativamente() {
		return ORM_valora_negativamente;
	}
	
	@Transient	
	public final basededatos.IdentificadoSetCollection valora_negativamente = new basededatos.IdentificadoSetCollection(this, _ormAdapter, ORMConstants.KEY_COMENTARIO_VALORA_NEGATIVAMENTE, ORMConstants.KEY_IDENTIFICADO_ES_VALORADO_NEGATIVA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_comentario());
	}
	
}
