package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadonoticiasbusquedausuarionoregistrado_item")
@JsModule("./src/vista-listadonoticiasbusquedausuarionoregistrado_item.ts")
public class VistaListadonoticiasbusquedausuarionoregistrado_item extends LitTemplate {

    public Element getItemlistadonoticiasbusquedausuarionoregistrado() {
		return itemlistadonoticiasbusquedausuarionoregistrado;
	}

	public void setItemlistadonoticiasbusquedausuarionoregistrado(Element itemlistadonoticiasbusquedausuarionoregistrado) {
		this.itemlistadonoticiasbusquedausuarionoregistrado = itemlistadonoticiasbusquedausuarionoregistrado;
	}

	@Id("Itemlistadonoticiasbusquedausuarionoregistrado")
	private Element itemlistadonoticiasbusquedausuarionoregistrado;

	public VistaListadonoticiasbusquedausuarionoregistrado_item() {
        // You can initialise any data required for the connected UI components here.
    }

}