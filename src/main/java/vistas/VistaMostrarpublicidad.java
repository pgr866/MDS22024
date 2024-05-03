package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.dom.Element;

@Tag("vista-mostrarpublicidad")
@JsModule("./src/vista-mostrarpublicidad.ts")
public class VistaMostrarpublicidad extends LitTemplate {

	public Element getLayoutanunciomostrarpublidad() {
		return layoutanunciomostrarpublidad;
	}

	public void setLayoutanunciomostrarpublidad(Element layoutanunciomostrarpublidad) {
		this.layoutanunciomostrarpublidad = layoutanunciomostrarpublidad;
	}

	public Button getButtonanunciomostrarpublidad() {
		return buttonanunciomostrarpublidad;
	}

	public void setButtonanunciomostrarpublidad(Button buttonanunciomostrarpublidad) {
		this.buttonanunciomostrarpublidad = buttonanunciomostrarpublidad;
	}

	public Image getImagenmostrarpublidad() {
		return imagenmostrarpublidad;
	}

	public void setImagenmostrarpublidad(Image imagenmostrarpublidad) {
		this.imagenmostrarpublidad = imagenmostrarpublidad;
	}

	@Id("Layoutanunciomostrarpublidad")
	private Element layoutanunciomostrarpublidad;
	@Id("Buttonanunciomostrarpublidad")
	private Button buttonanunciomostrarpublidad;
	@Id("Imagenmostrarpublidad")
	private Image imagenmostrarpublidad;

	public VistaMostrarpublicidad() {
        // You can initialise any data required for the connected UI components here.
    }

}