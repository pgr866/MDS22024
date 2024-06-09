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

@Tag("vista-explorarseccionesidentificado")
@JsModule("./src/vista-explorarseccionesidentificado.ts")
public class VistaExplorarseccionesidentificado extends LitTemplate {

    public Label getLabelexplorarseccionesidentificado() {
		return labelexplorarseccionesidentificado;
	}
	public void setLabelexplorarseccionesidentificado(Label labelexplorarseccionesidentificado) {
		this.labelexplorarseccionesidentificado = labelexplorarseccionesidentificado;
	}
	public Element getLayoutseccionesexplorarseccionesidentificado() {
		return layoutseccionesexplorarseccionesidentificado;
	}
	public void setLayoutseccionesexplorarseccionesidentificado(Element layoutseccionesexplorarseccionesidentificado) {
		this.layoutseccionesexplorarseccionesidentificado = layoutseccionesexplorarseccionesidentificado;
	}
	
	public HorizontalLayout getLayoutnombrebotonesexplorarseccionesidentificado() {
		return layoutnombrebotonesexplorarseccionesidentificado;
	}
	public void setLayoutnombrebotonesexplorarseccionesidentificado(HorizontalLayout layoutnombrebotonesexplorarseccionesidentificado) {
		this.layoutnombrebotonesexplorarseccionesidentificado = layoutnombrebotonesexplorarseccionesidentificado;
	}
	public TextField getTextfieldnombreexplorarseccionesidentificado() {
		return textfieldnombreexplorarseccionesidentificado;
	}
	public void setTextfieldnombreexplorarseccionesidentificado(TextField textfieldnombreexplorarseccionesidentificado) {
		this.textfieldnombreexplorarseccionesidentificado = textfieldnombreexplorarseccionesidentificado;
	}
	public Button getButtonanadirseccionexplorarseccionesidentificado() {
		return buttonanadirseccionexplorarseccionesidentificado;
	}
	public void setButtonanadirseccionexplorarseccionesidentificado(Button buttonanadirseccionexplorarseccionesidentificado) {
		this.buttonanadirseccionexplorarseccionesidentificado = buttonanadirseccionexplorarseccionesidentificado;
	}
	public Button getButtoneliminarexplorarseccionesidentificado() {
		return buttoneliminarexplorarseccionesidentificado;
	}
	public void setButtoneliminarexplorarseccionesidentificado(Button buttoneliminarexplorarseccionesidentificado) {
		this.buttoneliminarexplorarseccionesidentificado = buttoneliminarexplorarseccionesidentificado;
	}
	public HorizontalLayout getLayoutvistasnoticiasenseccionexplorarseccionesidentificado() {
		return layoutvistasnoticiasenseccionexplorarseccionesidentificado;
	}
	public void setLayoutvistasnoticiasenseccionexplorarseccionesidentificado(
			HorizontalLayout layoutvistasnoticiasenseccionexplorarseccionesidentificado) {
		this.layoutvistasnoticiasenseccionexplorarseccionesidentificado = layoutvistasnoticiasenseccionexplorarseccionesidentificado;
	}
	
	@Id("Layoutnombrebotonesexplorarseccionesidentificado")
	private HorizontalLayout layoutnombrebotonesexplorarseccionesidentificado;
	@Id("Textfieldnombreexplorarseccionesidentificado")
	private TextField textfieldnombreexplorarseccionesidentificado;
	@Id("Buttonanadirseccionexplorarseccionesidentificado")
	private Button buttonanadirseccionexplorarseccionesidentificado;
	@Id("Buttoneliminarexplorarseccionesidentificado")
	private Button buttoneliminarexplorarseccionesidentificado;
	@Id("Layoutvistasnoticiasenseccionexplorarseccionesidentificado")
	private HorizontalLayout layoutvistasnoticiasenseccionexplorarseccionesidentificado;
	@Id("Layoutseccionesexplorarseccionesidentificado")
	private Element layoutseccionesexplorarseccionesidentificado;
	@Id("Labelexplorarseccionesidentificado")
	private Label labelexplorarseccionesidentificado;
	public VistaExplorarseccionesidentificado() {
        // You can initialise any data required for the connected UI components here.
    }

}