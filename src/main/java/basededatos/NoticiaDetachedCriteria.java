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

public class NoticiaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public NoticiaDetachedCriteria() {
		super(basededatos.Noticia.class, basededatos.NoticiaCriteria.class);
		id_noticia = new IntegerExpression("id_noticia", this.getDetachedCriteria());
		portada_contiene_noticiasId = new IntegerExpression("portada_contiene_noticias.id_portada", this.getDetachedCriteria());
		portada_contiene_noticias = new AssociationExpression("portada_contiene_noticias", this.getDetachedCriteria());
		publicaId = new IntegerExpression("publica.", this.getDetachedCriteria());
		publica = new AssociationExpression("publica", this.getDetachedCriteria());
		elimina_noticiaId = new IntegerExpression("elimina_noticia.", this.getDetachedCriteria());
		elimina_noticia = new AssociationExpression("elimina_noticia", this.getDetachedCriteria());
		seccion_contiene_noticiasId = new IntegerExpression("seccion_contiene_noticias.id_seccion", this.getDetachedCriteria());
		seccion_contiene_noticias = new AssociationExpression("seccion_contiene_noticias", this.getDetachedCriteria());
		creaId = new IntegerExpression("crea.", this.getDetachedCriteria());
		crea = new AssociationExpression("crea", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		url_imagen_noticia = new StringExpression("url_imagen_noticia", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		lugar = new StringExpression("lugar", this.getDetachedCriteria());
		resumen = new StringExpression("resumen", this.getDetachedCriteria());
		contenido = new StringExpression("contenido", this.getDetachedCriteria());
		valoraciones_positivas = new IntegerExpression("valoraciones_positivas", this.getDetachedCriteria());
		valoraciones_negativas = new IntegerExpression("valoraciones_negativas", this.getDetachedCriteria());
		posicion_portada = new IntegerExpression("posicion_portada", this.getDetachedCriteria());
		valora_positiva = new CollectionExpression("ORM_valora_positiva", this.getDetachedCriteria());
		pertenece_a = new CollectionExpression("ORM_pertenece_a", this.getDetachedCriteria());
		valora_negativa = new CollectionExpression("ORM_valora_negativa", this.getDetachedCriteria());
		pertenece_a_noticia = new CollectionExpression("ORM_pertenece_a_noticia", this.getDetachedCriteria());
	}
	
	public NoticiaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.NoticiaCriteria.class);
		id_noticia = new IntegerExpression("id_noticia", this.getDetachedCriteria());
		portada_contiene_noticiasId = new IntegerExpression("portada_contiene_noticias.id_portada", this.getDetachedCriteria());
		portada_contiene_noticias = new AssociationExpression("portada_contiene_noticias", this.getDetachedCriteria());
		publicaId = new IntegerExpression("publica.", this.getDetachedCriteria());
		publica = new AssociationExpression("publica", this.getDetachedCriteria());
		elimina_noticiaId = new IntegerExpression("elimina_noticia.", this.getDetachedCriteria());
		elimina_noticia = new AssociationExpression("elimina_noticia", this.getDetachedCriteria());
		seccion_contiene_noticiasId = new IntegerExpression("seccion_contiene_noticias.id_seccion", this.getDetachedCriteria());
		seccion_contiene_noticias = new AssociationExpression("seccion_contiene_noticias", this.getDetachedCriteria());
		creaId = new IntegerExpression("crea.", this.getDetachedCriteria());
		crea = new AssociationExpression("crea", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		url_imagen_noticia = new StringExpression("url_imagen_noticia", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		lugar = new StringExpression("lugar", this.getDetachedCriteria());
		resumen = new StringExpression("resumen", this.getDetachedCriteria());
		contenido = new StringExpression("contenido", this.getDetachedCriteria());
		valoraciones_positivas = new IntegerExpression("valoraciones_positivas", this.getDetachedCriteria());
		valoraciones_negativas = new IntegerExpression("valoraciones_negativas", this.getDetachedCriteria());
		posicion_portada = new IntegerExpression("posicion_portada", this.getDetachedCriteria());
		valora_positiva = new CollectionExpression("ORM_valora_positiva", this.getDetachedCriteria());
		pertenece_a = new CollectionExpression("ORM_pertenece_a", this.getDetachedCriteria());
		valora_negativa = new CollectionExpression("ORM_valora_negativa", this.getDetachedCriteria());
		pertenece_a_noticia = new CollectionExpression("ORM_pertenece_a_noticia", this.getDetachedCriteria());
	}
	
	public PortadaDetachedCriteria createPortada_contiene_noticiasCriteria() {
		return new PortadaDetachedCriteria(createCriteria("portada_contiene_noticias"));
	}
	
	public EditorDetachedCriteria createPublicaCriteria() {
		return new EditorDetachedCriteria(createCriteria("publica"));
	}
	
	public EditorDetachedCriteria createElimina_noticiaCriteria() {
		return new EditorDetachedCriteria(createCriteria("elimina_noticia"));
	}
	
	public SeccionDetachedCriteria createSeccion_contiene_noticiasCriteria() {
		return new SeccionDetachedCriteria(createCriteria("seccion_contiene_noticias"));
	}
	
	public PeriodistaDetachedCriteria createCreaCriteria() {
		return new PeriodistaDetachedCriteria(createCriteria("crea"));
	}
	
	public IdentificadoDetachedCriteria createValora_positivaCriteria() {
		return new IdentificadoDetachedCriteria(createCriteria("ORM_valora_positiva"));
	}
	
	public TematicaDetachedCriteria createPertenece_aCriteria() {
		return new TematicaDetachedCriteria(createCriteria("ORM_pertenece_a"));
	}
	
	public IdentificadoDetachedCriteria createValora_negativaCriteria() {
		return new IdentificadoDetachedCriteria(createCriteria("ORM_valora_negativa"));
	}
	
	public ComentarioDetachedCriteria createPertenece_a_noticiaCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_pertenece_a_noticia"));
	}
	
	public Noticia uniqueNoticia(PersistentSession session) {
		return (Noticia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Noticia[] listNoticia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Noticia[]) list.toArray(new Noticia[list.size()]);
	}
}

