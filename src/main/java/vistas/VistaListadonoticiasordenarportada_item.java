package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadonoticiasordenarportada_item")
@JsModule("./src/vista-listadonoticiasordenarportada_item.ts")
public class VistaListadonoticiasordenarportada_item extends LitTemplate {

	public Element getLayoutlistadonoticiasordenarportadaitem() {
		return layoutlistadonoticiasordenarportadaitem;
	}

	public void setLayoutlistadonoticiasordenarportadaitem(Element layoutlistadonoticiasordenarportadaitem) {
		this.layoutlistadonoticiasordenarportadaitem = layoutlistadonoticiasordenarportadaitem;
	}

	@Id("Layoutlistadonoticiasordenarportadaitem")
	private Element layoutlistadonoticiasordenarportadaitem;

	public VistaListadonoticiasordenarportada_item() {
        // You can initialise any data required for the connected UI components here.
    }

}