package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextArea;

@Tag("vista-mostrarnoticiaextendida")
@JsModule("./src/vista-mostrarnoticiaextendida.ts")
public class VistaMostrarnoticiaextendida extends LitTemplate {

    public Element getLayoutmostrarnoticiaextendida() {
		return layoutmostrarnoticiaextendida;
	}

	public void setLayoutmostrarnoticiaextendida(Element layoutmostrarnoticiaextendida) {
		this.layoutmostrarnoticiaextendida = layoutmostrarnoticiaextendida;
	}

	public TextArea getTextareamostrarnoticiaextendida() {
		return textareamostrarnoticiaextendida;
	}

	public void setTextareamostrarnoticiaextendida(TextArea textareamostrarnoticiaextendida) {
		this.textareamostrarnoticiaextendida = textareamostrarnoticiaextendida;
	}

	@Id("Layoutmostrarnoticiaextendida")
	private Element layoutmostrarnoticiaextendida;
	@Id("Textareamostrarnoticiaextendida")
	private TextArea textareamostrarnoticiaextendida;

	public VistaMostrarnoticiaextendida() {
        // You can initialise any data required for the connected UI components here.
    }

}