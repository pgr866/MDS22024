package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadonoticiasbusquedaidentificado_item")
@JsModule("./src/vista-listadonoticiasbusquedaidentificado_item.ts")
public class VistaListadonoticiasbusquedaidentificado_item extends LitTemplate {

	public Element getLayoutlistadonoticiasbusquedaidentificadoitem() {
		return layoutlistadonoticiasbusquedaidentificadoitem;
	}

	public void setLayoutlistadonoticiasbusquedaidentificadoitem(Element layoutlistadonoticiasbusquedaidentificadoitem) {
		this.layoutlistadonoticiasbusquedaidentificadoitem = layoutlistadonoticiasbusquedaidentificadoitem;
	}

	@Id("Layoutlistadonoticiasbusquedaidentificadoitem")
	private Element layoutlistadonoticiasbusquedaidentificadoitem;

	public VistaListadonoticiasbusquedaidentificado_item() {
        // You can initialise any data required for the connected UI components here.
    }

}