package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.combobox.ComboBox;

@Tag("vista-listadonoticiasbusquedaidentificado")
@JsModule("./src/vista-listadonoticiasbusquedaidentificado.ts")
public class VistaListadonoticiasbusquedaidentificado extends LitTemplate {

	@Id("Layoutlistadonoticiasbusquedaidentificado")
	private Element layoutlistadonoticiasbusquedaidentificado;
	@Id("Comboboxlistadonoticiasbusquedaidentificado")
	private ComboBox<String> comboboxlistadonoticiasbusquedaidentificado;
	@Id("ironIcon")
	private Element ironIcon;

	public VistaListadonoticiasbusquedaidentificado() {
        // You can initialise any data required for the connected UI components here.
    }

}