package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;

@Tag("vista-listadonoticiasportadausuarionoregistrado")
@JsModule("./src/vista-listadonoticiasportadausuarionoregistrado.ts")
public class VistaListadonoticiasportadausuarionoregistrado extends LitTemplate {

	public Element getLayoutprincipallistadonoticiasportadausuarionoregistrado() {
		return layoutprincipallistadonoticiasportadausuarionoregistrado;
	}

	public void setLayoutprincipallistadonoticiasportadausuarionoregistrado(
			Element layoutprincipallistadonoticiasportadausuarionoregistrado) {
		this.layoutprincipallistadonoticiasportadausuarionoregistrado = layoutprincipallistadonoticiasportadausuarionoregistrado;
	}

	public Label getLabelnoticiasactualidadlistadonoticiasportadausuarionoregistrado() {
		return labelnoticiasactualidadlistadonoticiasportadausuarionoregistrado;
	}

	public void setLabelnoticiasactualidadlistadonoticiasportadausuarionoregistrado(
			Label labelnoticiasactualidadlistadonoticiasportadausuarionoregistrado) {
		this.labelnoticiasactualidadlistadonoticiasportadausuarionoregistrado = labelnoticiasactualidadlistadonoticiasportadausuarionoregistrado;
	}

	public HorizontalLayout getLayoutlistadonoticiasportadausuarionoregistrado() {
		return layoutlistadonoticiasportadausuarionoregistrado;
	}

	public void setLayoutlistadonoticiasportadausuarionoregistrado(
			HorizontalLayout layoutlistadonoticiasportadausuarionoregistrado) {
		this.layoutlistadonoticiasportadausuarionoregistrado = layoutlistadonoticiasportadausuarionoregistrado;
	}

	@Id("Layoutprincipallistadonoticiasportadausuarionoregistrado")
	private Element layoutprincipallistadonoticiasportadausuarionoregistrado;
	@Id("Labelnoticiasactualidadlistadonoticiasportadausuarionoregistrado")
	private Label labelnoticiasactualidadlistadonoticiasportadausuarionoregistrado;
	@Id("Layoutlistadonoticiasportadausuarionoregistrado")
	private HorizontalLayout layoutlistadonoticiasportadausuarionoregistrado;

	public VistaListadonoticiasportadausuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}