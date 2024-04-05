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

public class PeriodistaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final BooleanExpression esEliminado;
	public final StringExpression es_creadaId;
	public final AssociationExpression es_creada;
	
	public PeriodistaDetachedCriteria() {
		super(base_de_datos.Periodista.class, base_de_datos.PeriodistaCriteria.class);
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
		esEliminado = new BooleanExpression("esEliminado", this.getDetachedCriteria());
		es_creadaId = new StringExpression("es_creada.dni", this.getDetachedCriteria());
		es_creada = new AssociationExpression("es_creada", this.getDetachedCriteria());
	}
	
	public PeriodistaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.PeriodistaCriteria.class);
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
		esEliminado = new BooleanExpression("esEliminado", this.getDetachedCriteria());
		es_creadaId = new StringExpression("es_creada.dni", this.getDetachedCriteria());
		es_creada = new AssociationExpression("es_creada", this.getDetachedCriteria());
	}
	
	public NoticiaDetachedCriteria createEs_creadaCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("es_creada"));
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
	
	public Periodista uniquePeriodista(PersistentSession session) {
		return (Periodista) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Periodista[] listPeriodista(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Periodista[]) list.toArray(new Periodista[list.size()]);
	}
}

