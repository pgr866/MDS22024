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

public class ComentarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_comentario;
	public final IntegerExpression escribeId;
	public final AssociationExpression escribe;
	public final IntegerExpression elimina_comentarioId;
	public final AssociationExpression elimina_comentario;
	public final IntegerExpression noticia_contiene_comentariosId;
	public final AssociationExpression noticia_contiene_comentarios;
	public final StringExpression contenido;
	public final IntegerExpression valoraciones_positivas;
	public final IntegerExpression valoraciones_negativas;
	public final CollectionExpression valora_positivamente;
	public final CollectionExpression valora_negativamente;
	
	public ComentarioCriteria(Criteria criteria) {
		super(criteria);
		id_comentario = new IntegerExpression("id_comentario", this);
		escribeId = new IntegerExpression("escribe.id", this);
		escribe = new AssociationExpression("escribe", this);
		elimina_comentarioId = new IntegerExpression("elimina_comentario.", this);
		elimina_comentario = new AssociationExpression("elimina_comentario", this);
		noticia_contiene_comentariosId = new IntegerExpression("noticia_contiene_comentarios.id_noticia", this);
		noticia_contiene_comentarios = new AssociationExpression("noticia_contiene_comentarios", this);
		contenido = new StringExpression("contenido", this);
		valoraciones_positivas = new IntegerExpression("valoraciones_positivas", this);
		valoraciones_negativas = new IntegerExpression("valoraciones_negativas", this);
		valora_positivamente = new CollectionExpression("ORM_valora_positivamente", this);
		valora_negativamente = new CollectionExpression("ORM_valora_negativamente", this);
	}
	
	public ComentarioCriteria(PersistentSession session) {
		this(session.createCriteria(Comentario.class));
	}
	
	public ComentarioCriteria() throws PersistentException {
		this(MDS12324PFFornielesGomezPersistentManager.instance().getSession());
	}
	
	public IdentificadoCriteria createEscribeCriteria() {
		return new IdentificadoCriteria(createCriteria("escribe"));
	}
	
	public EditorCriteria createElimina_comentarioCriteria() {
		return new EditorCriteria(createCriteria("elimina_comentario"));
	}
	
	public NoticiaCriteria createNoticia_contiene_comentariosCriteria() {
		return new NoticiaCriteria(createCriteria("noticia_contiene_comentarios"));
	}
	
	public IdentificadoCriteria createValora_positivamenteCriteria() {
		return new IdentificadoCriteria(createCriteria("ORM_valora_positivamente"));
	}
	
	public IdentificadoCriteria createValora_negativamenteCriteria() {
		return new IdentificadoCriteria(createCriteria("ORM_valora_negativamente"));
	}
	
	public Comentario uniqueComentario() {
		return (Comentario) super.uniqueResult();
	}
	
	public Comentario[] listComentario() {
		java.util.List list = super.list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

