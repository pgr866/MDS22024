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
		es_valorado_positiva = new CollectionExpression("ORM_es_valorado_positiva", this);
		es_valorado_negativa = new CollectionExpression("ORM_es_valorado_negativa", this);
		es_valorada_positiva_por = new CollectionExpression("ORM_es_valorada_positiva_por", this);
		es_valorada_negativa_por = new CollectionExpression("ORM_es_valorada_negativa_por", this);
		es_eliminado_por = new CollectionExpression("ORM_es_eliminado_por", this);
		noticia_es_eliminada_por_ = new CollectionExpression("ORM_noticia_es_eliminada_por_", this);
		es_creada_por = new CollectionExpression("ORM_es_creada_por", this);
		es_eliminada_por = new CollectionExpression("ORM_es_eliminada_por", this);
		es_publicada_por = new CollectionExpression("ORM_es_publicada_por", this);
		es_ordenadaId = new IntegerExpression("es_ordenada.", this);
		es_ordenada = new AssociationExpression("es_ordenada", this);
		es_dado_de_alta = new CollectionExpression("ORM_es_dado_de_alta", this);
		es_dado_de_baja = new CollectionExpression("ORM_es_dado_de_baja", this);
	}
	
	public EditorCriteria(PersistentSession session) {
		this(session.createCriteria(Editor.class));
	}
	
	public EditorCriteria() throws PersistentException {
		this(MDS12324PFFornielesGomezPersistentManager.instance().getSession());
	}
	
	public ComentarioCriteria createEs_eliminado_porCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_es_eliminado_por"));
	}
	
	public NoticiaCriteria createNoticia_es_eliminada_por_Criteria() {
		return new NoticiaCriteria(createCriteria("ORM_noticia_es_eliminada_por_"));
	}
	
	public SeccionCriteria createEs_creada_porCriteria() {
		return new SeccionCriteria(createCriteria("ORM_es_creada_por"));
	}
	
	public SeccionCriteria createEs_eliminada_porCriteria() {
		return new SeccionCriteria(createCriteria("ORM_es_eliminada_por"));
	}
	
	public NoticiaCriteria createEs_publicada_porCriteria() {
		return new NoticiaCriteria(createCriteria("ORM_es_publicada_por"));
	}
	
	public PortadaCriteria createEs_ordenadaCriteria() {
		return new PortadaCriteria(createCriteria("es_ordenada"));
	}
	
	public PeriodistaCriteria createEs_dado_de_altaCriteria() {
		return new PeriodistaCriteria(createCriteria("ORM_es_dado_de_alta"));
	}
	
	public PeriodistaCriteria createEs_dado_de_bajaCriteria() {
		return new PeriodistaCriteria(createCriteria("ORM_es_dado_de_baja"));
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
	
	public Editor uniqueEditor() {
		return (Editor) super.uniqueResult();
	}
	
	public Editor[] listEditor() {
		java.util.List list = super.list();
		return (Editor[]) list.toArray(new Editor[list.size()]);
	}
}

