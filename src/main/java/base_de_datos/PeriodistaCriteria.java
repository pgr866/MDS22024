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

public class PeriodistaCriteria extends AbstractORMCriteria {
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
	public final BooleanExpression esEliminado;
	public final IntegerExpression es_creadaId;
	public final AssociationExpression es_creada;
	
	public PeriodistaCriteria(Criteria criteria) {
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
		esEliminado = new BooleanExpression("esEliminado", this);
		es_creadaId = new IntegerExpression("es_creada.", this);
		es_creada = new AssociationExpression("es_creada", this);
	}
	
	public PeriodistaCriteria(PersistentSession session) {
		this(session.createCriteria(Periodista.class));
	}
	
	public PeriodistaCriteria() throws PersistentException {
		this(base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession());
	}
	
	public NoticiaCriteria createEs_creadaCriteria() {
		return new NoticiaCriteria(createCriteria("es_creada"));
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
	
	public Periodista uniquePeriodista() {
		return (Periodista) super.uniqueResult();
	}
	
	public Periodista[] listPeriodista() {
		java.util.List list = super.list();
		return (Periodista[]) list.toArray(new Periodista[list.size()]);
	}
}

