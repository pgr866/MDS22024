package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-usuarionoregistrado")
@JsModule("./src/vista-usuarionoregistrado.ts")
public class VistaUsuarionoregistrado extends LitTemplate {

    public Element getLayoutlogonoregistrado() {
		return layoutlogonoregistrado;
	}

	public void setLayoutlogonoregistrado(Element layoutlogonoregistrado) {
		this.layoutlogonoregistrado = layoutlogonoregistrado;
	}

	public Button getLogonoregistrado() {
		return logonoregistrado;
	}

	public void setLogonoregistrado(Button logonoregistrado) {
		this.logonoregistrado = logonoregistrado;
	}

	public HorizontalLayout getBarrabusquedanoregistrado() {
		return barrabusquedanoregistrado;
	}

	public void setBarrabusquedanoregistrado(HorizontalLayout barrabusquedanoregistrado) {
		this.barrabusquedanoregistrado = barrabusquedanoregistrado;
	}

	public HorizontalLayout getOpcionesnoregistrado() {
		return opcionesnoregistrado;
	}

	public void setOpcionesnoregistrado(HorizontalLayout opcionesnoregistrado) {
		this.opcionesnoregistrado = opcionesnoregistrado;
	}

	public Button getExplorarseccionesnoregistrado() {
		return explorarseccionesnoregistrado;
	}

	public void setExplorarseccionesnoregistrado(Button explorarseccionesnoregistrado) {
		this.explorarseccionesnoregistrado = explorarseccionesnoregistrado;
	}

	public Element getOpcionescuentanoregistrado() {
		return opcionescuentanoregistrado;
	}

	public void setOpcionescuentanoregistrado(Element opcionescuentanoregistrado) {
		this.opcionescuentanoregistrado = opcionescuentanoregistrado;
	}

	public Button getIniciarsesion() {
		return iniciarsesion;
	}

	public void setIniciarsesion(Button iniciarsesion) {
		this.iniciarsesion = iniciarsesion;
	}

	public Element getAnuncioizquierda() {
		return anuncioizquierda;
	}

	public void setAnuncioizquierda(Element anuncioizquierda) {
		this.anuncioizquierda = anuncioizquierda;
	}

	public Element getNoticiasportadanoregistrado() {
		return noticiasportadanoregistrado;
	}

	public void setNoticiasportadanoregistrado(Element noticiasportadanoregistrado) {
		this.noticiasportadanoregistrado = noticiasportadanoregistrado;
	}

	public Element getAnuncioderecha() {
		return anuncioderecha;
	}

	public void setAnuncioderecha(Element anuncioderecha) {
		this.anuncioderecha = anuncioderecha;
	}

	@Id("Layoutlogonoregistrado")
	private Element layoutlogonoregistrado;
	@Id("Logonoregistrado")
	private Button logonoregistrado;
	@Id("Barrabusquedanoregistrado")
	private HorizontalLayout barrabusquedanoregistrado;
	@Id("Opcionesnoregistrado")
	private HorizontalLayout opcionesnoregistrado;
	@Id("Explorarseccionesnoregistrado")
	private Button explorarseccionesnoregistrado;
	@Id("Opcionescuentanoregistrado")
	private Element opcionescuentanoregistrado;
	@Id("Iniciarsesion")
	private Button iniciarsesion;
	@Id("Anuncioizquierda")
	private Element anuncioizquierda;
	@Id("Noticiasportadanoregistrado")
	private Element noticiasportadanoregistrado;
	@Id("Anuncioderecha")
	private Element anuncioderecha;

	public VistaUsuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}