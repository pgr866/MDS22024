package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.combobox.ComboBox;

@Tag("vista-listadonoticiasbusquedausuarionoregistrado")
@JsModule("./src/vista-listadonoticiasbusquedausuarionoregistrado.ts")
public class VistaListadonoticiasbusquedausuarionoregistrado extends LitTemplate {

	@Id("Layoutlistadonoticiasbusquedausuarionoregistrado")
	private Element layoutlistadonoticiasbusquedausuarionoregistrado;
	@Id("Comboboxlistadonoticiasbusquedausuarionoregistrado")
	private ComboBox<String> comboboxlistadonoticiasbusquedausuarionoregistrado;

	public VistaListadonoticiasbusquedausuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}