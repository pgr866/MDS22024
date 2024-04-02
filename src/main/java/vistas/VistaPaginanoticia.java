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
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vistaSeccioncomentarios")
	private Element vistaSeccioncomentarios;

	public VistaPaginanoticia() {
        // You can initialise any data required for the connected UI components here.
    }

}