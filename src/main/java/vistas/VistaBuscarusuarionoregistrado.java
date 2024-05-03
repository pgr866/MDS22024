package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-buscarusuarionoregistrado")
@JsModule("./src/vista-buscarusuarionoregistrado.ts")
public class VistaBuscarusuarionoregistrado extends LitTemplate {

	public Element getLayoutvistasbuscarusuarionoregistrado() {
		return layoutvistasbuscarusuarionoregistrado;
	}

	public void setLayoutvistasbuscarusuarionoregistrado(Element layoutvistasbuscarusuarionoregistrado) {
		this.layoutvistasbuscarusuarionoregistrado = layoutvistasbuscarusuarionoregistrado;
	}

	@Id("Layoutvistasbuscarusuarionoregistrado")
	private Element layoutvistasbuscarusuarionoregistrado;

	public VistaBuscarusuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}