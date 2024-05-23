package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.select.Select;

@Tag("vista-seccionesidentificado")
@JsModule("./src/vista-seccionesidentificado.ts")
public class VistaSeccionesidentificado extends LitTemplate {

	public Element getListboxseccionesidentificado() {
		return listboxseccionesidentificado;
	}

	public void setListboxseccionesidentificado(Element listboxseccionesidentificado) {
		this.listboxseccionesidentificado = listboxseccionesidentificado;
	}

	public Element getLayoutseccionesidentificado() {
		return layoutseccionesidentificado;
	}

	public void setLayoutseccionesidentificado(Element layoutseccionesidentificado) {
		this.layoutseccionesidentificado = layoutseccionesidentificado;
	}

	public Select getDesplegableseccionesidentificado() {
		return desplegableseccionesidentificado;
	}

	public void setDesplegableseccionesidentificado(Select desplegableseccionesidentificado) {
		this.desplegableseccionesidentificado = desplegableseccionesidentificado;
	}

	@Id("Layoutseccionesidentificado")
	private Element layoutseccionesidentificado;
	@Id("Desplegableseccionesidentificado")
	private Select desplegableseccionesidentificado;
	@Id("Listboxseccionesidentificado")
	private Element listboxseccionesidentificado;
	public VistaSeccionesidentificado() {
        // You can initialise any data required for the connected UI components here.
    }

}