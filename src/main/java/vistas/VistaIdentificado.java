package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;

@Tag("vista-identificado")
@JsModule("./src/vista-identificado.ts")
public class VistaIdentificado extends LitTemplate {

	public Element getLayoutbuscareditor() {
		return layoutbuscareditor;
	}

	public void setLayoutbuscareditor(Element layoutbuscareditor) {
		this.layoutbuscareditor = layoutbuscareditor;
	}

	public Element getLayoutbuscaridentificado() {
		return layoutbuscaridentificado;
	}

	public void setLayoutbuscaridentificado(Element layoutbuscaridentificado) {
		this.layoutbuscaridentificado = layoutbuscaridentificado;
	}

	public Element getLayoutnoticiasarevisaridentificado() {
		return layoutnoticiasarevisaridentificado;
	}

	public void setLayoutnoticiasarevisaridentificado(Element layoutnoticiasarevisaridentificado) {
		this.layoutnoticiasarevisaridentificado = layoutnoticiasarevisaridentificado;
	}

	public Element getLayoutvistavermisnoticiasidentificado() {
		return layoutvistavermisnoticiasidentificado;
	}

	public void setLayoutvistavermisnoticiasidentificado(Element layoutvistavermisnoticiasidentificado) {
		this.layoutvistavermisnoticiasidentificado = layoutvistavermisnoticiasidentificado;
	}

	public Element getLogoutopcionescuentaidentificado() {
		return logoutopcionescuentaidentificado;
	}

	public void setLogoutopcionescuentaidentificado(Element logoutopcionescuentaidentificado) {
		this.logoutopcionescuentaidentificado = logoutopcionescuentaidentificado;
	}

	public HorizontalLayout getLayoutvistabuscareditor() {
		return layoutvistabuscareditor;
	}

	public void setLayoutvistabuscareditor(HorizontalLayout layoutvistabuscareditor) {
		this.layoutvistabuscareditor = layoutvistabuscareditor;
	}

	public Element getLayoutlogoidentificado() {
		return layoutlogoidentificado;
	}

	public void setLayoutlogoidentificado(Element layoutlogoidentificado) {
		this.layoutlogoidentificado = layoutlogoidentificado;
	}

	public Button getButtonlogoidentificado() {
		return buttonlogoidentificado;
	}

	public void setButtonlogoidentificado(Button buttonlogoidentificado) {
		this.buttonlogoidentificado = buttonlogoidentificado;
	}

	public Image getImagenlogoidentificado() {
		return imagenlogoidentificado;
	}

	public void setImagenlogoidentificado(Image imagenlogoidentificado) {
		this.imagenlogoidentificado = imagenlogoidentificado;
	}

	public HorizontalLayout getLayoutvistabuscaridentificado() {
		return layoutvistabuscaridentificado;
	}

	public void setLayoutvistabuscaridentificado(HorizontalLayout layoutvistabuscaridentificado) {
		this.layoutvistabuscaridentificado = layoutvistabuscaridentificado;
	}

	public Element getLayoutexplorarseccionesidentificado() {
		return layoutexplorarseccionesidentificado;
	}

	public void setLayoutexplorarseccionesidentificado(Element layoutexplorarseccionesidentificado) {
		this.layoutexplorarseccionesidentificado = layoutexplorarseccionesidentificado;
	}

	public Button getExplorarseccionesidentificado() {
		return explorarseccionesidentificado;
	}

	public void setExplorarseccionesidentificado(Button explorarseccionesidentificado) {
		this.explorarseccionesidentificado = explorarseccionesidentificado;
	}

	public Element getLayoutvermisnoticiasidentificado() {
		return layoutvermisnoticiasidentificado;
	}

	public void setLayoutvermisnoticiasidentificado(Element layoutvermisnoticiasidentificado) {
		this.layoutvermisnoticiasidentificado = layoutvermisnoticiasidentificado;
	}

	public Element getLayoutcrearnuevanoticiaidentificado() {
		return layoutcrearnuevanoticiaidentificado;
	}

	public void setLayoutcrearnuevanoticiaidentificado(Element layoutcrearnuevanoticiaidentificado) {
		this.layoutcrearnuevanoticiaidentificado = layoutcrearnuevanoticiaidentificado;
	}

	public Button getButtoncrearnuevanoticiaidentificado() {
		return buttoncrearnuevanoticiaidentificado;
	}

	public void setButtoncrearnuevanoticiaidentificado(Button buttoncrearnuevanoticiaidentificado) {
		this.buttoncrearnuevanoticiaidentificado = buttoncrearnuevanoticiaidentificado;
	}

	public Element getLayoutvistanoticiasarevisaridentificado() {
		return layoutvistanoticiasarevisaridentificado;
	}

	public void setLayoutvistanoticiasarevisaridentificado(Element layoutvistanoticiasarevisaridentificado) {
		this.layoutvistanoticiasarevisaridentificado = layoutvistanoticiasarevisaridentificado;
	}

	public Element getLayoutdaraltabajaperiodistaidentificado() {
		return layoutdaraltabajaperiodistaidentificado;
	}

	public void setLayoutdaraltabajaperiodistaidentificado(Element layoutdaraltabajaperiodistaidentificado) {
		this.layoutdaraltabajaperiodistaidentificado = layoutdaraltabajaperiodistaidentificado;
	}

	public Button getButtondaraltabajaperiodistaidentificado() {
		return buttondaraltabajaperiodistaidentificado;
	}

	public void setButtondaraltabajaperiodistaidentificado(Button buttondaraltabajaperiodistaidentificado) {
		this.buttondaraltabajaperiodistaidentificado = buttondaraltabajaperiodistaidentificado;
	}

	public Button getConfigurarperfilidentificado() {
		return configurarperfilidentificado;
	}

	public void setConfigurarperfilidentificado(Button configurarperfilidentificado) {
		this.configurarperfilidentificado = configurarperfilidentificado;
	}

	public Element getLayoutnoticiasportadaidentificado() {
		return layoutnoticiasportadaidentificado;
	}

	public void setLayoutnoticiasportadaidentificado(Element layoutnoticiasportadaidentificado) {
		this.layoutnoticiasportadaidentificado = layoutnoticiasportadaidentificado;
	}

	@Id("Layoutlogoidentificado")
	private Element layoutlogoidentificado;
	@Id("Buttonlogoidentificado")
	private Button buttonlogoidentificado;
	@Id("Layoutvistabuscaridentificado")
	private HorizontalLayout layoutvistabuscaridentificado;
	@Id("Layoutexplorarseccionesidentificado")
	private Element layoutexplorarseccionesidentificado;
	@Id("Explorarseccionesidentificado")
	private Button explorarseccionesidentificado;
	@Id("Layoutcrearnuevanoticiaidentificado")
	private Element layoutcrearnuevanoticiaidentificado;
	@Id("Buttoncrearnuevanoticiaidentificado")
	private Button buttoncrearnuevanoticiaidentificado;
	@Id("Layoutvistanoticiasarevisaridentificado")
	private Element layoutvistanoticiasarevisaridentificado;
	@Id("Layoutdaraltabajaperiodistaidentificado")
	private Element layoutdaraltabajaperiodistaidentificado;
	@Id("Buttondaraltabajaperiodistaidentificado")
	private Button buttondaraltabajaperiodistaidentificado;
	@Id("Layoutnoticiasportadaidentificado")
	private Element layoutnoticiasportadaidentificado;
	@Id("Layoutvistabuscareditor")
	private HorizontalLayout layoutvistabuscareditor;
	@Id("Logoutopcionescuentaidentificado")
	private Element logoutopcionescuentaidentificado;
	@Id("Layoutvermisnoticiasidentificado")
	private Element layoutvermisnoticiasidentificado;
	@Id("Layoutnoticiasarevisaridentificado")
	private Element layoutnoticiasarevisaridentificado;
	@Id("Layoutvistavermisnoticiasidentificado")
	private Element layoutvistavermisnoticiasidentificado;
	@Id("Layoutbuscareditor")
	private Element layoutbuscareditor;
	@Id("Layoutbuscaridentificado")
	private Element layoutbuscaridentificado;
	@Id("imagenlogoidentificado")
	private Image imagenlogoidentificado;
	@Id("Configurarperfilidentificado")
	private Button configurarperfilidentificado;
	public VistaIdentificado() {
        // You can initialise any data required for the connected UI components here.
    }

}