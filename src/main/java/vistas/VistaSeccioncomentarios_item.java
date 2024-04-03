package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import vistas.VistaMostrarcomentario;
import vistas.VistaMostrarvaloracioncomentario;

@Tag("vista-seccioncomentarios_item")
@JsModule("./src/vista-seccioncomentarios_item.ts")
public class VistaSeccioncomentarios_item extends LitTemplate {

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Image getFotousuarioseccioncomentariositem() {
		return fotousuarioseccioncomentariositem;
	}

	public void setFotousuarioseccioncomentariositem(Image fotousuarioseccioncomentariositem) {
		this.fotousuarioseccioncomentariositem = fotousuarioseccioncomentariositem;
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

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Element getLayoutvistamostrarcomentarioseccioncomentariositem() {
		return layoutvistamostrarcomentarioseccioncomentariositem;
	}

	public void setLayoutvistamostrarcomentarioseccioncomentariositem(
			Element layoutvistamostrarcomentarioseccioncomentariositem) {
		this.layoutvistamostrarcomentarioseccioncomentariositem = layoutvistamostrarcomentarioseccioncomentariositem;
	}

	public VistaMostrarcomentario getVistamostrarcomentarioseccioncomentariositem() {
		return vistamostrarcomentarioseccioncomentariositem;
	}

	public void setVistamostrarcomentarioseccioncomentariositem(
			VistaMostrarcomentario vistamostrarcomentarioseccioncomentariositem) {
		this.vistamostrarcomentarioseccioncomentariositem = vistamostrarcomentarioseccioncomentariositem;
	}

	public Element getLayoutborrarcomentarioseccioncomentariositem() {
		return layoutborrarcomentarioseccioncomentariositem;
	}

	public void setLayoutborrarcomentarioseccioncomentariositem(Element layoutborrarcomentarioseccioncomentariositem) {
		this.layoutborrarcomentarioseccioncomentariositem = layoutborrarcomentarioseccioncomentariositem;
	}

	public Image getImagenborrarcomentarioseccioncomentariositem() {
		return imagenborrarcomentarioseccioncomentariositem;
	}

	public void setImagenborrarcomentarioseccioncomentariositem(Image imagenborrarcomentarioseccioncomentariositem) {
		this.imagenborrarcomentarioseccioncomentariositem = imagenborrarcomentarioseccioncomentariositem;
	}

	public Button getSeccioncomentariositem() {
		return seccioncomentariositem;
	}

	public void setSeccioncomentariositem(Button seccioncomentariositem) {
		this.seccioncomentariositem = seccioncomentariositem;
	}

	public Element getLayoutvistamostrarvaloracioncomentarioseccioncomentariositem() {
		return layoutvistamostrarvaloracioncomentarioseccioncomentariositem;
	}

	public void setLayoutvistamostrarvaloracioncomentarioseccioncomentariositem(
			Element layoutvistamostrarvaloracioncomentarioseccioncomentariositem) {
		this.layoutvistamostrarvaloracioncomentarioseccioncomentariositem = layoutvistamostrarvaloracioncomentarioseccioncomentariositem;
	}

	public VistaMostrarvaloracioncomentario getVistamostrarcomentarioseccioncomentariositem1() {
		return vistamostrarcomentarioseccioncomentariositem1;
	}

	public void setVistamostrarcomentarioseccioncomentariositem1(
			VistaMostrarvaloracioncomentario vistamostrarcomentarioseccioncomentariositem1) {
		this.vistamostrarcomentarioseccioncomentariositem1 = vistamostrarcomentarioseccioncomentariositem1;
	}

	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("Fotousuarioseccioncomentariositem")
	private Image fotousuarioseccioncomentariositem;
	@Id("Layoutnickusuarioseccioncomentariositem")
	private Element layoutnickusuarioseccioncomentariositem;
	@Id("Labelnickusuarioseccioncomentariositem")
	private Label labelnickusuarioseccioncomentariositem;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("Layoutvistamostrarcomentarioseccioncomentariositem")
	private Element layoutvistamostrarcomentarioseccioncomentariositem;
	@Id("Vistamostrarcomentarioseccioncomentariositem")
	private VistaMostrarcomentario vistamostrarcomentarioseccioncomentariositem;
	@Id("Layoutborrarcomentarioseccioncomentariositem")
	private Element layoutborrarcomentarioseccioncomentariositem;
	@Id("Imagenborrarcomentarioseccioncomentariositem")
	private Image imagenborrarcomentarioseccioncomentariositem;
	@Id("seccioncomentariositem")
	private Button seccioncomentariositem;
	@Id("Layoutvistamostrarvaloracioncomentarioseccioncomentariositem")
	private Element layoutvistamostrarvaloracioncomentarioseccioncomentariositem;
	@Id("Vistamostrarcomentarioseccioncomentariositem1")
	private VistaMostrarvaloracioncomentario vistamostrarcomentarioseccioncomentariositem1;

	public VistaSeccioncomentarios_item() {
        // You can initialise any data required for the connected UI components here.
    }

}