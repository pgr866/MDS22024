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

public class Usuario_suscritoCriteria extends AbstractORMCriteria {
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
	public final StringExpression num_tarjeta;
	
	public Usuario_suscritoCriteria(Criteria criteria) {
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
		num_tarjeta = new StringExpression("num_tarjeta", this);
	}
	
	public Usuario_suscritoCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario_suscrito.class));
	}
	
	public Usuario_suscritoCriteria() throws PersistentException {
		this(basededatos.MDS12324PFFornielesGomezPersistentManager.instance().getSession());
	}
	
	public basededatos.ComentarioCriteria createPertenece_a_identificadoCriteria() {
		return new basededatos.ComentarioCriteria(createCriteria("ORM_pertenece_a_identificado"));
	}
	
	public basededatos.ComentarioCriteria createEs_valorado_porCriteria() {
		return new basededatos.ComentarioCriteria(createCriteria("ORM_es_valorado_por"));
	}
	
	public basededatos.NoticiaCriteria createEs_valorada_porCriteria() {
		return new basededatos.NoticiaCriteria(createCriteria("ORM_es_valorada_por"));
	}
	
	public Usuario_suscrito uniqueUsuario_suscrito() {
		return (Usuario_suscrito) super.uniqueResult();
	}
	
	public Usuario_suscrito[] listUsuario_suscrito() {
		java.util.List list = super.list();
		return (Usuario_suscrito[]) list.toArray(new Usuario_suscrito[list.size()]);
	}
}

