package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.textfield.PasswordField;

@Tag("vista-iniciarsesion")
@JsModule("./src/vista-iniciarsesion.ts")
public class VistaIniciarsesion extends LitTemplate {

    @Id("Layoutlogin")
	private HorizontalLayout layoutlogin;
	@Id("Buttonlogologin")
	private Button buttonlogologin;
	@Id("Imagenlogologin")
	private Image imagenlogologin;
	@Id("Labellogin")
	private Label labellogin;
	@Id("Layoutopcioneslogin")
	private Element layoutopcioneslogin;
	@Id("Layoutusuariologin")
	private HorizontalLayout layoutusuariologin;
	@Id("Labelusuariologin")
	private Label labelusuariologin;
	@Id("Textfieldusuariologin")
	private TextField textfieldusuariologin;
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

	public VistaIniciarsesion() {
        // You can initialise any data required for the connected UI components here.
    }
}