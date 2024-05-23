package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

@Tag("vista-listadonoticiasportadausuarionoregistrado_item")
@JsModule("./src/vista-listadonoticiasportadausuarionoregistrado_item.ts")
public class VistaListadonoticiasportadausuarionoregistrado_item extends LitTemplate {

	public Element getLayouttitulolistadonoticiasportadausuarionoregistrado() {
		return layouttitulolistadonoticiasportadausuarionoregistrado;
	}

	public void setLayouttitulolistadonoticiasportadausuarionoregistrado(
			Element layouttitulolistadonoticiasportadausuarionoregistrado) {
		this.layouttitulolistadonoticiasportadausuarionoregistrado = layouttitulolistadonoticiasportadausuarionoregistrado;
	}

	public Button getTitulolistadonoticiasportadausuarionoregistrado() {
		return titulolistadonoticiasportadausuarionoregistrado;
	}

	public void setTitulolistadonoticiasportadausuarionoregistrado(Button titulolistadonoticiasportadausuarionoregistrado) {
		this.titulolistadonoticiasportadausuarionoregistrado = titulolistadonoticiasportadausuarionoregistrado;
	}

	public Element getLayouttitulonoticiaordenarportadausuarionoregistrado() {
		return layouttitulonoticiaordenarportadausuarionoregistrado;
	}

	public void setLayouttitulonoticiaordenarportadausuarionoregistrado(
			Element layouttitulonoticiaordenarportadausuarionoregistrado) {
		this.layouttitulonoticiaordenarportadausuarionoregistrado = layouttitulonoticiaordenarportadausuarionoregistrado;
	}

	public HorizontalLayout getLayoutimagenlistadonoticiasportadausuarionoregistrado() {
		return layoutimagenlistadonoticiasportadausuarionoregistrado;
	}

	public void setLayoutimagenlistadonoticiasportadausuarionoregistrado(
			HorizontalLayout layoutimagenlistadonoticiasportadausuarionoregistrado) {
		this.layoutimagenlistadonoticiasportadausuarionoregistrado = layoutimagenlistadonoticiasportadausuarionoregistrado;
	}

	public Button getButtonimagenlistadonoticiasportadausuarionoregistrado() {
		return buttonimagenlistadonoticiasportadausuarionoregistrado;
	}

	public void setButtonimagenlistadonoticiasportadausuarionoregistrado(
			Button buttonimagenlistadonoticiasportadausuarionoregistrado) {
		this.buttonimagenlistadonoticiasportadausuarionoregistrado = buttonimagenlistadonoticiasportadausuarionoregistrado;
	}

	public Image getImagenlistadonoticiasportadausuarionoregistrado() {
		return imagenlistadonoticiasportadausuarionoregistrado;
	}

	public void setImagenlistadonoticiasportadausuarionoregistrado(Image imagenlistadonoticiasportadausuarionoregistrado) {
		this.imagenlistadonoticiasportadausuarionoregistrado = imagenlistadonoticiasportadausuarionoregistrado;
	}

	public HorizontalLayout getLayoutautorlugarfechalistadonoticiasportadausuarionoregistrado() {
		return layoutautorlugarfechalistadonoticiasportadausuarionoregistrado;
	}

	public void setLayoutautorlugarfechalistadonoticiasportadausuarionoregistrado(
			HorizontalLayout layoutautorlugarfechalistadonoticiasportadausuarionoregistrado) {
		this.layoutautorlugarfechalistadonoticiasportadausuarionoregistrado = layoutautorlugarfechalistadonoticiasportadausuarionoregistrado;
	}

	public Label getLabelfechalistadonoticiasportadausuarionoregistrado() {
		return labelfechalistadonoticiasportadausuarionoregistrado;
	}

	public void setLabelfechalistadonoticiasportadausuarionoregistrado(
			Label labelfechalistadonoticiasportadausuarionoregistrado) {
		this.labelfechalistadonoticiasportadausuarionoregistrado = labelfechalistadonoticiasportadausuarionoregistrado;
	}

	public Label getLabelautorlistadonoticiasportadausuarionoregistrado() {
		return labelautorlistadonoticiasportadausuarionoregistrado;
	}

	public void setLabelautorlistadonoticiasportadausuarionoregistrado(
			Label labelautorlistadonoticiasportadausuarionoregistrado) {
		this.labelautorlistadonoticiasportadausuarionoregistrado = labelautorlistadonoticiasportadausuarionoregistrado;
	}

	public Label getLabellugarlistadonoticiasportadausuarionoregistrado() {
		return labellugarlistadonoticiasportadausuarionoregistrado;
	}

	public void setLabellugarlistadonoticiasportadausuarionoregistrado(
			Label labellugarlistadonoticiasportadausuarionoregistrado) {
		this.labellugarlistadonoticiasportadausuarionoregistrado = labellugarlistadonoticiasportadausuarionoregistrado;
	}

	public HorizontalLayout getLayouresumenlistadonoticiasportadausuarionoregistrado() {
		return layouresumenlistadonoticiasportadausuarionoregistrado;
	}

	public void setLayouresumenlistadonoticiasportadausuarionoregistrado(
			HorizontalLayout layouresumenlistadonoticiasportadausuarionoregistrado) {
		this.layouresumenlistadonoticiasportadausuarionoregistrado = layouresumenlistadonoticiasportadausuarionoregistrado;
	}

	public TextArea getTextarearesumenlistadonoticiasportadausuarionoregistrado() {
		return textarearesumenlistadonoticiasportadausuarionoregistrado;
	}

	public void setTextarearesumenlistadonoticiasportadausuarionoregistrado(
			TextArea textarearesumenlistadonoticiasportadausuarionoregistrado) {
		this.textarearesumenlistadonoticiasportadausuarionoregistrado = textarearesumenlistadonoticiasportadausuarionoregistrado;
	}

	@Id("Layouttitulolistadonoticiasportadausuarionoregistrado")
	private Element layouttitulolistadonoticiasportadausuarionoregistrado;
	@Id("Titulolistadonoticiasportadausuarionoregistrado")
	private Button titulolistadonoticiasportadausuarionoregistrado;
	@Id("Layouttitulonoticiaordenarportadausuarionoregistrado")
	private Element layouttitulonoticiaordenarportadausuarionoregistrado;
	@Id("Layoutimagenlistadonoticiasportadausuarionoregistrado")
	private HorizontalLayout layoutimagenlistadonoticiasportadausuarionoregistrado;
	@Id("Buttonimagenlistadonoticiasportadausuarionoregistrado")
	private Button buttonimagenlistadonoticiasportadausuarionoregistrado;
	@Id("Imagenlistadonoticiasportadausuarionoregistrado")
	private Image imagenlistadonoticiasportadausuarionoregistrado;
	@Id("Layoutautorlugarfechalistadonoticiasportadausuarionoregistrado")
	private HorizontalLayout layoutautorlugarfechalistadonoticiasportadausuarionoregistrado;
	@Id("Labelfechalistadonoticiasportadausuarionoregistrado")
	private Label labelfechalistadonoticiasportadausuarionoregistrado;
	@Id("Labelautorlistadonoticiasportadausuarionoregistrado")
	private Label labelautorlistadonoticiasportadausuarionoregistrado;
	@Id("Labellugarlistadonoticiasportadausuarionoregistrado")
	private Label labellugarlistadonoticiasportadausuarionoregistrado;
	@Id("Layouresumenlistadonoticiasportadausuarionoregistrado")
	private HorizontalLayout layouresumenlistadonoticiasportadausuarionoregistrado;
	@Id("Textarearesumenlistadonoticiasportadausuarionoregistrado")
	private TextArea textarearesumenlistadonoticiasportadausuarionoregistrado;

	public VistaListadonoticiasportadausuarionoregistrado_item() {
        // You can initialise any data required for the connected UI components here.
    }

}