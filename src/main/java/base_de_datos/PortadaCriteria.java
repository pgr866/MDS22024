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

public class PortadaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_seccion;
	public final StringExpression eliminaId;
	public final AssociationExpression elimina;
	public final StringExpression creaId;
	public final AssociationExpression crea;
	public final StringExpression titulo_seccion;
	public final CollectionExpression aparece_en;
	public final CollectionExpression pertenece_a_seccion;
	public final StringExpression ordenaId;
	public final AssociationExpression ordena;
	
	public PortadaCriteria(Criteria criteria) {
		super(criteria);
		id_seccion = new IntegerExpression("id_seccion", this);
		eliminaId = new StringExpression("elimina.dni", this);
		elimina = new AssociationExpression("elimina", this);
		creaId = new StringExpression("crea.dni", this);
		crea = new AssociationExpression("crea", this);
		titulo_seccion = new StringExpression("titulo_seccion", this);
		aparece_en = new CollectionExpression("ORM_aparece_en", this);
		pertenece_a_seccion = new CollectionExpression("ORM_pertenece_a_seccion", this);
		ordenaId = new StringExpression("ordena.dni", this);
		ordena = new AssociationExpression("ordena", this);
	}
	
	public PortadaCriteria(PersistentSession session) {
		this(session.createCriteria(Portada.class));
	}
	
	public PortadaCriteria() throws PersistentException {
		this(base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession());
	}
	
	public EditorCriteria createOrdenaCriteria() {
		return new EditorCriteria(createCriteria("ordena"));
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
	
	public Portada uniquePortada() {
		return (Portada) super.uniqueResult();
	}
	
	public Portada[] listPortada() {
		java.util.List list = super.list();
		return (Portada[]) list.toArray(new Portada[list.size()]);
	}
}

