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
	@Id("Layoutanuncioizquierda")
	private Element layoutanuncioizquierda;
	@Id("Anuncioizquierda")
	private VistaMostrarpublicidad anuncioizquierda;
	@Id("Layoutnoticiasportadanoregistrado")
	private Element layoutnoticiasportadanoregistrado;
	@Id("Noticiasportadanoregistrado")
	private Element noticiasportadanoregistrado;
	@Id("Layoutanuncioderecha")
	private Element layoutanuncioderecha;
	@Id("Anuncioderecha")
	private VistaMostrarpublicidad anuncioderecha;

	public VistaUsuarionoregistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}