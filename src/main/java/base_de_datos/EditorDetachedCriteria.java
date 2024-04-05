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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EditorDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final StringExpression es_ordenadaId;
	public final AssociationExpression es_ordenada;
	
	public EditorDetachedCriteria() {
		super(base_de_datos.Editor.class, base_de_datos.EditorCriteria.class);
		dni = new StringExpression("dni", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		nick_apodo = new StringExpression("nick_apodo", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		fecha_nacimiento = new StringExpression("fecha_nacimiento", this.getDetachedCriteria());
		telefono = new IntegerExpression("telefono", this.getDetachedCriteria());
		url_foto_perfil = new StringExpression("url_foto_perfil", this.getDetachedCriteria());
		pertenece_a_identificado = new CollectionExpression("ORM_pertenece_a_identificado", this.getDetachedCriteria());
		es_valorado_por = new CollectionExpression("ORM_es_valorado_por", this.getDetachedCriteria());
		es_valorada_por = new CollectionExpression("ORM_es_valorada_por", this.getDetachedCriteria());
		es_eliminado_por = new CollectionExpression("ORM_es_eliminado_por", this.getDetachedCriteria());
		es_eliminada_por_editor = new CollectionExpression("ORM_es_eliminada_por_editor", this.getDetachedCriteria());
		es_creada_por = new CollectionExpression("ORM_es_creada_por", this.getDetachedCriteria());
		es_eliminada_por = new CollectionExpression("ORM_es_eliminada_por", this.getDetachedCriteria());
		es_publicada_por = new CollectionExpression("ORM_es_publicada_por", this.getDetachedCriteria());
		es_ordenadaId = new StringExpression("es_ordenada.dni", this.getDetachedCriteria());
		es_ordenada = new AssociationExpression("es_ordenada", this.getDetachedCriteria());
	}
	
	public EditorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.EditorCriteria.class);
		dni = new StringExpression("dni", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		nick_apodo = new StringExpression("nick_apodo", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		fecha_nacimiento = new StringExpression("fecha_nacimiento", this.getDetachedCriteria());
		telefono = new IntegerExpression("telefono", this.getDetachedCriteria());
		url_foto_perfil = new StringExpression("url_foto_perfil", this.getDetachedCriteria());
		pertenece_a_identificado = new CollectionExpression("ORM_pertenece_a_identificado", this.getDetachedCriteria());
		es_valorado_por = new CollectionExpression("ORM_es_valorado_por", this.getDetachedCriteria());
		es_valorada_por = new CollectionExpression("ORM_es_valorada_por", this.getDetachedCriteria());
		es_eliminado_por = new CollectionExpression("ORM_es_eliminado_por", this.getDetachedCriteria());
		es_eliminada_por_editor = new CollectionExpression("ORM_es_eliminada_por_editor", this.getDetachedCriteria());
		es_creada_por = new CollectionExpression("ORM_es_creada_por", this.getDetachedCriteria());
		es_eliminada_por = new CollectionExpression("ORM_es_eliminada_por", this.getDetachedCriteria());
		es_publicada_por = new CollectionExpression("ORM_es_publicada_por", this.getDetachedCriteria());
		es_ordenadaId = new StringExpression("es_ordenada.dni", this.getDetachedCriteria());
		es_ordenada = new AssociationExpression("es_ordenada", this.getDetachedCriteria());
	}
	
	public base_de_datos.ComentarioDetachedCriteria createEs_eliminado_porCriteria() {
		return new base_de_datos.ComentarioDetachedCriteria(createCriteria("ORM_es_eliminado_por"));
	}
	
	public base_de_datos.NoticiaDetachedCriteria createEs_eliminada_por_editorCriteria() {
		return new base_de_datos.NoticiaDetachedCriteria(createCriteria("ORM_es_eliminada_por_editor"));
	}
	
	public base_de_datos.SeccionDetachedCriteria createEs_creada_porCriteria() {
		return new base_de_datos.SeccionDetachedCriteria(createCriteria("ORM_es_creada_por"));
	}
	
	public base_de_datos.SeccionDetachedCriteria createEs_eliminada_porCriteria() {
		return new base_de_datos.SeccionDetachedCriteria(createCriteria("ORM_es_eliminada_por"));
	}
	
	public base_de_datos.NoticiaDetachedCriteria createEs_publicada_porCriteria() {
		return new base_de_datos.NoticiaDetachedCriteria(createCriteria("ORM_es_publicada_por"));
	}
	
	public PortadaDetachedCriteria createEs_ordenadaCriteria() {
		return new PortadaDetachedCriteria(createCriteria("es_ordenada"));
	}
	
	public base_de_datos.ComentarioDetachedCriteria createPertenece_a_identificadoCriteria() {
		return new base_de_datos.ComentarioDetachedCriteria(createCriteria("ORM_pertenece_a_identificado"));
	}
	
	public base_de_datos.ComentarioDetachedCriteria createEs_valorado_porCriteria() {
		return new base_de_datos.ComentarioDetachedCriteria(createCriteria("ORM_es_valorado_por"));
	}
	
	public base_de_datos.NoticiaDetachedCriteria createEs_valorada_porCriteria() {
		return new base_de_datos.NoticiaDetachedCriteria(createCriteria("ORM_es_valorada_por"));
	}
	
	public Editor uniqueEditor(PersistentSession session) {
		return (Editor) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Editor[] listEditor(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Editor[]) list.toArray(new Editor[list.size()]);
	}
}

