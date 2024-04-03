package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextArea;

@Tag("vista-mostrarnoticiaresumida")
@JsModule("./src/vista-mostrarnoticiaresumida.ts")
public class VistaMostrarnoticiaresumida extends LitTemplate {

    public Element getLayoutresumenmostrarnoticiaresumida() {
		return layoutresumenmostrarnoticiaresumida;
	}

	public void setLayoutresumenmostrarnoticiaresumida(Element layoutresumenmostrarnoticiaresumida) {
		this.layoutresumenmostrarnoticiaresumida = layoutresumenmostrarnoticiaresumida;
	}

	public TextArea getTextarearesumenmostrarnoticiaresumida() {
		return textarearesumenmostrarnoticiaresumida;
	}

	public void setTextarearesumenmostrarnoticiaresumida(TextArea textarearesumenmostrarnoticiaresumida) {
		this.textarearesumenmostrarnoticiaresumida = textarearesumenmostrarnoticiaresumida;
	}

	@Id("Layoutresumenmostrarnoticiaresumida")
	private Element layoutresumenmostrarnoticiaresumida;
	@Id("Textarearesumenmostrarnoticiaresumida")
	private TextArea textarearesumenmostrarnoticiaresumida;

	public VistaMostrarnoticiaresumida() {
        // You can initialise any data required for the connected UI components here.
    }

}