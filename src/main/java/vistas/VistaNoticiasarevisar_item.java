package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-noticiasarevisar_item")
@JsModule("./src/vista-noticiasarevisar_item.ts")
public class VistaNoticiasarevisar_item extends LitTemplate {

	public Element getLayouttituloitemnoticiasarevisar() {
		return layouttituloitemnoticiasarevisar;
	}

	public void setLayouttituloitemnoticiasarevisar(Element layouttituloitemnoticiasarevisar) {
		this.layouttituloitemnoticiasarevisar = layouttituloitemnoticiasarevisar;
	}

	public Element getLayouturlitemnoticiasarevisar() {
		return layouturlitemnoticiasarevisar;
	}

	public void setLayouturlitemnoticiasarevisar(Element layouturlitemnoticiasarevisar) {
		this.layouturlitemnoticiasarevisar = layouturlitemnoticiasarevisar;
	}

	public Element getLayoutcontenidoitemnoticiasarevisar() {
		return layoutcontenidoitemnoticiasarevisar;
	}

	public void setLayoutcontenidoitemnoticiasarevisar(Element layoutcontenidoitemnoticiasarevisar) {
		this.layoutcontenidoitemnoticiasarevisar = layoutcontenidoitemnoticiasarevisar;
	}

	public Element getLayoutfechaitemnoticiasarevisar() {
		return layoutfechaitemnoticiasarevisar;
	}

	public void setLayoutfechaitemnoticiasarevisar(Element layoutfechaitemnoticiasarevisar) {
		this.layoutfechaitemnoticiasarevisar = layoutfechaitemnoticiasarevisar;
	}

	public Element getLayoutlugaritemnoticiasarevisar() {
		return layoutlugaritemnoticiasarevisar;
	}

	public void setLayoutlugaritemnoticiasarevisar(Element layoutlugaritemnoticiasarevisar) {
		this.layoutlugaritemnoticiasarevisar = layoutlugaritemnoticiasarevisar;
	}

	public Element getLayouttematicaitemnoticiasarevisar() {
		return layouttematicaitemnoticiasarevisar;
	}

	public void setLayouttematicaitemnoticiasarevisar(Element layouttematicaitemnoticiasarevisar) {
		this.layouttematicaitemnoticiasarevisar = layouttematicaitemnoticiasarevisar;
	}

	public Element getItemnoticiasarevisar() {
		return itemnoticiasarevisar;
	}

	public void setItemnoticiasarevisar(Element itemnoticiasarevisar) {
		this.itemnoticiasarevisar = itemnoticiasarevisar;
	}

	@Id("Itemnoticiasarevisar")
	private Element itemnoticiasarevisar;
	@Id("Layouttituloitemnoticiasarevisar")
	private Element layouttituloitemnoticiasarevisar;
	@Id("Layouturlitemnoticiasarevisar")
	private Element layouturlitemnoticiasarevisar;
	@Id("Layoutcontenidoitemnoticiasarevisar")
	private Element layoutcontenidoitemnoticiasarevisar;
	@Id("Layoutfechaitemnoticiasarevisar")
	private Element layoutfechaitemnoticiasarevisar;
	@Id("Layoutlugaritemnoticiasarevisar")
	private Element layoutlugaritemnoticiasarevisar;
	@Id("Layouttematicaitemnoticiasarevisar")
	private Element layouttematicaitemnoticiasarevisar;

	public VistaNoticiasarevisar_item() {
        // You can initialise any data required for the connected UI components here.
    }

}