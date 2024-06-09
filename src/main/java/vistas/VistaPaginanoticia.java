package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextArea;

@Tag("vista-paginanoticia")
@JsModule("./src/vista-paginanoticia.ts")
public class VistaPaginanoticia extends LitTemplate {

	public Element getLayoutimagennoticiapaginanoticia() {
		return layoutimagennoticiapaginanoticia;
	}

	public void setLayoutimagennoticiapaginanoticia(Element layoutimagennoticiapaginanoticia) {
		this.layoutimagennoticiapaginanoticia = layoutimagennoticiapaginanoticia;
	}

	public HorizontalLayout getLayouteliminarpaginanoticia() {
		return layouteliminarpaginanoticia;
	}

	public void setLayouteliminarpaginanoticia(HorizontalLayout layouteliminarpaginanoticia) {
		this.layouteliminarpaginanoticia = layouteliminarpaginanoticia;
	}

	public Button getButtoneliminarpaginanoticia() {
		return buttoneliminarpaginanoticia;
	}

	public void setButtoneliminarpaginanoticia(Button buttoneliminarpaginanoticia) {
		this.buttoneliminarpaginanoticia = buttoneliminarpaginanoticia;
	}

	public Image getImageneliminarpaginanoticia() {
		return imageneliminarpaginanoticia;
	}

	public void setImageneliminarpaginanoticia(Image imageneliminarpaginanoticia) {
		this.imageneliminarpaginanoticia = imageneliminarpaginanoticia;
	}

	public TextArea getTextareacomentarioseccioncomentarios() {
		return textareacomentarioseccioncomentarios;
	}

	public void setTextareacomentarioseccioncomentarios(TextArea textareacomentarioseccioncomentarios) {
		this.textareacomentarioseccioncomentarios = textareacomentarioseccioncomentarios;
	}

	public Label getLabelseccioncomentarios() {
		return labelseccioncomentarios;
	}

	public void setLabelseccioncomentarios(Label labelseccioncomentarios) {
		this.labelseccioncomentarios = labelseccioncomentarios;
	}

	public HorizontalLayout getLayoutcomentarioseccioncomentarios() {
		return layoutcomentarioseccioncomentarios;
	}

	public void setLayoutcomentarioseccioncomentarios(HorizontalLayout layoutcomentarioseccioncomentarios) {
		this.layoutcomentarioseccioncomentarios = layoutcomentarioseccioncomentarios;
	}

	public Button getBotonanadircomentarioseccioncomentarios() {
		return botonanadircomentarioseccioncomentarios;
	}

	public void setBotonanadircomentarioseccioncomentarios(Button botonanadircomentarioseccioncomentarios) {
		this.botonanadircomentarioseccioncomentarios = botonanadircomentarioseccioncomentarios;
	}
	
	public Element getLayoutcontenedornoticiapaginanoticia() {
		return layoutcontenedornoticiapaginanoticia;
	}

	public void setLayoutcontenedornoticiapaginanoticia(Element layoutcontenedornoticiapaginanoticia) {
		this.layoutcontenedornoticiapaginanoticia = layoutcontenedornoticiapaginanoticia;
	}

	public Label getLabeltitulonoticiapaginanoticia() {
		return labeltitulonoticiapaginanoticia;
	}

	public void setLabeltitulonoticiapaginanoticia(Label labeltitulonoticiapaginanoticia) {
		this.labeltitulonoticiapaginanoticia = labeltitulonoticiapaginanoticia;
	}

	public Label getLabeltitulotematicapaginanoticia() {
		return labeltitulotematicapaginanoticia;
	}

	public void setLabeltitulotematicapaginanoticia(Label labeltitulotematicapaginanoticia) {
		this.labeltitulotematicapaginanoticia = labeltitulotematicapaginanoticia;
	}

	public HorizontalLayout getLayoutfechaautorlugarpaginanoticia() {
		return layoutfechaautorlugarpaginanoticia;
	}

	public void setLayoutfechaautorlugarpaginanoticia(HorizontalLayout layoutfechaautorlugarpaginanoticia) {
		this.layoutfechaautorlugarpaginanoticia = layoutfechaautorlugarpaginanoticia;
	}

	public Label getLayoutfechapaginanoticia() {
		return layoutfechapaginanoticia;
	}

	public void setLayoutfechapaginanoticia(Label layoutfechapaginanoticia) {
		this.layoutfechapaginanoticia = layoutfechapaginanoticia;
	}

	public Label getLayoutautorpaginanoticia() {
		return layoutautorpaginanoticia;
	}

	public void setLayoutautorpaginanoticia(Label layoutautorpaginanoticia) {
		this.layoutautorpaginanoticia = layoutautorpaginanoticia;
	}

	public Label getLayoutlugarpaginanoticia() {
		return layoutlugarpaginanoticia;
	}

	public void setLayoutlugarpaginanoticia(Label layoutlugarpaginanoticia) {
		this.layoutlugarpaginanoticia = layoutlugarpaginanoticia;
	}

	public HorizontalLayout getMostrarvaloracionnoticiapaginanoticia() {
		return mostrarvaloracionnoticiapaginanoticia;
	}

	public void setMostrarvaloracionnoticiapaginanoticia(HorizontalLayout mostrarvaloracionnoticiapaginanoticia) {
		this.mostrarvaloracionnoticiapaginanoticia = mostrarvaloracionnoticiapaginanoticia;
	}

	public HorizontalLayout getMostrarnoticiaresumidayextendidapaginanoticia() {
		return mostrarnoticiaresumidayextendidapaginanoticia;
	}

	public void setMostrarnoticiaresumidayextendidapaginanoticia(
			HorizontalLayout mostrarnoticiaresumidayextendidapaginanoticia) {
		this.mostrarnoticiaresumidayextendidapaginanoticia = mostrarnoticiaresumidayextendidapaginanoticia;
	}

	public Element getLayoutseccioncomentariospaginanoticia() {
		return layoutseccioncomentariospaginanoticia;
	}

	public void setLayoutseccioncomentariospaginanoticia(Element layoutseccioncomentariospaginanoticia) {
		this.layoutseccioncomentariospaginanoticia = layoutseccioncomentariospaginanoticia;
	}

	@Id("Layoutcontenedornoticiapaginanoticia")
	private Element layoutcontenedornoticiapaginanoticia;
	@Id("Labeltitulonoticiapaginanoticia")
	private Label labeltitulonoticiapaginanoticia;
	@Id("Labeltitulotematicapaginanoticia")
	private Label labeltitulotematicapaginanoticia;
	@Id("Layoutfechaautorlugarpaginanoticia")
	private HorizontalLayout layoutfechaautorlugarpaginanoticia;
	@Id("Layoutfechapaginanoticia")
	private Label layoutfechapaginanoticia;
	@Id("Layoutautorpaginanoticia")
	private Label layoutautorpaginanoticia;
	@Id("Layoutlugarpaginanoticia")
	private Label layoutlugarpaginanoticia;
	@Id("Mostrarvaloracionnoticiapaginanoticia")
	private HorizontalLayout mostrarvaloracionnoticiapaginanoticia;
	@Id("Mostrarnoticiaresumidayextendidapaginanoticia")
	private HorizontalLayout mostrarnoticiaresumidayextendidapaginanoticia;
	@Id("Layoutseccioncomentariospaginanoticia")
	private Element layoutseccioncomentariospaginanoticia;
	@Id("Labelseccioncomentarios")
	private Label labelseccioncomentarios;
	@Id("Layoutcomentarioseccioncomentarios")
	private HorizontalLayout layoutcomentarioseccioncomentarios;
	@Id("Botonanadircomentarioseccioncomentarios")
	private Button botonanadircomentarioseccioncomentarios;
	@Id("Textareacomentarioseccioncomentarios")
	private TextArea textareacomentarioseccioncomentarios;
	@Id("Layouteliminarpaginanoticia")
	private HorizontalLayout layouteliminarpaginanoticia;
	@Id("Buttoneliminarpaginanoticia")
	private Button buttoneliminarpaginanoticia;
	@Id("Imageneliminarpaginanoticia")
	private Image imageneliminarpaginanoticia;
	@Id("Layoutimagennoticiapaginanoticia")
	private Element layoutimagennoticiapaginanoticia;
	public VistaPaginanoticia() {
        // You can initialise any data required for the connected UI components here.
    }

}