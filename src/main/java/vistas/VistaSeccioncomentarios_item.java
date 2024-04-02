package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextArea;

@Tag("vista-seccioncomentarios_item")
@JsModule("./src/vista-seccioncomentarios_item.ts")
public class VistaSeccioncomentarios_item extends LitTemplate {

	public VistaSeccioncomentarios_item() {
        // You can initialise any data required for the connected UI components here.
    }

}