package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listaperiodistas_item")
@JsModule("./src/vista-listaperiodistas_item.ts")
public class VistaListaperiodistas_item extends LitTemplate {

    public Element getItemlistaperiodistas() {
		return itemlistaperiodistas;
	}

	public void setItemlistaperiodistas(Element itemlistaperiodistas) {
		this.itemlistaperiodistas = itemlistaperiodistas;
	}

	@Id("Itemlistaperiodistas")
	private Element itemlistaperiodistas;

	public VistaListaperiodistas_item() {
        // You can initialise any data required for the connected UI components here.
    }

}