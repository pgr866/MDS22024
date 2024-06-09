package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

@Tag("vista-bajaaltaperiodistas")
@JsModule("./src/vista-bajaaltaperiodistas.ts")
public class VistaBajaaltaperiodistas extends LitTemplate {

    public Label getLabelerrordatosaltaperiodista() {
		return labelerrordatosaltaperiodista;
	}

	public void setLabelerrordatosaltaperiodista(Label labelerrordatosaltaperiodista) {
		this.labelerrordatosaltaperiodista = labelerrordatosaltaperiodista;
	}

	public HorizontalLayout getContrasenafehcanacimientodaraltaperiodista() {
		return contrasenafehcanacimientodaraltaperiodista;
	}

	public void setContrasenafehcanacimientodaraltaperiodista(HorizontalLayout contrasenafehcanacimientodaraltaperiodista) {
		this.contrasenafehcanacimientodaraltaperiodista = contrasenafehcanacimientodaraltaperiodista;
	}

	public Label getLabelcontrasenadaraltaperiodista() {
		return labelcontrasenadaraltaperiodista;
	}

	public void setLabelcontrasenadaraltaperiodista(Label labelcontrasenadaraltaperiodista) {
		this.labelcontrasenadaraltaperiodista = labelcontrasenadaraltaperiodista;
	}

	public Label getLabelfechanacimientodaraltaperiodista() {
		return labelfechanacimientodaraltaperiodista;
	}

	public void setLabelfechanacimientodaraltaperiodista(Label labelfechanacimientodaraltaperiodista) {
		this.labelfechanacimientodaraltaperiodista = labelfechanacimientodaraltaperiodista;
	}

	public TextField getTextfieldcontrasenadaraltaperiodista() {
		return textfieldcontrasenadaraltaperiodista;
	}

	public void setTextfieldcontrasenadaraltaperiodista(TextField textfieldcontrasenadaraltaperiodista) {
		this.textfieldcontrasenadaraltaperiodista = textfieldcontrasenadaraltaperiodista;
	}

	public TextField getTextfieldfechanacimientodaraltaperiodista() {
		return textfieldfechanacimientodaraltaperiodista;
	}

	public void setTextfieldfechanacimientodaraltaperiodista(TextField textfieldfechanacimientodaraltaperiodista) {
		this.textfieldfechanacimientodaraltaperiodista = textfieldfechanacimientodaraltaperiodista;
	}

	public Element getLayoutbuscarperiodistabajaaltaperiodistas() {
		return layoutbuscarperiodistabajaaltaperiodistas;
	}

	public void setLayoutbuscarperiodistabajaaltaperiodistas(Element layoutbuscarperiodistabajaaltaperiodistas) {
		this.layoutbuscarperiodistabajaaltaperiodistas = layoutbuscarperiodistabajaaltaperiodistas;
	}

	public Element getLayoutdaraltaperiodista() {
		return layoutdaraltaperiodista;
	}

	public void setLayoutdaraltaperiodista(Element layoutdaraltaperiodista) {
		this.layoutdaraltaperiodista = layoutdaraltaperiodista;
	}

	public Label getLabeldaraltaperiodista() {
		return labeldaraltaperiodista;
	}

	public void setLabeldaraltaperiodista(Label labeldaraltaperiodista) {
		this.labeldaraltaperiodista = labeldaraltaperiodista;
	}

	public HorizontalLayout getNombreydnidaraltaperiodista() {
		return nombreydnidaraltaperiodista;
	}

	public void setNombreydnidaraltaperiodista(HorizontalLayout nombreydnidaraltaperiodista) {
		this.nombreydnidaraltaperiodista = nombreydnidaraltaperiodista;
	}

	public Label getLabelnombredaraltaperiodista() {
		return labelnombredaraltaperiodista;
	}

	public void setLabelnombredaraltaperiodista(Label labelnombredaraltaperiodista) {
		this.labelnombredaraltaperiodista = labelnombredaraltaperiodista;
	}

	public TextField getTextfieldnombredaraltaperiodista() {
		return textfieldnombredaraltaperiodista;
	}

	public void setTextfieldnombredaraltaperiodista(TextField textfieldnombredaraltaperiodista) {
		this.textfieldnombredaraltaperiodista = textfieldnombredaraltaperiodista;
	}

	public Label getLabeldnidaraltaperiodista() {
		return labeldnidaraltaperiodista;
	}

	public void setLabeldnidaraltaperiodista(Label labeldnidaraltaperiodista) {
		this.labeldnidaraltaperiodista = labeldnidaraltaperiodista;
	}

	public TextField getTextfielddnidaraltaperiodista() {
		return textfielddnidaraltaperiodista;
	}

	public void setTextfielddnidaraltaperiodista(TextField textfielddnidaraltaperiodista) {
		this.textfielddnidaraltaperiodista = textfielddnidaraltaperiodista;
	}

	public HorizontalLayout getApellidosemaildaraltaperiodista() {
		return apellidosemaildaraltaperiodista;
	}

	public void setApellidosemaildaraltaperiodista(HorizontalLayout apellidosemaildaraltaperiodista) {
		this.apellidosemaildaraltaperiodista = apellidosemaildaraltaperiodista;
	}

	public Label getLabelapellidosdaraltaperiodista() {
		return labelapellidosdaraltaperiodista;
	}

	public void setLabelapellidosdaraltaperiodista(Label labelapellidosdaraltaperiodista) {
		this.labelapellidosdaraltaperiodista = labelapellidosdaraltaperiodista;
	}

	public TextField getTextfieldapellidosdaraltaperiodista() {
		return textfieldapellidosdaraltaperiodista;
	}

	public void setTextfieldapellidosdaraltaperiodista(TextField textfieldapellidosdaraltaperiodista) {
		this.textfieldapellidosdaraltaperiodista = textfieldapellidosdaraltaperiodista;
	}

	public Label getLabelemaildaraltaperiodista() {
		return labelemaildaraltaperiodista;
	}

	public void setLabelemaildaraltaperiodista(Label labelemaildaraltaperiodista) {
		this.labelemaildaraltaperiodista = labelemaildaraltaperiodista;
	}

	public TextField getTextfieldemaildaraltaperiodista() {
		return textfieldemaildaraltaperiodista;
	}

	public void setTextfieldemaildaraltaperiodista(TextField textfieldemaildaraltaperiodista) {
		this.textfieldemaildaraltaperiodista = textfieldemaildaraltaperiodista;
	}

	public HorizontalLayout getNicktelefonodaraltaperiodista() {
		return nicktelefonodaraltaperiodista;
	}

	public void setNicktelefonodaraltaperiodista(HorizontalLayout nicktelefonodaraltaperiodista) {
		this.nicktelefonodaraltaperiodista = nicktelefonodaraltaperiodista;
	}

	public Label getLabelnickdaraltaperiodista() {
		return labelnickdaraltaperiodista;
	}

	public void setLabelnickdaraltaperiodista(Label labelnickdaraltaperiodista) {
		this.labelnickdaraltaperiodista = labelnickdaraltaperiodista;
	}

	public TextField getTextfieldnickdaraltaperiodista() {
		return textfieldnickdaraltaperiodista;
	}

	public void setTextfieldnickdaraltaperiodista(TextField textfieldnickdaraltaperiodista) {
		this.textfieldnickdaraltaperiodista = textfieldnickdaraltaperiodista;
	}

	public Label getLabeltelefonodaraltaperiodista() {
		return labeltelefonodaraltaperiodista;
	}

	public void setLabeltelefonodaraltaperiodista(Label labeltelefonodaraltaperiodista) {
		this.labeltelefonodaraltaperiodista = labeltelefonodaraltaperiodista;
	}

	public TextField getTextfieldtelefonodaraltaperiodista() {
		return textfieldtelefonodaraltaperiodista;
	}

	public void setTextfieldtelefonodaraltaperiodista(TextField textfieldtelefonodaraltaperiodista) {
		this.textfieldtelefonodaraltaperiodista = textfieldtelefonodaraltaperiodista;
	}

	public HorizontalLayout getLayoutbotondaraltaperiodista() {
		return layoutbotondaraltaperiodista;
	}

	public void setLayoutbotondaraltaperiodista(HorizontalLayout layoutbotondaraltaperiodista) {
		this.layoutbotondaraltaperiodista = layoutbotondaraltaperiodista;
	}

	public Button getButtondaraltaperiodista() {
		return buttondaraltaperiodista;
	}

	public void setButtondaraltaperiodista(Button buttondaraltaperiodista) {
		this.buttondaraltaperiodista = buttondaraltaperiodista;
	}

	public Element getLayoutdarbajaperiodista() {
		return layoutdarbajaperiodista;
	}

	public void setLayoutdarbajaperiodista(Element layoutdarbajaperiodista) {
		this.layoutdarbajaperiodista = layoutdarbajaperiodista;
	}

	public Label getLabeldarbajaperiodista() {
		return labeldarbajaperiodista;
	}

	public void setLabeldarbajaperiodista(Label labeldarbajaperiodista) {
		this.labeldarbajaperiodista = labeldarbajaperiodista;
	}

	public Button getButtondarbajaperiodista() {
		return buttondarbajaperiodista;
	}

	public void setButtondarbajaperiodista(Button buttondarbajaperiodista) {
		this.buttondarbajaperiodista = buttondarbajaperiodista;
	}

	@Id("Layoutdaraltaperiodista")
	private Element layoutdaraltaperiodista;
	@Id("Labeldaraltaperiodista")
	private Label labeldaraltaperiodista;
	@Id("Nombreydnidaraltaperiodista")
	private HorizontalLayout nombreydnidaraltaperiodista;
	@Id("Labelnombredaraltaperiodista")
	private Label labelnombredaraltaperiodista;
	@Id("Textfieldnombredaraltaperiodista")
	private TextField textfieldnombredaraltaperiodista;
	@Id("Labeldnidaraltaperiodista")
	private Label labeldnidaraltaperiodista;
	@Id("Textfielddnidaraltaperiodista")
	private TextField textfielddnidaraltaperiodista;
	@Id("Apellidosemaildaraltaperiodista")
	private HorizontalLayout apellidosemaildaraltaperiodista;
	@Id("Labelapellidosdaraltaperiodista")
	private Label labelapellidosdaraltaperiodista;
	@Id("Textfieldapellidosdaraltaperiodista")
	private TextField textfieldapellidosdaraltaperiodista;
	@Id("Labelemaildaraltaperiodista")
	private Label labelemaildaraltaperiodista;
	@Id("Textfieldemaildaraltaperiodista")
	private TextField textfieldemaildaraltaperiodista;
	@Id("Nicktelefonodaraltaperiodista")
	private HorizontalLayout nicktelefonodaraltaperiodista;
	@Id("Labelnickdaraltaperiodista")
	private Label labelnickdaraltaperiodista;
	@Id("Textfieldnickdaraltaperiodista")
	private TextField textfieldnickdaraltaperiodista;
	@Id("Labeltelefonodaraltaperiodista")
	private Label labeltelefonodaraltaperiodista;
	@Id("Textfieldtelefonodaraltaperiodista")
	private TextField textfieldtelefonodaraltaperiodista;
	@Id("Layoutbotondaraltaperiodista")
	private HorizontalLayout layoutbotondaraltaperiodista;
	@Id("Buttondaraltaperiodista")
	private Button buttondaraltaperiodista;
	@Id("Layoutdarbajaperiodista")
	private Element layoutdarbajaperiodista;
	@Id("Labeldarbajaperiodista")
	private Label labeldarbajaperiodista;
	@Id("Buttondarbajaperiodista")
	private Button buttondarbajaperiodista;
	@Id("Layoutbuscarperiodistabajaaltaperiodistas")
	private Element layoutbuscarperiodistabajaaltaperiodistas;
	@Id("contrasenafehcanacimientodaraltaperiodista")
	private HorizontalLayout contrasenafehcanacimientodaraltaperiodista;
	@Id("Labelcontrasenadaraltaperiodista")
	private Label labelcontrasenadaraltaperiodista;
	@Id("Labelfechanacimientodaraltaperiodista")
	private Label labelfechanacimientodaraltaperiodista;
	@Id("Textfieldcontrasenadaraltaperiodista")
	private TextField textfieldcontrasenadaraltaperiodista;
	@Id("Textfieldfechanacimientodaraltaperiodista")
	private TextField textfieldfechanacimientodaraltaperiodista;
	@Id("Labelerrordatosaltaperiodista")
	private Label labelerrordatosaltaperiodista;

	public VistaBajaaltaperiodistas() {
        // You can initialise any data required for the connected UI components here.
    }

}