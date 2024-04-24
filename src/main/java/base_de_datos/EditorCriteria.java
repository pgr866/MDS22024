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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EditorCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression dni;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression nick_apodo;
	public final StringExpression email;
	public final StringExpression contrasena;
	public final StringExpression fecha_nacimiento;
	public final IntegerExpression telefono;
	public final StringExpression url_foto_perfil;
	public final CollectionExpression pertenece_a_identificado;
	public final CollectionExpression es_valorado_por;
	public final CollectionExpression es_valorada_por;
	public final CollectionExpression es_eliminado_por;
	public final CollectionExpression es_eliminada_por_editor;
	public final CollectionExpression es_creada_por;
	public final CollectionExpression es_eliminada_por;
	public final CollectionExpression es_publicada_por;
	public final IntegerExpression es_ordenadaId;
	public final AssociationExpression es_ordenada;
	
	public EditorCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		dni = new StringExpression("dni", this);
		nombre = new StringExpression("nombre", this);
		apellidos = new StringExpression("apellidos", this);
		nick_apodo = new StringExpression("nick_apodo", this);
		email = new StringExpression("email", this);
		contrasena = new StringExpression("contrasena", this);
		fecha_nacimiento = new StringExpression("fecha_nacimiento", this);
		telefono = new IntegerExpression("telefono", this);
		url_foto_perfil = new StringExpression("url_foto_perfil", this);
		pertenece_a_identificado = new CollectionExpression("ORM_pertenece_a_identificado", this);
		es_valorado_por = new CollectionExpression("ORM_es_valorado_por", this);
		es_valorada_por = new CollectionExpression("ORM_es_valorada_por", this);
		es_eliminado_por = new CollectionExpression("ORM_es_eliminado_por", this);
		es_eliminada_por_editor = new CollectionExpression("ORM_es_eliminada_por_editor", this);
		es_creada_por = new CollectionExpression("ORM_es_creada_por", this);
		es_eliminada_por = new CollectionExpression("ORM_es_eliminada_por", this);
		es_publicada_por = new CollectionExpression("ORM_es_publicada_por", this);
		es_ordenadaId = new IntegerExpression("es_ordenada.", this);
		es_ordenada = new AssociationExpression("es_ordenada", this);
	}
	
	public EditorCriteria(PersistentSession session) {
		this(session.createCriteria(Editor.class));
	}
	
	public EditorCriteria() throws PersistentException {
		this(base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession());
	}
	
	public base_de_datos.ComentarioCriteria createEs_eliminado_porCriteria() {
		return new base_de_datos.ComentarioCriteria(createCriteria("ORM_es_eliminado_por"));
	}
	
	public base_de_datos.NoticiaCriteria createEs_eliminada_por_editorCriteria() {
		return new base_de_datos.NoticiaCriteria(createCriteria("ORM_es_eliminada_por_editor"));
	}
	
	public base_de_datos.SeccionCriteria createEs_creada_porCriteria() {
		return new base_de_datos.SeccionCriteria(createCriteria("ORM_es_creada_por"));
	}
	
	public base_de_datos.SeccionCriteria createEs_eliminada_porCriteria() {
		return new base_de_datos.SeccionCriteria(createCriteria("ORM_es_eliminada_por"));
	}
	
	public base_de_datos.NoticiaCriteria createEs_publicada_porCriteria() {
		return new base_de_datos.NoticiaCriteria(createCriteria("ORM_es_publicada_por"));
	}
	
	public PortadaCriteria createEs_ordenadaCriteria() {
		return new PortadaCriteria(createCriteria("es_ordenada"));
	}
	
	public base_de_datos.ComentarioCriteria createPertenece_a_identificadoCriteria() {
		return new base_de_datos.ComentarioCriteria(createCriteria("ORM_pertenece_a_identificado"));
	}
	
	public base_de_datos.ComentarioCriteria createEs_valorado_porCriteria() {
		return new base_de_datos.ComentarioCriteria(createCriteria("ORM_es_valorado_por"));
	}
	
	public base_de_datos.NoticiaCriteria createEs_valorada_porCriteria() {
		return new base_de_datos.NoticiaCriteria(createCriteria("ORM_es_valorada_por"));
	}
	
	public Editor uniqueEditor() {
		return (Editor) super.uniqueResult();
	}
	
	public Editor[] listEditor() {
		java.util.List list = super.list();
		return (Editor[]) list.toArray(new Editor[list.size()]);
	}
}

