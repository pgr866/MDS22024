package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextArea;

@Tag("vista-seccioncomentarios")
@JsModule("./src/vista-seccioncomentarios.ts")
public class VistaSeccioncomentarios extends LitTemplate {

	@Id("Layoutseccioncomentarios")
	private Element layoutseccioncomentarios;
	@Id("Labelseccioncomentarios")
	private Label labelseccioncomentarios;
	@Id("Layoutcomentarioseccioncomentarios")
	private HorizontalLayout layoutcomentarioseccioncomentarios;
	@Id("Botonanadircomentarioseccioncomentarios")
	private Button botonanadircomentarioseccioncomentarios;
	@Id("vaadinTextArea")
	private TextArea vaadinTextArea;
	@Id("Layoutvistaseccioncomentarios")
	private Element layoutvistaseccioncomentarios;

	public VistaSeccioncomentarios() {
        // You can initialise any data required for the connected UI components here.
    }

}