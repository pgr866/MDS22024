package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import vistas.VistaMostrarvaloracionnoticia;
import vistas.VistaMostrarnoticiaresumida;
import vistas.VistaMostrarnoticiaextendida;

@Tag("vista-paginanoticia")
@JsModule("./src/vista-paginanoticia.ts")
public class VistaPaginanoticia extends LitTemplate {

    public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Label getLabel1() {
		return label1;
	}

	public void setLabel1(Label label1) {
		this.label1 = label1;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Label getLabel2() {
		return label2;
	}

	public void setLabel2(Label label2) {
		this.label2 = label2;
	}

	public Label getLabel3() {
		return label3;
	}

	public void setLabel3(Label label3) {
		this.label3 = label3;
	}

	public Label getLabel4() {
		return label4;
	}

	public void setLabel4(Label label4) {
		this.label4 = label4;
	}

	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}

	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}

	public VistaMostrarvaloracionnoticia getVistaMostrarvaloracionnoticia() {
		return vistaMostrarvaloracionnoticia;
	}

	public void setVistaMostrarvaloracionnoticia(VistaMostrarvaloracionnoticia vistaMostrarvaloracionnoticia) {
		this.vistaMostrarvaloracionnoticia = vistaMostrarvaloracionnoticia;
	}

	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}

	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}

	public VistaMostrarnoticiaresumida getVistaMostrarnoticiaresumida() {
		return vistaMostrarnoticiaresumida;
	}

	public void setVistaMostrarnoticiaresumida(VistaMostrarnoticiaresumida vistaMostrarnoticiaresumida) {
		this.vistaMostrarnoticiaresumida = vistaMostrarnoticiaresumida;
	}

	public VistaMostrarnoticiaextendida getVistaMostrarnoticiaextendida() {
		return vistaMostrarnoticiaextendida;
	}

	public void setVistaMostrarnoticiaextendida(VistaMostrarnoticiaextendida vistaMostrarnoticiaextendida) {
		this.vistaMostrarnoticiaextendida = vistaMostrarnoticiaextendida;
	}

	public Element getVistaSeccioncomentarios() {
		return vistaSeccioncomentarios;
	}

	public void setVistaSeccioncomentarios(Element vistaSeccioncomentarios) {
		this.vistaSeccioncomentarios = vistaSeccioncomentarios;
	}

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("label")
	private Label label;
	@Id("label1")
	private Label label1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("img")
	private Image img;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("label2")
	private Label label2;
	@Id("label3")
	private Label label3;
	@Id("label4")
	private Label label4;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vistaMostrarvaloracionnoticia")
	private VistaMostrarvaloracionnoticia vistaMostrarvaloracionnoticia;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vistaMostrarnoticiaresumida")
	private VistaMostrarnoticiaresumida vistaMostrarnoticiaresumida;
	@Id("vistaMostrarnoticiaextendida")
	private VistaMostrarnoticiaextendida vistaMostrarnoticiaextendida;
	@Id("vistaSeccioncomentarios")//Creo que cuelga
	private Element vistaSeccioncomentarios;
	@Id("Layoutseccioncomentariospaginanoticia")
	private Element layoutseccioncomentariospaginanoticia;
	public VistaPaginanoticia() {
        // You can initialise any data required for the connected UI components here.
    }

}