package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.combobox.ComboBox;

@Tag("vista-seccionesusuarionoregistrado")
@JsModule("./src/vista-seccionesusuarionoregistrado.ts")
public class VistaSeccionesusuarionoregistrado extends LitTemplate {

	public ComboBox<String> getComboboxseccionesusuarionoregistrado() {
		return comboboxseccionesusuarionoregistrado;
	}

	public void setComboboxseccionesusuarionoregistrado(ComboBox<String> comboboxseccionesusuarionoregistrado) {
		this.comboboxseccionesusuarionoregistrado = comboboxseccionesusuarionoregistrado;
	}

	public Element getLayoutseccionesusuarionoregistrado() {
		return layoutseccionesusuarionoregistrado;
	}

	public void setLayoutseccionesusuarionoregistrado(Element layoutseccionesusuarionoregistrado) {
		this.layoutseccionesusuarionoregistrado = layoutseccionesusuarionoregistrado;
	}

	@Id("Layoutseccionesusuarionoregistrado")
	private Element layoutseccionesusuarionoregistrado;
	@Id("Comboboxseccionesusuarionoregistrado")
	private ComboBox<String> comboboxseccionesusuarionoregistrado;
	public VistaSeccionesusuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}