package interfaz;

import com.vaadin.flow.component.UI;

public class Gestionar_publicidad {

	public Gestor_de_publicidad _gestor_de_publicidad;
	public Mostrar_publicidad _mostrar_publicidad;

	public Gestionar_publicidad(Mostrar_publicidad _mostrar_publicidad) {
		super();
		this._mostrar_publicidad = _mostrar_publicidad;
		Publicidad();
	}
	
	public void Publicidad() {
		this._mostrar_publicidad.getImagenmostrarpublidad().setSrc("https://i.postimg.cc/Vs0hp5Rx/anuncio.png");
		this._mostrar_publicidad.getButtonanunciomostrarpublidad().addClickListener(event -> {
			UI.getCurrent().getPage().setLocation("https://www.coca-cola.com/");
		});
	}
}