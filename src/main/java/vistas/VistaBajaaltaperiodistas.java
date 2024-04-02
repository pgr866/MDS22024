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
import vistas.VistaBuscarperiodista;

@Tag("vista-bajaaltaperiodistas")
@JsModule("./src/vista-bajaaltaperiodistas.ts")
public class VistaBajaaltaperiodistas extends LitTemplate {

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
	@Id("Layoutvistadarbajaperiodista")
	private HorizontalLayout layoutvistadarbajaperiodista;
	@Id("Busquedadarbajaperiodista")
	private VistaBuscarperiodista busquedadarbajaperiodista;
	@Id("Buttondarbajaperiodista")
	private Button buttondarbajaperiodista;

	public VistaBajaaltaperiodistas() {
        // You can initialise any data required for the connected UI components here.
    }

}