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

public class TematicaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_tematica;
	public final StringExpression titulo_tematica;
	public final CollectionExpression contiene;
	
	public TematicaDetachedCriteria() {
		super(basededatos.Tematica.class, basededatos.TematicaCriteria.class);
		id_tematica = new IntegerExpression("id_tematica", this.getDetachedCriteria());
		titulo_tematica = new StringExpression("titulo_tematica", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
	}
	
	public TematicaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.TematicaCriteria.class);
		id_tematica = new IntegerExpression("id_tematica", this.getDetachedCriteria());
		titulo_tematica = new StringExpression("titulo_tematica", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
	}
	
	public NoticiaDetachedCriteria createContieneCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("ORM_contiene"));
	}
	
	public Tematica uniqueTematica(PersistentSession session) {
		return (Tematica) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tematica[] listTematica(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tematica[]) list.toArray(new Tematica[list.size()]);
	}
}

