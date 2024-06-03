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
	public final IntegerExpression portada_contiene_noticiasId;
	public final AssociationExpression portada_contiene_noticias;
	public final IntegerExpression publicaId;
	public final AssociationExpression publica;
	public final IntegerExpression elimina_noticiaId;
	public final AssociationExpression elimina_noticia;
	public final IntegerExpression seccion_contiene_noticiasId;
	public final AssociationExpression seccion_contiene_noticias;
	public final IntegerExpression creaId;
	public final AssociationExpression crea;
	public final StringExpression titulo;
	public final StringExpression url_imagen_noticia;
	public final StringExpression fecha;
	public final StringExpression lugar;
	public final StringExpression resumen;
	public final StringExpression contenido;
	public final IntegerExpression valoraciones_positivas;
	public final IntegerExpression valoraciones_negativas;
	public final IntegerExpression posicion_portada;
	public final CollectionExpression valora_positiva;
	public final CollectionExpression pertenece_a;
	public final CollectionExpression valora_negativa;
	public final CollectionExpression pertenece_a_noticia;
	
	public NoticiaCriteria(Criteria criteria) {
		super(criteria);
		id_noticia = new IntegerExpression("id_noticia", this);
		portada_contiene_noticiasId = new IntegerExpression("portada_contiene_noticias.id_portada", this);
		portada_contiene_noticias = new AssociationExpression("portada_contiene_noticias", this);
		publicaId = new IntegerExpression("publica.", this);
		publica = new AssociationExpression("publica", this);
		elimina_noticiaId = new IntegerExpression("elimina_noticia.", this);
		elimina_noticia = new AssociationExpression("elimina_noticia", this);
		seccion_contiene_noticiasId = new IntegerExpression("seccion_contiene_noticias.id_seccion", this);
		seccion_contiene_noticias = new AssociationExpression("seccion_contiene_noticias", this);
		creaId = new IntegerExpression("crea.", this);
		crea = new AssociationExpression("crea", this);
		titulo = new StringExpression("titulo", this);
		url_imagen_noticia = new StringExpression("url_imagen_noticia", this);
		fecha = new StringExpression("fecha", this);
		lugar = new StringExpression("lugar", this);
		resumen = new StringExpression("resumen", this);
		contenido = new StringExpression("contenido", this);
		valoraciones_positivas = new IntegerExpression("valoraciones_positivas", this);
		valoraciones_negativas = new IntegerExpression("valoraciones_negativas", this);
		posicion_portada = new IntegerExpression("posicion_portada", this);
		valora_positiva = new CollectionExpression("ORM_valora_positiva", this);
		pertenece_a = new CollectionExpression("ORM_pertenece_a", this);
		valora_negativa = new CollectionExpression("ORM_valora_negativa", this);
		pertenece_a_noticia = new CollectionExpression("ORM_pertenece_a_noticia", this);
	}
	
	public NoticiaCriteria(PersistentSession session) {
		this(session.createCriteria(Noticia.class));
	}
	
	public NoticiaCriteria() throws PersistentException {
		this(MDS12324PFFornielesGomezPersistentManager.instance().getSession());
	}
	
	public PortadaCriteria createPortada_contiene_noticiasCriteria() {
		return new PortadaCriteria(createCriteria("portada_contiene_noticias"));
	}
	
	public EditorCriteria createPublicaCriteria() {
		return new EditorCriteria(createCriteria("publica"));
	}
	
	public EditorCriteria createElimina_noticiaCriteria() {
		return new EditorCriteria(createCriteria("elimina_noticia"));
	}
	
	public SeccionCriteria createSeccion_contiene_noticiasCriteria() {
		return new SeccionCriteria(createCriteria("seccion_contiene_noticias"));
	}
	
	public PeriodistaCriteria createCreaCriteria() {
		return new PeriodistaCriteria(createCriteria("crea"));
	}
	
	public IdentificadoCriteria createValora_positivaCriteria() {
		return new IdentificadoCriteria(createCriteria("ORM_valora_positiva"));
	}
	
	public TematicaCriteria createPertenece_aCriteria() {
		return new TematicaCriteria(createCriteria("ORM_pertenece_a"));
	}
	
	public IdentificadoCriteria createValora_negativaCriteria() {
		return new IdentificadoCriteria(createCriteria("ORM_valora_negativa"));
	}
	
	public ComentarioCriteria createPertenece_a_noticiaCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_pertenece_a_noticia"));
	}
	
	public Noticia uniqueNoticia() {
		return (Noticia) super.uniqueResult();
	}
	
	public Noticia[] listNoticia() {
		java.util.List list = super.list();
		return (Noticia[]) list.toArray(new Noticia[list.size()]);
	}
}

