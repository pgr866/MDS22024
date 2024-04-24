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

public class TematicaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_tematica;
	public final StringExpression titulo_tematica;
	public final CollectionExpression seccion_contiene_tematicas;
	public final CollectionExpression contiene;
	
	public TematicaCriteria(Criteria criteria) {
		super(criteria);
		id_tematica = new IntegerExpression("id_tematica", this);
		titulo_tematica = new StringExpression("titulo_tematica", this);
		seccion_contiene_tematicas = new CollectionExpression("ORM_seccion_contiene_tematicas", this);
		contiene = new CollectionExpression("ORM_contiene", this);
	}
	
	public TematicaCriteria(PersistentSession session) {
		this(session.createCriteria(Tematica.class));
	}
	
	public TematicaCriteria() throws PersistentException {
		this(basededatos.MDS12324PFFornielesGomezPersistentManager.instance().getSession());
	}
	
	public basededatos.SeccionCriteria createSeccion_contiene_tematicasCriteria() {
		return new basededatos.SeccionCriteria(createCriteria("ORM_seccion_contiene_tematicas"));
	}
	
	public basededatos.NoticiaCriteria createContieneCriteria() {
		return new basededatos.NoticiaCriteria(createCriteria("ORM_contiene"));
	}
	
	public Tematica uniqueTematica() {
		return (Tematica) super.uniqueResult();
	}
	
	public Tematica[] listTematica() {
		java.util.List list = super.list();
		return (Tematica[]) list.toArray(new Tematica[list.size()]);
	}
}

