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
@Table(name="Noticia")
public class Noticia implements Serializable {
	public Noticia() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_NOTICIA_VALORA_POSITIVA) {
			return ORM_valora_positiva;
		}
		else if (key == ORMConstants.KEY_NOTICIA_PERTENECE_A) {
			return ORM_pertenece_a;
		}
		else if (key == ORMConstants.KEY_NOTICIA_VALORA_NEGATIVA) {
			return ORM_valora_negativa;
		}
		else if (key == ORMConstants.KEY_NOTICIA_PERTENECE_A_NOTICIA) {
			return ORM_pertenece_a_noticia;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_NOTICIA_PUBLICA) {
			this.publica = (basededatos.Editor) owner;
		}
		
		else if (key == ORMConstants.KEY_NOTICIA_CREA) {
			this.crea = (basededatos.Periodista) owner;
		}
		
		else if (key == ORMConstants.KEY_NOTICIA_SECCION_CONTIENE_NOTICIAS) {
			this.seccion_contiene_noticias = (basededatos.Seccion) owner;
		}
		
		else if (key == ORMConstants.KEY_NOTICIA_ELIMINA_NOTICIA) {
			this.elimina_noticia = (basededatos.Editor) owner;
		}
		
		else if (key == ORMConstants.KEY_NOTICIA_PORTADA_CONTIENE_NOTICIAS) {
			this.portada_contiene_noticias = (basededatos.Portada) owner;
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
	
	@Column(name="Id_noticia", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_NOTICIA_ID_NOTICIA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_NOTICIA_ID_NOTICIA_GENERATOR", strategy="native")	
	private int id_noticia;
	
	@ManyToOne(targetEntity=basededatos.Portada.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PortadaId_portada", referencedColumnName="Id_portada") }, foreignKey=@ForeignKey(name="FKNoticia219859"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Portada portada_contiene_noticias;
	
	@ManyToOne(targetEntity=basededatos.Editor.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EditorIdentificadoId2", referencedColumnName="IdentificadoId") }, foreignKey=@ForeignKey(name="FKNoticia105236"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Editor publica;
	
	@ManyToOne(targetEntity=basededatos.Editor.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EditorIdentificadoId", referencedColumnName="IdentificadoId") }, foreignKey=@ForeignKey(name="FKNoticia859437"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Editor elimina_noticia;
	
	@ManyToOne(targetEntity=basededatos.Seccion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="SeccionId_seccion", referencedColumnName="Id_seccion") }, foreignKey=@ForeignKey(name="FKNoticia469234"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Seccion seccion_contiene_noticias;
	
	@ManyToOne(targetEntity=basededatos.Periodista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PeriodistaIdentificadoId", referencedColumnName="IdentificadoId", nullable=false) }, foreignKey=@ForeignKey(name="FKNoticia644303"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Periodista crea;
	
	@Column(name="Titulo", nullable=false, length=255)	
	private String titulo;
	
	@Column(name="Url_imagen_noticia", nullable=false, length=255)	
	private String url_imagen_noticia;
	
	@Column(name="Fecha", nullable=false, length=255)	
	private String fecha;
	
	@Column(name="Lugar", nullable=false, length=255)	
	private String lugar;
	
	@Column(name="Resumen", nullable=true, length=255)	
	private String resumen;
	
	@Column(name="Contenido", nullable=false, length=255)	
	private String contenido;
	
	@Column(name="Valoraciones_positivas", nullable=false, length=10)	
	private int valoraciones_positivas;
	
	@Column(name="Valoraciones_negativas", nullable=false, length=10)	
	private int valoraciones_negativas;
	
	@Column(name="Posicion_portada", nullable=false, length=10)	
	private int posicion_portada;
	
	@ManyToMany(targetEntity=basededatos.Identificado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Identificado_Noticia", joinColumns={ @JoinColumn(name="NoticiaId_noticia") }, inverseJoinColumns={ @JoinColumn(name="IdentificadoId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_valora_positiva = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Tematica.class, fetch = FetchType.EAGER)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Tematica_Noticia", joinColumns={ @JoinColumn(name="NoticiaId_noticia") }, inverseJoinColumns={ @JoinColumn(name="TematicaId_tematica") })		
	private java.util.Set ORM_pertenece_a = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Identificado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Identificado_Noticia2", joinColumns={ @JoinColumn(name="NoticiaId_noticia") }, inverseJoinColumns={ @JoinColumn(name="IdentificadoId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_valora_negativa = new java.util.HashSet();
	
	@OneToMany(mappedBy="noticia_contiene_comentarios", targetEntity=basededatos.Comentario.class, fetch = FetchType.EAGER)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})		
	private java.util.Set ORM_pertenece_a_noticia = new java.util.HashSet();
	
	private void setId_noticia(int value) {
		this.id_noticia = value;
	}
	
	public int getId_noticia() {
		return id_noticia;
	}
	
	public int getORMID() {
		return getId_noticia();
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setUrl_imagen_noticia(String value) {
		this.url_imagen_noticia = value;
	}
	
	public String getUrl_imagen_noticia() {
		return url_imagen_noticia;
	}
	
	public void setFecha(String value) {
		this.fecha = value;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setLugar(String value) {
		this.lugar = value;
	}
	
	public String getLugar() {
		return lugar;
	}
	
	public void setResumen(String value) {
		this.resumen = value;
	}
	
	public String getResumen() {
		return resumen;
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
	
	public void setPosicion_portada(int value) {
		this.posicion_portada = value;
	}
	
	public int getPosicion_portada() {
		return posicion_portada;
	}
	
	public void setPublica(basededatos.Editor value) {
		if (publica != null) {
			publica.es_publicada_por.remove(this);
		}
		if (value != null) {
			value.es_publicada_por.add(this);
		}
	}
	
	public basededatos.Editor getPublica() {
		return publica;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Publica(basededatos.Editor value) {
		this.publica = value;
	}
	
	private basededatos.Editor getORM_Publica() {
		return publica;
	}
	
	public void setCrea(basededatos.Periodista value) {
		if (crea != null) {
			crea.es_creada.remove(this);
		}
		if (value != null) {
			value.es_creada.add(this);
		}
	}
	
	public basededatos.Periodista getCrea() {
		return crea;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Crea(basededatos.Periodista value) {
		this.crea = value;
	}
	
	private basededatos.Periodista getORM_Crea() {
		return crea;
	}
	
	private void setORM_Valora_positiva(java.util.Set value) {
		this.ORM_valora_positiva = value;
	}
	
	private java.util.Set getORM_Valora_positiva() {
		return ORM_valora_positiva;
	}
	
	@Transient	
	public final basededatos.IdentificadoSetCollection valora_positiva = new basededatos.IdentificadoSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTICIA_VALORA_POSITIVA, ORMConstants.KEY_IDENTIFICADO_ES_VALORADA_POSITIVA_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Pertenece_a(java.util.Set value) {
		this.ORM_pertenece_a = value;
	}
	
	private java.util.Set getORM_Pertenece_a() {
		return ORM_pertenece_a;
	}
	
	@Transient	
	public final basededatos.TematicaSetCollection pertenece_a = new basededatos.TematicaSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTICIA_PERTENECE_A, ORMConstants.KEY_TEMATICA_CONTIENE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Valora_negativa(java.util.Set value) {
		this.ORM_valora_negativa = value;
	}
	
	private java.util.Set getORM_Valora_negativa() {
		return ORM_valora_negativa;
	}
	
	@Transient	
	public final basededatos.IdentificadoSetCollection valora_negativa = new basededatos.IdentificadoSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTICIA_VALORA_NEGATIVA, ORMConstants.KEY_IDENTIFICADO_ES_VALORADA_NEGATIVA_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setSeccion_contiene_noticias(basededatos.Seccion value) {
		if (seccion_contiene_noticias != null) {
			seccion_contiene_noticias.aparece_en.remove(this);
		}
		if (value != null) {
			value.aparece_en.add(this);
		}
	}
	
	public basededatos.Seccion getSeccion_contiene_noticias() {
		return seccion_contiene_noticias;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Seccion_contiene_noticias(basededatos.Seccion value) {
		this.seccion_contiene_noticias = value;
	}
	
	private basededatos.Seccion getORM_Seccion_contiene_noticias() {
		return seccion_contiene_noticias;
	}
	
	private void setORM_Pertenece_a_noticia(java.util.Set value) {
		this.ORM_pertenece_a_noticia = value;
	}
	
	private java.util.Set getORM_Pertenece_a_noticia() {
		return ORM_pertenece_a_noticia;
	}
	
	@Transient	
	public final basededatos.ComentarioSetCollection pertenece_a_noticia = new basededatos.ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTICIA_PERTENECE_A_NOTICIA, ORMConstants.KEY_COMENTARIO_NOTICIA_CONTIENE_COMENTARIOS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setElimina_noticia(basededatos.Editor value) {
		if (elimina_noticia != null) {
			elimina_noticia.noticia_es_eliminada_por_.remove(this);
		}
		if (value != null) {
			value.noticia_es_eliminada_por_.add(this);
		}
	}
	
	public basededatos.Editor getElimina_noticia() {
		return elimina_noticia;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Elimina_noticia(basededatos.Editor value) {
		this.elimina_noticia = value;
	}
	
	private basededatos.Editor getORM_Elimina_noticia() {
		return elimina_noticia;
	}
	
	public void setPortada_contiene_noticias(basededatos.Portada value) {
		if (portada_contiene_noticias != null) {
			portada_contiene_noticias.aparece_en_portada.remove(this);
		}
		if (value != null) {
			value.aparece_en_portada.add(this);
		}
	}
	
	public basededatos.Portada getPortada_contiene_noticias() {
		return portada_contiene_noticias;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Portada_contiene_noticias(basededatos.Portada value) {
		this.portada_contiene_noticias = value;
	}
	
	private basededatos.Portada getORM_Portada_contiene_noticias() {
		return portada_contiene_noticias;
	}
	
	public String toString() {
		return String.valueOf(getId_noticia());
	}
	
}
