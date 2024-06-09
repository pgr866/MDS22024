package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

@Tag("vista-explorarseccionesusuarionoregistrado")
@JsModule("./src/vista-explorarseccionesusuarionoregistrado.ts")
public class VistaExplorarseccionesusuarionoregistrado extends LitTemplate {

    public Label getLabelexplorarseccionesusuarionoregistrado() {
		return labelexplorarseccionesusuarionoregistrado;
	}
	public void setLabelexplorarseccionesusuarionoregistrado(Label labelexplorarseccionesusuarionoregistrado) {
		this.labelexplorarseccionesusuarionoregistrado = labelexplorarseccionesusuarionoregistrado;
	}
	public Element getLayoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado() {
		return layoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado;
	}
	public void setLayoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado(
			Element layoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado) {
		this.layoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado = layoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado;
	}
	public Element getLayoutseccionesexplorarseccionesusuarionoregistrado() {
		return layoutseccionesexplorarseccionesusuarionoregistrado;
	}
	public void setLayoutseccionesexplorarseccionesusuarionoregistrado(Element layoutseccionesexplorarseccionesusuarionoregistrado) {
		this.layoutseccionesexplorarseccionesusuarionoregistrado = layoutseccionesexplorarseccionesusuarionoregistrado;
	}
	
	@Id("Layoutseccionesexplorarseccionesusuarionoregistrado")
	private Element layoutseccionesexplorarseccionesusuarionoregistrado;
	@Id("Layoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado")
	private Element layoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado;
	@Id("Labelexplorarseccionesusuarionoregistrado")
	private Label labelexplorarseccionesusuarionoregistrado;
	public VistaExplorarseccionesusuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}