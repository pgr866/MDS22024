package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-seccionesusuarionoregistrado_item")
@JsModule("./src/vista-seccionesusuarionoregistrado_item.ts")
public class VistaSeccionesusuarionoregistrado_item extends LitTemplate {

	public Element getItemseccionesusuarionoregistrado() {
		return itemseccionesusuarionoregistrado;
	}

	public void setItemseccionesusuarionoregistrado(Element itemseccionesusuarionoregistrado) {
		this.itemseccionesusuarionoregistrado = itemseccionesusuarionoregistrado;
	}

	@Id("Itemseccionesusuarionoregistrado")
	private Element itemseccionesusuarionoregistrado;

	public VistaSeccionesusuarionoregistrado_item() {
        // You can initialise any data required for the connected UI components here.
    }

}