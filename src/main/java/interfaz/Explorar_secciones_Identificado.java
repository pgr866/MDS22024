package interfaz;

public class Explorar_secciones_Identificado extends Explorar_secciones {

	public Identificado _identificado;
	public Noticias_en_seccion_Identificado _noticias_en_seccion_Identificado;

	public Explorar_secciones_Identificado(Identificado _identificado) {
		super();
		this._identificado = _identificado;
		this._noticias_en_seccion_Identificado = new Noticias_en_seccion_Identificado(this);
		//this.get
		this.getLayoutnombrebotonesexplorarsecciones().setVisible(false);
		Noticias_en_seccion_Identificado();
	}
	
	public void Noticias_en_seccion_Identificado() {
		this.getLayoutvistasnoticiasenseccionexplorarsecciones().add(_noticias_en_seccion_Identificado);
	}
}