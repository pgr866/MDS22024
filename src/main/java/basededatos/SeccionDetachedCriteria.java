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

public class SeccionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_seccion;
	public final IntegerExpression eliminaId;
	public final AssociationExpression elimina;
	public final IntegerExpression creaId;
	public final AssociationExpression crea;
	public final StringExpression titulo_seccion;
	public final CollectionExpression aparece_en;
	public final CollectionExpression pertenece_a_seccion;
	
	public SeccionDetachedCriteria() {
		super(basededatos.Seccion.class, basededatos.SeccionCriteria.class);
		id_seccion = new IntegerExpression("id_seccion", this.getDetachedCriteria());
		eliminaId = new IntegerExpression("elimina.", this.getDetachedCriteria());
		elimina = new AssociationExpression("elimina", this.getDetachedCriteria());
		creaId = new IntegerExpression("crea.", this.getDetachedCriteria());
		crea = new AssociationExpression("crea", this.getDetachedCriteria());
		titulo_seccion = new StringExpression("titulo_seccion", this.getDetachedCriteria());
		aparece_en = new CollectionExpression("ORM_aparece_en", this.getDetachedCriteria());
		pertenece_a_seccion = new CollectionExpression("ORM_pertenece_a_seccion", this.getDetachedCriteria());
	}
	
	public SeccionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.SeccionCriteria.class);
		id_seccion = new IntegerExpression("id_seccion", this.getDetachedCriteria());
		eliminaId = new IntegerExpression("elimina.", this.getDetachedCriteria());
		elimina = new AssociationExpression("elimina", this.getDetachedCriteria());
		creaId = new IntegerExpression("crea.", this.getDetachedCriteria());
		crea = new AssociationExpression("crea", this.getDetachedCriteria());
		titulo_seccion = new StringExpression("titulo_seccion", this.getDetachedCriteria());
		aparece_en = new CollectionExpression("ORM_aparece_en", this.getDetachedCriteria());
		pertenece_a_seccion = new CollectionExpression("ORM_pertenece_a_seccion", this.getDetachedCriteria());
	}
	
	public EditorDetachedCriteria createEliminaCriteria() {
		return new EditorDetachedCriteria(createCriteria("elimina"));
	}
	
	public EditorDetachedCriteria createCreaCriteria() {
		return new EditorDetachedCriteria(createCriteria("crea"));
	}
	
	public basededatos.NoticiaDetachedCriteria createAparece_enCriteria() {
		return new basededatos.NoticiaDetachedCriteria(createCriteria("ORM_aparece_en"));
	}
	
	public basededatos.TematicaDetachedCriteria createPertenece_a_seccionCriteria() {
		return new basededatos.TematicaDetachedCriteria(createCriteria("ORM_pertenece_a_seccion"));
	}
	
	public Seccion uniqueSeccion(PersistentSession session) {
		return (Seccion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Seccion[] listSeccion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

