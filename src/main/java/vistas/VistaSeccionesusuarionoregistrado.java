package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.select.Select;

@Tag("vista-seccionesusuarionoregistrado")
@JsModule("./src/vista-seccionesusuarionoregistrado.ts")
public class VistaSeccionesusuarionoregistrado extends LitTemplate {

	public Element getListboxseccionesusuarionoregistrado() {
		return listboxseccionesusuarionoregistrado;
	}

	public void setListboxseccionesusuarionoregistrado(Element listboxseccionesusuarionoregistrado) {
		this.listboxseccionesusuarionoregistrado = listboxseccionesusuarionoregistrado;
	}

	public Element getLayoutseccionesusuarionoregistrado() {
		return layoutseccionesusuarionoregistrado;
	}

	public void setLayoutseccionesusuarionoregistrado(Element layoutseccionesusuarionoregistrado) {
		this.layoutseccionesusuarionoregistrado = layoutseccionesusuarionoregistrado;
	}

	public Select getDesplegableseccionesusuarionoregistrado() {
		return desplegableseccionesusuarionoregistrado;
	}

	public void setDesplegableseccionesusuarionoregistrado(Select desplegableseccionesusuarionoregistrado) {
		this.desplegableseccionesusuarionoregistrado = desplegableseccionesusuarionoregistrado;
	}

	@Id("Layoutseccionesusuarionoregistrado")
	private Element layoutseccionesusuarionoregistrado;
	@Id("Desplegableseccionesusuarionoregistrado")
	private Select desplegableseccionesusuarionoregistrado;
	@Id("Listboxseccionesusuarionoregistrado")
	private Element listboxseccionesusuarionoregistrado;
	public VistaSeccionesusuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}