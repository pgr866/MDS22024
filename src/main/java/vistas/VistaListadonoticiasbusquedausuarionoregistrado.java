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

    public ComboBox<String> getComboboxlayoutlistadonoticiasbusquedausuarionoregistrado() {
		return comboboxlayoutlistadonoticiasbusquedausuarionoregistrado;
	}

	public void setComboboxlayoutlistadonoticiasbusquedausuarionoregistrado(
			ComboBox<String> comboboxlayoutlistadonoticiasbusquedausuarionoregistrado) {
		this.comboboxlayoutlistadonoticiasbusquedausuarionoregistrado = comboboxlayoutlistadonoticiasbusquedausuarionoregistrado;
	}

	public Element getLupalistadonoticiasbusquedausuarionoregistrado() {
		return lupalistadonoticiasbusquedausuarionoregistrado;
	}

	public void setLupalistadonoticiasbusquedausuarionoregistrado(Element lupalistadonoticiasbusquedausuarionoregistrado) {
		this.lupalistadonoticiasbusquedausuarionoregistrado = lupalistadonoticiasbusquedausuarionoregistrado;
	}

	public Element getLayoutlistadonoticiasbusquedausuarionoregistrado() {
		return layoutlistadonoticiasbusquedausuarionoregistrado;
	}

	public void setLayoutlistadonoticiasbusquedausuarionoregistrado(
			Element layoutlistadonoticiasbusquedausuarionoregistrado) {
		this.layoutlistadonoticiasbusquedausuarionoregistrado = layoutlistadonoticiasbusquedausuarionoregistrado;
	}

	public ComboBox<String> getComboboxlistadonoticiasbusquedausuarionoregistrado() {
		return comboboxlistadonoticiasbusquedausuarionoregistrado;
	}

	public void setComboboxlistadonoticiasbusquedausuarionoregistrado(
			ComboBox<String> comboboxlistadonoticiasbusquedausuarionoregistrado) {
		this.comboboxlistadonoticiasbusquedausuarionoregistrado = comboboxlistadonoticiasbusquedausuarionoregistrado;
	}

	@Id("Comboboxlayoutlistadonoticiasbusquedausuarionoregistrado")
	private ComboBox<String> comboboxlayoutlistadonoticiasbusquedausuarionoregistrado;
	@Id("Lupalistadonoticiasbusquedausuarionoregistrado")
	private Element lupalistadonoticiasbusquedausuarionoregistrado;
	@Id("Layoutlistadonoticiasbusquedausuarionoregistrado")
	private Element layoutlistadonoticiasbusquedausuarionoregistrado;
	@Id("Comboboxlistadonoticiasbusquedausuarionoregistrado")
	private ComboBox<String> comboboxlistadonoticiasbusquedausuarionoregistrado;

	public VistaListadonoticiasbusquedausuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}