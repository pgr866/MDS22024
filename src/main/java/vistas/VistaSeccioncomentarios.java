package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;

@Tag("vista-seccioncomentarios")
@JsModule("./src/vista-seccioncomentarios.ts")
public class VistaSeccioncomentarios extends LitTemplate {

    public Element getLayoutseccioncomentarios() {
		return layoutseccioncomentarios;
	}

	public void setLayoutseccioncomentarios(Element layoutseccioncomentarios) {
		this.layoutseccioncomentarios = layoutseccioncomentarios;
	}

	public TextField getLabelcomentarios() {
		return labelcomentarios;
	}

	public void setLabelcomentarios(TextField labelcomentarios) {
		this.labelcomentarios = labelcomentarios;
	}

	public Element getSeccioncomentarios() {
		return seccioncomentarios;
	}

	public void setSeccioncomentarios(Element seccioncomentarios) {
		this.seccioncomentarios = seccioncomentarios;
	}

	public TextField getLabelseccioncomentarios() {
		return labelseccioncomentarios;
	}

	public void setLabelseccioncomentarios(TextField labelseccioncomentarios) {
		this.labelseccioncomentarios = labelseccioncomentarios;
	}

	@Id("Layoutseccioncomentarios")
	private Element layoutseccioncomentarios;
	@Id("Labelcomentarios")
	private TextField labelcomentarios;
	@Id("Seccioncomentarios")
	private Element seccioncomentarios;
	@Id("Labelseccioncomentarios")
	private TextField labelseccioncomentarios;

	public VistaSeccioncomentarios() {
        // You can initialise any data required for the connected UI components here.
    }

}