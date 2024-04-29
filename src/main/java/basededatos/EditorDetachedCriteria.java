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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EditorDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final CollectionExpression es_valorado_positiva;
	public final CollectionExpression es_valorado_negativa;
	public final CollectionExpression es_valorada_positiva_por;
	public final CollectionExpression es_valorada_negativa_por;
	public final CollectionExpression es_eliminado_por;
	public final CollectionExpression noticia_es_eliminada_por_;
	public final CollectionExpression es_creada_por;
	public final CollectionExpression es_eliminada_por;
	public final CollectionExpression es_publicada_por;
	public final IntegerExpression es_ordenadaId;
	public final AssociationExpression es_ordenada;
	public final CollectionExpression es_dado_de_alta;
	public final CollectionExpression es_dado_de_baja;
	
	public EditorDetachedCriteria() {
		super(basededatos.Editor.class, basededatos.EditorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
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
		es_valorado_positiva = new CollectionExpression("ORM_es_valorado_positiva", this.getDetachedCriteria());
		es_valorado_negativa = new CollectionExpression("ORM_es_valorado_negativa", this.getDetachedCriteria());
		es_valorada_positiva_por = new CollectionExpression("ORM_es_valorada_positiva_por", this.getDetachedCriteria());
		es_valorada_negativa_por = new CollectionExpression("ORM_es_valorada_negativa_por", this.getDetachedCriteria());
		es_eliminado_por = new CollectionExpression("ORM_es_eliminado_por", this.getDetachedCriteria());
		noticia_es_eliminada_por_ = new CollectionExpression("ORM_noticia_es_eliminada_por_", this.getDetachedCriteria());
		es_creada_por = new CollectionExpression("ORM_es_creada_por", this.getDetachedCriteria());
		es_eliminada_por = new CollectionExpression("ORM_es_eliminada_por", this.getDetachedCriteria());
		es_publicada_por = new CollectionExpression("ORM_es_publicada_por", this.getDetachedCriteria());
		es_ordenadaId = new IntegerExpression("es_ordenada.", this.getDetachedCriteria());
		es_ordenada = new AssociationExpression("es_ordenada", this.getDetachedCriteria());
		es_dado_de_alta = new CollectionExpression("ORM_es_dado_de_alta", this.getDetachedCriteria());
		es_dado_de_baja = new CollectionExpression("ORM_es_dado_de_baja", this.getDetachedCriteria());
	}
	
	public EditorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.EditorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
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
		es_valorado_positiva = new CollectionExpression("ORM_es_valorado_positiva", this.getDetachedCriteria());
		es_valorado_negativa = new CollectionExpression("ORM_es_valorado_negativa", this.getDetachedCriteria());
		es_valorada_positiva_por = new CollectionExpression("ORM_es_valorada_positiva_por", this.getDetachedCriteria());
		es_valorada_negativa_por = new CollectionExpression("ORM_es_valorada_negativa_por", this.getDetachedCriteria());
		es_eliminado_por = new CollectionExpression("ORM_es_eliminado_por", this.getDetachedCriteria());
		noticia_es_eliminada_por_ = new CollectionExpression("ORM_noticia_es_eliminada_por_", this.getDetachedCriteria());
		es_creada_por = new CollectionExpression("ORM_es_creada_por", this.getDetachedCriteria());
		es_eliminada_por = new CollectionExpression("ORM_es_eliminada_por", this.getDetachedCriteria());
		es_publicada_por = new CollectionExpression("ORM_es_publicada_por", this.getDetachedCriteria());
		es_ordenadaId = new IntegerExpression("es_ordenada.", this.getDetachedCriteria());
		es_ordenada = new AssociationExpression("es_ordenada", this.getDetachedCriteria());
		es_dado_de_alta = new CollectionExpression("ORM_es_dado_de_alta", this.getDetachedCriteria());
		es_dado_de_baja = new CollectionExpression("ORM_es_dado_de_baja", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria createEs_eliminado_porCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_es_eliminado_por"));
	}
	
	public NoticiaDetachedCriteria createNoticia_es_eliminada_por_Criteria() {
		return new NoticiaDetachedCriteria(createCriteria("ORM_noticia_es_eliminada_por_"));
	}
	
	public SeccionDetachedCriteria createEs_creada_porCriteria() {
		return new SeccionDetachedCriteria(createCriteria("ORM_es_creada_por"));
	}
	
	public SeccionDetachedCriteria createEs_eliminada_porCriteria() {
		return new SeccionDetachedCriteria(createCriteria("ORM_es_eliminada_por"));
	}
	
	public NoticiaDetachedCriteria createEs_publicada_porCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("ORM_es_publicada_por"));
	}
	
	public PortadaDetachedCriteria createEs_ordenadaCriteria() {
		return new PortadaDetachedCriteria(createCriteria("es_ordenada"));
	}
	
	public PeriodistaDetachedCriteria createEs_dado_de_altaCriteria() {
		return new PeriodistaDetachedCriteria(createCriteria("ORM_es_dado_de_alta"));
	}
	
	public PeriodistaDetachedCriteria createEs_dado_de_bajaCriteria() {
		return new PeriodistaDetachedCriteria(createCriteria("ORM_es_dado_de_baja"));
	}
	
	public ComentarioDetachedCriteria createPertenece_a_identificadoCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_pertenece_a_identificado"));
	}
	
	public ComentarioDetachedCriteria createEs_valorado_positivaCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_es_valorado_positiva"));
	}
	
	public ComentarioDetachedCriteria createEs_valorado_negativaCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_es_valorado_negativa"));
	}
	
	public NoticiaDetachedCriteria createEs_valorada_positiva_porCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("ORM_es_valorada_positiva_por"));
	}
	
	public NoticiaDetachedCriteria createEs_valorada_negativa_porCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("ORM_es_valorada_negativa_por"));
	}
	
	public Editor uniqueEditor(PersistentSession session) {
		return (Editor) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Editor[] listEditor(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Editor[]) list.toArray(new Editor[list.size()]);
	}
}

