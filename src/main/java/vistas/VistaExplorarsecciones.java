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

    @Id("Layoutvistaseccionesexplorarsecciones")
	private Element layoutvistaseccionesexplorarsecciones;
	@Id("vistaseccionesexplorarsecciones")
	private Element vistaseccionesexplorarsecciones;
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