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

public class TematicaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_tematica;
	public final StringExpression titulo_tematica;
	public final CollectionExpression seccion_contiene_tematicas;
	public final CollectionExpression contiene;
	
	public TematicaDetachedCriteria() {
		super(base_de_datos.Tematica.class, base_de_datos.TematicaCriteria.class);
		id_tematica = new IntegerExpression("id_tematica", this.getDetachedCriteria());
		titulo_tematica = new StringExpression("titulo_tematica", this.getDetachedCriteria());
		seccion_contiene_tematicas = new CollectionExpression("ORM_seccion_contiene_tematicas", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
	}
	
	public TematicaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.TematicaCriteria.class);
		id_tematica = new IntegerExpression("id_tematica", this.getDetachedCriteria());
		titulo_tematica = new StringExpression("titulo_tematica", this.getDetachedCriteria());
		seccion_contiene_tematicas = new CollectionExpression("ORM_seccion_contiene_tematicas", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
	}
	
	public base_de_datos.SeccionDetachedCriteria createSeccion_contiene_tematicasCriteria() {
		return new base_de_datos.SeccionDetachedCriteria(createCriteria("ORM_seccion_contiene_tematicas"));
	}
	
	public base_de_datos.NoticiaDetachedCriteria createContieneCriteria() {
		return new base_de_datos.NoticiaDetachedCriteria(createCriteria("ORM_contiene"));
	}
	
	public Tematica uniqueTematica(PersistentSession session) {
		return (Tematica) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tematica[] listTematica(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tematica[]) list.toArray(new Tematica[list.size()]);
	}
}

