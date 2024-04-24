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

public class NoticiaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_noticia;
	public final IntegerExpression creaId;
	public final AssociationExpression crea;
	public final StringExpression titulo;
	public final StringExpression url_imagen_noticia;
	public final StringExpression fecha;
	public final StringExpression lugar;
	public final StringExpression resumen;
	public final StringExpression contenido;
	public final IntegerExpression autor;
	public final BooleanExpression publicada;
	public final IntegerExpression valoraciones_positivas;
	public final IntegerExpression valoraciones_negativas;
	public final CollectionExpression publica;
	public final CollectionExpression valora;
	public final CollectionExpression pertenece_a;
	public final CollectionExpression seccion_contiene_noticias;
	public final CollectionExpression pertenece_a_noticia;
	public final CollectionExpression elimina;
	
	public NoticiaCriteria(Criteria criteria) {
		super(criteria);
		id_noticia = new IntegerExpression("id_noticia", this);
		creaId = new IntegerExpression("crea.", this);
		crea = new AssociationExpression("crea", this);
		titulo = new StringExpression("titulo", this);
		url_imagen_noticia = new StringExpression("url_imagen_noticia", this);
		fecha = new StringExpression("fecha", this);
		lugar = new StringExpression("lugar", this);
		resumen = new StringExpression("resumen", this);
		contenido = new StringExpression("contenido", this);
		autor = new IntegerExpression("autor", this);
		publicada = new BooleanExpression("publicada", this);
		valoraciones_positivas = new IntegerExpression("valoraciones_positivas", this);
		valoraciones_negativas = new IntegerExpression("valoraciones_negativas", this);
		publica = new CollectionExpression("ORM_publica", this);
		valora = new CollectionExpression("ORM_valora", this);
		pertenece_a = new CollectionExpression("ORM_pertenece_a", this);
		seccion_contiene_noticias = new CollectionExpression("ORM_seccion_contiene_noticias", this);
		pertenece_a_noticia = new CollectionExpression("ORM_pertenece_a_noticia", this);
		elimina = new CollectionExpression("ORM_elimina", this);
	}
	
	public NoticiaCriteria(PersistentSession session) {
		this(session.createCriteria(Noticia.class));
	}
	
	public NoticiaCriteria() throws PersistentException {
		this(basededatos.MDS12324PFFornielesGomezPersistentManager.instance().getSession());
	}
	
	public PeriodistaCriteria createCreaCriteria() {
		return new PeriodistaCriteria(createCriteria("crea"));
	}
	
	public basededatos.EditorCriteria createPublicaCriteria() {
		return new basededatos.EditorCriteria(createCriteria("ORM_publica"));
	}
	
	public basededatos.IdentificadoCriteria createValoraCriteria() {
		return new basededatos.IdentificadoCriteria(createCriteria("ORM_valora"));
	}
	
	public basededatos.TematicaCriteria createPertenece_aCriteria() {
		return new basededatos.TematicaCriteria(createCriteria("ORM_pertenece_a"));
	}
	
	public basededatos.SeccionCriteria createSeccion_contiene_noticiasCriteria() {
		return new basededatos.SeccionCriteria(createCriteria("ORM_seccion_contiene_noticias"));
	}
	
	public basededatos.ComentarioCriteria createPertenece_a_noticiaCriteria() {
		return new basededatos.ComentarioCriteria(createCriteria("ORM_pertenece_a_noticia"));
	}
	
	public basededatos.EditorCriteria createEliminaCriteria() {
		return new basededatos.EditorCriteria(createCriteria("ORM_elimina"));
	}
	
	public Noticia uniqueNoticia() {
		return (Noticia) super.uniqueResult();
	}
	
	public Noticia[] listNoticia() {
		java.util.List list = super.list();
		return (Noticia[]) list.toArray(new Noticia[list.size()]);
	}
}

