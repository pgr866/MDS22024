package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

@Tag("vista-seccioncomentarios_item")
@JsModule("./src/vista-seccioncomentarios_item.ts")
public class VistaSeccioncomentarios_item extends LitTemplate {

	public Button getButtonborrarcomentario() {
		return buttonborrarcomentario;
	}

	public void setButtonborrarcomentario(Button buttonborrarcomentario) {
		this.buttonborrarcomentario = buttonborrarcomentario;
	}

	public Element getLayoutborrarcomentarioseccioncomentariositem() {
		return layoutborrarcomentarioseccioncomentariositem;
	}

	public void setLayoutborrarcomentarioseccioncomentariositem(Element layoutborrarcomentarioseccioncomentariositem) {
		this.layoutborrarcomentarioseccioncomentariositem = layoutborrarcomentarioseccioncomentariositem;
	}

	public Element getLayoutfotousuarioseccioncomentariositem() {
		return layoutfotousuarioseccioncomentariositem;
	}

	public void setLayoutfotousuarioseccioncomentariositem(Element layoutfotousuarioseccioncomentariositem) {
		this.layoutfotousuarioseccioncomentariositem = layoutfotousuarioseccioncomentariositem;
	}

	public Element getLayoutnickusuarioseccioncomentariositem() {
		return layoutnickusuarioseccioncomentariositem;
	}

	public void setLayoutnickusuarioseccioncomentariositem(Element layoutnickusuarioseccioncomentariositem) {
		this.layoutnickusuarioseccioncomentariositem = layoutnickusuarioseccioncomentariositem;
	}

	public Label getLabelnickusuarioseccioncomentariositem() {
		return labelnickusuarioseccioncomentariositem;
	}

	public void setLabelnickusuarioseccioncomentariositem(Label labelnickusuarioseccioncomentariositem) {
		this.labelnickusuarioseccioncomentariositem = labelnickusuarioseccioncomentariositem;
	}

	public Element getLayoutvistamostrarcomentarioseccioncomentariositem() {
		return layoutvistamostrarcomentarioseccioncomentariositem;
	}

	public void setLayoutvistamostrarcomentarioseccioncomentariositem(
			Element layoutvistamostrarcomentarioseccioncomentariositem) {
		this.layoutvistamostrarcomentarioseccioncomentariositem = layoutvistamostrarcomentarioseccioncomentariositem;
	}

	public Image getImagenborrarcomentarioseccioncomentariositem() {
		return imagenborrarcomentarioseccioncomentariositem;
	}

	public void setImagenborrarcomentarioseccioncomentariositem(Image imagenborrarcomentarioseccioncomentariositem) {
		this.imagenborrarcomentarioseccioncomentariositem = imagenborrarcomentarioseccioncomentariositem;
	}

	public Element getLayoutvistamostrarvaloracioncomentarioseccioncomentariositem() {
		return layoutvistamostrarvaloracioncomentarioseccioncomentariositem;
	}

	public void setLayoutvistamostrarvaloracioncomentarioseccioncomentariositem(
			Element layoutvistamostrarvaloracioncomentarioseccioncomentariositem) {
		this.layoutvistamostrarvaloracioncomentarioseccioncomentariositem = layoutvistamostrarvaloracioncomentarioseccioncomentariositem;
	}

	@Id("Layoutnickusuarioseccioncomentariositem")
	private Element layoutnickusuarioseccioncomentariositem;
	@Id("Labelnickusuarioseccioncomentariositem")
	private Label labelnickusuarioseccioncomentariositem;
	@Id("Layoutvistamostrarcomentarioseccioncomentariositem")
	private Element layoutvistamostrarcomentarioseccioncomentariositem;
	@Id("Layoutborrarcomentarioseccioncomentariositem")
	private Element layoutborrarcomentarioseccioncomentariositem;
	@Id("Imagenborrarcomentarioseccioncomentariositem")
	private Image imagenborrarcomentarioseccioncomentariositem;
	@Id("Layoutvistamostrarvaloracioncomentarioseccioncomentariositem")
	private Element layoutvistamostrarvaloracioncomentarioseccioncomentariositem;
	@Id("Layoutfotousuarioseccioncomentariositem")
	private Element layoutfotousuarioseccioncomentariositem;
	@Id("Buttonborrarcomentario")
	private Button buttonborrarcomentario;
	public VistaSeccioncomentarios_item() {
        // You can initialise any data required for the connected UI components here.
    }

}