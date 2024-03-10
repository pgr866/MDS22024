package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-identificado")
@JsModule("./src/vista-identificado.ts")
public class VistaIdentificado extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("Layoutlogoidentificado")
	private Element layoutlogoidentificado;
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getLayoutlogoidentificado() {
		return layoutlogoidentificado;
	}

	public void setLayoutlogoidentificado(Element layoutlogoidentificado) {
		this.layoutlogoidentificado = layoutlogoidentificado;
	}

	public Button getLogoidentificado() {
		return logoidentificado;
	}

	public void setLogoidentificado(Button logoidentificado) {
		this.logoidentificado = logoidentificado;
	}

	public HorizontalLayout getBarrabusquedaidentificado() {
		return barrabusquedaidentificado;
	}

	public void setBarrabusquedaidentificado(HorizontalLayout barrabusquedaidentificado) {
		this.barrabusquedaidentificado = barrabusquedaidentificado;
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

	public Element getLayoutvermisnoticias() {
		return layoutvermisnoticias;
	}

	public void setLayoutvermisnoticias(Element layoutvermisnoticias) {
		this.layoutvermisnoticias = layoutvermisnoticias;
	}

	public Element getLayoutcrearnuevanoticia() {
		return layoutcrearnuevanoticia;
	}

	public void setLayoutcrearnuevanoticia(Element layoutcrearnuevanoticia) {
		this.layoutcrearnuevanoticia = layoutcrearnuevanoticia;
	}

	public Button getCrearnuevanoticia() {
		return crearnuevanoticia;
	}

	public void setCrearnuevanoticia(Button crearnuevanoticia) {
		this.crearnuevanoticia = crearnuevanoticia;
	}

	public Element getLayoutrevisarnoticia() {
		return layoutrevisarnoticia;
	}

	public void setLayoutrevisarnoticia(Element layoutrevisarnoticia) {
		this.layoutrevisarnoticia = layoutrevisarnoticia;
	}

	public Element getLayoutdaraltabajaperiodista() {
		return layoutdaraltabajaperiodista;
	}

	public void setLayoutdaraltabajaperiodista(Element layoutdaraltabajaperiodista) {
		this.layoutdaraltabajaperiodista = layoutdaraltabajaperiodista;
	}

	public Button getDaraltabajaperiodista() {
		return daraltabajaperiodista;
	}

	public void setDaraltabajaperiodista(Button daraltabajaperiodista) {
		this.daraltabajaperiodista = daraltabajaperiodista;
	}

	public Element getOpcionescuentaidentificado() {
		return opcionescuentaidentificado;
	}

	public void setOpcionescuentaidentificado(Element opcionescuentaidentificado) {
		this.opcionescuentaidentificado = opcionescuentaidentificado;
	}

	public Button getConfigurarperfil() {
		return configurarperfil;
	}

	public void setConfigurarperfil(Button configurarperfil) {
		this.configurarperfil = configurarperfil;
	}

	public Button getCerrarsesion() {
		return cerrarsesion;
	}

	public void setCerrarsesion(Button cerrarsesion) {
		this.cerrarsesion = cerrarsesion;
	}

	public Element getNoticiasportadaidentificado() {
		return noticiasportadaidentificado;
	}

	public void setNoticiasportadaidentificado(Element noticiasportadaidentificado) {
		this.noticiasportadaidentificado = noticiasportadaidentificado;
	}

	@Id("Logoidentificado")
	private Button logoidentificado;
	@Id("Barrabusquedaidentificado")
	private HorizontalLayout barrabusquedaidentificado;
	@Id("Layoutexplorarseccionesidentificado")
	private Element layoutexplorarseccionesidentificado;
	@Id("Explorarseccionesidentificado")
	private Button explorarseccionesidentificado;
	@Id("Layoutvermisnoticias")
	private Element layoutvermisnoticias;
	@Id("Layoutcrearnuevanoticia")
	private Element layoutcrearnuevanoticia;
	@Id("Crearnuevanoticia")
	private Button crearnuevanoticia;
	@Id("Layoutrevisarnoticia")
	private Element layoutrevisarnoticia;
	@Id("Layoutdaraltabajaperiodista")
	private Element layoutdaraltabajaperiodista;
	@Id("Daraltabajaperiodista")
	private Button daraltabajaperiodista;
	@Id("Opcionescuentaidentificado")
	private Element opcionescuentaidentificado;
	@Id("Configurarperfil")
	private Button configurarperfil;
	@Id("Cerrarsesion")
	private Button cerrarsesion;
	@Id("Noticiasportadaidentificado")
	private Element noticiasportadaidentificado;

	public VistaIdentificado() {
        // You can initialise any data required for the connected UI components here.
    }

}