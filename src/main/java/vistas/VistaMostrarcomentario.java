package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextArea;

@Tag("vista-mostrarcomentario")
@JsModule("./src/vista-mostrarcomentario.ts")
public class VistaMostrarcomentario extends LitTemplate {

    @Id("Layoutmostrarcomentario")
	private Element layoutmostrarcomentario;
	@Id("Textareacontenidocomentario")
	private TextArea textareacontenidocomentario;

	public VistaMostrarcomentario() {
        // You can initialise any data required for the connected UI components here.
    }

}