package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.combobox.ComboBox;

@Tag("vista-seccionesidentificado")
@JsModule("./src/vista-seccionesidentificado.ts")
public class VistaSeccionesidentificado extends LitTemplate {

	public ComboBox<String> getComboboxseccionesidentificado() {
		return comboboxseccionesidentificado;
	}

	public void setComboboxseccionesidentificado(ComboBox<String> comboboxseccionesidentificado) {
		this.comboboxseccionesidentificado = comboboxseccionesidentificado;
	}

	public Element getLayoutseccionesidentificado() {
		return layoutseccionesidentificado;
	}

	public void setLayoutseccionesidentificado(Element layoutseccionesidentificado) {
		this.layoutseccionesidentificado = layoutseccionesidentificado;
	}

	@Id("Layoutseccionesidentificado")
	private Element layoutseccionesidentificado;
	@Id("Comboboxseccionesidentificado")
	private ComboBox<String> comboboxseccionesidentificado;
	public VistaSeccionesidentificado() {
        // You can initialise any data required for the connected UI components here.
    }

}