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

	public HorizontalLayout getLayoutimagenlistadonoticiasportadausuarionoregistrado() {
		return layoutimagenlistadonoticiasportadausuarionoregistrado;
	}

	public void setLayoutimagenlistadonoticiasportadausuarionoregistrado(
			HorizontalLayout layoutimagenlistadonoticiasportadausuarionoregistrado) {
		this.layoutimagenlistadonoticiasportadausuarionoregistrado = layoutimagenlistadonoticiasportadausuarionoregistrado;
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

	@Id("Layouttitulolistadonoticiasportadausuarionoregistrado")
	private Element layouttitulolistadonoticiasportadausuarionoregistrado;
	@Id("Titulolistadonoticiasportadausuarionoregistrado")
	private Button titulolistadonoticiasportadausuarionoregistrado;
	@Id("Layoutimagenlistadonoticiasportadausuarionoregistrado")
	private HorizontalLayout layoutimagenlistadonoticiasportadausuarionoregistrado;
	@Id("Layoutautorlugarfechalistadonoticiasportadausuarionoregistrado")
	private HorizontalLayout layoutautorlugarfechalistadonoticiasportadausuarionoregistrado;
	@Id("Labelfechalistadonoticiasportadausuarionoregistrado")
	private Label labelfechalistadonoticiasportadausuarionoregistrado;
	@Id("Labelautorlistadonoticiasportadausuarionoregistrado")
	private Label labelautorlistadonoticiasportadausuarionoregistrado;
	@Id("Labellugarlistadonoticiasportadausuarionoregistrado")
	private Label labellugarlistadonoticiasportadausuarionoregistrado;
	public VistaListadonoticiasportadausuarionoregistrado_item() {
        // You can initialise any data required for the connected UI components here.
    }

}