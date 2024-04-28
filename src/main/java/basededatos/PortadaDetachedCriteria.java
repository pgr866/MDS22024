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

public class PortadaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_portada;
	public final IntegerExpression ordenaId;
	public final AssociationExpression ordena;
	public final CollectionExpression aparece_en_portada;
	
	public PortadaDetachedCriteria() {
		super(basededatos.Portada.class, basededatos.PortadaCriteria.class);
		id_portada = new IntegerExpression("id_portada", this.getDetachedCriteria());
		ordenaId = new IntegerExpression("ordena.", this.getDetachedCriteria());
		ordena = new AssociationExpression("ordena", this.getDetachedCriteria());
		aparece_en_portada = new CollectionExpression("ORM_aparece_en_portada", this.getDetachedCriteria());
	}
	
	public PortadaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.PortadaCriteria.class);
		id_portada = new IntegerExpression("id_portada", this.getDetachedCriteria());
		ordenaId = new IntegerExpression("ordena.", this.getDetachedCriteria());
		ordena = new AssociationExpression("ordena", this.getDetachedCriteria());
		aparece_en_portada = new CollectionExpression("ORM_aparece_en_portada", this.getDetachedCriteria());
	}
	
	public EditorDetachedCriteria createOrdenaCriteria() {
		return new EditorDetachedCriteria(createCriteria("ordena"));
	}
	
	public NoticiaDetachedCriteria createAparece_en_portadaCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("ORM_aparece_en_portada"));
	}
	
	public Portada uniquePortada(PersistentSession session) {
		return (Portada) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Portada[] listPortada(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Portada[]) list.toArray(new Portada[list.size()]);
	}
}

