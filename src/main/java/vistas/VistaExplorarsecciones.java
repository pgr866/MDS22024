package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

@Tag("vista-explorarsecciones")
@JsModule("./src/vista-explorarsecciones.ts")
public class VistaExplorarsecciones extends LitTemplate {

    public Element getLayoutvistaseccionesexplorarsecciones() {
		return layoutvistaseccionesexplorarsecciones;
	}
	public void setLayoutvistaseccionesexplorarsecciones(Element layoutvistaseccionesexplorarsecciones) {
		this.layoutvistaseccionesexplorarsecciones = layoutvistaseccionesexplorarsecciones;
	}
	
	public HorizontalLayout getLayoutnombrebotonesexplorarsecciones() {
		return layoutnombrebotonesexplorarsecciones;
	}
	public void setLayoutnombrebotonesexplorarsecciones(HorizontalLayout layoutnombrebotonesexplorarsecciones) {
		this.layoutnombrebotonesexplorarsecciones = layoutnombrebotonesexplorarsecciones;
	}
	public TextField getTextfieldnombreexplorarsecciones() {
		return textfieldnombreexplorarsecciones;
	}
	public void setTextfieldnombreexplorarsecciones(TextField textfieldnombreexplorarsecciones) {
		this.textfieldnombreexplorarsecciones = textfieldnombreexplorarsecciones;
	}
	public Button getButtonanadirseccionexplorarsecciones() {
		return buttonanadirseccionexplorarsecciones;
	}
	public void setButtonanadirseccionexplorarsecciones(Button buttonanadirseccionexplorarsecciones) {
		this.buttonanadirseccionexplorarsecciones = buttonanadirseccionexplorarsecciones;
	}
	public Button getButtoneliminarexplorarsecciones() {
		return buttoneliminarexplorarsecciones;
	}
	public void setButtoneliminarexplorarsecciones(Button buttoneliminarexplorarsecciones) {
		this.buttoneliminarexplorarsecciones = buttoneliminarexplorarsecciones;
	}
	public HorizontalLayout getLayoutvistasnoticiasenseccionexplorarsecciones() {
		return layoutvistasnoticiasenseccionexplorarsecciones;
	}
	public void setLayoutvistasnoticiasenseccionexplorarsecciones(
			HorizontalLayout layoutvistasnoticiasenseccionexplorarsecciones) {
		this.layoutvistasnoticiasenseccionexplorarsecciones = layoutvistasnoticiasenseccionexplorarsecciones;
	}
	public Element getVistanoticiasseccionusuarionoregistradoexplorarsecciones() {
		return vistanoticiasseccionusuarionoregistradoexplorarsecciones;
	}
	public void setVistanoticiasseccionusuarionoregistradoexplorarsecciones(
			Element vistanoticiasseccionusuarionoregistradoexplorarsecciones) {
		this.vistanoticiasseccionusuarionoregistradoexplorarsecciones = vistanoticiasseccionusuarionoregistradoexplorarsecciones;
	}
	public Element getVistanoticiasseccionidentificadoexplorarsecciones() {
		return vistanoticiasseccionidentificadoexplorarsecciones;
	}
	public void setVistanoticiasseccionidentificadoexplorarsecciones(
			Element vistanoticiasseccionidentificadoexplorarsecciones) {
		this.vistanoticiasseccionidentificadoexplorarsecciones = vistanoticiasseccionidentificadoexplorarsecciones;
	}
	@Id("Layoutvistaseccionesexplorarsecciones")
	private Element layoutvistaseccionesexplorarsecciones;
	@Id("Layoutnombrebotonesexplorarsecciones")
	private HorizontalLayout layoutnombrebotonesexplorarsecciones;
	@Id("Textfieldnombreexplorarsecciones")
	private TextField textfieldnombreexplorarsecciones;
	@Id("Buttonanadirseccionexplorarsecciones")
	private Button buttonanadirseccionexplorarsecciones;
	@Id("Buttoneliminarexplorarsecciones")
	private Button buttoneliminarexplorarsecciones;
	@Id("Layoutvistasnoticiasenseccionexplorarsecciones")
	private HorizontalLayout layoutvistasnoticiasenseccionexplorarsecciones;
	@Id("vistanoticiasseccionusuarionoregistradoexplorarsecciones")
	private Element vistanoticiasseccionusuarionoregistradoexplorarsecciones;
	@Id("vistanoticiasseccionidentificadoexplorarsecciones")
	private Element vistanoticiasseccionidentificadoexplorarsecciones;
	public VistaExplorarsecciones() {
        // You can initialise any data required for the connected UI components here.
    }

}