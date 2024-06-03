package base_de_datos;

import org.orm.PersistentException;

public interface iUsuario_Suscrito extends iIdentificado {

	public void Eliminar_cuenta(int aId) throws PersistentException;
}