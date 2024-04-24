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

public class SeccionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_seccion;
	public final IntegerExpression eliminaId;
	public final AssociationExpression elimina;
	public final IntegerExpression creaId;
	public final AssociationExpression crea;
	public final StringExpression titulo_seccion;
	public final CollectionExpression aparece_en;
	public final CollectionExpression pertenece_a_seccion;
	
	public SeccionCriteria(Criteria criteria) {
		super(criteria);
		id_seccion = new IntegerExpression("id_seccion", this);
		eliminaId = new IntegerExpression("elimina.", this);
		elimina = new AssociationExpression("elimina", this);
		creaId = new IntegerExpression("crea.", this);
		crea = new AssociationExpression("crea", this);
		titulo_seccion = new StringExpression("titulo_seccion", this);
		aparece_en = new CollectionExpression("ORM_aparece_en", this);
		pertenece_a_seccion = new CollectionExpression("ORM_pertenece_a_seccion", this);
	}
	
	public SeccionCriteria(PersistentSession session) {
		this(session.createCriteria(Seccion.class));
	}
	
	public SeccionCriteria() throws PersistentException {
		this(base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession());
	}
	
	public EditorCriteria createEliminaCriteria() {
		return new EditorCriteria(createCriteria("elimina"));
	}
	
	public EditorCriteria createCreaCriteria() {
		return new EditorCriteria(createCriteria("crea"));
	}
	
	public base_de_datos.NoticiaCriteria createAparece_enCriteria() {
		return new base_de_datos.NoticiaCriteria(createCriteria("ORM_aparece_en"));
	}
	
	public base_de_datos.TematicaCriteria createPertenece_a_seccionCriteria() {
		return new base_de_datos.TematicaCriteria(createCriteria("ORM_pertenece_a_seccion"));
	}
	
	public Seccion uniqueSeccion() {
		return (Seccion) super.uniqueResult();
	}
	
	public Seccion[] listSeccion() {
		java.util.List list = super.list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

