package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

@Tag("vista-explorarseccionesusuarionoregistrado")
@JsModule("./src/vista-explorarseccionesusuarionoregistrado.ts")
public class VistaExplorarseccionesusuarionoregistrado extends LitTemplate {

    public Element getLayoutseccionesexplorarseccionesusuarionoregistrado() {
		return layoutseccionesexplorarseccionesusuarionoregistrado;
	}
	public void setLayoutseccionesexplorarseccionesusuarionoregistrado(Element layoutseccionesexplorarseccionesusuarionoregistrado) {
		this.layoutseccionesexplorarseccionesusuarionoregistrado = layoutseccionesexplorarseccionesusuarionoregistrado;
	}
	public HorizontalLayout getLayoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado() {
		return layoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado;
	}
	public void setLayoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado(
			HorizontalLayout layoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado) {
		this.layoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado = layoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado;
	}
	
	@Id("Layoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado")
	private HorizontalLayout layoutvistasnoticiasenseccionexplorarseccionesusuarionoregistrado;
	@Id("Layoutseccionesexplorarseccionesusuarionoregistrado")
	private Element layoutseccionesexplorarseccionesusuarionoregistrado;
	public VistaExplorarseccionesusuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}