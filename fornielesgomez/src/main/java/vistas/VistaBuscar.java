package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;

@Tag("vista-buscar")
@JsModule("./src/vista-buscar.ts")
public class VistaBuscar extends LitTemplate {

    public VistaBuscar() {
        // You can initialise any data required for the connected UI components here.
    }

}