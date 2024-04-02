package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.combobox.ComboBox;

@Tag("vista-mostrarmisnoticias")
@JsModule("./src/vista-mostrarmisnoticias.ts")
public class VistaMostrarmisnoticias extends LitTemplate {

    @Id("Layoutmostrarmisnoticias")
	private Element layoutmostrarmisnoticias;
	@Id("Comboboxmostrarmisnoticias")
	private ComboBox<String> comboboxmostrarmisnoticias;

	public VistaMostrarmisnoticias() {
        // You can initialise any data required for the connected UI components here.
    }

}