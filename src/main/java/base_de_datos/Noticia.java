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
package base_de_datos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Noticia")
public class Noticia implements Serializable {
	public Noticia() {
	}
	
	public static Noticia loadNoticiaByORMID(int id_noticia) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadNoticiaByORMID(session, id_noticia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(int id_noticia) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getNoticiaByORMID(session, id_noticia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByORMID(int id_noticia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadNoticiaByORMID(session, id_noticia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(int id_noticia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getNoticiaByORMID(session, id_noticia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByORMID(PersistentSession session, int id_noticia) throws PersistentException {
		try {
			return (Noticia) session.load(base_de_datos.Noticia.class, Integer.valueOf(id_noticia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(PersistentSession session, int id_noticia) throws PersistentException {
		try {
			return (Noticia) session.get(base_de_datos.Noticia.class, Integer.valueOf(id_noticia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByORMID(PersistentSession session, int id_noticia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Noticia) session.load(base_de_datos.Noticia.class, Integer.valueOf(id_noticia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(PersistentSession session, int id_noticia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Noticia) session.get(base_de_datos.Noticia.class, Integer.valueOf(id_noticia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryNoticia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryNoticia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Noticia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryNoticia(session, condition, orderBy);
			return (Noticia[]) list.toArray(new Noticia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryNoticia(session, condition, orderBy, lockMode);
			return (Noticia[]) list.toArray(new Noticia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Noticia[] noticias = listNoticiaByQuery(session, condition, orderBy);
		if (noticias != null && noticias.length > 0)
			return noticias[0];
		else
			return null;
	}
	
	public static Noticia loadNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Noticia[] noticias = listNoticiaByQuery(session, condition, orderBy, lockMode);
		if (noticias != null && noticias.length > 0)
			return noticias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Noticia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByCriteria(NoticiaCriteria noticiaCriteria) {
		Noticia[] noticias = listNoticiaByCriteria(noticiaCriteria);
		if(noticias == null || noticias.length == 0) {
			return null;
		}
		return noticias[0];
	}
	
	public static Noticia[] listNoticiaByCriteria(NoticiaCriteria noticiaCriteria) {
		return noticiaCriteria.listNoticia();
	}
	
	public static Noticia createNoticia() {
		return new base_de_datos.Noticia();
	}
	
	public boolean save() throws PersistentException {
		try {
			base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			base_de_datos.Editor[] lPublicas = publica.toArray();
			for(int i = 0; i < lPublicas.length; i++) {
				lPublicas[i].es_publicada_por.remove(this);
			}
			if(getCrea() != null) {
				getCrea().setEs_creada(null);
			}
			
			base_de_datos.Identificado[] lValoras = valora.toArray();
			for(int i = 0; i < lValoras.length; i++) {
				lValoras[i].es_valorada_por.remove(this);
			}
			base_de_datos.Tematica[] lPertenece_as = pertenece_a.toArray();
			for(int i = 0; i < lPertenece_as.length; i++) {
				lPertenece_as[i].contiene.remove(this);
			}
			base_de_datos.Seccion[] lSeccion_contiene_noticiass = seccion_contiene_noticias.toArray();
			for(int i = 0; i < lSeccion_contiene_noticiass.length; i++) {
				lSeccion_contiene_noticiass[i].aparece_en.remove(this);
			}
			base_de_datos.Comentario[] lPertenece_a_noticias = pertenece_a_noticia.toArray();
			for(int i = 0; i < lPertenece_a_noticias.length; i++) {
				lPertenece_a_noticias[i].setNoticia_contiene_comentarios(null);
			}
			base_de_datos.Editor[] lEliminas = elimina.toArray();
			for(int i = 0; i < lEliminas.length; i++) {
				lEliminas[i].es_eliminada_por_editor.remove(this);
			}
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			base_de_datos.Editor[] lPublicas = publica.toArray();
			for(int i = 0; i < lPublicas.length; i++) {
				lPublicas[i].es_publicada_por.remove(this);
			}
			if(getCrea() != null) {
				getCrea().setEs_creada(null);
			}
			
			base_de_datos.Identificado[] lValoras = valora.toArray();
			for(int i = 0; i < lValoras.length; i++) {
				lValoras[i].es_valorada_por.remove(this);
			}
			base_de_datos.Tematica[] lPertenece_as = pertenece_a.toArray();
			for(int i = 0; i < lPertenece_as.length; i++) {
				lPertenece_as[i].contiene.remove(this);
			}
			base_de_datos.Seccion[] lSeccion_contiene_noticiass = seccion_contiene_noticias.toArray();
			for(int i = 0; i < lSeccion_contiene_noticiass.length; i++) {
				lSeccion_contiene_noticiass[i].aparece_en.remove(this);
			}
			base_de_datos.Comentario[] lPertenece_a_noticias = pertenece_a_noticia.toArray();
			for(int i = 0; i < lPertenece_a_noticias.length; i++) {
				lPertenece_a_noticias[i].setNoticia_contiene_comentarios(null);
			}
			base_de_datos.Editor[] lEliminas = elimina.toArray();
			for(int i = 0; i < lEliminas.length; i++) {
				lEliminas[i].es_eliminada_por_editor.remove(this);
			}
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_NOTICIA_PUBLICA) {
			return ORM_publica;
		}
		else if (key == base_de_datos.ORMConstants.KEY_NOTICIA_VALORA) {
			return ORM_valora;
		}
		else if (key == base_de_datos.ORMConstants.KEY_NOTICIA_PERTENECE_A) {
			return ORM_pertenece_a;
		}
		else if (key == base_de_datos.ORMConstants.KEY_NOTICIA_SECCION_CONTIENE_NOTICIAS) {
			return ORM_seccion_contiene_noticias;
		}
		else if (key == base_de_datos.ORMConstants.KEY_NOTICIA_PERTENECE_A_NOTICIA) {
			return ORM_pertenece_a_noticia;
		}
		else if (key == base_de_datos.ORMConstants.KEY_NOTICIA_ELIMINA) {
			return ORM_elimina;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == base_de_datos.ORMConstants.KEY_NOTICIA_CREA) {
			this.crea = (base_de_datos.Periodista) owner;
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
	@GeneratedValue(generator="BASE_DE_DATOS_NOTICIA_ID_NOTICIA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_NOTICIA_ID_NOTICIA_GENERATOR", strategy="native")	
	private int id_noticia;
	
	@ManyToMany(targetEntity=base_de_datos.Editor.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Identificado_Noticia2", joinColumns={ @JoinColumn(name="NoticiaId_noticia") }, inverseJoinColumns={ @JoinColumn(name="IdentificadoDni") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_publica = new java.util.HashSet();
	
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
	
	@Column(name="Autor", nullable=true, length=255)	
	private String autor;
	
	@Column(name="Publicada", nullable=false, length=1)	
	private boolean publicada;
	
	@Column(name="Valoraciones_positivas", nullable=false, length=10)	
	private int valoraciones_positivas;
	
	@Column(name="Valoraciones_negativas", nullable=false, length=10)	
	private int valoraciones_negativas;
	
	@OneToOne(optional=false, targetEntity=base_de_datos.Periodista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="IdentificadoDni", referencedColumnName="Dni", nullable=false) }, foreignKey=@ForeignKey(name="FKNoticia294701"))	
	private base_de_datos.Periodista crea;
	
	@ManyToMany(targetEntity=base_de_datos.Identificado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Identificado_Noticia", joinColumns={ @JoinColumn(name="NoticiaId_noticia") }, inverseJoinColumns={ @JoinColumn(name="IdentificadoDni") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_valora = new java.util.HashSet();
	
	@ManyToMany(targetEntity=base_de_datos.Tematica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Tematica_Noticia", joinColumns={ @JoinColumn(name="NoticiaId_noticia") }, inverseJoinColumns={ @JoinColumn(name="TematicaId_tematica") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pertenece_a = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_aparece_en", targetEntity=base_de_datos.Seccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seccion_contiene_noticias = new java.util.HashSet();
	
	@OneToMany(mappedBy="noticia_contiene_comentarios", targetEntity=base_de_datos.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pertenece_a_noticia = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_es_eliminada_por_editor", targetEntity=base_de_datos.Editor.class)	
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
	
	public void setAutor(String value) {
		this.autor = value;
	}
	
	public String getAutor() {
		return autor;
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
	public final base_de_datos.EditorSetCollection publica = new base_de_datos.EditorSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_NOTICIA_PUBLICA, base_de_datos.ORMConstants.KEY_EDITOR_ES_PUBLICADA_POR, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setCrea(base_de_datos.Periodista value) {
		if (this.crea != value) {
			base_de_datos.Periodista lcrea = this.crea;
			this.crea = value;
			if (value != null) {
				crea.setEs_creada(this);
			}
			if (lcrea != null && lcrea.getEs_creada() == this) {
				lcrea.setEs_creada(null);
			}
		}
	}
	
	public base_de_datos.Periodista getCrea() {
		return crea;
	}
	
	private void setORM_Valora(java.util.Set value) {
		this.ORM_valora = value;
	}
	
	private java.util.Set getORM_Valora() {
		return ORM_valora;
	}
	
	@Transient	
	public final base_de_datos.IdentificadoSetCollection valora = new base_de_datos.IdentificadoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_NOTICIA_VALORA, base_de_datos.ORMConstants.KEY_IDENTIFICADO_ES_VALORADA_POR, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Pertenece_a(java.util.Set value) {
		this.ORM_pertenece_a = value;
	}
	
	private java.util.Set getORM_Pertenece_a() {
		return ORM_pertenece_a;
	}
	
	@Transient	
	public final base_de_datos.TematicaSetCollection pertenece_a = new base_de_datos.TematicaSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_NOTICIA_PERTENECE_A, base_de_datos.ORMConstants.KEY_TEMATICA_CONTIENE, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Seccion_contiene_noticias(java.util.Set value) {
		this.ORM_seccion_contiene_noticias = value;
	}
	
	private java.util.Set getORM_Seccion_contiene_noticias() {
		return ORM_seccion_contiene_noticias;
	}
	
	@Transient	
	public final base_de_datos.SeccionSetCollection seccion_contiene_noticias = new base_de_datos.SeccionSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_NOTICIA_SECCION_CONTIENE_NOTICIAS, base_de_datos.ORMConstants.KEY_SECCION_APARECE_EN, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Pertenece_a_noticia(java.util.Set value) {
		this.ORM_pertenece_a_noticia = value;
	}
	
	private java.util.Set getORM_Pertenece_a_noticia() {
		return ORM_pertenece_a_noticia;
	}
	
	@Transient	
	public final base_de_datos.ComentarioSetCollection pertenece_a_noticia = new base_de_datos.ComentarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_NOTICIA_PERTENECE_A_NOTICIA, base_de_datos.ORMConstants.KEY_COMENTARIO_NOTICIA_CONTIENE_COMENTARIOS, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Elimina(java.util.Set value) {
		this.ORM_elimina = value;
	}
	
	private java.util.Set getORM_Elimina() {
		return ORM_elimina;
	}
	
	@Transient	
	public final base_de_datos.EditorSetCollection elimina = new base_de_datos.EditorSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_NOTICIA_ELIMINA, base_de_datos.ORMConstants.KEY_EDITOR_ES_ELIMINADA_POR_EDITOR, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_noticia());
	}
	
}
