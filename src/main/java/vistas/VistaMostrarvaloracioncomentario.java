package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

@Tag("vista-mostrarvaloracioncomentario")
@JsModule("./src/vista-mostrarvaloracioncomentario.ts")
public class VistaMostrarvaloracioncomentario extends LitTemplate {

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