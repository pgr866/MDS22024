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

public class ComentarioDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ComentarioDetachedCriteria() {
		super(base_de_datos.Comentario.class, base_de_datos.ComentarioCriteria.class);
		id_comentario = new IntegerExpression("id_comentario", this.getDetachedCriteria());
		escribeId = new StringExpression("escribe.dni", this.getDetachedCriteria());
		escribe = new AssociationExpression("escribe", this.getDetachedCriteria());
		eliminaId = new StringExpression("elimina.dni", this.getDetachedCriteria());
		elimina = new AssociationExpression("elimina", this.getDetachedCriteria());
		noticia_contiene_comentariosId = new IntegerExpression("noticia_contiene_comentarios.id_noticia", this.getDetachedCriteria());
		noticia_contiene_comentarios = new AssociationExpression("noticia_contiene_comentarios", this.getDetachedCriteria());
		propietario = new StringExpression("propietario", this.getDetachedCriteria());
		contenido = new StringExpression("contenido", this.getDetachedCriteria());
		valoraciones_positivas = new IntegerExpression("valoraciones_positivas", this.getDetachedCriteria());
		valoraciones_negativas = new IntegerExpression("valoraciones_negativas", this.getDetachedCriteria());
		valora = new CollectionExpression("ORM_valora", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.ComentarioCriteria.class);
		id_comentario = new IntegerExpression("id_comentario", this.getDetachedCriteria());
		escribeId = new StringExpression("escribe.dni", this.getDetachedCriteria());
		escribe = new AssociationExpression("escribe", this.getDetachedCriteria());
		eliminaId = new StringExpression("elimina.dni", this.getDetachedCriteria());
		elimina = new AssociationExpression("elimina", this.getDetachedCriteria());
		noticia_contiene_comentariosId = new IntegerExpression("noticia_contiene_comentarios.id_noticia", this.getDetachedCriteria());
		noticia_contiene_comentarios = new AssociationExpression("noticia_contiene_comentarios", this.getDetachedCriteria());
		propietario = new StringExpression("propietario", this.getDetachedCriteria());
		contenido = new StringExpression("contenido", this.getDetachedCriteria());
		valoraciones_positivas = new IntegerExpression("valoraciones_positivas", this.getDetachedCriteria());
		valoraciones_negativas = new IntegerExpression("valoraciones_negativas", this.getDetachedCriteria());
		valora = new CollectionExpression("ORM_valora", this.getDetachedCriteria());
	}
	
	public IdentificadoDetachedCriteria createEscribeCriteria() {
		return new IdentificadoDetachedCriteria(createCriteria("escribe"));
	}
	
	public EditorDetachedCriteria createEliminaCriteria() {
		return new EditorDetachedCriteria(createCriteria("elimina"));
	}
	
	public NoticiaDetachedCriteria createNoticia_contiene_comentariosCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("noticia_contiene_comentarios"));
	}
	
	public base_de_datos.IdentificadoDetachedCriteria createValoraCriteria() {
		return new base_de_datos.IdentificadoDetachedCriteria(createCriteria("ORM_valora"));
	}
	
	public Comentario uniqueComentario(PersistentSession session) {
		return (Comentario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comentario[] listComentario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

