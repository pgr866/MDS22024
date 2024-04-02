package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;

@Tag("vista-registrarse")
@JsModule("./src/vista-registrarse.ts")
public class VistaRegistrarse extends LitTemplate {


	@Id("Layoutregistrarse")
	private HorizontalLayout layoutregistrarse;
	@Id("Logoregistrarse")
	private Button logoregistrarse;
	@Id("Imagenlogoregistrarse")
	private Image imagenlogoregistrarse;
	@Id("Labelregistrarse")
	private Label labelregistrarse;
	@Id("Layoutemailregistrarse")
	private HorizontalLayout layoutemailregistrarse;
	@Id("Labelemailregistrarse")
	private Label labelemailregistrarse;
	@Id("Textfieldemailregistrarse")
	private TextField textfieldemailregistrarse;
	@Id("Layoutnombreregistrarse")
	private HorizontalLayout layoutnombreregistrarse;
	@Id("Labelnombreregistrarse")
	private Label labelnombreregistrarse;
	@Id("Textfieldnombreregistrarse")
	private TextField textfieldnombreregistrarse;
	@Id("Layoutapellidosregistrarse")
	private HorizontalLayout layoutapellidosregistrarse;
	@Id("Labelapellidosregistrarse")
	private Label labelapellidosregistrarse;
	@Id("Textfieldapellidosregistrarse")
	private TextField textfieldapellidosregistrarse;
	@Id("Layoutfechanacimientoregistrarse")
	private HorizontalLayout layoutfechanacimientoregistrarse;
	@Id("Labelfechanacimientoregistrarse")
	private Label labelfechanacimientoregistrarse;
	@Id("Textfieldfechanacimientoregistrarse")
	private TextField textfieldfechanacimientoregistrarse;
	@Id("Layoutapodoregistrarse")
	private HorizontalLayout layoutapodoregistrarse;
	@Id("Labelapodoregistrarse")
	private Label labelapodoregistrarse;
	@Id("Textfieldregistrarse")
	private TextField textfieldregistrarse;
	@Id("Layoutdniregistrarse")
	private HorizontalLayout layoutdniregistrarse;
	@Id("Labeldniregistrarse")
	private Label labeldniregistrarse;
	@Id("Textfielddniregistrarse")
	private TextField textfielddniregistrarse;
	@Id("Layoutntarjetaregistrarse")
	private HorizontalLayout layoutntarjetaregistrarse;
	@Id("Labelntarjetaregistrarse")
	private Label labelntarjetaregistrarse;
	@Id("Textfieldntarjetaregistrarse")
	private TextField textfieldntarjetaregistrarse;
	@Id("Layoutcontrasenaregistrarse")
	private HorizontalLayout layoutcontrasenaregistrarse;
	@Id("Labelcontrasenaregistrarse")
	private Label labelcontrasenaregistrarse;
	@Id("Passwordfieldcontrasenaregistrarse")
	private PasswordField passwordfieldcontrasenaregistrarse;
	@Id("Layoutrepetircontrasenaregistrarse")
	private HorizontalLayout layoutrepetircontrasenaregistrarse;
	@Id("Labelrepetircontrasenaregistrarse")
	private Label labelrepetircontrasenaregistrarse;
	@Id("Passwordfieldrepetircontrasenaregistrarse")
	private PasswordField passwordfieldrepetircontrasenaregistrarse;
	@Id("Layoutcancelarenviarregistrarse")
	private HorizontalLayout layoutcancelarenviarregistrarse;
	@Id("Cancelarregistrarse")
	private Button cancelarregistrarse;
	@Id("Enviarregistrarse")
	private Button enviarregistrarse;

	public VistaRegistrarse() {
        // You can initialise any data required for the connected UI components here.
    }

}