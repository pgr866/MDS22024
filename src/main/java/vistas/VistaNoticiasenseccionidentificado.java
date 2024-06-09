package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;

@Tag("vista-noticiasenseccionidentificado")
@JsModule("./src/vista-noticiasenseccionidentificado.ts")
public class VistaNoticiasenseccionidentificado extends LitTemplate {

	public Element getLayoutnoticiasenseccionidentificado() {
		return layoutnoticiasenseccionidentificado;
	}

	public void setLayoutnoticiasenseccionidentificado(Element layoutnoticiasenseccionidentificado) {
		this.layoutnoticiasenseccionidentificado = layoutnoticiasenseccionidentificado;
	}

	public HorizontalLayout getNoticiasenseccionidentificado() {
		return noticiasenseccionidentificado;
	}

	public void setNoticiasenseccionidentificado(HorizontalLayout noticiasenseccionidentificado) {
		this.noticiasenseccionidentificado = noticiasenseccionidentificado;
	}

	@Id("Layoutnoticiasenseccionidentificado")
	private Element layoutnoticiasenseccionidentificado;
	@Id("Noticiasenseccionidentificado")
	private HorizontalLayout noticiasenseccionidentificado;
	public VistaNoticiasenseccionidentificado() {
        // You can initialise any data required for the connected UI components here.
    }

}