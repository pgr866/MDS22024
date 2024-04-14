package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextArea;

@Tag("vista-seccioncomentarios")
@JsModule("./src/vista-seccioncomentarios.ts")
public class VistaSeccioncomentarios extends LitTemplate {

	public TextArea getTextareacomentarioseccioncomentarios() {
		return textareacomentarioseccioncomentarios;
	}

	public void setTextareacomentarioseccioncomentarios(TextArea textareacomentarioseccioncomentarios) {
		this.textareacomentarioseccioncomentarios = textareacomentarioseccioncomentarios;
	}

	public Element getLayoutseccioncomentarios() {
		return layoutseccioncomentarios;
	}

	public void setLayoutseccioncomentarios(Element layoutseccioncomentarios) {
		this.layoutseccioncomentarios = layoutseccioncomentarios;
	}

	public Label getLabelseccioncomentarios() {
		return labelseccioncomentarios;
	}

	public void setLabelseccioncomentarios(Label labelseccioncomentarios) {
		this.labelseccioncomentarios = labelseccioncomentarios;
	}

	public HorizontalLayout getLayoutcomentarioseccioncomentarios() {
		return layoutcomentarioseccioncomentarios;
	}

	public void setLayoutcomentarioseccioncomentarios(HorizontalLayout layoutcomentarioseccioncomentarios) {
		this.layoutcomentarioseccioncomentarios = layoutcomentarioseccioncomentarios;
	}

	public Button getBotonanadircomentarioseccioncomentarios() {
		return botonanadircomentarioseccioncomentarios;
	}

	public void setBotonanadircomentarioseccioncomentarios(Button botonanadircomentarioseccioncomentarios) {
		this.botonanadircomentarioseccioncomentarios = botonanadircomentarioseccioncomentarios;
	}

	public Element getLayoutvistaseccioncomentarios() {
		return layoutvistaseccioncomentarios;
	}

	public void setLayoutvistaseccioncomentarios(Element layoutvistaseccioncomentarios) {
		this.layoutvistaseccioncomentarios = layoutvistaseccioncomentarios;
	}

	@Id("Layoutseccioncomentarios")
	private Element layoutseccioncomentarios;
	@Id("Labelseccioncomentarios")
	private Label labelseccioncomentarios;
	@Id("Layoutcomentarioseccioncomentarios")
	private HorizontalLayout layoutcomentarioseccioncomentarios;
	@Id("Botonanadircomentarioseccioncomentarios")
	private Button botonanadircomentarioseccioncomentarios;
	@Id("Layoutvistaseccioncomentarios")
	private Element layoutvistaseccioncomentarios;
	@Id("Textareacomentarioseccioncomentarios")
	private TextArea textareacomentarioseccioncomentarios;

	public VistaSeccioncomentarios() {
        // You can initialise any data required for the connected UI components here.
    }

}