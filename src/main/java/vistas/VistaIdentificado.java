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
import vistas.VistaMostrarmisnoticias;
import vistas.VistaLogout;

@Tag("vista-identificado")
@JsModule("./src/vista-identificado.ts")
public class VistaIdentificado extends LitTemplate {

	@Id("Layoutlogoidentificado")
	private Element layoutlogoidentificado;
	@Id("Buttonlogoidentificado")
	private Button buttonlogoidentificado;
	@Id("imagenlogoidentificado")
	private Image imagenlogoidentificado;
	@Id("Layoutvistabuscaridentificado")
	private HorizontalLayout layoutvistabuscaridentificado;
	@Id("vistabuscaridentificado")
	private VistaBuscar vistabuscaridentificado;
	@Id("Layoutexplorarseccionesidentificado")
	private Element layoutexplorarseccionesidentificado;
	@Id("Explorarseccionesidentificado")
	private Button explorarseccionesidentificado;
	@Id("Layoutvermisnoticiasidentificado")
	private Element layoutvermisnoticiasidentificado;
	@Id("Vistavermisnoticiasidentificado")
	private VistaMostrarmisnoticias vistavermisnoticiasidentificado;
	@Id("Layoutcrearnuevanoticiaidentificado")
	private Element layoutcrearnuevanoticiaidentificado;
	@Id("Buttoncrearnuevanoticiaidentificado")
	private Button buttoncrearnuevanoticiaidentificado;
	@Id("Layoutvistanoticiasarevisaridentificado")
	private Element layoutvistanoticiasarevisaridentificado;
	@Id("Vistanoticiasarevisaridentificado")
	private Element vistanoticiasarevisaridentificado;
	@Id("Layoutdaraltabajaperiodistaidentificado")
	private Element layoutdaraltabajaperiodistaidentificado;
	@Id("Buttondaraltabajaperiodistaidentificado")
	private Button buttondaraltabajaperiodistaidentificado;
	@Id("Opcionescuentaidentificado")
	private Element opcionescuentaidentificado;
	@Id("Configurarperfilidentificado")
	private Button configurarperfilidentificado;
	@Id("Imagenconfigurarperfilidentificado")
	private Image imagenconfigurarperfilidentificado;
	@Id("vistalogoutidentificado")
	private VistaLogout vistalogoutidentificado;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("Layoutnoticiasportadaidentificado")
	private Element layoutnoticiasportadaidentificado;
	@Id("vistanoticiasportadaidentificado")
	private Element vistanoticiasportadaidentificado;

	public VistaIdentificado() {
        // You can initialise any data required for the connected UI components here.
    }

}