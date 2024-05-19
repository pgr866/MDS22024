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

public class ComentarioDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ComentarioDetachedCriteria() {
		super(basededatos.Comentario.class, basededatos.ComentarioCriteria.class);
		id_comentario = new IntegerExpression("id_comentario", this.getDetachedCriteria());
		escribeId = new IntegerExpression("escribe.id", this.getDetachedCriteria());
		escribe = new AssociationExpression("escribe", this.getDetachedCriteria());
		elimina_comentarioId = new IntegerExpression("elimina_comentario.", this.getDetachedCriteria());
		elimina_comentario = new AssociationExpression("elimina_comentario", this.getDetachedCriteria());
		noticia_contiene_comentariosId = new IntegerExpression("noticia_contiene_comentarios.id_noticia", this.getDetachedCriteria());
		noticia_contiene_comentarios = new AssociationExpression("noticia_contiene_comentarios", this.getDetachedCriteria());
		contenido = new StringExpression("contenido", this.getDetachedCriteria());
		valoraciones_positivas = new IntegerExpression("valoraciones_positivas", this.getDetachedCriteria());
		valoraciones_negativas = new IntegerExpression("valoraciones_negativas", this.getDetachedCriteria());
		valora_positivamente = new CollectionExpression("ORM_valora_positivamente", this.getDetachedCriteria());
		valora_negativamente = new CollectionExpression("ORM_valora_negativamente", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ComentarioCriteria.class);
		id_comentario = new IntegerExpression("id_comentario", this.getDetachedCriteria());
		escribeId = new IntegerExpression("escribe.id", this.getDetachedCriteria());
		escribe = new AssociationExpression("escribe", this.getDetachedCriteria());
		elimina_comentarioId = new IntegerExpression("elimina_comentario.", this.getDetachedCriteria());
		elimina_comentario = new AssociationExpression("elimina_comentario", this.getDetachedCriteria());
		noticia_contiene_comentariosId = new IntegerExpression("noticia_contiene_comentarios.id_noticia", this.getDetachedCriteria());
		noticia_contiene_comentarios = new AssociationExpression("noticia_contiene_comentarios", this.getDetachedCriteria());
		contenido = new StringExpression("contenido", this.getDetachedCriteria());
		valoraciones_positivas = new IntegerExpression("valoraciones_positivas", this.getDetachedCriteria());
		valoraciones_negativas = new IntegerExpression("valoraciones_negativas", this.getDetachedCriteria());
		valora_positivamente = new CollectionExpression("ORM_valora_positivamente", this.getDetachedCriteria());
		valora_negativamente = new CollectionExpression("ORM_valora_negativamente", this.getDetachedCriteria());
	}
	
	public IdentificadoDetachedCriteria createEscribeCriteria() {
		return new IdentificadoDetachedCriteria(createCriteria("escribe"));
	}
	
	public EditorDetachedCriteria createElimina_comentarioCriteria() {
		return new EditorDetachedCriteria(createCriteria("elimina_comentario"));
	}
	
	public NoticiaDetachedCriteria createNoticia_contiene_comentariosCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("noticia_contiene_comentarios"));
	}
	
	public IdentificadoDetachedCriteria createValora_positivamenteCriteria() {
		return new IdentificadoDetachedCriteria(createCriteria("ORM_valora_positivamente"));
	}
	
	public IdentificadoDetachedCriteria createValora_negativamenteCriteria() {
		return new IdentificadoDetachedCriteria(createCriteria("ORM_valora_negativamente"));
	}
	
	public Comentario uniqueComentario(PersistentSession session) {
		return (Comentario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comentario[] listComentario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

