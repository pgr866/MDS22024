package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-noticiasenseccionusuarionoregistrado")
@JsModule("./src/vista-noticiasenseccionusuarionoregistrado.ts")
public class VistaNoticiasenseccionusuarionoregistrado extends LitTemplate {

    public Element getLayoutnoticiasenseccionusuarionoregistrado() {
		return layoutnoticiasenseccionusuarionoregistrado;
	}

	public void setLayoutnoticiasenseccionusuarionoregistrado(Element layoutnoticiasenseccionusuarionoregistrado) {
		this.layoutnoticiasenseccionusuarionoregistrado = layoutnoticiasenseccionusuarionoregistrado;
	}

	public TextField getLabelnoticiasenseccionusuarionoregistrado() {
		return labelnoticiasenseccionusuarionoregistrado;
	}

	public void setLabelnoticiasenseccionusuarionoregistrado(TextField labelnoticiasenseccionusuarionoregistrado) {
		this.labelnoticiasenseccionusuarionoregistrado = labelnoticiasenseccionusuarionoregistrado;
	}

	public HorizontalLayout getNoticiasenseccionusuarionoregistrado() {
		return noticiasenseccionusuarionoregistrado;
	}

	public void setNoticiasenseccionusuarionoregistrado(HorizontalLayout noticiasenseccionusuarionoregistrado) {
		this.noticiasenseccionusuarionoregistrado = noticiasenseccionusuarionoregistrado;
	}

	@Id("Layoutnoticiasenseccionusuarionoregistrado")
	private Element layoutnoticiasenseccionusuarionoregistrado;
	@Id("Labelnoticiasenseccionusuarionoregistrado")
	private TextField labelnoticiasenseccionusuarionoregistrado;
	@Id("Noticiasenseccionusuarionoregistrado")
	private HorizontalLayout noticiasenseccionusuarionoregistrado;

	public VistaNoticiasenseccionusuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}