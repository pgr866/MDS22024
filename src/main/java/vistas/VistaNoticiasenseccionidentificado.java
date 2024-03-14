package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-noticiasenseccionidentificado")
@JsModule("./src/vista-noticiasenseccionidentificado.ts")
public class VistaNoticiasenseccionidentificado extends LitTemplate {

    public Element getLayoutnoticiasenseccionusuarioidentificado() {
		return layoutnoticiasenseccionusuarioidentificado;
	}

	public void setLayoutnoticiasenseccionusuarioidentificado(Element layoutnoticiasenseccionusuarioidentificado) {
		this.layoutnoticiasenseccionusuarioidentificado = layoutnoticiasenseccionusuarioidentificado;
	}

	public TextField getLabelnoticiasenseccionusuarioidentificado() {
		return labelnoticiasenseccionusuarioidentificado;
	}

	public void setLabelnoticiasenseccionusuarioidentificado(TextField labelnoticiasenseccionusuarioidentificado) {
		this.labelnoticiasenseccionusuarioidentificado = labelnoticiasenseccionusuarioidentificado;
	}

	public HorizontalLayout getNoticiasenseccionusuarioidentificado1() {
		return noticiasenseccionusuarioidentificado1;
	}

	public void setNoticiasenseccionusuarioidentificado1(HorizontalLayout noticiasenseccionusuarioidentificado1) {
		this.noticiasenseccionusuarioidentificado1 = noticiasenseccionusuarioidentificado1;
	}

	public Element getLayoutnoticiasenseccionidentificado() {
		return layoutnoticiasenseccionidentificado;
	}

	public void setLayoutnoticiasenseccionidentificado(Element layoutnoticiasenseccionidentificado) {
		this.layoutnoticiasenseccionidentificado = layoutnoticiasenseccionidentificado;
	}

	public TextField getLabelnoticiasenseccionidentificado() {
		return labelnoticiasenseccionidentificado;
	}

	public void setLabelnoticiasenseccionidentificado(TextField labelnoticiasenseccionidentificado) {
		this.labelnoticiasenseccionidentificado = labelnoticiasenseccionidentificado;
	}

	public HorizontalLayout getNoticiasenseccionidentificado() {
		return noticiasenseccionidentificado;
	}

	public void setNoticiasenseccionidentificado(HorizontalLayout noticiasenseccionidentificado) {
		this.noticiasenseccionidentificado = noticiasenseccionidentificado;
	}

	@Id("Layoutnoticiasenseccionusuarioidentificado")
	private Element layoutnoticiasenseccionusuarioidentificado;
	@Id("Labelnoticiasenseccionusuarioidentificado")
	private TextField labelnoticiasenseccionusuarioidentificado;
	@Id("Noticiasenseccionusuarioidentificado1")
	private HorizontalLayout noticiasenseccionusuarioidentificado1;
	@Id("Layoutnoticiasenseccionidentificado")
	private Element layoutnoticiasenseccionidentificado;
	@Id("Labelnoticiasenseccionidentificado")
	private TextField labelnoticiasenseccionidentificado;
	@Id("Noticiasenseccionidentificado")
	private HorizontalLayout noticiasenseccionidentificado;

	public VistaNoticiasenseccionidentificado() {
        // You can initialise any data required for the connected UI components here.
    }

}