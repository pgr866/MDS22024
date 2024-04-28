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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class IdentificadoCriteria extends AbstractORMCriteria {
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
	
	public IdentificadoCriteria(Criteria criteria) {
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
		es_valorado_positiva = new CollectionExpression("ORM_es_valorado_positiva", this);
		es_valorado_negativa = new CollectionExpression("ORM_es_valorado_negativa", this);
		es_valorada_positiva_por = new CollectionExpression("ORM_es_valorada_positiva_por", this);
		es_valorada_negativa_por = new CollectionExpression("ORM_es_valorada_negativa_por", this);
	}
	
	public IdentificadoCriteria(PersistentSession session) {
		this(session.createCriteria(Identificado.class));
	}
	
	public IdentificadoCriteria() throws PersistentException {
		this(MDS12324PFFornielesGomezPersistentManager.instance().getSession());
	}
	
	public ComentarioCriteria createPertenece_a_identificadoCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_pertenece_a_identificado"));
	}
	
	public ComentarioCriteria createEs_valorado_positivaCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_es_valorado_positiva"));
	}
	
	public ComentarioCriteria createEs_valorado_negativaCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_es_valorado_negativa"));
	}
	
	public NoticiaCriteria createEs_valorada_positiva_porCriteria() {
		return new NoticiaCriteria(createCriteria("ORM_es_valorada_positiva_por"));
	}
	
	public NoticiaCriteria createEs_valorada_negativa_porCriteria() {
		return new NoticiaCriteria(createCriteria("ORM_es_valorada_negativa_por"));
	}
	
	public Identificado uniqueIdentificado() {
		return (Identificado) super.uniqueResult();
	}
	
	public Identificado[] listIdentificado() {
		java.util.List list = super.list();
		return (Identificado[]) list.toArray(new Identificado[list.size()]);
	}
}

