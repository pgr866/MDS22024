package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.html.Label;

@Tag("vista-noticiasenseccionidentificado_item")
@JsModule("./src/vista-noticiasenseccionidentificado_item.ts")
public class VistaNoticiasenseccionidentificado_item extends LitTemplate {

	@Id("Layouttitulonoticiasenseccionidentificado")
	private Element layouttitulonoticiasenseccionidentificado;
	@Id("Titulonoticiasenseccionidentificado")
	private Button titulonoticiasenseccionidentificado;
	@Id("Layoutimagennoticiasenseccionidentificado")
	private HorizontalLayout layoutimagennoticiasenseccionidentificado;
	@Id("Imagennoticiasenseccionidentificado")
	private Image imagennoticiasenseccionidentificado;
	@Id("Layoutautorlugarfechanoticiasenseccionidentificado")
	private HorizontalLayout layoutautorlugarfechanoticiasenseccionidentificado;
	@Id("Fechanoticiasenseccionidentificado")
	private Label fechanoticiasenseccionidentificado;
	@Id("Autornoticiasenseccionidentificado")
	private Label autornoticiasenseccionidentificado;
	@Id("Lugarnoticiasenseccionidentificado")
	private Label lugarnoticiasenseccionidentificado;
	@Id("Layoutcontenidonoticiasenseccionidentificado")
	private HorizontalLayout layoutcontenidonoticiasenseccionidentificado;
	@Id("Contenidonoticiasenseccionidentificado")
	private TextArea contenidonoticiasenseccionidentificado;

	public VistaNoticiasenseccionidentificado_item() {
        // You can initialise any data required for the connected UI components here.
    }

}