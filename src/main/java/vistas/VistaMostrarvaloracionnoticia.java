package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

@Tag("vista-mostrarvaloracionnoticia")
@JsModule("./src/vista-mostrarvaloracionnoticia.ts")
public class VistaMostrarvaloracionnoticia extends LitTemplate {

    public HorizontalLayout getLayoutmegustanomegustamostrarvaloracionnoticia() {
		return layoutmegustanomegustamostrarvaloracionnoticia;
	}

	public void setLayoutmegustanomegustamostrarvaloracionnoticia(
			HorizontalLayout layoutmegustanomegustamostrarvaloracionnoticia) {
		this.layoutmegustanomegustamostrarvaloracionnoticia = layoutmegustanomegustamostrarvaloracionnoticia;
	}

	public Button getMegustamostrarvaloracionnoticia() {
		return megustamostrarvaloracionnoticia;
	}

	public void setMegustamostrarvaloracionnoticia(Button megustamostrarvaloracionnoticia) {
		this.megustamostrarvaloracionnoticia = megustamostrarvaloracionnoticia;
	}

	public Image getImagenmegustamostrarvaloracionnoticia() {
		return imagenmegustamostrarvaloracionnoticia;
	}

	public void setImagenmegustamostrarvaloracionnoticia(Image imagenmegustamostrarvaloracionnoticia) {
		this.imagenmegustamostrarvaloracionnoticia = imagenmegustamostrarvaloracionnoticia;
	}

	public Label getNumeromegustamostrarvaloracionnoticia() {
		return numeromegustamostrarvaloracionnoticia;
	}

	public void setNumeromegustamostrarvaloracionnoticia(Label numeromegustamostrarvaloracionnoticia) {
		this.numeromegustamostrarvaloracionnoticia = numeromegustamostrarvaloracionnoticia;
	}

	public Button getNomegustamostrarvaloracionnoticia() {
		return nomegustamostrarvaloracionnoticia;
	}

	public void setNomegustamostrarvaloracionnoticia(Button nomegustamostrarvaloracionnoticia) {
		this.nomegustamostrarvaloracionnoticia = nomegustamostrarvaloracionnoticia;
	}

	public Image getImagennomegustamostrarvaloracionnoticia() {
		return imagennomegustamostrarvaloracionnoticia;
	}

	public void setImagennomegustamostrarvaloracionnoticia(Image imagennomegustamostrarvaloracionnoticia) {
		this.imagennomegustamostrarvaloracionnoticia = imagennomegustamostrarvaloracionnoticia;
	}

	public Label getNumeronomegustamostrarvaloracionnoticia() {
		return numeronomegustamostrarvaloracionnoticia;
	}

	public void setNumeronomegustamostrarvaloracionnoticia(Label numeronomegustamostrarvaloracionnoticia) {
		this.numeronomegustamostrarvaloracionnoticia = numeronomegustamostrarvaloracionnoticia;
	}

	@Id("Layoutmegustanomegustamostrarvaloracionnoticia")
	private HorizontalLayout layoutmegustanomegustamostrarvaloracionnoticia;
	@Id("Megustamostrarvaloracionnoticia")
	private Button megustamostrarvaloracionnoticia;
	@Id("Imagenmegustamostrarvaloracionnoticia")
	private Image imagenmegustamostrarvaloracionnoticia;
	@Id("Numeromegustamostrarvaloracionnoticia")
	private Label numeromegustamostrarvaloracionnoticia;
	@Id("Nomegustamostrarvaloracionnoticia")
	private Button nomegustamostrarvaloracionnoticia;
	@Id("Imagennomegustamostrarvaloracionnoticia")
	private Image imagennomegustamostrarvaloracionnoticia;
	@Id("Numeronomegustamostrarvaloracionnoticia")
	private Label numeronomegustamostrarvaloracionnoticia;

	public VistaMostrarvaloracionnoticia() {
        // You can initialise any data required for the connected UI components here.
    }

}