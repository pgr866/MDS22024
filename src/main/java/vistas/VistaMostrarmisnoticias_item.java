package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-mostrarmisnoticias_item")
@JsModule("./src/vista-mostrarmisnoticias_item.ts")
public class VistaMostrarmisnoticias_item extends LitTemplate {

	public Element getLayoutmostrarmisnoticiasitem() {
		return layoutmostrarmisnoticiasitem;
	}

	public void setLayoutmostrarmisnoticiasitem(Element layoutmostrarmisnoticiasitem) {
		this.layoutmostrarmisnoticiasitem = layoutmostrarmisnoticiasitem;
	}

	@Id("Layoutmostrarmisnoticiasitem")
	private Element layoutmostrarmisnoticiasitem;
	
	public VistaMostrarmisnoticias_item() {
        // You can initialise any data required for the connected UI components here.
    }

}