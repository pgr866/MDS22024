package basededatos;

import base_de_datos.BDPrincipal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Tematicas {
	
	public java.util.Vector<Tematica> _contiene_tematicas = new Vector<Tematica>();
	public BDPrincipal _bd_main_tematica;

	public Tematica[] Cargar_tematicas(String aTematicas) throws PersistentException {
		List<Tematica> tematicas = null;
		PersistentTransaction t = MDS12324PFFornielesGomezPersistentManager.instance().getSession().beginTransaction();
				try {
					tematicas = TematicaDAO.queryTematica(null, null);
					t.commit();
				} catch (Exception e) {
					t.rollback();
				}
				
				List<String> tematicas_existentes = new ArrayList<>();
				for (Tematica tematica : tematicas)
					tematicas_existentes.add(tematica.getTitulo_tematica());
				
				List<String> tematicas_aportadas = Arrays.stream(aTematicas.split(",")).map(String::trim).collect(Collectors.toList());
				
		        for (String tematica : tematicas_aportadas) {
		        	if (!tematicas_existentes.contains(tematica)) {
		        		try {
		        			Tematica nueva_tematica = TematicaDAO.createTematica();
		        			nueva_tematica.setTitulo_tematica(aTematicas);;
		        			TematicaDAO.save(nueva_tematica);
		        			t.commit();
		        			tematicas.add(nueva_tematica);
		        		}
		        			catch (Exception e) {
		        			t.rollback();
		        		}
		        		MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		        	}
		        }

				return (Tematica[]) tematicas.toArray();
	}
}