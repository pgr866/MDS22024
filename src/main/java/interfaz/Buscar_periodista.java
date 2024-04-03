package interfaz;

public class Buscar_periodista extends vistas.VistaBuscarperiodista {

	public Baja_Alta_Periodistas _baja_Alta_Periodistas;
	public Lista_periodistas _lista_periodistas;
	
	public Buscar_periodista(Baja_Alta_Periodistas _baja_Alta_Periodistas,
			interfaz.Lista_periodistas _lista_periodistas) {
		super();
		this._baja_Alta_Periodistas = _baja_Alta_Periodistas;
		this._lista_periodistas = _lista_periodistas;
	}

	public void Lista_periodistas() {
		throw new UnsupportedOperationException();
	}
}