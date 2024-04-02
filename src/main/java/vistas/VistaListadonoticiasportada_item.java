package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

@Tag("vista-listadonoticiasportada_item")
@JsModule("./src/vista-listadonoticiasportada_item.ts")
public class VistaListadonoticiasportada_item extends LitTemplate {

	@Id("Layouttitulolistadonoticiasportada")
	private Element layouttitulolistadonoticiasportada;
	@Id("Titulolistadonoticiasportada")
	private Button titulolistadonoticiasportada;
	@Id("Comboboxtitulolistadonoticiasportada")
	private ComboBox<String> comboboxtitulolistadonoticiasportada;
	@Id("Layoutimagenlistadonoticiasportada")
	private HorizontalLayout layoutimagenlistadonoticiasportada;
	@Id("Imagenlistadonoticiasportada")
	private Image imagenlistadonoticiasportada;
	@Id("Layoutautorlugarfechalistadonoticiasportada")
	private HorizontalLayout layoutautorlugarfechalistadonoticiasportada;
	@Id("Labelfechalistadonoticiasportada")
	private Label labelfechalistadonoticiasportada;
	@Id("Labelautorlistadonoticiasportada")
	private Label labelautorlistadonoticiasportada;
	@Id("Labellugarlistadonoticiasportada")
	private Label labellugarlistadonoticiasportada;
	@Id("Layouresumenlistadonoticiasportada")
	private HorizontalLayout layouresumenlistadonoticiasportada;
	@Id("Textarearesumenlistadonoticiasportada")
	private TextArea textarearesumenlistadonoticiasportada;

	public VistaListadonoticiasportada_item() {
        // You can initialise any data required for the connected UI components here.
    }

}