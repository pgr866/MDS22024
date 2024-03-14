package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextArea;

@Tag("vista-seccioncomentarios_item")
@JsModule("./src/vista-seccioncomentarios_item.ts")
public class VistaSeccioncomentarios_item extends LitTemplate {

    public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Image getFotousuario() {
		return fotousuario;
	}

	public void setFotousuario(Image fotousuario) {
		this.fotousuario = fotousuario;
	}

	public Element getLayoutnickusuario() {
		return layoutnickusuario;
	}

	public void setLayoutnickusuario(Element layoutnickusuario) {
		this.layoutnickusuario = layoutnickusuario;
	}

	public TextField getNickusuario() {
		return nickusuario;
	}

	public void setNickusuario(TextField nickusuario) {
		this.nickusuario = nickusuario;
	}

	public Element getLayoutmegusta() {
		return layoutmegusta;
	}

	public void setLayoutmegusta(Element layoutmegusta) {
		this.layoutmegusta = layoutmegusta;
	}

	public Button getMegusta() {
		return megusta;
	}

	public void setMegusta(Button megusta) {
		this.megusta = megusta;
	}

	public Element getLayoutnumeromegusta() {
		return layoutnumeromegusta;
	}

	public void setLayoutnumeromegusta(Element layoutnumeromegusta) {
		this.layoutnumeromegusta = layoutnumeromegusta;
	}

	public TextField getNumeromegusta() {
		return numeromegusta;
	}

	public void setNumeromegusta(TextField numeromegusta) {
		this.numeromegusta = numeromegusta;
	}

	public Element getLayoutcontenidocomentario() {
		return layoutcontenidocomentario;
	}

	public void setLayoutcontenidocomentario(Element layoutcontenidocomentario) {
		this.layoutcontenidocomentario = layoutcontenidocomentario;
	}

	public TextArea getContenidocomentario() {
		return contenidocomentario;
	}

	public void setContenidocomentario(TextArea contenidocomentario) {
		this.contenidocomentario = contenidocomentario;
	}

	public Element getLayoutborrarcomentario() {
		return layoutborrarcomentario;
	}

	public void setLayoutborrarcomentario(Element layoutborrarcomentario) {
		this.layoutborrarcomentario = layoutborrarcomentario;
	}

	public Button getBorrarcomentario() {
		return borrarcomentario;
	}

	public void setBorrarcomentario(Button borrarcomentario) {
		this.borrarcomentario = borrarcomentario;
	}

	public Element getLayoutnomegusta() {
		return layoutnomegusta;
	}

	public void setLayoutnomegusta(Element layoutnomegusta) {
		this.layoutnomegusta = layoutnomegusta;
	}

	public Button getNomegusta() {
		return nomegusta;
	}

	public void setNomegusta(Button nomegusta) {
		this.nomegusta = nomegusta;
	}

	public Element getLayoutnumeronomegusta() {
		return layoutnumeronomegusta;
	}

	public void setLayoutnumeronomegusta(Element layoutnumeronomegusta) {
		this.layoutnumeronomegusta = layoutnumeronomegusta;
	}

	public TextField getNumeronomegusta() {
		return numeronomegusta;
	}

	public void setNumeronomegusta(TextField numeronomegusta) {
		this.numeronomegusta = numeronomegusta;
	}

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("Fotousuario")
	private Image fotousuario;
	@Id("Layoutnickusuario")
	private Element layoutnickusuario;
	@Id("Nickusuario")
	private TextField nickusuario;
	@Id("Layoutmegusta")
	private Element layoutmegusta;
	@Id("Megusta")
	private Button megusta;
	@Id("Layoutnumeromegusta")
	private Element layoutnumeromegusta;
	@Id("Numeromegusta")
	private TextField numeromegusta;
	@Id("Layoutcontenidocomentario")
	private Element layoutcontenidocomentario;
	@Id("Contenidocomentario")
	private TextArea contenidocomentario;
	@Id("Layoutborrarcomentario")
	private Element layoutborrarcomentario;
	@Id("Borrarcomentario")
	private Button borrarcomentario;
	@Id("Layoutnomegusta")
	private Element layoutnomegusta;
	@Id("Nomegusta")
	private Button nomegusta;
	@Id("Layoutnumeronomegusta")
	private Element layoutnumeronomegusta;
	@Id("Numeronomegusta")
	private TextField numeronomegusta;

	public VistaSeccioncomentarios_item() {
        // You can initialise any data required for the connected UI components here.
    }

}