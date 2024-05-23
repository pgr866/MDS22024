package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.select.Select;

@Tag("vista-noticiasarevisar")
@JsModule("./src/vista-noticiasarevisar.ts")
public class VistaNoticiasarevisar extends LitTemplate {

	public Element getListboxnoticiasarevisar() {
		return listboxnoticiasarevisar;
	}

	public void setListboxnoticiasarevisar(Element listboxnoticiasarevisar) {
		this.listboxnoticiasarevisar = listboxnoticiasarevisar;
	}

	public Element getLayoutnoticiasarevisar() {
		return layoutnoticiasarevisar;
	}

	public void setLayoutnoticiasarevisar(Element layoutnoticiasarevisar) {
		this.layoutnoticiasarevisar = layoutnoticiasarevisar;
	}

	public Select getSelectnoticiasarevisar() {
		return selectnoticiasarevisar;
	}

	public void setSelectnoticiasarevisar(Select selectnoticiasarevisar) {
		this.selectnoticiasarevisar = selectnoticiasarevisar;
	}

	@Id("Layoutnoticiasarevisar")
	private Element layoutnoticiasarevisar;
	@Id("Selectnoticiasarevisar")
	private Select selectnoticiasarevisar;
	@Id("Listboxnoticiasarevisar")
	private Element listboxnoticiasarevisar;
	public VistaNoticiasarevisar() {
        // You can initialise any data required for the connected UI components here.
    }

}