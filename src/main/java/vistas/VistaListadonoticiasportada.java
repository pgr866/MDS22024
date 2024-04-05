package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;

@Tag("vista-listadonoticiasportada")
@JsModule("./src/vista-listadonoticiasportada.ts")
public class VistaListadonoticiasportada extends LitTemplate {

	

	public Element getLayoutprincipallistadonoticiasportada() {
		return layoutprincipallistadonoticiasportada;
	}

	public void setLayoutprincipallistadonoticiasportada(Element layoutprincipallistadonoticiasportada) {
		this.layoutprincipallistadonoticiasportada = layoutprincipallistadonoticiasportada;
	}

	public Label getLabelnoticiasactualidadlistadonoticiasportada() {
		return labelnoticiasactualidadlistadonoticiasportada;
	}

	public void setLabelnoticiasactualidadlistadonoticiasportada(Label labelnoticiasactualidadlistadonoticiasportada) {
		this.labelnoticiasactualidadlistadonoticiasportada = labelnoticiasactualidadlistadonoticiasportada;
	}

	public HorizontalLayout getLayoutlistadonoticiasportada() {
		return layoutlistadonoticiasportada;
	}

	public void setLayoutlistadonoticiasportada(HorizontalLayout layoutlistadonoticiasportada) {
		this.layoutlistadonoticiasportada = layoutlistadonoticiasportada;
	}

	@Id("Layoutprincipallistadonoticiasportada")
	private Element layoutprincipallistadonoticiasportada;
	@Id("Labelnoticiasactualidadlistadonoticiasportada")
	private Label labelnoticiasactualidadlistadonoticiasportada;
	@Id("Layoutlistadonoticiasportada")
	private HorizontalLayout layoutlistadonoticiasportada;

	public VistaListadonoticiasportada() {
        // You can initialise any data required for the connected UI components here.
    }

}