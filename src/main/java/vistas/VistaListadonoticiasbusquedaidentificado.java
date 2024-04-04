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

	public Element getLayoutlistadonoticiasbusquedaidentificado() {
		return layoutlistadonoticiasbusquedaidentificado;
	}

	public void setLayoutlistadonoticiasbusquedaidentificado(Element layoutlistadonoticiasbusquedaidentificado) {
		this.layoutlistadonoticiasbusquedaidentificado = layoutlistadonoticiasbusquedaidentificado;
	}

	public ComboBox<String> getComboboxlistadonoticiasbusquedaidentificado() {
		return comboboxlistadonoticiasbusquedaidentificado;
	}

	public void setComboboxlistadonoticiasbusquedaidentificado(
			ComboBox<String> comboboxlistadonoticiasbusquedaidentificado) {
		this.comboboxlistadonoticiasbusquedaidentificado = comboboxlistadonoticiasbusquedaidentificado;
	}

	@Id("Layoutlistadonoticiasbusquedaidentificado")
	private Element layoutlistadonoticiasbusquedaidentificado;
	@Id("Comboboxlistadonoticiasbusquedaidentificado")
	private ComboBox<String> comboboxlistadonoticiasbusquedaidentificado;
	
	public VistaListadonoticiasbusquedaidentificado() {
        // You can initialise any data required for the connected UI components here.
    }

}