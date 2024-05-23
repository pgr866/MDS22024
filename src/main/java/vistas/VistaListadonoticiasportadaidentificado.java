package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;

@Tag("vista-listadonoticiasportadaidentificado")
@JsModule("./src/vista-listadonoticiasportadaidentificado.ts")
public class VistaListadonoticiasportadaidentificado extends LitTemplate {

	public Element getLayoutprincipallistadonoticiasportadaidentificado() {
		return layoutprincipallistadonoticiasportadaidentificado;
	}

	public void setLayoutprincipallistadonoticiasportadaidentificado(
			Element layoutprincipallistadonoticiasportadaidentificado) {
		this.layoutprincipallistadonoticiasportadaidentificado = layoutprincipallistadonoticiasportadaidentificado;
	}

	public Label getLabelnoticiasactualidadlistadonoticiasportadaidentificado() {
		return labelnoticiasactualidadlistadonoticiasportadaidentificado;
	}

	public void setLabelnoticiasactualidadlistadonoticiasportadaidentificado(
			Label labelnoticiasactualidadlistadonoticiasportadaidentificado) {
		this.labelnoticiasactualidadlistadonoticiasportadaidentificado = labelnoticiasactualidadlistadonoticiasportadaidentificado;
	}

	public HorizontalLayout getLayoutlistadonoticiasportadaidentificado() {
		return layoutlistadonoticiasportadaidentificado;
	}

	public void setLayoutlistadonoticiasportadaidentificado(HorizontalLayout layoutlistadonoticiasportadaidentificado) {
		this.layoutlistadonoticiasportadaidentificado = layoutlistadonoticiasportadaidentificado;
	}

	@Id("Layoutprincipallistadonoticiasportadaidentificado")
	private Element layoutprincipallistadonoticiasportadaidentificado;
	@Id("Labelnoticiasactualidadlistadonoticiasportadaidentificado")
	private Label labelnoticiasactualidadlistadonoticiasportadaidentificado;
	@Id("Layoutlistadonoticiasportadaidentificado")
	private HorizontalLayout layoutlistadonoticiasportadaidentificado;

	public VistaListadonoticiasportadaidentificado() {
        // You can initialise any data required for the connected UI components here.
    }

}