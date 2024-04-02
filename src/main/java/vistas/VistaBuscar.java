package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-buscar")
@JsModule("./src/vista-buscar.ts")
public class VistaBuscar extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("Busquedanoticiasusuarionoregistrado")
	private Element busquedanoticiasusuarionoregistrado;
	@Id("Busquedanoticiasidentificado")
	private Element busquedanoticiasidentificado;

	public VistaBuscar() {
        // You can initialise any data required for the connected UI components here.
    }

}