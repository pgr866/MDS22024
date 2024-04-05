/**
 * Licensee: Pablo(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS12324PFFornielesGomezDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance());
			base_de_datos.MDS12324PFFornielesGomezPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
