package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;

@Tag("vista-noticiasenseccionusuarionoregistrado")
@JsModule("./src/vista-noticiasenseccionusuarionoregistrado.ts")
public class VistaNoticiasenseccionusuarionoregistrado extends LitTemplate {

	@Id("Layoutnoticiasenseccionusuarionoregistrado")
	private Element layoutnoticiasenseccionusuarionoregistrado;
	@Id("label")
	private Label label;
	@Id("Noticiasenseccionusuarionoregistrado")
	private HorizontalLayout noticiasenseccionusuarionoregistrado;

	public VistaNoticiasenseccionusuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}