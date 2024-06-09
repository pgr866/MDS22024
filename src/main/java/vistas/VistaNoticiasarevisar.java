package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.combobox.ComboBox;

@Tag("vista-noticiasarevisar")
@JsModule("./src/vista-noticiasarevisar.ts")
public class VistaNoticiasarevisar extends LitTemplate {

	public ComboBox<String> getComboboxnoticiasarevisar() {
		return comboboxnoticiasarevisar;
	}

	public void setComboboxnoticiasarevisar(ComboBox<String> comboboxnoticiasarevisar) {
		this.comboboxnoticiasarevisar = comboboxnoticiasarevisar;
	}

	public Element getLayoutnoticiasarevisar() {
		return layoutnoticiasarevisar;
	}

	public void setLayoutnoticiasarevisar(Element layoutnoticiasarevisar) {
		this.layoutnoticiasarevisar = layoutnoticiasarevisar;
	}

	@Id("Layoutnoticiasarevisar")
	private Element layoutnoticiasarevisar;
	@Id("Comboboxnoticiasarevisar")
	private ComboBox<String> comboboxnoticiasarevisar;
	public VistaNoticiasarevisar() {
        // You can initialise any data required for the connected UI components here.
    }

}