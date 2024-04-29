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

	public Button getButtonimagenlistadonoticiasportada() {
		return buttonimagenlistadonoticiasportada;
	}

	public void setButtonimagenlistadonoticiasportada(Button buttonimagenlistadonoticiasportada) {
		this.buttonimagenlistadonoticiasportada = buttonimagenlistadonoticiasportada;
	}

	public Element getLayouttitulolistadonoticiasportada() {
		return layouttitulolistadonoticiasportada;
	}

	public void setLayouttitulolistadonoticiasportada(Element layouttitulolistadonoticiasportada) {
		this.layouttitulolistadonoticiasportada = layouttitulolistadonoticiasportada;
	}

	public Button getTitulolistadonoticiasportada() {
		return titulolistadonoticiasportada;
	}

	public void setTitulolistadonoticiasportada(Button titulolistadonoticiasportada) {
		this.titulolistadonoticiasportada = titulolistadonoticiasportada;
	}

	public ComboBox<String> getComboboxtitulolistadonoticiasportada() {
		return comboboxtitulolistadonoticiasportada;
	}

	public void setComboboxtitulolistadonoticiasportada(ComboBox<String> comboboxtitulolistadonoticiasportada) {
		this.comboboxtitulolistadonoticiasportada = comboboxtitulolistadonoticiasportada;
	}

	public HorizontalLayout getLayoutimagenlistadonoticiasportada() {
		return layoutimagenlistadonoticiasportada;
	}

	public void setLayoutimagenlistadonoticiasportada(HorizontalLayout layoutimagenlistadonoticiasportada) {
		this.layoutimagenlistadonoticiasportada = layoutimagenlistadonoticiasportada;
	}

	public Image getImagenlistadonoticiasportada() {
		return imagenlistadonoticiasportada;
	}

	public void setImagenlistadonoticiasportada(Image imagenlistadonoticiasportada) {
		this.imagenlistadonoticiasportada = imagenlistadonoticiasportada;
	}

	public HorizontalLayout getLayoutautorlugarfechalistadonoticiasportada() {
		return layoutautorlugarfechalistadonoticiasportada;
	}

	public void setLayoutautorlugarfechalistadonoticiasportada(
			HorizontalLayout layoutautorlugarfechalistadonoticiasportada) {
		this.layoutautorlugarfechalistadonoticiasportada = layoutautorlugarfechalistadonoticiasportada;
	}

	public Label getLabelfechalistadonoticiasportada() {
		return labelfechalistadonoticiasportada;
	}

	public void setLabelfechalistadonoticiasportada(Label labelfechalistadonoticiasportada) {
		this.labelfechalistadonoticiasportada = labelfechalistadonoticiasportada;
	}

	public Label getLabelautorlistadonoticiasportada() {
		return labelautorlistadonoticiasportada;
	}

	public void setLabelautorlistadonoticiasportada(Label labelautorlistadonoticiasportada) {
		this.labelautorlistadonoticiasportada = labelautorlistadonoticiasportada;
	}

	public Label getLabellugarlistadonoticiasportada() {
		return labellugarlistadonoticiasportada;
	}

	public void setLabellugarlistadonoticiasportada(Label labellugarlistadonoticiasportada) {
		this.labellugarlistadonoticiasportada = labellugarlistadonoticiasportada;
	}

	public HorizontalLayout getLayouresumenlistadonoticiasportada() {
		return layouresumenlistadonoticiasportada;
	}

	public void setLayouresumenlistadonoticiasportada(HorizontalLayout layouresumenlistadonoticiasportada) {
		this.layouresumenlistadonoticiasportada = layouresumenlistadonoticiasportada;
	}

	public TextArea getTextarearesumenlistadonoticiasportada() {
		return textarearesumenlistadonoticiasportada;
	}

	public void setTextarearesumenlistadonoticiasportada(TextArea textarearesumenlistadonoticiasportada) {
		this.textarearesumenlistadonoticiasportada = textarearesumenlistadonoticiasportada;
	}

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
	@Id("Buttonimagenlistadonoticiasportada")
	private Button buttonimagenlistadonoticiasportada;

	public VistaListadonoticiasportada_item() {
        // You can initialise any data required for the connected UI components here.
    }

}