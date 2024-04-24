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

public class NoticiaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public NoticiaDetachedCriteria() {
		super(base_de_datos.Noticia.class, base_de_datos.NoticiaCriteria.class);
		id_noticia = new IntegerExpression("id_noticia", this.getDetachedCriteria());
		creaId = new IntegerExpression("crea.", this.getDetachedCriteria());
		crea = new AssociationExpression("crea", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		url_imagen_noticia = new StringExpression("url_imagen_noticia", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		lugar = new StringExpression("lugar", this.getDetachedCriteria());
		resumen = new StringExpression("resumen", this.getDetachedCriteria());
		contenido = new StringExpression("contenido", this.getDetachedCriteria());
		autor = new IntegerExpression("autor", this.getDetachedCriteria());
		publicada = new BooleanExpression("publicada", this.getDetachedCriteria());
		valoraciones_positivas = new IntegerExpression("valoraciones_positivas", this.getDetachedCriteria());
		valoraciones_negativas = new IntegerExpression("valoraciones_negativas", this.getDetachedCriteria());
		publica = new CollectionExpression("ORM_publica", this.getDetachedCriteria());
		valora = new CollectionExpression("ORM_valora", this.getDetachedCriteria());
		pertenece_a = new CollectionExpression("ORM_pertenece_a", this.getDetachedCriteria());
		seccion_contiene_noticias = new CollectionExpression("ORM_seccion_contiene_noticias", this.getDetachedCriteria());
		pertenece_a_noticia = new CollectionExpression("ORM_pertenece_a_noticia", this.getDetachedCriteria());
		elimina = new CollectionExpression("ORM_elimina", this.getDetachedCriteria());
	}
	
	public NoticiaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.NoticiaCriteria.class);
		id_noticia = new IntegerExpression("id_noticia", this.getDetachedCriteria());
		creaId = new IntegerExpression("crea.", this.getDetachedCriteria());
		crea = new AssociationExpression("crea", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		url_imagen_noticia = new StringExpression("url_imagen_noticia", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		lugar = new StringExpression("lugar", this.getDetachedCriteria());
		resumen = new StringExpression("resumen", this.getDetachedCriteria());
		contenido = new StringExpression("contenido", this.getDetachedCriteria());
		autor = new IntegerExpression("autor", this.getDetachedCriteria());
		publicada = new BooleanExpression("publicada", this.getDetachedCriteria());
		valoraciones_positivas = new IntegerExpression("valoraciones_positivas", this.getDetachedCriteria());
		valoraciones_negativas = new IntegerExpression("valoraciones_negativas", this.getDetachedCriteria());
		publica = new CollectionExpression("ORM_publica", this.getDetachedCriteria());
		valora = new CollectionExpression("ORM_valora", this.getDetachedCriteria());
		pertenece_a = new CollectionExpression("ORM_pertenece_a", this.getDetachedCriteria());
		seccion_contiene_noticias = new CollectionExpression("ORM_seccion_contiene_noticias", this.getDetachedCriteria());
		pertenece_a_noticia = new CollectionExpression("ORM_pertenece_a_noticia", this.getDetachedCriteria());
		elimina = new CollectionExpression("ORM_elimina", this.getDetachedCriteria());
	}
	
	public PeriodistaDetachedCriteria createCreaCriteria() {
		return new PeriodistaDetachedCriteria(createCriteria("crea"));
	}
	
	public base_de_datos.EditorDetachedCriteria createPublicaCriteria() {
		return new base_de_datos.EditorDetachedCriteria(createCriteria("ORM_publica"));
	}
	
	public base_de_datos.IdentificadoDetachedCriteria createValoraCriteria() {
		return new base_de_datos.IdentificadoDetachedCriteria(createCriteria("ORM_valora"));
	}
	
	public base_de_datos.TematicaDetachedCriteria createPertenece_aCriteria() {
		return new base_de_datos.TematicaDetachedCriteria(createCriteria("ORM_pertenece_a"));
	}
	
	public base_de_datos.SeccionDetachedCriteria createSeccion_contiene_noticiasCriteria() {
		return new base_de_datos.SeccionDetachedCriteria(createCriteria("ORM_seccion_contiene_noticias"));
	}
	
	public base_de_datos.ComentarioDetachedCriteria createPertenece_a_noticiaCriteria() {
		return new base_de_datos.ComentarioDetachedCriteria(createCriteria("ORM_pertenece_a_noticia"));
	}
	
	public base_de_datos.EditorDetachedCriteria createEliminaCriteria() {
		return new base_de_datos.EditorDetachedCriteria(createCriteria("ORM_elimina"));
	}
	
	public Noticia uniqueNoticia(PersistentSession session) {
		return (Noticia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Noticia[] listNoticia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Noticia[]) list.toArray(new Noticia[list.size()]);
	}
}

