package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-usuarionoregistrado")
@JsModule("./src/vista-usuarionoregistrado.ts")
public class VistaUsuarionoregistrado extends LitTemplate {

	public VistaUsuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}