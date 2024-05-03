package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.html.Label;

@Tag("vista-noticiasenseccionidentificado_item")
@JsModule("./src/vista-noticiasenseccionidentificado_item.ts")
public class VistaNoticiasenseccionidentificado_item extends LitTemplate {

	public Element getLayouttitulonoticiasenseccionidentificado() {
		return layouttitulonoticiasenseccionidentificado;
	}

	public void setLayouttitulonoticiasenseccionidentificado(Element layouttitulonoticiasenseccionidentificado) {
		this.layouttitulonoticiasenseccionidentificado = layouttitulonoticiasenseccionidentificado;
	}

	public Button getTitulonoticiasenseccionidentificado() {
		return titulonoticiasenseccionidentificado;
	}

	public void setTitulonoticiasenseccionidentificado(Button titulonoticiasenseccionidentificado) {
		this.titulonoticiasenseccionidentificado = titulonoticiasenseccionidentificado;
	}

	public HorizontalLayout getLayoutimagennoticiasenseccionidentificado() {
		return layoutimagennoticiasenseccionidentificado;
	}

	public void setLayoutimagennoticiasenseccionidentificado(HorizontalLayout layoutimagennoticiasenseccionidentificado) {
		this.layoutimagennoticiasenseccionidentificado = layoutimagennoticiasenseccionidentificado;
	}

	public Image getImagennoticiasenseccionidentificado() {
		return imagennoticiasenseccionidentificado;
	}

	public void setImagennoticiasenseccionidentificado(Image imagennoticiasenseccionidentificado) {
		this.imagennoticiasenseccionidentificado = imagennoticiasenseccionidentificado;
	}

	public HorizontalLayout getLayoutautorlugarfechanoticiasenseccionidentificado() {
		return layoutautorlugarfechanoticiasenseccionidentificado;
	}

	public void setLayoutautorlugarfechanoticiasenseccionidentificado(
			HorizontalLayout layoutautorlugarfechanoticiasenseccionidentificado) {
		this.layoutautorlugarfechanoticiasenseccionidentificado = layoutautorlugarfechanoticiasenseccionidentificado;
	}

	public Label getFechanoticiasenseccionidentificado() {
		return fechanoticiasenseccionidentificado;
	}

	public void setFechanoticiasenseccionidentificado(Label fechanoticiasenseccionidentificado) {
		this.fechanoticiasenseccionidentificado = fechanoticiasenseccionidentificado;
	}

	public Label getAutornoticiasenseccionidentificado() {
		return autornoticiasenseccionidentificado;
	}

	public void setAutornoticiasenseccionidentificado(Label autornoticiasenseccionidentificado) {
		this.autornoticiasenseccionidentificado = autornoticiasenseccionidentificado;
	}

	public Label getLugarnoticiasenseccionidentificado() {
		return lugarnoticiasenseccionidentificado;
	}

	public void setLugarnoticiasenseccionidentificado(Label lugarnoticiasenseccionidentificado) {
		this.lugarnoticiasenseccionidentificado = lugarnoticiasenseccionidentificado;
	}

	public HorizontalLayout getLayoutcontenidonoticiasenseccionidentificado() {
		return layoutcontenidonoticiasenseccionidentificado;
	}

	public void setLayoutcontenidonoticiasenseccionidentificado(
			HorizontalLayout layoutcontenidonoticiasenseccionidentificado) {
		this.layoutcontenidonoticiasenseccionidentificado = layoutcontenidonoticiasenseccionidentificado;
	}

	public TextArea getContenidonoticiasenseccionidentificado() {
		return contenidonoticiasenseccionidentificado;
	}

	public void setContenidonoticiasenseccionidentificado(TextArea contenidonoticiasenseccionidentificado) {
		this.contenidonoticiasenseccionidentificado = contenidonoticiasenseccionidentificado;
	}

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