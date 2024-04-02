package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

@Tag("vista-revisarnoticias")
@JsModule("./src/vista-revisarnoticias.ts")
public class VistaRevisarnoticias extends LitTemplate {

    @Id("Layouttitulonoticiarevisarnoticias")
	private HorizontalLayout layouttitulonoticiarevisarnoticias;
	@Id("Labeltitulonoticiarevisarnoticias")
	private Label labeltitulonoticiarevisarnoticias;
	@Id("Textfieldtitulonoticiarevisarnoticias")
	private TextField textfieldtitulonoticiarevisarnoticias;
	@Id("Layouturlimagenesrevisarnoticias")
	private HorizontalLayout layouturlimagenesrevisarnoticias;
	@Id("Labelurlimagenesrevisarnoticias")
	private Label labelurlimagenesrevisarnoticias;
	@Id("Textfieldurlimagenesrevisarnoticias")
	private TextField textfieldurlimagenesrevisarnoticias;
	@Id("Layoutcontenidonoticiarevisarnoticias")
	private HorizontalLayout layoutcontenidonoticiarevisarnoticias;
	@Id("Textareacontenidonoticiarevisarnoticias")
	private TextArea textareacontenidonoticiarevisarnoticias;
	@Id("Layoutfechaylugarrevisarnoticias")
	private HorizontalLayout layoutfechaylugarrevisarnoticias;
	@Id("Labelfechaylugarrevisarnoticias")
	private Label labelfechaylugarrevisarnoticias;
	@Id("Layouttextfieldsfechaylugarrevisarnoticias")
	private HorizontalLayout layouttextfieldsfechaylugarrevisarnoticias;
	@Id("Textfieldfecharevisarnoticias")
	private TextField textfieldfecharevisarnoticias;
	@Id("Textfieldlugarrevisarnoticias")
	private TextField textfieldlugarrevisarnoticias;
	@Id("Layoutresumenrevisarnoticias")
	private HorizontalLayout layoutresumenrevisarnoticias;
	@Id("Labelresumenrevisarnoticias")
	private Label labelresumenrevisarnoticias;
	@Id("Textfieldresumenrevisarnoticias")
	private TextField textfieldresumenrevisarnoticias;
	@Id("Layoutvistaseccionessrevisarnoticias")
	private HorizontalLayout layoutvistaseccionessrevisarnoticias;
	@Id("vistaseccionesrevisarnoticia")
	private Element vistaseccionesrevisarnoticia;
	@Id("Layoutopcionesrevisarnoticia")
	private HorizontalLayout layoutopcionesrevisarnoticia;
	@Id("publicarrevisarnoticia")
	private Button publicarrevisarnoticia;
	@Id("eliminarrevisarnoticia")
	private Button eliminarrevisarnoticia;

	public VistaRevisarnoticias() {
        // You can initialise any data required for the connected UI components here.
    }

}