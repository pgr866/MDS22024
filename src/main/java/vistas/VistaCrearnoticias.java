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

    public Label getLabelmensajeerrorcrearnoticia() {
		return labelmensajeerrorcrearnoticia;
	}

	public void setLabelmensajeerrorcrearnoticia(Label labelmensajeerrorcrearnoticia) {
		this.labelmensajeerrorcrearnoticia = labelmensajeerrorcrearnoticia;
	}

	public HorizontalLayout getLayouttitulocrearnoticias() {
		return layouttitulocrearnoticias;
	}

	public void setLayouttitulocrearnoticias(HorizontalLayout layouttitulocrearnoticias) {
		this.layouttitulocrearnoticias = layouttitulocrearnoticias;
	}

	public Label getLabeltitulocrearnoticias() {
		return labeltitulocrearnoticias;
	}

	public void setLabeltitulocrearnoticias(Label labeltitulocrearnoticias) {
		this.labeltitulocrearnoticias = labeltitulocrearnoticias;
	}

	public TextField getTextfieldtitulocrearnoticias() {
		return textfieldtitulocrearnoticias;
	}

	public void setTextfieldtitulocrearnoticias(TextField textfieldtitulocrearnoticias) {
		this.textfieldtitulocrearnoticias = textfieldtitulocrearnoticias;
	}

	public HorizontalLayout getLayouturlimagenescrearnoticias() {
		return layouturlimagenescrearnoticias;
	}

	public void setLayouturlimagenescrearnoticias(HorizontalLayout layouturlimagenescrearnoticias) {
		this.layouturlimagenescrearnoticias = layouturlimagenescrearnoticias;
	}

	public Label getLabelurlimagenescrearnoticias() {
		return labelurlimagenescrearnoticias;
	}

	public void setLabelurlimagenescrearnoticias(Label labelurlimagenescrearnoticias) {
		this.labelurlimagenescrearnoticias = labelurlimagenescrearnoticias;
	}

	public TextField getTextfieldurlimagenescrearnoticias() {
		return textfieldurlimagenescrearnoticias;
	}

	public void setTextfieldurlimagenescrearnoticias(TextField textfieldurlimagenescrearnoticias) {
		this.textfieldurlimagenescrearnoticias = textfieldurlimagenescrearnoticias;
	}

	public HorizontalLayout getLayoutcontenidocrearnoticias() {
		return layoutcontenidocrearnoticias;
	}

	public void setLayoutcontenidocrearnoticias(HorizontalLayout layoutcontenidocrearnoticias) {
		this.layoutcontenidocrearnoticias = layoutcontenidocrearnoticias;
	}

	public Label getLabelcontenidocrearnoticias() {
		return labelcontenidocrearnoticias;
	}

	public void setLabelcontenidocrearnoticias(Label labelcontenidocrearnoticias) {
		this.labelcontenidocrearnoticias = labelcontenidocrearnoticias;
	}

	public TextArea getTextareacontenidocrearnoticias() {
		return textareacontenidocrearnoticias;
	}

	public void setTextareacontenidocrearnoticias(TextArea textareacontenidocrearnoticias) {
		this.textareacontenidocrearnoticias = textareacontenidocrearnoticias;
	}

	public HorizontalLayout getLayoutfechalugarcrearnoticias() {
		return layoutfechalugarcrearnoticias;
	}

	public void setLayoutfechalugarcrearnoticias(HorizontalLayout layoutfechalugarcrearnoticias) {
		this.layoutfechalugarcrearnoticias = layoutfechalugarcrearnoticias;
	}

	public Label getLabelfechalugarcrearnoticias() {
		return labelfechalugarcrearnoticias;
	}

	public void setLabelfechalugarcrearnoticias(Label labelfechalugarcrearnoticias) {
		this.labelfechalugarcrearnoticias = labelfechalugarcrearnoticias;
	}

	public HorizontalLayout getLayouttextfieldfechalugarcrearnoticias() {
		return layouttextfieldfechalugarcrearnoticias;
	}

	public void setLayouttextfieldfechalugarcrearnoticias(HorizontalLayout layouttextfieldfechalugarcrearnoticias) {
		this.layouttextfieldfechalugarcrearnoticias = layouttextfieldfechalugarcrearnoticias;
	}

	public TextField getTextfieldfechacrearnoticias() {
		return textfieldfechacrearnoticias;
	}

	public void setTextfieldfechacrearnoticias(TextField textfieldfechacrearnoticias) {
		this.textfieldfechacrearnoticias = textfieldfechacrearnoticias;
	}

	public TextField getTextfiedlugarcrearnoticias() {
		return textfiedlugarcrearnoticias;
	}

	public void setTextfiedlugarcrearnoticias(TextField textfiedlugarcrearnoticias) {
		this.textfiedlugarcrearnoticias = textfiedlugarcrearnoticias;
	}

	public HorizontalLayout getLayouttematicacrearnoticias() {
		return layouttematicacrearnoticias;
	}

	public void setLayouttematicacrearnoticias(HorizontalLayout layouttematicacrearnoticias) {
		this.layouttematicacrearnoticias = layouttematicacrearnoticias;
	}

	public Label getLabeltematicacrearnoticias() {
		return labeltematicacrearnoticias;
	}

	public void setLabeltematicacrearnoticias(Label labeltematicacrearnoticias) {
		this.labeltematicacrearnoticias = labeltematicacrearnoticias;
	}

	public TextField getTextfieldtematicacrearnoticias() {
		return textfieldtematicacrearnoticias;
	}

	public void setTextfieldtematicacrearnoticias(TextField textfieldtematicacrearnoticias) {
		this.textfieldtematicacrearnoticias = textfieldtematicacrearnoticias;
	}

	public HorizontalLayout getLayoutbotoncrearnoticias() {
		return layoutbotoncrearnoticias;
	}

	public void setLayoutbotoncrearnoticias(HorizontalLayout layoutbotoncrearnoticias) {
		this.layoutbotoncrearnoticias = layoutbotoncrearnoticias;
	}

	public Button getButtoncrearnoticias() {
		return buttoncrearnoticias;
	}

	public void setButtoncrearnoticias(Button buttoncrearnoticias) {
		this.buttoncrearnoticias = buttoncrearnoticias;
	}

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
	@Id("Labelmensajeerrorcrearnoticia")
	private Label labelmensajeerrorcrearnoticia;

	public VistaCrearnoticias() {
        // You can initialise any data required for the connected UI components here.
    }

}