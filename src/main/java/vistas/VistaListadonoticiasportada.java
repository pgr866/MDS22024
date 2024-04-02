package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-listadonoticiasportada")
@JsModule("./src/vista-listadonoticiasportada.ts")
public class VistaListadonoticiasportada extends LitTemplate {

	public VistaListadonoticiasportada() {
        // You can initialise any data required for the connected UI components here.
    }

}