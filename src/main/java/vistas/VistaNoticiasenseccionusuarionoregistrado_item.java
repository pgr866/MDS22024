package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.html.Label;

@Tag("vista-noticiasenseccionusuarionoregistrado_item")
@JsModule("./src/vista-noticiasenseccionusuarionoregistrado_item.ts")
public class VistaNoticiasenseccionusuarionoregistrado_item extends LitTemplate {

	@Id("Layouttitulonoticiasenseccionusuarionoregistrado")
	private Element layouttitulonoticiasenseccionusuarionoregistrado;
	@Id("Titulonoticiasenseccionusuarionoregistrado")
	private Button titulonoticiasenseccionusuarionoregistrado;
	@Id("Layoutimagennoticiasenseccionusuarionoregistrado")
	private HorizontalLayout layoutimagennoticiasenseccionusuarionoregistrado;
	@Id("Imagennoticiasenseccionusuarionoregistrado")
	private Image imagennoticiasenseccionusuarionoregistrado;
	@Id("Layoutautorlugarfechanoticiasenseccionusuarionoregistrado")
	private HorizontalLayout layoutautorlugarfechanoticiasenseccionusuarionoregistrado;
	@Id("Fechanoticiasenseccionusuarionoregistrado")
	private Label fechanoticiasenseccionusuarionoregistrado;
	@Id("Autornoticiasenseccionusuarionoregistrado")
	private Label autornoticiasenseccionusuarionoregistrado;
	@Id("Lugarnoticiasenseccionusuarionoregistrado")
	private Label lugarnoticiasenseccionusuarionoregistrado;
	@Id("Layoutcontenidonoticiasenseccionusuarionoregistrado")
	private HorizontalLayout layoutcontenidonoticiasenseccionusuarionoregistrado;
	@Id("Contenidonoticiasenseccionusuarionoregistrado")
	private TextArea contenidonoticiasenseccionusuarionoregistrado;

	public VistaNoticiasenseccionusuarionoregistrado_item() {
        // You can initialise any data required for the connected UI components here.
    }

}