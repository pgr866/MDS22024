package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import vistas.VistaBuscar;
import vistas.VistaMostrarpublicidad;

@Tag("vista-usuarionoregistrado")
@JsModule("./src/vista-usuarionoregistrado.ts")
public class VistaUsuarionoregistrado extends LitTemplate {

	public Button getLogonoregistrado() {
		return logonoregistrado;
	}
	public void setLogonoregistrado(Button logonoregistrado) {
		this.logonoregistrado = logonoregistrado;
	}
	public Image getFotologonoregistrado() {
		return fotologonoregistrado;
	}
	public void setFotologonoregistrado(Image fotologonoregistrado) {
		this.fotologonoregistrado = fotologonoregistrado;
	}
	public HorizontalLayout getBarrabusquedanoregistrado() {
		return barrabusquedanoregistrado;
	}
	public void setBarrabusquedanoregistrado(HorizontalLayout barrabusquedanoregistrado) {
		this.barrabusquedanoregistrado = barrabusquedanoregistrado;
	}
	public HorizontalLayout getLayoutexplorarseccionesnoregistrado() {
		return layoutexplorarseccionesnoregistrado;
	}
	public void setLayoutexplorarseccionesnoregistrado(HorizontalLayout layoutexplorarseccionesnoregistrado) {
		this.layoutexplorarseccionesnoregistrado = layoutexplorarseccionesnoregistrado;
	}
	public Button getExplorarseccionesnoregistrado() {
		return explorarseccionesnoregistrado;
	}
	public void setExplorarseccionesnoregistrado(Button explorarseccionesnoregistrado) {
		this.explorarseccionesnoregistrado = explorarseccionesnoregistrado;
	}
	public Element getLayoutiniciarsesion() {
		return layoutiniciarsesion;
	}
	public void setLayoutiniciarsesion(Element layoutiniciarsesion) {
		this.layoutiniciarsesion = layoutiniciarsesion;
	}
	public Button getIniciarsesion() {
		return iniciarsesion;
	}
	public void setIniciarsesion(Button iniciarsesion) {
		this.iniciarsesion = iniciarsesion;
	}
	public Element getLayoutanuncioderechausuarionoregistrado() {
		return layoutanuncioderechausuarionoregistrado;
	}
	public void setLayoutanuncioderechausuarionoregistrado(Element layoutanuncioderechausuarionoregistrado) {
		this.layoutanuncioderechausuarionoregistrado = layoutanuncioderechausuarionoregistrado;
	}
	public Element getLayoutanuncioizquierdausuarionoregistrado() {
		return layoutanuncioizquierdausuarionoregistrado;
	}
	public void setLayoutanuncioizquierdausuarionoregistrado(Element layoutanuncioizquierdausuarionoregistrado) {
		this.layoutanuncioizquierdausuarionoregistrado = layoutanuncioizquierdausuarionoregistrado;
	}
	public Element getLayoutnoticiasportadausuarionoregistrado() {
		return layoutnoticiasportadausuarionoregistrado;
	}
	public void setLayoutnoticiasportadausuarionoregistrado(Element layoutnoticiasportadausuarionoregistrado) {
		this.layoutnoticiasportadausuarionoregistrado = layoutnoticiasportadausuarionoregistrado;
	}
	public Element getLayoutlogonoregistrado() {
		return layoutlogonoregistrado;
	}
	public void setLayoutlogonoregistrado(Element layoutlogonoregistrado) {
		this.layoutlogonoregistrado = layoutlogonoregistrado;
	}
	@Id("Logonoregistrado")
	private Button logonoregistrado;
	@Id("Fotologonoregistrado")
	private Image fotologonoregistrado;
	@Id("Barrabusquedanoregistrado")
	private HorizontalLayout barrabusquedanoregistrado;
	@Id("Layoutexplorarseccionesnoregistrado")
	private HorizontalLayout layoutexplorarseccionesnoregistrado;
	@Id("Explorarseccionesnoregistrado")
	private Button explorarseccionesnoregistrado;
	@Id("Layoutiniciarsesion")
	private Element layoutiniciarsesion;
	@Id("Iniciarsesion")
	private Button iniciarsesion;
	@Id("Layoutanuncioderechausuarionoregistrado")
	private Element layoutanuncioderechausuarionoregistrado;
	@Id("Layoutanuncioizquierdausuarionoregistrado")
	private Element layoutanuncioizquierdausuarionoregistrado;
	@Id("Layoutnoticiasportadausuarionoregistrado")
	private Element layoutnoticiasportadausuarionoregistrado;
	@Id("Layoutlogonoregistrado")
	private Element layoutlogonoregistrado;
	public VistaUsuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}