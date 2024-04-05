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

public class NoticiaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_noticia;
	public final CollectionExpression publica;
	public final StringExpression titulo;
	public final StringExpression url_imagen_noticia;
	public final StringExpression fecha;
	public final StringExpression lugar;
	public final StringExpression resumen;
	public final StringExpression contenido;
	public final StringExpression autor;
	public final BooleanExpression publicada;
	public final IntegerExpression valoraciones_positivas;
	public final IntegerExpression valoraciones_negativas;
	public final StringExpression creaId;
	public final AssociationExpression crea;
	public final CollectionExpression valora;
	public final CollectionExpression pertenece_a;
	public final CollectionExpression seccion_contiene_noticias;
	public final CollectionExpression pertenece_a_noticia;
	public final CollectionExpression elimina;
	
	public NoticiaCriteria(Criteria criteria) {
		super(criteria);
		id_noticia = new IntegerExpression("id_noticia", this);
		publica = new CollectionExpression("ORM_publica", this);
		titulo = new StringExpression("titulo", this);
		url_imagen_noticia = new StringExpression("url_imagen_noticia", this);
		fecha = new StringExpression("fecha", this);
		lugar = new StringExpression("lugar", this);
		resumen = new StringExpression("resumen", this);
		contenido = new StringExpression("contenido", this);
		autor = new StringExpression("autor", this);
		publicada = new BooleanExpression("publicada", this);
		valoraciones_positivas = new IntegerExpression("valoraciones_positivas", this);
		valoraciones_negativas = new IntegerExpression("valoraciones_negativas", this);
		creaId = new StringExpression("crea.dni", this);
		crea = new AssociationExpression("crea", this);
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
		this(base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().getSession());
	}
	
	public base_de_datos.EditorCriteria createPublicaCriteria() {
		return new base_de_datos.EditorCriteria(createCriteria("ORM_publica"));
	}
	
	public PeriodistaCriteria createCreaCriteria() {
		return new PeriodistaCriteria(createCriteria("crea"));
	}
	
	public base_de_datos.IdentificadoCriteria createValoraCriteria() {
		return new base_de_datos.IdentificadoCriteria(createCriteria("ORM_valora"));
	}
	
	public base_de_datos.TematicaCriteria createPertenece_aCriteria() {
		return new base_de_datos.TematicaCriteria(createCriteria("ORM_pertenece_a"));
	}
	
	public base_de_datos.SeccionCriteria createSeccion_contiene_noticiasCriteria() {
		return new base_de_datos.SeccionCriteria(createCriteria("ORM_seccion_contiene_noticias"));
	}
	
	public base_de_datos.ComentarioCriteria createPertenece_a_noticiaCriteria() {
		return new base_de_datos.ComentarioCriteria(createCriteria("ORM_pertenece_a_noticia"));
	}
	
	public base_de_datos.EditorCriteria createEliminaCriteria() {
		return new base_de_datos.EditorCriteria(createCriteria("ORM_elimina"));
	}
	
	public Noticia uniqueNoticia() {
		return (Noticia) super.uniqueResult();
	}
	
	public Noticia[] listNoticia() {
		java.util.List list = super.list();
		return (Noticia[]) list.toArray(new Noticia[list.size()]);
	}
}

