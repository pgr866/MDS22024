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

	public Element getLayoutligonoregistrado() {
		return layoutligonoregistrado;
	}

	public void setLayoutligonoregistrado(Element layoutligonoregistrado) {
		this.layoutligonoregistrado = layoutligonoregistrado;
	}

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

	public VistaBuscar getVistabuscarnoregistrado() {
		return vistabuscarnoregistrado;
	}

	public void setVistabuscarnoregistrado(VistaBuscar vistabuscarnoregistrado) {
		this.vistabuscarnoregistrado = vistabuscarnoregistrado;
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

	public Element getLayoutnoticiasportadanoregistrado() {
		return layoutnoticiasportadanoregistrado;
	}

	public void setLayoutnoticiasportadanoregistrado(Element layoutnoticiasportadanoregistrado) {
		this.layoutnoticiasportadanoregistrado = layoutnoticiasportadanoregistrado;
	}

	public Element getLayoutanuncioderecha() {
		return layoutanuncioderecha;
	}

	public void setLayoutanuncioderecha(Element layoutanuncioderecha) {
		this.layoutanuncioderecha = layoutanuncioderecha;
	}

	@Id("Layoutligonoregistrado")
	private Element layoutligonoregistrado;
	@Id("Logonoregistrado")
	private Button logonoregistrado;
	@Id("Fotologonoregistrado")
	private Image fotologonoregistrado;
	@Id("Barrabusquedanoregistrado")
	private HorizontalLayout barrabusquedanoregistrado;
	@Id("Vistabuscarnoregistrado")
	private VistaBuscar vistabuscarnoregistrado;
	@Id("Layoutexplorarseccionesnoregistrado")
	private HorizontalLayout layoutexplorarseccionesnoregistrado;
	@Id("Explorarseccionesnoregistrado")
	private Button explorarseccionesnoregistrado;
	@Id("Layoutiniciarsesion")
	private Element layoutiniciarsesion;
	@Id("Iniciarsesion")
	private Button iniciarsesion;
	@Id("Layoutnoticiasportadanoregistrado")
	private Element layoutnoticiasportadanoregistrado;
	@Id("Layoutanuncioderecha")
	private Element layoutanuncioderecha;
	@Id("Layoutanuncioderechausuarionoregistrado")
	private Element layoutanuncioderechausuarionoregistrado;
	@Id("Layoutnoticiasportadausuarionoregistrado")
	private Element layoutnoticiasportadausuarionoregistrado;
	@Id("Layoutanuncioizquierdausuarionoregistrado")
	private Element layoutanuncioizquierdausuarionoregistrado;
	public VistaUsuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}