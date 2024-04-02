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

	@Id("Layoutlistadonoticiasportada")
	private Element layoutlistadonoticiasportada;
	@Id("Labelnoticiasactualidadlistadonoticiasportada")
	private Label labelnoticiasactualidadlistadonoticiasportada;
	@Id("Layoutlistadonoticiasportada1")
	private HorizontalLayout layoutlistadonoticiasportada1;

	public VistaListadonoticiasportada() {
        // You can initialise any data required for the connected UI components here.
    }

}