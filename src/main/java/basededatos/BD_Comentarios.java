package basededatos;

import base_de_datos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Comentario;

public class BD_Comentarios {

	public Vector<Comentario> _contiene_comentarios = new Vector<Comentario>();
	public BDPrincipal _bd_main_comentario;

	public void Comentar(int aId_identificado, int aId_noticia, String aContenido) throws PersistentException {
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
	}

	public void Valorar_comentario(int aId_comentario, int aId_identificado, boolean aPositiva) {
		if (aPositiva) {
			
		} else {
			
		}
	}

	public void Eliminar_comentario(int aId_comentario, int aId_editor) throws PersistentException {
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
	}
}