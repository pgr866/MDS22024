package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;

@Tag("vista-seccioncomentarios")
@JsModule("./src/vista-seccioncomentarios.ts")
public class VistaSeccioncomentarios extends LitTemplate {

	public VistaSeccioncomentarios() {
        // You can initialise any data required for the connected UI components here.
    }

}