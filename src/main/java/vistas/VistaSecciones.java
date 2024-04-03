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

	public Element getLayoutsecciones() {
		return layoutsecciones;
	}

	public void setLayoutsecciones(Element layoutsecciones) {
		this.layoutsecciones = layoutsecciones;
	}

	public Select getDesplegablesecciones() {
		return desplegablesecciones;
	}

	public void setDesplegablesecciones(Select desplegablesecciones) {
		this.desplegablesecciones = desplegablesecciones;
	}

	public Element getListboxsecciones() {
		return listboxsecciones;
	}

	public void setListboxsecciones(Element listboxsecciones) {
		this.listboxsecciones = listboxsecciones;
	}

	@Id("Layoutsecciones")
	private Element layoutsecciones;
	@Id("Desplegablesecciones")
	private Select desplegablesecciones;
	@Id("Listboxsecciones")
	private Element listboxsecciones;

	public VistaSecciones() {
        // You can initialise any data required for the connected UI components here.
    }

}