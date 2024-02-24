package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;

@Tag("vista-logout")
@JsModule("./src/vista-logout.ts")
public class VistaLogout extends LitTemplate {

    public VistaLogout() {
        // You can initialise any data required for the connected UI components here.
    }

}