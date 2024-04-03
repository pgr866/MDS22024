package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-buscar")
@JsModule("./src/vista-buscar.ts")
public class VistaBuscar extends LitTemplate {

    public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getBusquedanoticiasusuarionoregistrado() {
		return busquedanoticiasusuarionoregistrado;
	}

	public void setBusquedanoticiasusuarionoregistrado(Element busquedanoticiasusuarionoregistrado) {
		this.busquedanoticiasusuarionoregistrado = busquedanoticiasusuarionoregistrado;
	}

	public Element getBusquedanoticiasidentificado() {
		return busquedanoticiasidentificado;
	}

	public void setBusquedanoticiasidentificado(Element busquedanoticiasidentificado) {
		this.busquedanoticiasidentificado = busquedanoticiasidentificado;
	}

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