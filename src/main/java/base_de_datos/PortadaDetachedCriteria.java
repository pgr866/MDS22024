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

public class PortadaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public PortadaDetachedCriteria() {
		super(base_de_datos.Portada.class, base_de_datos.PortadaCriteria.class);
		id_seccion = new IntegerExpression("id_seccion", this.getDetachedCriteria());
		eliminaId = new StringExpression("elimina.dni", this.getDetachedCriteria());
		elimina = new AssociationExpression("elimina", this.getDetachedCriteria());
		creaId = new StringExpression("crea.dni", this.getDetachedCriteria());
		crea = new AssociationExpression("crea", this.getDetachedCriteria());
		titulo_seccion = new StringExpression("titulo_seccion", this.getDetachedCriteria());
		aparece_en = new CollectionExpression("ORM_aparece_en", this.getDetachedCriteria());
		pertenece_a_seccion = new CollectionExpression("ORM_pertenece_a_seccion", this.getDetachedCriteria());
		ordenaId = new StringExpression("ordena.dni", this.getDetachedCriteria());
		ordena = new AssociationExpression("ordena", this.getDetachedCriteria());
	}
	
	public PortadaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.PortadaCriteria.class);
		id_seccion = new IntegerExpression("id_seccion", this.getDetachedCriteria());
		eliminaId = new StringExpression("elimina.dni", this.getDetachedCriteria());
		elimina = new AssociationExpression("elimina", this.getDetachedCriteria());
		creaId = new StringExpression("crea.dni", this.getDetachedCriteria());
		crea = new AssociationExpression("crea", this.getDetachedCriteria());
		titulo_seccion = new StringExpression("titulo_seccion", this.getDetachedCriteria());
		aparece_en = new CollectionExpression("ORM_aparece_en", this.getDetachedCriteria());
		pertenece_a_seccion = new CollectionExpression("ORM_pertenece_a_seccion", this.getDetachedCriteria());
		ordenaId = new StringExpression("ordena.dni", this.getDetachedCriteria());
		ordena = new AssociationExpression("ordena", this.getDetachedCriteria());
	}
	
	public EditorDetachedCriteria createOrdenaCriteria() {
		return new EditorDetachedCriteria(createCriteria("ordena"));
	}
	
	public EditorDetachedCriteria createEliminaCriteria() {
		return new EditorDetachedCriteria(createCriteria("elimina"));
	}
	
	public EditorDetachedCriteria createCreaCriteria() {
		return new EditorDetachedCriteria(createCriteria("crea"));
	}
	
	public base_de_datos.NoticiaDetachedCriteria createAparece_enCriteria() {
		return new base_de_datos.NoticiaDetachedCriteria(createCriteria("ORM_aparece_en"));
	}
	
	public base_de_datos.TematicaDetachedCriteria createPertenece_a_seccionCriteria() {
		return new base_de_datos.TematicaDetachedCriteria(createCriteria("ORM_pertenece_a_seccion"));
	}
	
	public Portada uniquePortada(PersistentSession session) {
		return (Portada) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Portada[] listPortada(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Portada[]) list.toArray(new Portada[list.size()]);
	}
}

