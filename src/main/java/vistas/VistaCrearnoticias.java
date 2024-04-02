package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;

@Tag("vista-crearnoticias")
@JsModule("./src/vista-crearnoticias.ts")
public class VistaCrearnoticias extends LitTemplate {

    @Id("Layouttitulocrearnoticias")
	private HorizontalLayout layouttitulocrearnoticias;
	@Id("Labeltitulocrearnoticias")
	private Label labeltitulocrearnoticias;
	@Id("Textfieldtitulocrearnoticias")
	private TextField textfieldtitulocrearnoticias;
	@Id("Layouturlimagenescrearnoticias")
	private HorizontalLayout layouturlimagenescrearnoticias;
	@Id("Labelurlimagenescrearnoticias")
	private Label labelurlimagenescrearnoticias;
	@Id("Textfieldurlimagenescrearnoticias")
	private TextField textfieldurlimagenescrearnoticias;
	@Id("Layoutcontenidocrearnoticias")
	private HorizontalLayout layoutcontenidocrearnoticias;
	@Id("Labelcontenidocrearnoticias")
	private Label labelcontenidocrearnoticias;
	@Id("Textareacontenidocrearnoticias")
	private TextArea textareacontenidocrearnoticias;
	@Id("Layoutfechalugarcrearnoticias")
	private HorizontalLayout layoutfechalugarcrearnoticias;
	@Id("Labelfechalugarcrearnoticias")
	private Label labelfechalugarcrearnoticias;
	@Id("Layouttextfieldfechalugarcrearnoticias")
	private HorizontalLayout layouttextfieldfechalugarcrearnoticias;
	@Id("Textfieldfechacrearnoticias")
	private TextField textfieldfechacrearnoticias;
	@Id("Textfiedlugarcrearnoticias")
	private TextField textfiedlugarcrearnoticias;
	@Id("Layouttematicacrearnoticias")
	private HorizontalLayout layouttematicacrearnoticias;
	@Id("Labeltematicacrearnoticias")
	private Label labeltematicacrearnoticias;
	@Id("Textfieldtematicacrearnoticias")
	private TextField textfieldtematicacrearnoticias;
	@Id("Layoutbotoncrearnoticias")
	private HorizontalLayout layoutbotoncrearnoticias;
	@Id("Buttoncrearnoticias")
	private Button buttoncrearnoticias;

	public VistaCrearnoticias() {
        // You can initialise any data required for the connected UI components here.
    }

}