package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-buscaridentificado")
@JsModule("./src/vista-buscaridentificado.ts")
public class VistaBuscaridentificado extends LitTemplate {

	public Element getLayoutvistasbuscaridentificado() {
		return layoutvistasbuscaridentificado;
	}

	public void setLayoutvistasbuscaridentificado(Element layoutvistasbuscaridentificado) {
		this.layoutvistasbuscaridentificado = layoutvistasbuscaridentificado;
	}

	@Id("Layoutvistasbuscaridentificado")
	private Element layoutvistasbuscaridentificado;

	public VistaBuscaridentificado() {
        // You can initialise any data required for the connected UI components here.
    }

}