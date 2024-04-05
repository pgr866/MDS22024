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

public class ComentarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_comentario;
	public final StringExpression escribeId;
	public final AssociationExpression escribe;
	public final StringExpression eliminaId;
	public final AssociationExpression elimina;
	public final IntegerExpression noticia_contiene_comentariosId;
	public final AssociationExpression noticia_contiene_comentarios;
	public final StringExpression propietario;
	public final StringExpression contenido;
	public final IntegerExpression valoraciones_positivas;
	public final IntegerExpression valoraciones_negativas;
	public final CollectionExpression valora;
	
	public ComentarioCriteria(Criteria criteria) {
		super(criteria);
		id_comentario = new IntegerExpression("id_comentario", this);
		escribeId = new StringExpression("escribe.dni", this);
		escribe = new AssociationExpression("escribe", this);
		eliminaId = new StringExpression("elimina.dni", this);
		elimina = new AssociationExpression("elimina", this);
		noticia_contiene_comentariosId = new IntegerExpression("noticia_contiene_comentarios.id_noticia", this);
		noticia_contiene_comentarios = new AssociationExpression("noticia_contiene_comentarios", this);
		propietario = new StringExpression("propietario", this);
		contenido = new StringExpression("contenido", this);
		valoraciones_positivas = new IntegerExpression("valoraciones_positivas", this);
		valoraciones_negativas = new IntegerExpression("valoraciones_negativas", this);
		valora = new CollectionExpression("ORM_valora", this);
	}
	
	public ComentarioCriteria(PersistentSession session) {
		this(session.createCriteria(Comentario.class));
	}
	
	public ComentarioCriteria() throws PersistentException {
		this(base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession());
	}
	
	public IdentificadoCriteria createEscribeCriteria() {
		return new IdentificadoCriteria(createCriteria("escribe"));
	}
	
	public EditorCriteria createEliminaCriteria() {
		return new EditorCriteria(createCriteria("elimina"));
	}
	
	public NoticiaCriteria createNoticia_contiene_comentariosCriteria() {
		return new NoticiaCriteria(createCriteria("noticia_contiene_comentarios"));
	}
	
	public base_de_datos.IdentificadoCriteria createValoraCriteria() {
		return new base_de_datos.IdentificadoCriteria(createCriteria("ORM_valora"));
	}
	
	public Comentario uniqueComentario() {
		return (Comentario) super.uniqueResult();
	}
	
	public Comentario[] listComentario() {
		java.util.List list = super.list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

