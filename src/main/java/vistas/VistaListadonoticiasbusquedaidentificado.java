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

    public Element getLupalistadonoticiasbusquedaidentificado() {
		return lupalistadonoticiasbusquedaidentificado;
	}

	public void setLupalistadonoticiasbusquedaidentificado(Element lupalistadonoticiasbusquedaidentificado) {
		this.lupalistadonoticiasbusquedaidentificado = lupalistadonoticiasbusquedaidentificado;
	}

	public ComboBox<String> getComboboxlistadonoticiasbusquedaidentificado() {
		return comboboxlistadonoticiasbusquedaidentificado;
	}

	public void setComboboxlistadonoticiasbusquedaidentificado(
			ComboBox<String> comboboxlistadonoticiasbusquedaidentificado) {
		this.comboboxlistadonoticiasbusquedaidentificado = comboboxlistadonoticiasbusquedaidentificado;
	}

	public Element getLayoutlistadonoticiasbusquedaidentificado() {
		return layoutlistadonoticiasbusquedaidentificado;
	}

	public void setLayoutlistadonoticiasbusquedaidentificado(Element layoutlistadonoticiasbusquedaidentificado) {
		this.layoutlistadonoticiasbusquedaidentificado = layoutlistadonoticiasbusquedaidentificado;
	}

	@Id("Lupalistadonoticiasbusquedaidentificado")
	private Element lupalistadonoticiasbusquedaidentificado;
	@Id("Comboboxlistadonoticiasbusquedaidentificado")
	private ComboBox<String> comboboxlistadonoticiasbusquedaidentificado;
	@Id("Layoutlistadonoticiasbusquedaidentificado")
	private Element layoutlistadonoticiasbusquedaidentificado;

	public VistaListadonoticiasbusquedaidentificado() {
        // You can initialise any data required for the connected UI components here.
    }

}