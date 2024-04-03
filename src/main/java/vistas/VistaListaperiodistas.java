package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.combobox.ComboBox;

@Tag("vista-listaperiodistas")
@JsModule("./src/vista-listaperiodistas.ts")
public class VistaListaperiodistas extends LitTemplate {

	public Element getLayoutlistaperiodistas() {
		return layoutlistaperiodistas;
	}

	public void setLayoutlistaperiodistas(Element layoutlistaperiodistas) {
		this.layoutlistaperiodistas = layoutlistaperiodistas;
	}

	public ComboBox<String> getComboboxlistaperiodistas() {
		return comboboxlistaperiodistas;
	}

	public void setComboboxlistaperiodistas(ComboBox<String> comboboxlistaperiodistas) {
		this.comboboxlistaperiodistas = comboboxlistaperiodistas;
	}

	@Id("Layoutlistaperiodistas")
	private Element layoutlistaperiodistas;
	@Id("Comboboxlistaperiodistas")
	private ComboBox<String> comboboxlistaperiodistas;

	public VistaListaperiodistas() {
        // You can initialise any data required for the connected UI components here.
    }

}