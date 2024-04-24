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
@Table(name="Editor")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Editor")
@PrimaryKeyJoinColumn(name="IdentificadoId", referencedColumnName="Id")
public class Editor extends base_de_datos.Identificado implements Serializable {
	public Editor() {
	}
	
	public static Editor loadEditorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadEditorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor getEditorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getEditorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadEditorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor getEditorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getEditorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Editor) session.load(base_de_datos.Editor.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor getEditorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Editor) session.get(base_de_datos.Editor.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Editor) session.load(base_de_datos.Editor.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor getEditorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Editor) session.get(base_de_datos.Editor.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEditor(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryEditor(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEditor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryEditor(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor[] listEditorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listEditorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor[] listEditorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listEditorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEditor(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Editor as Editor");
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
	
	public static List queryEditor(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Editor as Editor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Editor", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor[] listEditorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEditor(session, condition, orderBy);
			return (Editor[]) list.toArray(new Editor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor[] listEditorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEditor(session, condition, orderBy, lockMode);
			return (Editor[]) list.toArray(new Editor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadEditorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadEditorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Editor[] editors = listEditorByQuery(session, condition, orderBy);
		if (editors != null && editors.length > 0)
			return editors[0];
		else
			return null;
	}
	
	public static Editor loadEditorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Editor[] editors = listEditorByQuery(session, condition, orderBy, lockMode);
		if (editors != null && editors.length > 0)
			return editors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEditorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateEditorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEditorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateEditorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEditorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Editor as Editor");
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
	
	public static java.util.Iterator iterateEditorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Editor as Editor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Editor", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByCriteria(EditorCriteria editorCriteria) {
		Editor[] editors = listEditorByCriteria(editorCriteria);
		if(editors == null || editors.length == 0) {
			return null;
		}
		return editors[0];
	}
	
	public static Editor[] listEditorByCriteria(EditorCriteria editorCriteria) {
		return editorCriteria.listEditor();
	}
	
	public static Editor createEditor() {
		return new base_de_datos.Editor();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			base_de_datos.Comentario[] lEs_eliminado_pors = es_eliminado_por.toArray();
			for(int i = 0; i < lEs_eliminado_pors.length; i++) {
				lEs_eliminado_pors[i].setElimina(null);
			}
			base_de_datos.Noticia[] lEs_eliminada_por_editors = es_eliminada_por_editor.toArray();
			for(int i = 0; i < lEs_eliminada_por_editors.length; i++) {
				lEs_eliminada_por_editors[i].elimina.remove(this);
			}
			base_de_datos.Seccion[] lEs_creada_pors = es_creada_por.toArray();
			for(int i = 0; i < lEs_creada_pors.length; i++) {
				lEs_creada_pors[i].setCrea(null);
			}
			base_de_datos.Seccion[] lEs_eliminada_pors = es_eliminada_por.toArray();
			for(int i = 0; i < lEs_eliminada_pors.length; i++) {
				lEs_eliminada_pors[i].setElimina(null);
			}
			base_de_datos.Noticia[] lEs_publicada_pors = es_publicada_por.toArray();
			for(int i = 0; i < lEs_publicada_pors.length; i++) {
				lEs_publicada_pors[i].publica.remove(this);
			}
			if(getEs_ordenada() != null) {
				getEs_ordenada().setOrdena(null);
			}
			
			base_de_datos.Comentario[] lPertenece_a_identificados = pertenece_a_identificado.toArray();
			for(int i = 0; i < lPertenece_a_identificados.length; i++) {
				lPertenece_a_identificados[i].setEscribe(null);
			}
			base_de_datos.Comentario[] lEs_valorado_pors = es_valorado_por.toArray();
			for(int i = 0; i < lEs_valorado_pors.length; i++) {
				lEs_valorado_pors[i].valora.remove(this);
			}
			base_de_datos.Noticia[] lEs_valorada_pors = es_valorada_por.toArray();
			for(int i = 0; i < lEs_valorada_pors.length; i++) {
				lEs_valorada_pors[i].valora.remove(this);
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
			base_de_datos.Comentario[] lEs_eliminado_pors = es_eliminado_por.toArray();
			for(int i = 0; i < lEs_eliminado_pors.length; i++) {
				lEs_eliminado_pors[i].setElimina(null);
			}
			base_de_datos.Noticia[] lEs_eliminada_por_editors = es_eliminada_por_editor.toArray();
			for(int i = 0; i < lEs_eliminada_por_editors.length; i++) {
				lEs_eliminada_por_editors[i].elimina.remove(this);
			}
			base_de_datos.Seccion[] lEs_creada_pors = es_creada_por.toArray();
			for(int i = 0; i < lEs_creada_pors.length; i++) {
				lEs_creada_pors[i].setCrea(null);
			}
			base_de_datos.Seccion[] lEs_eliminada_pors = es_eliminada_por.toArray();
			for(int i = 0; i < lEs_eliminada_pors.length; i++) {
				lEs_eliminada_pors[i].setElimina(null);
			}
			base_de_datos.Noticia[] lEs_publicada_pors = es_publicada_por.toArray();
			for(int i = 0; i < lEs_publicada_pors.length; i++) {
				lEs_publicada_pors[i].publica.remove(this);
			}
			if(getEs_ordenada() != null) {
				getEs_ordenada().setOrdena(null);
			}
			
			base_de_datos.Comentario[] lPertenece_a_identificados = pertenece_a_identificado.toArray();
			for(int i = 0; i < lPertenece_a_identificados.length; i++) {
				lPertenece_a_identificados[i].setEscribe(null);
			}
			base_de_datos.Comentario[] lEs_valorado_pors = es_valorado_por.toArray();
			for(int i = 0; i < lEs_valorado_pors.length; i++) {
				lEs_valorado_pors[i].valora.remove(this);
			}
			base_de_datos.Noticia[] lEs_valorada_pors = es_valorada_por.toArray();
			for(int i = 0; i < lEs_valorada_pors.length; i++) {
				lEs_valorada_pors[i].valora.remove(this);
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
		if (key == base_de_datos.ORMConstants.KEY_EDITOR_ES_ELIMINADO_POR) {
			return ORM_es_eliminado_por;
		}
		else if (key == base_de_datos.ORMConstants.KEY_EDITOR_ES_ELIMINADA_POR_EDITOR) {
			return ORM_es_eliminada_por_editor;
		}
		else if (key == base_de_datos.ORMConstants.KEY_EDITOR_ES_CREADA_POR) {
			return ORM_es_creada_por;
		}
		else if (key == base_de_datos.ORMConstants.KEY_EDITOR_ES_ELIMINADA_POR) {
			return ORM_es_eliminada_por;
		}
		else if (key == base_de_datos.ORMConstants.KEY_EDITOR_ES_PUBLICADA_POR) {
			return ORM_es_publicada_por;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == base_de_datos.ORMConstants.KEY_EDITOR_ES_ORDENADA) {
			this.es_ordenada = (base_de_datos.Portada) owner;
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
	
	@OneToMany(mappedBy="elimina", targetEntity=base_de_datos.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_eliminado_por = new java.util.HashSet();
	
	@ManyToMany(targetEntity=base_de_datos.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Noticia_Editor", joinColumns={ @JoinColumn(name="EditorIdentificadoId") }, inverseJoinColumns={ @JoinColumn(name="NoticiaId_noticia") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_eliminada_por_editor = new java.util.HashSet();
	
	@OneToMany(mappedBy="crea", targetEntity=base_de_datos.Seccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_creada_por = new java.util.HashSet();
	
	@OneToMany(mappedBy="elimina", targetEntity=base_de_datos.Seccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_eliminada_por = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_publica", targetEntity=base_de_datos.Noticia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_publicada_por = new java.util.HashSet();
	
	@OneToOne(mappedBy="ordena", targetEntity=base_de_datos.Portada.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private base_de_datos.Portada es_ordenada;
	
	private void setORM_Es_eliminado_por(java.util.Set value) {
		this.ORM_es_eliminado_por = value;
	}
	
	private java.util.Set getORM_Es_eliminado_por() {
		return ORM_es_eliminado_por;
	}
	
	@Transient	
	public final base_de_datos.ComentarioSetCollection es_eliminado_por = new base_de_datos.ComentarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_EDITOR_ES_ELIMINADO_POR, base_de_datos.ORMConstants.KEY_COMENTARIO_ELIMINA, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_eliminada_por_editor(java.util.Set value) {
		this.ORM_es_eliminada_por_editor = value;
	}
	
	private java.util.Set getORM_Es_eliminada_por_editor() {
		return ORM_es_eliminada_por_editor;
	}
	
	@Transient	
	public final base_de_datos.NoticiaSetCollection es_eliminada_por_editor = new base_de_datos.NoticiaSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_EDITOR_ES_ELIMINADA_POR_EDITOR, base_de_datos.ORMConstants.KEY_NOTICIA_ELIMINA, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_creada_por(java.util.Set value) {
		this.ORM_es_creada_por = value;
	}
	
	private java.util.Set getORM_Es_creada_por() {
		return ORM_es_creada_por;
	}
	
	@Transient	
	public final base_de_datos.SeccionSetCollection es_creada_por = new base_de_datos.SeccionSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_EDITOR_ES_CREADA_POR, base_de_datos.ORMConstants.KEY_SECCION_CREA, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_eliminada_por(java.util.Set value) {
		this.ORM_es_eliminada_por = value;
	}
	
	private java.util.Set getORM_Es_eliminada_por() {
		return ORM_es_eliminada_por;
	}
	
	@Transient	
	public final base_de_datos.SeccionSetCollection es_eliminada_por = new base_de_datos.SeccionSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_EDITOR_ES_ELIMINADA_POR, base_de_datos.ORMConstants.KEY_SECCION_ELIMINA, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_publicada_por(java.util.Set value) {
		this.ORM_es_publicada_por = value;
	}
	
	private java.util.Set getORM_Es_publicada_por() {
		return ORM_es_publicada_por;
	}
	
	@Transient	
	public final base_de_datos.NoticiaSetCollection es_publicada_por = new base_de_datos.NoticiaSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_EDITOR_ES_PUBLICADA_POR, base_de_datos.ORMConstants.KEY_NOTICIA_PUBLICA, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setEs_ordenada(base_de_datos.Portada value) {
		if (this.es_ordenada != value) {
			base_de_datos.Portada les_ordenada = this.es_ordenada;
			this.es_ordenada = value;
			if (value != null) {
				es_ordenada.setOrdena(this);
			}
			if (les_ordenada != null && les_ordenada.getOrdena() == this) {
				les_ordenada.setOrdena(null);
			}
		}
	}
	
	public base_de_datos.Portada getEs_ordenada() {
		return es_ordenada;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
