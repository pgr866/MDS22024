package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

@Tag("vista-mostrarvaloracioncomentario")
@JsModule("./src/vista-mostrarvaloracioncomentario.ts")
public class VistaMostrarvaloracioncomentario extends LitTemplate {

	public HorizontalLayout getLayoutmegustamostrarvaloracioncomentario() {
		return layoutmegustamostrarvaloracioncomentario;
	}

	public void setLayoutmegustamostrarvaloracioncomentario(HorizontalLayout layoutmegustamostrarvaloracioncomentario) {
		this.layoutmegustamostrarvaloracioncomentario = layoutmegustamostrarvaloracioncomentario;
	}

	public Button getMegustaseccioncomentariositem() {
		return megustaseccioncomentariositem;
	}

	public void setMegustaseccioncomentariositem(Button megustaseccioncomentariositem) {
		this.megustaseccioncomentariositem = megustaseccioncomentariositem;
	}

	public Image getImagenmegustaseccioncomentariositem() {
		return imagenmegustaseccioncomentariositem;
	}

	public void setImagenmegustaseccioncomentariositem(Image imagenmegustaseccioncomentariositem) {
		this.imagenmegustaseccioncomentariositem = imagenmegustaseccioncomentariositem;
	}

	public Label getNumeromegustamostrarvaloracioncomentario() {
		return numeromegustamostrarvaloracioncomentario;
	}

	public void setNumeromegustamostrarvaloracioncomentario(Label numeromegustamostrarvaloracioncomentario) {
		this.numeromegustamostrarvaloracioncomentario = numeromegustamostrarvaloracioncomentario;
	}

	public HorizontalLayout getLayoutnomegustamostrarvaloracioncomentario() {
		return layoutnomegustamostrarvaloracioncomentario;
	}

	public void setLayoutnomegustamostrarvaloracioncomentario(HorizontalLayout layoutnomegustamostrarvaloracioncomentario) {
		this.layoutnomegustamostrarvaloracioncomentario = layoutnomegustamostrarvaloracioncomentario;
	}

	public Button getNomegustaseccioncomentariositem() {
		return nomegustaseccioncomentariositem;
	}

	public void setNomegustaseccioncomentariositem(Button nomegustaseccioncomentariositem) {
		this.nomegustaseccioncomentariositem = nomegustaseccioncomentariositem;
	}

	public Image getImagennomegustaseccioncomentariositem() {
		return imagennomegustaseccioncomentariositem;
	}

	public void setImagennomegustaseccioncomentariositem(Image imagennomegustaseccioncomentariositem) {
		this.imagennomegustaseccioncomentariositem = imagennomegustaseccioncomentariositem;
	}

	public Label getNumeronomegustamostrarvaloracioncomentario() {
		return numeronomegustamostrarvaloracioncomentario;
	}

	public void setNumeronomegustamostrarvaloracioncomentario(Label numeronomegustamostrarvaloracioncomentario) {
		this.numeronomegustamostrarvaloracioncomentario = numeronomegustamostrarvaloracioncomentario;
	}

	@Id("Layoutmegustamostrarvaloracioncomentario")
	private HorizontalLayout layoutmegustamostrarvaloracioncomentario;
	@Id("Megustaseccioncomentariositem")
	private Button megustaseccioncomentariositem;
	@Id("Imagenmegustaseccioncomentariositem")
	private Image imagenmegustaseccioncomentariositem;
	@Id("Numeromegustamostrarvaloracioncomentario")
	private Label numeromegustamostrarvaloracioncomentario;
	@Id("Layoutnomegustamostrarvaloracioncomentario")
	private HorizontalLayout layoutnomegustamostrarvaloracioncomentario;
	@Id("Nomegustaseccioncomentariositem")
	private Button nomegustaseccioncomentariositem;
	@Id("Imagennomegustaseccioncomentariositem")
	private Image imagennomegustaseccioncomentariositem;
	@Id("Numeronomegustamostrarvaloracioncomentario")
	private Label numeronomegustamostrarvaloracioncomentario;

	public VistaMostrarvaloracioncomentario() {
        // You can initialise any data required for the connected UI components here.
    }

}