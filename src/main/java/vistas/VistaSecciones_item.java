package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-secciones_item")
@JsModule("./src/vista-secciones_item.ts")
public class VistaSecciones_item extends LitTemplate {

	public Element getItemsecciones() {
		return itemsecciones;
	}

	public void setItemsecciones(Element itemsecciones) {
		this.itemsecciones = itemsecciones;
	}

	@Id("Itemsecciones")
	private Element itemsecciones;

	public VistaSecciones_item() {
        // You can initialise any data required for the connected UI components here.
    }

}