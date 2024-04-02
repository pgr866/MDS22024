package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;

@Tag("vista-configurarperfil")
@JsModule("./src/vista-configurarperfil.ts")
public class VistaConfigurarperfil extends LitTemplate {

    @Id("Layoutconfigurarperfil")
	private Element layoutconfigurarperfil;
	@Id("ButtonFotoconfigurarperfil")
	private Button buttonFotoconfigurarperfil;
	@Id("Fotoconfigurarperfil")
	private Image fotoconfigurarperfil;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("Layoutnombreconfigurarperfil")
	private HorizontalLayout layoutnombreconfigurarperfil;
	@Id("Labelnombreconfigurarperfil")
	private Label labelnombreconfigurarperfil;
	@Id("Textfieldnombreconfigurarperfil")
	private TextField textfieldnombreconfigurarperfil;
	@Id("Layoutapodoconfigurarperfil")
	private HorizontalLayout layoutapodoconfigurarperfil;
	@Id("Labelapodoconfigurarperfil")
	private Label labelapodoconfigurarperfil;
	@Id("Textfieldapodoconfigurarperfil")
	private TextField textfieldapodoconfigurarperfil;
	@Id("Layoutemailconfigurarperfil")
	private HorizontalLayout layoutemailconfigurarperfil;
	@Id("Labelemailconfigurarperfil")
	private Label labelemailconfigurarperfil;
	@Id("Layoutntarjetaconfigurarperfil")
	private HorizontalLayout layoutntarjetaconfigurarperfil;
	@Id("Textfieldemailconfigurarperfil")
	private TextField textfieldemailconfigurarperfil;
	@Id("Labelntarjetaconfigurarperfil")
	private Label labelntarjetaconfigurarperfil;
	@Id("Textfieldntarjetaconfigurarperfil")
	private TextField textfieldntarjetaconfigurarperfil;
	@Id("Layoutcontrasenaconfigurarperfil")
	private HorizontalLayout layoutcontrasenaconfigurarperfil;
	@Id("Labelcontrasenaconfigurarperfil")
	private Label labelcontrasenaconfigurarperfil;
	@Id("Passwordfieldcontrasenaconfigurarperfil")
	private PasswordField passwordfieldcontrasenaconfigurarperfil;
	@Id("Layoutbotonesconfigurarperfil")
	private HorizontalLayout layoutbotonesconfigurarperfil;
	@Id("Buttonguardarcambiosconfigurarperfil")
	private Button buttonguardarcambiosconfigurarperfil;
	@Id("Buttoneliminarcuentaconfigurarperfil")
	private Button buttoneliminarcuentaconfigurarperfil;

	public VistaConfigurarperfil() {
        // You can initialise any data required for the connected UI components here.
    }

}