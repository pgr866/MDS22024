package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.html.Label;

@Tag("vista-noticiasenseccionusuarionoregistrado_item")
@JsModule("./src/vista-noticiasenseccionusuarionoregistrado_item.ts")
public class VistaNoticiasenseccionusuarionoregistrado_item extends LitTemplate {

	public HorizontalLayout getLayoutautorlugarfechanoticiasenseccionusuarionoregistrado() {
		return layoutautorlugarfechanoticiasenseccionusuarionoregistrado;
	}

	public void setLayoutautorlugarfechanoticiasenseccionusuarionoregistrado(
			HorizontalLayout layoutautorlugarfechanoticiasenseccionusuarionoregistrado) {
		this.layoutautorlugarfechanoticiasenseccionusuarionoregistrado = layoutautorlugarfechanoticiasenseccionusuarionoregistrado;
	}

	public Label getFechanoticiasenseccionusuarionoregistrado() {
		return fechanoticiasenseccionusuarionoregistrado;
	}

	public void setFechanoticiasenseccionusuarionoregistrado(Label fechanoticiasenseccionusuarionoregistrado) {
		this.fechanoticiasenseccionusuarionoregistrado = fechanoticiasenseccionusuarionoregistrado;
	}

	public Label getAutornoticiasenseccionusuarionoregistrado() {
		return autornoticiasenseccionusuarionoregistrado;
	}

	public void setAutornoticiasenseccionusuarionoregistrado(Label autornoticiasenseccionusuarionoregistrado) {
		this.autornoticiasenseccionusuarionoregistrado = autornoticiasenseccionusuarionoregistrado;
	}

	public Label getLugarnoticiasenseccionusuarionoregistrado() {
		return lugarnoticiasenseccionusuarionoregistrado;
	}

	public void setLugarnoticiasenseccionusuarionoregistrado(Label lugarnoticiasenseccionusuarionoregistrado) {
		this.lugarnoticiasenseccionusuarionoregistrado = lugarnoticiasenseccionusuarionoregistrado;
	}

	public Element getLayoutnoticiasenseccionusuarionoregistrado() {
		return layoutnoticiasenseccionusuarionoregistrado;
	}

	public void setLayoutnoticiasenseccionusuarionoregistrado(Element layoutnoticiasenseccionusuarionoregistrado) {
		this.layoutnoticiasenseccionusuarionoregistrado = layoutnoticiasenseccionusuarionoregistrado;
	}

	public Element getLayouttitulonoticiasenseccionusuarionoregistrado() {
		return layouttitulonoticiasenseccionusuarionoregistrado;
	}

	public void setLayouttitulonoticiasenseccionusuarionoregistrado(
			Element layouttitulonoticiasenseccionusuarionoregistrado) {
		this.layouttitulonoticiasenseccionusuarionoregistrado = layouttitulonoticiasenseccionusuarionoregistrado;
	}

	public Button getTitulonoticiasenseccionusuarionoregistrado() {
		return titulonoticiasenseccionusuarionoregistrado;
	}

	public void setTitulonoticiasenseccionusuarionoregistrado(Button titulonoticiasenseccionusuarionoregistrado) {
		this.titulonoticiasenseccionusuarionoregistrado = titulonoticiasenseccionusuarionoregistrado;
	}

	public HorizontalLayout getLayoutimagennoticiasenseccionusuarionoregistrado() {
		return layoutimagennoticiasenseccionusuarionoregistrado;
	}

	public void setLayoutimagennoticiasenseccionusuarionoregistrado(
			HorizontalLayout layoutimagennoticiasenseccionusuarionoregistrado) {
		this.layoutimagennoticiasenseccionusuarionoregistrado = layoutimagennoticiasenseccionusuarionoregistrado;
	}

	@Id("Layouttitulonoticiasenseccionusuarionoregistrado")
	private Element layouttitulonoticiasenseccionusuarionoregistrado;
	@Id("Titulonoticiasenseccionusuarionoregistrado")
	private Button titulonoticiasenseccionusuarionoregistrado;
	@Id("Layoutimagennoticiasenseccionusuarionoregistrado")
	private HorizontalLayout layoutimagennoticiasenseccionusuarionoregistrado;
	@Id("Layoutnoticiasenseccionusuarionoregistrado")
	private Element layoutnoticiasenseccionusuarionoregistrado;
	@Id("Layoutautorlugarfechanoticiasenseccionusuarionoregistrado")
	private HorizontalLayout layoutautorlugarfechanoticiasenseccionusuarionoregistrado;
	@Id("Fechanoticiasenseccionusuarionoregistrado")
	private Label fechanoticiasenseccionusuarionoregistrado;
	@Id("Autornoticiasenseccionusuarionoregistrado")
	private Label autornoticiasenseccionusuarionoregistrado;
	@Id("Lugarnoticiasenseccionusuarionoregistrado")
	private Label lugarnoticiasenseccionusuarionoregistrado;

	public VistaNoticiasenseccionusuarionoregistrado_item() {
        // You can initialise any data required for the connected UI components here.
    }

}