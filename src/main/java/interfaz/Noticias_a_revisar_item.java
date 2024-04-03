package interfaz;

import vistas.VistaNoticiasarevisar_item;

public class Noticias_a_revisar_item extends VistaNoticiasarevisar_item {
	public Noticias_a_revisar _noticias_a_revisar;
	public Revisar_noticias _revisar_noticias;
	
	public Noticias_a_revisar_item(Noticias_a_revisar _noticias_a_revisar,
			interfaz.Revisar_noticias _revisar_noticias) {
		super();
		this._noticias_a_revisar = _noticias_a_revisar;
		this._revisar_noticias = _revisar_noticias;
	}



	public void Revisar_noticias() {
		throw new UnsupportedOperationException();
	}
}