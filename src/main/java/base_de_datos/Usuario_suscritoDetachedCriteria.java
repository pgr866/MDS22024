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

public class Usuario_suscritoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public Usuario_suscritoDetachedCriteria() {
		super(base_de_datos.Usuario_suscrito.class, base_de_datos.Usuario_suscritoCriteria.class);
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
		es_valorado_por = new CollectionExpression("ORM_es_valorado_por", this.getDetachedCriteria());
		es_valorada_por = new CollectionExpression("ORM_es_valorada_por", this.getDetachedCriteria());
		num_tarjeta = new StringExpression("num_tarjeta", this.getDetachedCriteria());
	}
	
	public Usuario_suscritoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.Usuario_suscritoCriteria.class);
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
		es_valorado_por = new CollectionExpression("ORM_es_valorado_por", this.getDetachedCriteria());
		es_valorada_por = new CollectionExpression("ORM_es_valorada_por", this.getDetachedCriteria());
		num_tarjeta = new StringExpression("num_tarjeta", this.getDetachedCriteria());
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
	
	public Usuario_suscrito uniqueUsuario_suscrito(PersistentSession session) {
		return (Usuario_suscrito) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario_suscrito[] listUsuario_suscrito(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario_suscrito[]) list.toArray(new Usuario_suscrito[list.size()]);
	}
}

