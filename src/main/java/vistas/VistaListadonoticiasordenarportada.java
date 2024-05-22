package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.combobox.ComboBox;

@Tag("vista-listadonoticiasordenarportada")
@JsModule("./src/vista-listadonoticiasordenarportada.ts")
public class VistaListadonoticiasordenarportada extends LitTemplate {

	public Element getLayoutlistadonoticiasordenarportada() {
		return layoutlistadonoticiasordenarportada;
	}

	public void setLayoutlistadonoticiasordenarportada(Element layoutlistadonoticiasordenarportada) {
		this.layoutlistadonoticiasordenarportada = layoutlistadonoticiasordenarportada;
	}

	public ComboBox<String> getComboboxlistadonoticiasordenarportada() {
		return comboboxlistadonoticiasordenarportada;
	}

	public void setComboboxlistadonoticiasordenarportada(ComboBox<String> comboboxlistadonoticiasordenarportada) {
		this.comboboxlistadonoticiasordenarportada = comboboxlistadonoticiasordenarportada;
	}

	@Id("Layoutlistadonoticiasordenarportada")
	private Element layoutlistadonoticiasordenarportada;
	@Id("Comboboxlistadonoticiasordenarportada")
	private ComboBox<String> comboboxlistadonoticiasordenarportada;

	public VistaListadonoticiasordenarportada() {
        // You can initialise any data required for the connected UI components here.
    }

}