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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class EditorDAO {
	public static Editor loadEditorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadEditorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor getEditorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getEditorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadEditorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor getEditorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return getEditorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Editor) session.load(basededatos.Editor.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor getEditorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Editor) session.get(basededatos.Editor.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Editor) session.load(basededatos.Editor.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor getEditorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Editor) session.get(basededatos.Editor.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEditor(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryEditor(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEditor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return queryEditor(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor[] listEditorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listEditorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor[] listEditorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return listEditorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEditor(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Editor as Editor");
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
		StringBuffer sb = new StringBuffer("From basededatos.Editor as Editor");
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
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return loadEditorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Editor loadEditorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
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
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateEditorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEditorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12324PFFornielesGomezPersistentManager.instance().getSession();
			return iterateEditorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEditorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Editor as Editor");
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
		StringBuffer sb = new StringBuffer("From basededatos.Editor as Editor");
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
	
	public static Editor createEditor() {
		return new basededatos.Editor();
	}
	
	public static boolean save(basededatos.Editor editor) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().saveObject(editor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Editor editor) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().deleteObject(editor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Editor editor)throws PersistentException {
		try {
			basededatos.Comentario[] lEs_eliminado_pors = editor.es_eliminado_por.toArray();
			for(int i = 0; i < lEs_eliminado_pors.length; i++) {
				lEs_eliminado_pors[i].setElimina_comentario(null);
			}
			basededatos.Noticia[] lNoticia_es_eliminada_por_s = editor.noticia_es_eliminada_por_.toArray();
			for(int i = 0; i < lNoticia_es_eliminada_por_s.length; i++) {
				lNoticia_es_eliminada_por_s[i].setElimina_noticia(null);
			}
			basededatos.Seccion[] lEs_creada_pors = editor.es_creada_por.toArray();
			for(int i = 0; i < lEs_creada_pors.length; i++) {
				lEs_creada_pors[i].setCrea_seccion(null);
			}
			basededatos.Seccion[] lEs_eliminada_pors = editor.es_eliminada_por.toArray();
			for(int i = 0; i < lEs_eliminada_pors.length; i++) {
				lEs_eliminada_pors[i].setElimina(null);
			}
			basededatos.Noticia[] lEs_publicada_pors = editor.es_publicada_por.toArray();
			for(int i = 0; i < lEs_publicada_pors.length; i++) {
				lEs_publicada_pors[i].setPublica(null);
			}
			if (editor.getEs_ordenada() != null) {
				editor.getEs_ordenada().setOrdena(null);
			}
			
			basededatos.Periodista[] lEs_dado_de_altas = editor.es_dado_de_alta.toArray();
			for(int i = 0; i < lEs_dado_de_altas.length; i++) {
				lEs_dado_de_altas[i].setDa_de_alta(null);
			}
			basededatos.Periodista[] lEs_dado_de_bajas = editor.es_dado_de_baja.toArray();
			for(int i = 0; i < lEs_dado_de_bajas.length; i++) {
				lEs_dado_de_bajas[i].setDa_de_baja(null);
			}
			basededatos.Comentario[] lPertenece_a_identificados = editor.pertenece_a_identificado.toArray();
			for(int i = 0; i < lPertenece_a_identificados.length; i++) {
				lPertenece_a_identificados[i].setEscribe(null);
			}
			basededatos.Comentario[] lEs_valorado_positivas = editor.es_valorado_positiva.toArray();
			for(int i = 0; i < lEs_valorado_positivas.length; i++) {
				lEs_valorado_positivas[i].valora_positivamente.remove(editor);
			}
			basededatos.Comentario[] lEs_valorado_negativas = editor.es_valorado_negativa.toArray();
			for(int i = 0; i < lEs_valorado_negativas.length; i++) {
				lEs_valorado_negativas[i].valora_negativamente.remove(editor);
			}
			basededatos.Noticia[] lEs_valorada_positiva_pors = editor.es_valorada_positiva_por.toArray();
			for(int i = 0; i < lEs_valorada_positiva_pors.length; i++) {
				lEs_valorada_positiva_pors[i].valora_positiva.remove(editor);
			}
			basededatos.Noticia[] lEs_valorada_negativa_pors = editor.es_valorada_negativa_por.toArray();
			for(int i = 0; i < lEs_valorada_negativa_pors.length; i++) {
				lEs_valorada_negativa_pors[i].valora_negativa.remove(editor);
			}
			return delete(editor);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Editor editor, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Comentario[] lEs_eliminado_pors = editor.es_eliminado_por.toArray();
			for(int i = 0; i < lEs_eliminado_pors.length; i++) {
				lEs_eliminado_pors[i].setElimina_comentario(null);
			}
			basededatos.Noticia[] lNoticia_es_eliminada_por_s = editor.noticia_es_eliminada_por_.toArray();
			for(int i = 0; i < lNoticia_es_eliminada_por_s.length; i++) {
				lNoticia_es_eliminada_por_s[i].setElimina_noticia(null);
			}
			basededatos.Seccion[] lEs_creada_pors = editor.es_creada_por.toArray();
			for(int i = 0; i < lEs_creada_pors.length; i++) {
				lEs_creada_pors[i].setCrea_seccion(null);
			}
			basededatos.Seccion[] lEs_eliminada_pors = editor.es_eliminada_por.toArray();
			for(int i = 0; i < lEs_eliminada_pors.length; i++) {
				lEs_eliminada_pors[i].setElimina(null);
			}
			basededatos.Noticia[] lEs_publicada_pors = editor.es_publicada_por.toArray();
			for(int i = 0; i < lEs_publicada_pors.length; i++) {
				lEs_publicada_pors[i].setPublica(null);
			}
			if (editor.getEs_ordenada() != null) {
				editor.getEs_ordenada().setOrdena(null);
			}
			
			basededatos.Periodista[] lEs_dado_de_altas = editor.es_dado_de_alta.toArray();
			for(int i = 0; i < lEs_dado_de_altas.length; i++) {
				lEs_dado_de_altas[i].setDa_de_alta(null);
			}
			basededatos.Periodista[] lEs_dado_de_bajas = editor.es_dado_de_baja.toArray();
			for(int i = 0; i < lEs_dado_de_bajas.length; i++) {
				lEs_dado_de_bajas[i].setDa_de_baja(null);
			}
			basededatos.Comentario[] lPertenece_a_identificados = editor.pertenece_a_identificado.toArray();
			for(int i = 0; i < lPertenece_a_identificados.length; i++) {
				lPertenece_a_identificados[i].setEscribe(null);
			}
			basededatos.Comentario[] lEs_valorado_positivas = editor.es_valorado_positiva.toArray();
			for(int i = 0; i < lEs_valorado_positivas.length; i++) {
				lEs_valorado_positivas[i].valora_positivamente.remove(editor);
			}
			basededatos.Comentario[] lEs_valorado_negativas = editor.es_valorado_negativa.toArray();
			for(int i = 0; i < lEs_valorado_negativas.length; i++) {
				lEs_valorado_negativas[i].valora_negativamente.remove(editor);
			}
			basededatos.Noticia[] lEs_valorada_positiva_pors = editor.es_valorada_positiva_por.toArray();
			for(int i = 0; i < lEs_valorada_positiva_pors.length; i++) {
				lEs_valorada_positiva_pors[i].valora_positiva.remove(editor);
			}
			basededatos.Noticia[] lEs_valorada_negativa_pors = editor.es_valorada_negativa_por.toArray();
			for(int i = 0; i < lEs_valorada_negativa_pors.length; i++) {
				lEs_valorada_negativa_pors[i].valora_negativa.remove(editor);
			}
			try {
				session.delete(editor);
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
	
	public static boolean refresh(basededatos.Editor editor) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().getSession().refresh(editor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Editor editor) throws PersistentException {
		try {
			MDS12324PFFornielesGomezPersistentManager.instance().getSession().evict(editor);
			return true;
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
}
