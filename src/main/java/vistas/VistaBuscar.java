package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-buscar")
@JsModule("./src/vista-buscar.ts")
public class VistaBuscar extends LitTemplate {

	public Element getLayoutvistasbuscar() {
		return layoutvistasbuscar;
	}

	public void setLayoutvistasbuscar(Element layoutvistasbuscar) {
		this.layoutvistasbuscar = layoutvistasbuscar;
	}

	@Id("Layoutvistasbuscar")
	private Element layoutvistasbuscar;

	public VistaBuscar() {
        // You can initialise any data required for the connected UI components here.
    }

}