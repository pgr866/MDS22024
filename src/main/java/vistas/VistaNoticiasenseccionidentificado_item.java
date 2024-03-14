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

	public Image getImagennoticiasenseccionidentificado1() {
		return imagennoticiasenseccionidentificado1;
	}

	public void setImagennoticiasenseccionidentificado1(Image imagennoticiasenseccionidentificado1) {
		this.imagennoticiasenseccionidentificado1 = imagennoticiasenseccionidentificado1;
	}

	public HorizontalLayout getLayoutautorlugarfechanoticiasenseccionidentificado() {
		return layoutautorlugarfechanoticiasenseccionidentificado;
	}

	public void setLayoutautorlugarfechanoticiasenseccionidentificado(
			HorizontalLayout layoutautorlugarfechanoticiasenseccionidentificado) {
		this.layoutautorlugarfechanoticiasenseccionidentificado = layoutautorlugarfechanoticiasenseccionidentificado;
	}

	public TextField getFechanoticiasenseccionidentificado() {
		return fechanoticiasenseccionidentificado;
	}

	public void setFechanoticiasenseccionidentificado(TextField fechanoticiasenseccionidentificado) {
		this.fechanoticiasenseccionidentificado = fechanoticiasenseccionidentificado;
	}

	public TextField getAutornoticiasenseccionidentificado() {
		return autornoticiasenseccionidentificado;
	}

	public void setAutornoticiasenseccionidentificado(TextField autornoticiasenseccionidentificado) {
		this.autornoticiasenseccionidentificado = autornoticiasenseccionidentificado;
	}

	public TextField getLugarnoticiasenseccionidentificado() {
		return lugarnoticiasenseccionidentificado;
	}

	public void setLugarnoticiasenseccionidentificado(TextField lugarnoticiasenseccionidentificado) {
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
	@Id("Imagennoticiasenseccionidentificado1")
	private Image imagennoticiasenseccionidentificado1;
	@Id("Layoutautorlugarfechanoticiasenseccionidentificado")
	private HorizontalLayout layoutautorlugarfechanoticiasenseccionidentificado;
	@Id("Fechanoticiasenseccionidentificado")
	private TextField fechanoticiasenseccionidentificado;
	@Id("Autornoticiasenseccionidentificado")
	private TextField autornoticiasenseccionidentificado;
	@Id("Lugarnoticiasenseccionidentificado")
	private TextField lugarnoticiasenseccionidentificado;
	@Id("Layoutcontenidonoticiasenseccionidentificado")
	private HorizontalLayout layoutcontenidonoticiasenseccionidentificado;
	@Id("Contenidonoticiasenseccionidentificado")
	private TextArea contenidonoticiasenseccionidentificado;

	public VistaNoticiasenseccionidentificado_item() {
        // You can initialise any data required for the connected UI components here.
    }

}