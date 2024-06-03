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
@Table(name="Identificado")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Identificado")
public class Identificado implements Serializable {
	public Identificado() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_IDENTIFICADO_PERTENECE_A_IDENTIFICADO) {
			return ORM_pertenece_a_identificado;
		}
		else if (key == ORMConstants.KEY_IDENTIFICADO_ES_VALORADO_POSITIVA) {
			return ORM_es_valorado_positiva;
		}
		else if (key == ORMConstants.KEY_IDENTIFICADO_ES_VALORADO_NEGATIVA) {
			return ORM_es_valorado_negativa;
		}
		else if (key == ORMConstants.KEY_IDENTIFICADO_ES_VALORADA_POSITIVA_POR) {
			return ORM_es_valorada_positiva_por;
		}
		else if (key == ORMConstants.KEY_IDENTIFICADO_ES_VALORADA_NEGATIVA_POR) {
			return ORM_es_valorada_negativa_por;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_IDENTIFICADO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_IDENTIFICADO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Dni", nullable=false, length=255)	
	private String dni;
	
	@Column(name="Nombre", nullable=false, length=255)	
	private String nombre;
	
	@Column(name="Apellidos", nullable=false, length=255)	
	private String apellidos;
	
	@Column(name="Nick_apodo", nullable=false, length=255)	
	private String nick_apodo;
	
	@Column(name="Email", nullable=false, length=255)	
	private String email;
	
	@Column(name="Contrasena", nullable=false, length=255)	
	private String contrasena;
	
	@Column(name="Fecha_nacimiento", nullable=false, length=255)	
	private String fecha_nacimiento;
	
	@Column(name="Telefono", nullable=false, length=10)	
	private int telefono;
	
	@Column(name="Url_foto_perfil", nullable=true, length=255)	
	private String url_foto_perfil;
	
	@OneToMany(mappedBy="escribe", targetEntity=basededatos.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pertenece_a_identificado = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Comentario_Identificado", joinColumns={ @JoinColumn(name="IdentificadoId") }, inverseJoinColumns={ @JoinColumn(name="ComentarioId_comentario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_valorado_positiva = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Comentario_Identificado2", joinColumns={ @JoinColumn(name="IdentificadoId") }, inverseJoinColumns={ @JoinColumn(name="ComentarioId_comentario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_valorado_negativa = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_valora_positiva", targetEntity=basededatos.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_valorada_positiva_por = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_valora_negativa", targetEntity=basededatos.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_valorada_negativa_por = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setDni(String value) {
		this.dni = value;
	}
	
	public String getDni() {
		return dni;
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
	public final basededatos.ComentarioSetCollection pertenece_a_identificado = new basededatos.ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_IDENTIFICADO_PERTENECE_A_IDENTIFICADO, ORMConstants.KEY_COMENTARIO_ESCRIBE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_valorado_positiva(java.util.Set value) {
		this.ORM_es_valorado_positiva = value;
	}
	
	private java.util.Set getORM_Es_valorado_positiva() {
		return ORM_es_valorado_positiva;
	}
	
	@Transient	
	public final basededatos.ComentarioSetCollection es_valorado_positiva = new basededatos.ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_IDENTIFICADO_ES_VALORADO_POSITIVA, ORMConstants.KEY_COMENTARIO_VALORA_POSITIVAMENTE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_valorado_negativa(java.util.Set value) {
		this.ORM_es_valorado_negativa = value;
	}
	
	private java.util.Set getORM_Es_valorado_negativa() {
		return ORM_es_valorado_negativa;
	}
	
	@Transient	
	public final basededatos.ComentarioSetCollection es_valorado_negativa = new basededatos.ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_IDENTIFICADO_ES_VALORADO_NEGATIVA, ORMConstants.KEY_COMENTARIO_VALORA_NEGATIVAMENTE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_valorada_positiva_por(java.util.Set value) {
		this.ORM_es_valorada_positiva_por = value;
	}
	
	private java.util.Set getORM_Es_valorada_positiva_por() {
		return ORM_es_valorada_positiva_por;
	}
	
	@Transient	
	public final basededatos.NoticiaSetCollection es_valorada_positiva_por = new basededatos.NoticiaSetCollection(this, _ormAdapter, ORMConstants.KEY_IDENTIFICADO_ES_VALORADA_POSITIVA_POR, ORMConstants.KEY_NOTICIA_VALORA_POSITIVA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_valorada_negativa_por(java.util.Set value) {
		this.ORM_es_valorada_negativa_por = value;
	}
	
	private java.util.Set getORM_Es_valorada_negativa_por() {
		return ORM_es_valorada_negativa_por;
	}
	
	@Transient	
	public final basededatos.NoticiaSetCollection es_valorada_negativa_por = new basededatos.NoticiaSetCollection(this, _ormAdapter, ORMConstants.KEY_IDENTIFICADO_ES_VALORADA_NEGATIVA_POR, ORMConstants.KEY_NOTICIA_VALORA_NEGATIVA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
