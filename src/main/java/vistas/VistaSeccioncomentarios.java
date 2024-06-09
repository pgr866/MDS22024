package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextArea;

@Tag("vista-seccioncomentarios")
@JsModule("./src/vista-seccioncomentarios.ts")
public class VistaSeccioncomentarios extends LitTemplate {

	public Label getLabelmensajenohaycomentarios() {
		return labelmensajenohaycomentarios;
	}

	public void setLabelmensajenohaycomentarios(Label labelmensajenohaycomentarios) {
		this.labelmensajenohaycomentarios = labelmensajenohaycomentarios;
	}

	public Element getLayoutseccioncomentarios() {
		return layoutseccioncomentarios;
	}

	public void setLayoutseccioncomentarios(Element layoutseccioncomentarios) {
		this.layoutseccioncomentarios = layoutseccioncomentarios;
	}
	
	public Element getLayoutvistaseccioncomentarios() {
		return layoutvistaseccioncomentarios;
	}

	public void setLayoutvistaseccioncomentarios(Element layoutvistaseccioncomentarios) {
		this.layoutvistaseccioncomentarios = layoutvistaseccioncomentarios;
	}

	@Id("Layoutseccioncomentarios")
	private Element layoutseccioncomentarios;
	@Id("Layoutvistaseccioncomentarios")
	private Element layoutvistaseccioncomentarios;
	@Id("Labelmensajenohaycomentarios")
	private Label labelmensajenohaycomentarios;
	public VistaSeccioncomentarios() {
        // You can initialise any data required for the connected UI components here.
    }

}