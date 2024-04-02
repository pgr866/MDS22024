package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.select.Select;

@Tag("vista-noticiasarevisar")
@JsModule("./src/vista-noticiasarevisar.ts")
public class VistaNoticiasarevisar extends LitTemplate {

	public VistaNoticiasarevisar() {
        // You can initialise any data required for the connected UI components here.
    }

}