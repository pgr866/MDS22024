package basededatos;

import base_de_datos.BDPrincipal;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Noticias {

	public Vector<Noticia> _contiene_noticias = new Vector<Noticia>();
	public BDPrincipal _bd_main_noticia;

	public Noticia Crear_noticia(String aTitulo, String aUrl_imagen, String aContenido, String aFecha, String aLugar,
			String aTematicas, int aId_periodista, BD_Tematicas _bd_tematicas) throws PersistentException {
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		Noticia noticia = null;
		try {
			noticia = NoticiaDAO.createNoticia();
			noticia.setTitulo(aTitulo);
			noticia.setUrl_imagen_noticia(aUrl_imagen);
			noticia.setContenido(aContenido);
			noticia.setFecha(aFecha);
			noticia.setLugar(aLugar);
			noticia.setValoraciones_positivas(0);
			noticia.setValoraciones_negativas(0);
			noticia.setPosicion_portada(-1);
			noticia.setORM_Crea(PeriodistaDAO.getPeriodistaByORMID(aId_periodista));
			NoticiaDAO.save(noticia);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		
		Tematica[] tematicas = _bd_tematicas.Cargar_tematicas(aTematicas);
		
		t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(noticia.getId_noticia());
			for (Tematica tematica : tematicas)
				noticia.pertenece_a.add(tematica);
			NoticiaDAO.save(noticia);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		
		return noticia;
	}

	public Noticia Valorar_noticia(int aId_noticia, int aId_identificado, boolean aPositiva)
			throws PersistentException {
		Noticia noticia = null;
		Identificado identificado = null;
		if (aPositiva) {
			PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession()
					.beginTransaction();
			try {
				noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
				identificado = IdentificadoDAO.getIdentificadoByORMID(aId_identificado);
				if (noticia.valora_positiva.contains(identificado)) {
					noticia.valora_positiva.remove(identificado);
					noticia.setValoraciones_positivas(noticia.getValoraciones_positivas() - 1);
				} else {
					noticia.valora_positiva.add(identificado);
					noticia.setValoraciones_positivas(noticia.getValoraciones_positivas() + 1);
					if (noticia.valora_negativa.contains(identificado)) {
						noticia.valora_negativa.remove(identificado);
						noticia.setValoraciones_negativas(noticia.getValoraciones_negativas() - 1);
					}
				}
				NoticiaDAO.save(noticia);
				t.commit();
			} catch (Exception e) {
				t.rollback();
			}
			MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		} else {
			PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession()
					.beginTransaction();
			try {
				noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
				identificado = IdentificadoDAO.getIdentificadoByORMID(aId_identificado);
				if (noticia.valora_negativa.contains(identificado)) {
					noticia.valora_negativa.remove(identificado);
					noticia.setValoraciones_negativas(noticia.getValoraciones_negativas() - 1);
				} else {
					noticia.valora_negativa.add(identificado);
					noticia.setValoraciones_negativas(noticia.getValoraciones_negativas() + 1);
					if (noticia.valora_positiva.contains(identificado)) {
						noticia.valora_positiva.remove(identificado);
						noticia.setValoraciones_positivas(noticia.getValoraciones_positivas() - 1);
					}
				}
				NoticiaDAO.save(noticia);
				t.commit();
			} catch (Exception e) {
				t.rollback();
			}
			MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		}
		return noticia;
	}

	public Noticia[] Cargar_noticias() throws PersistentException {
		List<Noticia> noticias = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			noticias = NoticiaDAO.queryNoticia("EditorIdentificadoId IS NULL AND EditorIdentificadoId2 IS NOT NULL",
					"Id_noticia DESC");
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return noticias.toArray(new Noticia[0]);
	}

	public Noticia[] Cargar_noticias_revisar() throws PersistentException {
		List<Noticia> noticias = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			noticias = NoticiaDAO.queryNoticia("EditorIdentificadoId IS NULL AND EditorIdentificadoId2 IS NULL", "Id_noticia DESC");
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return noticias.toArray(new Noticia[0]);
	}

	public void Publicar_noticia(String aNombre_seccion, String aResumen, int aId_noticia, int aId_editor)
			throws PersistentException {
		Noticia noticia = null;
		Seccion seccion = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			noticia.setResumen(aResumen);
			noticia.setORM_Publica(EditorDAO.getEditorByORMID(aId_editor));
			seccion = SeccionDAO.loadSeccionByQuery("Titulo_seccion = '" + aNombre_seccion + "'", null);;
			noticia.setORM_Seccion_contiene_noticias(seccion);
			NoticiaDAO.save(noticia);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
	}

	public void Eliminar_noticia(int aId_noticia, int aId_editor) throws PersistentException {
		Noticia noticia = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			noticia.setORM_Elimina_noticia(EditorDAO.getEditorByORMID(aId_editor));
			noticia.setORM_Portada_contiene_noticias(null);
			noticia.setPosicion_portada(-1);
			NoticiaDAO.save(noticia);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		
		List<Noticia> noticias = null;
		t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			noticias = NoticiaDAO.queryNoticia("PortadaId_portada IS NOT NULL", "Posicion_portada");
			for (int i=0; i<noticias.size(); i++) {
				noticias.get(i).setPosicion_portada(i);
				NoticiaDAO.save(noticias.get(i));
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
	}

	public void Cambiar_orden_noticias_portada(String aTitulo_noticia, int aPosicion_portada)
			throws PersistentException {
		Noticia noticia = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.loadNoticiaByQuery("Posicion_portada = " + aPosicion_portada, null);
			noticia.setPosicion_portada(-1);
			noticia.setORM_Portada_contiene_noticias(null);
			NoticiaDAO.save(noticia);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		
		noticia = null;
		Editor editor = null;
		
		t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.loadNoticiaByQuery("Titulo = '" + aTitulo_noticia + "'", null);
			editor = EditorDAO.loadEditorByQuery(null, null);
			noticia.setORM_Portada_contiene_noticias(editor.getEs_ordenada());
			noticia.setPosicion_portada(aPosicion_portada);
			NoticiaDAO.save(noticia);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		
		List<Noticia> noticias = null;
		t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			noticias = NoticiaDAO.queryNoticia("PortadaId_portada IS NOT NULL", "Posicion_portada");
			for (int i=0; i<noticias.size(); i++) {
				noticias.get(i).setPosicion_portada(i);
				NoticiaDAO.save(noticias.get(i));
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
	}
}