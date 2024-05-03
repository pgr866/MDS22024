package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.textfield.PasswordField;

@Tag("vista-iniciarsesion")
@JsModule("./src/vista-iniciarsesion.ts")
public class VistaIniciarsesion extends LitTemplate {

    public HorizontalLayout getLayoutmensajeerrorlogin() {
		return layoutmensajeerrorlogin;
	}

	public void setLayoutmensajeerrorlogin(HorizontalLayout layoutmensajeerrorlogin) {
		this.layoutmensajeerrorlogin = layoutmensajeerrorlogin;
	}

	public Label getLabelmensajeerrorlogin() {
		return labelmensajeerrorlogin;
	}

	public void setLabelmensajeerrorlogin(Label labelmensajeerrorlogin) {
		this.labelmensajeerrorlogin = labelmensajeerrorlogin;
	}

	public HorizontalLayout getLayoutemaillogin() {
		return layoutemaillogin;
	}

	public void setLayoutemaillogin(HorizontalLayout layoutemaillogin) {
		this.layoutemaillogin = layoutemaillogin;
	}

	public Label getLabelemaillogin() {
		return labelemaillogin;
	}

	public void setLabelemaillogin(Label labelemaillogin) {
		this.labelemaillogin = labelemaillogin;
	}

	public TextField getTextfieldemaillogin() {
		return textfieldemaillogin;
	}

	public void setTextfieldemaillogin(TextField textfieldemaillogin) {
		this.textfieldemaillogin = textfieldemaillogin;
	}

	public HorizontalLayout getLayoutlogin() {
		return layoutlogin;
	}

	public void setLayoutlogin(HorizontalLayout layoutlogin) {
		this.layoutlogin = layoutlogin;
	}

	public Label getLabellogin() {
		return labellogin;
	}

	public void setLabellogin(Label labellogin) {
		this.labellogin = labellogin;
	}

	public Element getLayoutopcioneslogin() {
		return layoutopcioneslogin;
	}

	public void setLayoutopcioneslogin(Element layoutopcioneslogin) {
		this.layoutopcioneslogin = layoutopcioneslogin;
	}

	public HorizontalLayout getLayoutcontrasenalogin() {
		return layoutcontrasenalogin;
	}

	public void setLayoutcontrasenalogin(HorizontalLayout layoutcontrasenalogin) {
		this.layoutcontrasenalogin = layoutcontrasenalogin;
	}

	public Label getLabelcontrasenalogin() {
		return labelcontrasenalogin;
	}

	public void setLabelcontrasenalogin(Label labelcontrasenalogin) {
		this.labelcontrasenalogin = labelcontrasenalogin;
	}

	public PasswordField getPasswordfieldogin() {
		return passwordfieldogin;
	}

	public void setPasswordfieldogin(PasswordField passwordfieldogin) {
		this.passwordfieldogin = passwordfieldogin;
	}

	public Button getButtonentrarlogin() {
		return buttonentrarlogin;
	}

	public void setButtonentrarlogin(Button buttonentrarlogin) {
		this.buttonentrarlogin = buttonentrarlogin;
	}

	public HorizontalLayout getLayoutregistrarselogin() {
		return layoutregistrarselogin;
	}

	public void setLayoutregistrarselogin(HorizontalLayout layoutregistrarselogin) {
		this.layoutregistrarselogin = layoutregistrarselogin;
	}

	public Label getLabelnoestasregistrado() {
		return labelnoestasregistrado;
	}

	public void setLabelnoestasregistrado(Label labelnoestasregistrado) {
		this.labelnoestasregistrado = labelnoestasregistrado;
	}

	public Button getButtonregistrarselogin() {
		return buttonregistrarselogin;
	}

	public void setButtonregistrarselogin(Button buttonregistrarselogin) {
		this.buttonregistrarselogin = buttonregistrarselogin;
	}

	@Id("Layoutlogin")
	private HorizontalLayout layoutlogin;
	@Id("Labellogin")
	private Label labellogin;
	@Id("Layoutcontrasenalogin")
	private HorizontalLayout layoutcontrasenalogin;
	@Id("Labelcontrasenalogin")
	private Label labelcontrasenalogin;
	@Id("Passwordfieldogin")
	private PasswordField passwordfieldogin;
	@Id("Buttonentrarlogin")
	private Button buttonentrarlogin;
	@Id("Layoutregistrarselogin")
	private HorizontalLayout layoutregistrarselogin;
	@Id("Labelnoestasregistrado")
	private Label labelnoestasregistrado;
	@Id("Buttonregistrarselogin")
	private Button buttonregistrarselogin;
	@Id("Layoutopcioneslogin")
	private Element layoutopcioneslogin;
	@Id("Layoutemaillogin")
	private HorizontalLayout layoutemaillogin;
	@Id("Labelemaillogin")
	private Label labelemaillogin;
	@Id("Textfieldemaillogin")
	private TextField textfieldemaillogin;
	@Id("Layoutmensajeerrorlogin")
	private HorizontalLayout layoutmensajeerrorlogin;
	@Id("Labelmensajeerrorlogin")
	private Label labelmensajeerrorlogin;

	public VistaIniciarsesion() {
        // You can initialise any data required for the connected UI components here.
    }
}