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

public class PortadaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_portada;
	public final IntegerExpression ordenaId;
	public final AssociationExpression ordena;
	public final CollectionExpression aparece_en_portada;
	
	public PortadaCriteria(Criteria criteria) {
		super(criteria);
		id_portada = new IntegerExpression("id_portada", this);
		ordenaId = new IntegerExpression("ordena.", this);
		ordena = new AssociationExpression("ordena", this);
		aparece_en_portada = new CollectionExpression("ORM_aparece_en_portada", this);
	}
	
	public PortadaCriteria(PersistentSession session) {
		this(session.createCriteria(Portada.class));
	}
	
	public PortadaCriteria() throws PersistentException {
		this(MDS12324PFFornielesGomezPersistentManager.instance().getSession());
	}
	
	public EditorCriteria createOrdenaCriteria() {
		return new EditorCriteria(createCriteria("ordena"));
	}
	
	public NoticiaCriteria createAparece_en_portadaCriteria() {
		return new NoticiaCriteria(createCriteria("ORM_aparece_en_portada"));
	}
	
	public Portada uniquePortada() {
		return (Portada) super.uniqueResult();
	}
	
	public Portada[] listPortada() {
		java.util.List list = super.list();
		return (Portada[]) list.toArray(new Portada[list.size()]);
	}
}

