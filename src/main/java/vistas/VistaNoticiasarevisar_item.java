package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-noticiasarevisar_item")
@JsModule("./src/vista-noticiasarevisar_item.ts")
public class VistaNoticiasarevisar_item extends LitTemplate {

	public Element getItemnoticiasarevisar() {
		return itemnoticiasarevisar;
	}

	public void setItemnoticiasarevisar(Element itemnoticiasarevisar) {
		this.itemnoticiasarevisar = itemnoticiasarevisar;
	}

	@Id("Itemnoticiasarevisar")
	private Element itemnoticiasarevisar;
	public VistaNoticiasarevisar_item() {
        // You can initialise any data required for the connected UI components here.
    }

}