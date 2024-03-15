package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

@Tag("vista-iniciarsesion")
@JsModule("./src/vista-iniciarsesion.ts")
public class VistaIniciarsesion extends LitTemplate {

    @Id("Layoutlogin")
	private HorizontalLayout layoutlogin;
	@Id("Passwordlogin")
	private TextField passwordlogin;
	@Id("Usernamelogin")
	private TextField usernamelogin;
	@Id("Botonlogin")
	private Button botonlogin;
	public VistaIniciarsesion() {
        // You can initialise any data required for the connected UI components here.
    }
	public HorizontalLayout getLayoutlogin() {
		return layoutlogin;
	}
	public void setLayoutlogin(HorizontalLayout layoutlogin) {
		this.layoutlogin = layoutlogin;
	}
	public TextField getPasswordlogin() {
		return passwordlogin;
	}
	public void setPasswordlogin(TextField passwordlogin) {
		this.passwordlogin = passwordlogin;
	}
	public TextField getUsernamelogin() {
		return usernamelogin;
	}
	public void setUsernamelogin(TextField usernamelogin) {
		this.usernamelogin = usernamelogin;
	}
	public Button getBotonlogin() {
		return botonlogin;
	}
	public void setBotonlogin(Button botonlogin) {
		this.botonlogin = botonlogin;
	}
	
	

}