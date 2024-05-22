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

public class SeccionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_seccion;
	public final IntegerExpression eliminaId;
	public final AssociationExpression elimina;
	public final IntegerExpression crea_seccionId;
	public final AssociationExpression crea_seccion;
	public final StringExpression titulo_seccion;
	public final CollectionExpression aparece_en;
	
	public SeccionCriteria(Criteria criteria) {
		super(criteria);
		id_seccion = new IntegerExpression("id_seccion", this);
		eliminaId = new IntegerExpression("elimina.", this);
		elimina = new AssociationExpression("elimina", this);
		crea_seccionId = new IntegerExpression("crea_seccion.", this);
		crea_seccion = new AssociationExpression("crea_seccion", this);
		titulo_seccion = new StringExpression("titulo_seccion", this);
		aparece_en = new CollectionExpression("ORM_aparece_en", this);
	}
	
	public SeccionCriteria(PersistentSession session) {
		this(session.createCriteria(Seccion.class));
	}
	
	public SeccionCriteria() throws PersistentException {
		this(MDS12324PFFornielesGomezPersistentManager.instance().getSession());
	}
	
	public EditorCriteria createEliminaCriteria() {
		return new EditorCriteria(createCriteria("elimina"));
	}
	
	public EditorCriteria createCrea_seccionCriteria() {
		return new EditorCriteria(createCriteria("crea_seccion"));
	}
	
	public NoticiaCriteria createAparece_enCriteria() {
		return new NoticiaCriteria(createCriteria("ORM_aparece_en"));
	}
	
	public Seccion uniqueSeccion() {
		return (Seccion) super.uniqueResult();
	}
	
	public Seccion[] listSeccion() {
		java.util.List list = super.list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

