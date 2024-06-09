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

@Tag("vista-listadonoticiasportadaidentificado_item")
@JsModule("./src/vista-listadonoticiasportadaidentificado_item.ts")
public class VistaListadonoticiasportadaidentificado_item extends LitTemplate {

	public Element getLayouttitulolistadonoticiasportadaidentificado() {
		return layouttitulolistadonoticiasportadaidentificado;
	}
	public void setLayouttitulolistadonoticiasportadaidentificado(Element layouttitulolistadonoticiasportadaidentificado) {
		this.layouttitulolistadonoticiasportadaidentificado = layouttitulolistadonoticiasportadaidentificado;
	}
	public Button getTitulolistadonoticiasportadaidentificado() {
		return titulolistadonoticiasportadaidentificado;
	}
	public void setTitulolistadonoticiasportadaidentificado(Button titulolistadonoticiasportadaidentificado) {
		this.titulolistadonoticiasportadaidentificado = titulolistadonoticiasportadaidentificado;
	}
	public Element getLayouttitulonoticiaordenarportadaidentificado() {
		return layouttitulonoticiaordenarportadaidentificado;
	}
	public void setLayouttitulonoticiaordenarportadaidentificado(Element layouttitulonoticiaordenarportadaidentificado) {
		this.layouttitulonoticiaordenarportadaidentificado = layouttitulonoticiaordenarportadaidentificado;
	}
	public HorizontalLayout getLayoutimagenlistadonoticiasportadaidentificado() {
		return layoutimagenlistadonoticiasportadaidentificado;
	}
	public void setLayoutimagenlistadonoticiasportadaidentificado(
			HorizontalLayout layoutimagenlistadonoticiasportadaidentificado) {
		this.layoutimagenlistadonoticiasportadaidentificado = layoutimagenlistadonoticiasportadaidentificado;
	}
	public HorizontalLayout getLayoutautorlugarfechalistadonoticiasportadaidentificado() {
		return layoutautorlugarfechalistadonoticiasportadaidentificado;
	}
	public void setLayoutautorlugarfechalistadonoticiasportadaidentificado(
			HorizontalLayout layoutautorlugarfechalistadonoticiasportadaidentificado) {
		this.layoutautorlugarfechalistadonoticiasportadaidentificado = layoutautorlugarfechalistadonoticiasportadaidentificado;
	}
	public Label getLabelfechalistadonoticiasportadaidentificado() {
		return labelfechalistadonoticiasportadaidentificado;
	}
	public void setLabelfechalistadonoticiasportadaidentificado(Label labelfechalistadonoticiasportadaidentificado) {
		this.labelfechalistadonoticiasportadaidentificado = labelfechalistadonoticiasportadaidentificado;
	}
	public Label getLabelautorlistadonoticiasportadaidentificado() {
		return labelautorlistadonoticiasportadaidentificado;
	}
	public void setLabelautorlistadonoticiasportadaidentificado(Label labelautorlistadonoticiasportadaidentificado) {
		this.labelautorlistadonoticiasportadaidentificado = labelautorlistadonoticiasportadaidentificado;
	}
	public Label getLabellugarlistadonoticiasportadaidentificado() {
		return labellugarlistadonoticiasportadaidentificado;
	}
	public void setLabellugarlistadonoticiasportadaidentificado(Label labellugarlistadonoticiasportadaidentificado) {
		this.labellugarlistadonoticiasportadaidentificado = labellugarlistadonoticiasportadaidentificado;
	}
	
	@Id("Layouttitulolistadonoticiasportadaidentificado")
	private Element layouttitulolistadonoticiasportadaidentificado;
	@Id("Titulolistadonoticiasportadaidentificado")
	private Button titulolistadonoticiasportadaidentificado;
	@Id("Layouttitulonoticiaordenarportadaidentificado")
	private Element layouttitulonoticiaordenarportadaidentificado;
	@Id("Layoutimagenlistadonoticiasportadaidentificado")
	private HorizontalLayout layoutimagenlistadonoticiasportadaidentificado;
	@Id("Layoutautorlugarfechalistadonoticiasportadaidentificado")
	private HorizontalLayout layoutautorlugarfechalistadonoticiasportadaidentificado;
	@Id("Labelfechalistadonoticiasportadaidentificado")
	private Label labelfechalistadonoticiasportadaidentificado;
	@Id("Labelautorlistadonoticiasportadaidentificado")
	private Label labelautorlistadonoticiasportadaidentificado;
	@Id("Labellugarlistadonoticiasportadaidentificado")
	private Label labellugarlistadonoticiasportadaidentificado;
	public VistaListadonoticiasportadaidentificado_item() {
        // You can initialise any data required for the connected UI components here.
    }

}