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
		if (key == ORMConstants.KEY_NOTICIA_PUBLICA) {
			return ORM_publica;
		}
		else if (key == ORMConstants.KEY_NOTICIA_VALORA_POSITIVA) {
			return ORM_valora_positiva;
		}
		else if (key == ORMConstants.KEY_NOTICIA_PERTENECE_A) {
			return ORM_pertenece_a;
		}
		else if (key == ORMConstants.KEY_NOTICIA_VALORA_NEGATIVA) {
			return ORM_valora_negativa;
		}
		else if (key == ORMConstants.KEY_NOTICIA_SECCION_CONTIENE_NOTICIAS) {
			return ORM_seccion_contiene_noticias;
		}
		else if (key == ORMConstants.KEY_NOTICIA_PERTENECE_A_NOTICIA) {
			return ORM_pertenece_a_noticia;
		}
		else if (key == ORMConstants.KEY_NOTICIA_ELIMINA) {
			return ORM_elimina;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_NOTICIA_CREA) {
			this.crea = (basededatos.Periodista) owner;
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
	@JoinColumns(value={ @JoinColumn(name="PortadaId_portada", referencedColumnName="Id_portada", nullable=false) }, foreignKey=@ForeignKey(name="FKNoticia219859"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Portada portada_contiene_noticias;
	
	@ManyToOne(targetEntity=basededatos.Periodista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PeriodistaIdentificadoId", referencedColumnName="IdentificadoId", nullable=false) }, foreignKey=@ForeignKey(name="FKNoticia644303"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Periodista crea;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="Url_imagen_noticia", nullable=true, length=255)	
	private String url_imagen_noticia;
	
	@Column(name="Fecha", nullable=true, length=255)	
	private String fecha;
	
	@Column(name="Lugar", nullable=true, length=255)	
	private String lugar;
	
	@Column(name="Resumen", nullable=true, length=255)	
	private String resumen;
	
	@Column(name="Contenido", nullable=true, length=255)	
	private String contenido;
	
	@Column(name="Publicada", nullable=false, length=1)	
	private boolean publicada;
	
	@Column(name="Valoraciones_positivas", nullable=false, length=10)	
	private int valoraciones_positivas;
	
	@Column(name="Valoraciones_negativas", nullable=false, length=10)	
	private int valoraciones_negativas;
	
	@ManyToMany(targetEntity=basededatos.Editor.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Editor_Noticia", joinColumns={ @JoinColumn(name="NoticiaId_noticia") }, inverseJoinColumns={ @JoinColumn(name="EditorIdentificadoId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_publica = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Identificado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Identificado_Noticia", joinColumns={ @JoinColumn(name="NoticiaId_noticia") }, inverseJoinColumns={ @JoinColumn(name="IdentificadoId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_valora_positiva = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Tematica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Tematica_Noticia", joinColumns={ @JoinColumn(name="NoticiaId_noticia") }, inverseJoinColumns={ @JoinColumn(name="TematicaId_tematica") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pertenece_a = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Identificado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Identificado_Noticia2", joinColumns={ @JoinColumn(name="NoticiaId_noticia") }, inverseJoinColumns={ @JoinColumn(name="IdentificadoId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_valora_negativa = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_aparece_en", targetEntity=basededatos.Seccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seccion_contiene_noticias = new java.util.HashSet();
	
	@OneToMany(mappedBy="noticia_contiene_comentarios", targetEntity=basededatos.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pertenece_a_noticia = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_es_eliminada_por_editor", targetEntity=basededatos.Editor.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_elimina = new java.util.HashSet();
	
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
	
	public void setPublicada(boolean value) {
		this.publicada = value;
	}
	
	public boolean getPublicada() {
		return publicada;
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
	
	private void setORM_Publica(java.util.Set value) {
		this.ORM_publica = value;
	}
	
	private java.util.Set getORM_Publica() {
		return ORM_publica;
	}
	
	@Transient	
	public final basededatos.EditorSetCollection publica = new basededatos.EditorSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTICIA_PUBLICA, ORMConstants.KEY_EDITOR_ES_PUBLICADA_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
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
	
	private void setORM_Seccion_contiene_noticias(java.util.Set value) {
		this.ORM_seccion_contiene_noticias = value;
	}
	
	private java.util.Set getORM_Seccion_contiene_noticias() {
		return ORM_seccion_contiene_noticias;
	}
	
	@Transient	
	public final basededatos.SeccionSetCollection seccion_contiene_noticias = new basededatos.SeccionSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTICIA_SECCION_CONTIENE_NOTICIAS, ORMConstants.KEY_SECCION_APARECE_EN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Pertenece_a_noticia(java.util.Set value) {
		this.ORM_pertenece_a_noticia = value;
	}
	
	private java.util.Set getORM_Pertenece_a_noticia() {
		return ORM_pertenece_a_noticia;
	}
	
	@Transient	
	public final basededatos.ComentarioSetCollection pertenece_a_noticia = new basededatos.ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTICIA_PERTENECE_A_NOTICIA, ORMConstants.KEY_COMENTARIO_NOTICIA_CONTIENE_COMENTARIOS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Elimina(java.util.Set value) {
		this.ORM_elimina = value;
	}
	
	private java.util.Set getORM_Elimina() {
		return ORM_elimina;
	}
	
	@Transient	
	public final basededatos.EditorSetCollection elimina = new basededatos.EditorSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTICIA_ELIMINA, ORMConstants.KEY_EDITOR_ES_ELIMINADA_POR_EDITOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
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
