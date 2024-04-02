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