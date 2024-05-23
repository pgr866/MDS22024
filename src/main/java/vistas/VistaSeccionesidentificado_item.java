package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-seccionesidentificado_item")
@JsModule("./src/vista-seccionesidentificado_item.ts")
public class VistaSeccionesidentificado_item extends LitTemplate {

	public Element getItemseccionesidentificado() {
		return itemseccionesidentificado;
	}

	public void setItemseccionesidentificado(Element itemseccionesidentificado) {
		this.itemseccionesidentificado = itemseccionesidentificado;
	}

	@Id("Itemseccionesidentificado")
	private Element itemseccionesidentificado;

	public VistaSeccionesidentificado_item() {
        // You can initialise any data required for the connected UI components here.
    }

}