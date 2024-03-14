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

@Tag("vista-listadonoticiasportada_item")
@JsModule("./src/vista-listadonoticiasportada_item.ts")
public class VistaListadonoticiasportada_item extends LitTemplate {

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

	public HorizontalLayout getLayoutautorlugarfechalistadonoticiasportada() {
		return layoutautorlugarfechalistadonoticiasportada;
	}

	public void setLayoutautorlugarfechalistadonoticiasportada(
			HorizontalLayout layoutautorlugarfechalistadonoticiasportada) {
		this.layoutautorlugarfechalistadonoticiasportada = layoutautorlugarfechalistadonoticiasportada;
	}

	public TextField getFechalistadonoticiasportada() {
		return fechalistadonoticiasportada;
	}

	public void setFechalistadonoticiasportada(TextField fechalistadonoticiasportada) {
		this.fechalistadonoticiasportada = fechalistadonoticiasportada;
	}

	public TextField getAutorlistadonoticiasportada() {
		return autorlistadonoticiasportada;
	}

	public void setAutorlistadonoticiasportada(TextField autorlistadonoticiasportada) {
		this.autorlistadonoticiasportada = autorlistadonoticiasportada;
	}

	public TextField getLugarlistadonoticiasportada() {
		return lugarlistadonoticiasportada;
	}

	public void setLugarlistadonoticiasportada(TextField lugarlistadonoticiasportada) {
		this.lugarlistadonoticiasportada = lugarlistadonoticiasportada;
	}

	public HorizontalLayout getLayoutcontenidolistadonoticiasportada() {
		return layoutcontenidolistadonoticiasportada;
	}

	public void setLayoutcontenidolistadonoticiasportada(HorizontalLayout layoutcontenidolistadonoticiasportada) {
		this.layoutcontenidolistadonoticiasportada = layoutcontenidolistadonoticiasportada;
	}

	public TextArea getContenidolistadonoticiasportada() {
		return contenidolistadonoticiasportada;
	}

	public void setContenidolistadonoticiasportada(TextArea contenidolistadonoticiasportada) {
		this.contenidolistadonoticiasportada = contenidolistadonoticiasportada;
	}

	@Id("Layouttitulolistadonoticiasportada")
	private Element layouttitulolistadonoticiasportada;
	@Id("Titulolistadonoticiasportada")
	private Button titulolistadonoticiasportada;
	@Id("Comboboxtitulolistadonoticiasportada")
	private ComboBox<String> comboboxtitulolistadonoticiasportada;
	@Id("Layoutimagenlistadonoticiasportada")
	private HorizontalLayout layoutimagenlistadonoticiasportada;
	@Id("Layoutautorlugarfechalistadonoticiasportada")
	private HorizontalLayout layoutautorlugarfechalistadonoticiasportada;
	@Id("Fechalistadonoticiasportada")
	private TextField fechalistadonoticiasportada;
	@Id("Autorlistadonoticiasportada")
	private TextField autorlistadonoticiasportada;
	@Id("Lugarlistadonoticiasportada")
	private TextField lugarlistadonoticiasportada;
	@Id("Layoutcontenidolistadonoticiasportada")
	private HorizontalLayout layoutcontenidolistadonoticiasportada;
	@Id("Contenidolistadonoticiasportada")
	private TextArea contenidolistadonoticiasportada;

	public VistaListadonoticiasportada_item() {
        // You can initialise any data required for the connected UI components here.
    }

}