package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Comentarios {

	public Vector<Comentario> _contiene_comentarios = new Vector<Comentario>();
	public BDPrincipal _bd_main_comentario;

	public Noticia Comentar(int aId_identificado, int aId_noticia, String aContenido) throws PersistentException {
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		Comentario comentario = null;
		try {
			comentario = ComentarioDAO.createComentario();
			comentario.setORM_Escribe(IdentificadoDAO.getIdentificadoByORMID(aId_identificado));
			comentario.setORM_Noticia_contiene_comentarios(NoticiaDAO.getNoticiaByORMID(aId_noticia));
			comentario.setContenido(aContenido);
			ComentarioDAO.save(comentario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		
		Noticia noticia = null;
		t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(aId_noticia);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return noticia;
	}

	public Noticia Valorar_comentario(int aId_comentario, int aId_identificado, boolean aPositiva)
			throws PersistentException {
		Comentario comentario = null;
		Identificado identificado = null;
		if (aPositiva) {
			PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession()
					.beginTransaction();
			try {
				comentario = ComentarioDAO.getComentarioByORMID(aId_comentario);
				identificado = IdentificadoDAO.getIdentificadoByORMID(aId_identificado);
				if (comentario.valora_positivamente.contains(identificado)) {
					comentario.valora_positivamente.remove(identificado);
					comentario.setValoraciones_positivas(comentario.getValoraciones_positivas() - 1);
				} else {
					comentario.valora_positivamente.add(identificado);
					comentario.setValoraciones_positivas(comentario.getValoraciones_positivas() + 1);
					if (comentario.valora_negativamente.contains(identificado)) {
						comentario.valora_negativamente.remove(identificado);
						comentario.setValoraciones_negativas(comentario.getValoraciones_negativas() - 1);
					}
				}
				ComentarioDAO.save(comentario);
				t.commit();
			} catch (Exception e) {
				t.rollback();
			}
			MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		} else {
			PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession()
					.beginTransaction();
			try {
				comentario = ComentarioDAO.getComentarioByORMID(aId_comentario);
				identificado = IdentificadoDAO.getIdentificadoByORMID(aId_identificado);
				if (comentario.valora_negativamente.contains(identificado)) {
					comentario.valora_negativamente.remove(identificado);
					comentario.setValoraciones_negativas(comentario.getValoraciones_negativas() - 1);
				} else {
					comentario.valora_negativamente.add(identificado);
					comentario.setValoraciones_negativas(comentario.getValoraciones_negativas() + 1);
					if (comentario.valora_positivamente.contains(identificado)) {
						comentario.valora_positivamente.remove(identificado);
						comentario.setValoraciones_positivas(comentario.getValoraciones_positivas() - 1);
					}
				}
				ComentarioDAO.save(comentario);
				t.commit();
			} catch (Exception e) {
				t.rollback();
			}
			MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		}
		
		Noticia noticia = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(comentario.getNoticia_contiene_comentarios().getId_noticia());
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return noticia;
	}

	public Noticia Eliminar_comentario(int aId_comentario, int aId_editor) throws PersistentException {
		Comentario comentario = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			comentario = ComentarioDAO.getComentarioByORMID(aId_comentario);
			comentario.setORM_Elimina_comentario(EditorDAO.getEditorByORMID(aId_editor));
			ComentarioDAO.save(comentario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		
		Noticia noticia = null;
		t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
		try {
			noticia = NoticiaDAO.getNoticiaByORMID(comentario.getNoticia_contiene_comentarios().getId_noticia());
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return noticia;
	}
}