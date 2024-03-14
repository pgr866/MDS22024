package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.select.Select;

@Tag("vista-secciones")
@JsModule("./src/vista-secciones.ts")
public class VistaSecciones extends LitTemplate {

    public Element getSecciones() {
		return secciones;
	}

	public void setSecciones(Element secciones) {
		this.secciones = secciones;
	}

	public TextField getLabelsecciones() {
		return labelsecciones;
	}

	public void setLabelsecciones(TextField labelsecciones) {
		this.labelsecciones = labelsecciones;
	}

	public Select getDesplegablesecciones() {
		return desplegablesecciones;
	}

	public void setDesplegablesecciones(Select desplegablesecciones) {
		this.desplegablesecciones = desplegablesecciones;
	}

	@Id("secciones")
	private Element secciones;
	@Id("Labelsecciones")
	private TextField labelsecciones;
	@Id("Desplegablesecciones")
	private Select desplegablesecciones;

	public VistaSecciones() {
        // You can initialise any data required for the connected UI components here.
    }

}