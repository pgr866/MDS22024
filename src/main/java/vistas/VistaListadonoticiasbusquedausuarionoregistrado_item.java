package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadonoticiasbusquedausuarionoregistrado_item")
@JsModule("./src/vista-listadonoticiasbusquedausuarionoregistrado_item.ts")
public class VistaListadonoticiasbusquedausuarionoregistrado_item extends LitTemplate {

	@Id("Layoutlistadonoticiasbusquedausuarionoregistradoitem")
	private Element layoutlistadonoticiasbusquedausuarionoregistradoitem;

	public Element getLayoutlistadonoticiasbusquedausuarionoregistradoitem() {
		return layoutlistadonoticiasbusquedausuarionoregistradoitem;
	}

	public void setLayoutlistadonoticiasbusquedausuarionoregistradoitem(
			Element layoutlistadonoticiasbusquedausuarionoregistradoitem) {
		this.layoutlistadonoticiasbusquedausuarionoregistradoitem = layoutlistadonoticiasbusquedausuarionoregistradoitem;
	}

	public VistaListadonoticiasbusquedausuarionoregistrado_item() {
        // You can initialise any data required for the connected UI components here.
    }

}