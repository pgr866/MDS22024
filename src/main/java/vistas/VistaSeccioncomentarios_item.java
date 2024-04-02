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