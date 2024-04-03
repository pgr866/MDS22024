package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextField;

@Tag("vista-mostrarpublicidad")
@JsModule("./src/vista-mostrarpublicidad.ts")
public class VistaMostrarpublicidad extends LitTemplate {

    public HorizontalLayout getLayoutpublicidadsuperiormostrarpublidad() {
		return layoutpublicidadsuperiormostrarpublidad;
	}

	public void setLayoutpublicidadsuperiormostrarpublidad(HorizontalLayout layoutpublicidadsuperiormostrarpublidad) {
		this.layoutpublicidadsuperiormostrarpublidad = layoutpublicidadsuperiormostrarpublidad;
	}

	public Button getAnunciosuperiormostrarpublidad() {
		return anunciosuperiormostrarpublidad;
	}

	public void setAnunciosuperiormostrarpublidad(Button anunciosuperiormostrarpublidad) {
		this.anunciosuperiormostrarpublidad = anunciosuperiormostrarpublidad;
	}

	public Image getImagenpublicidadsuperiormostrarpublidad() {
		return imagenpublicidadsuperiormostrarpublidad;
	}

	public void setImagenpublicidadsuperiormostrarpublidad(Image imagenpublicidadsuperiormostrarpublidad) {
		this.imagenpublicidadsuperiormostrarpublidad = imagenpublicidadsuperiormostrarpublidad;
	}

	public HorizontalLayout getLayoutpublicidadetiquetamostrarpublidad() {
		return layoutpublicidadetiquetamostrarpublidad;
	}

	public void setLayoutpublicidadetiquetamostrarpublidad(HorizontalLayout layoutpublicidadetiquetamostrarpublidad) {
		this.layoutpublicidadetiquetamostrarpublidad = layoutpublicidadetiquetamostrarpublidad;
	}

	public TextField getPublicidadetiquetamostrarpublidad() {
		return publicidadetiquetamostrarpublidad;
	}

	public void setPublicidadetiquetamostrarpublidad(TextField publicidadetiquetamostrarpublidad) {
		this.publicidadetiquetamostrarpublidad = publicidadetiquetamostrarpublidad;
	}

	public HorizontalLayout getLayoutpublicidadinferiormostrarpublidad() {
		return layoutpublicidadinferiormostrarpublidad;
	}

	public void setLayoutpublicidadinferiormostrarpublidad(HorizontalLayout layoutpublicidadinferiormostrarpublidad) {
		this.layoutpublicidadinferiormostrarpublidad = layoutpublicidadinferiormostrarpublidad;
	}

	public Button getPublicidadinferiormostrarpublidad() {
		return publicidadinferiormostrarpublidad;
	}

	public void setPublicidadinferiormostrarpublidad(Button publicidadinferiormostrarpublidad) {
		this.publicidadinferiormostrarpublidad = publicidadinferiormostrarpublidad;
	}

	public Image getImagenpublicidadinferiormostrarpublidad() {
		return imagenpublicidadinferiormostrarpublidad;
	}

	public void setImagenpublicidadinferiormostrarpublidad(Image imagenpublicidadinferiormostrarpublidad) {
		this.imagenpublicidadinferiormostrarpublidad = imagenpublicidadinferiormostrarpublidad;
	}

	@Id("Layoutpublicidadsuperiormostrarpublidad")
	private HorizontalLayout layoutpublicidadsuperiormostrarpublidad;
	@Id("Anunciosuperiormostrarpublidad")
	private Button anunciosuperiormostrarpublidad;
	@Id("Imagenpublicidadsuperiormostrarpublidad")
	private Image imagenpublicidadsuperiormostrarpublidad;
	@Id("Layoutpublicidadetiquetamostrarpublidad")
	private HorizontalLayout layoutpublicidadetiquetamostrarpublidad;
	@Id("Publicidadetiquetamostrarpublidad")
	private TextField publicidadetiquetamostrarpublidad;
	@Id("Layoutpublicidadinferiormostrarpublidad")
	private HorizontalLayout layoutpublicidadinferiormostrarpublidad;
	@Id("Publicidadinferiormostrarpublidad")
	private Button publicidadinferiormostrarpublidad;
	@Id("Imagenpublicidadinferiormostrarpublidad")
	private Image imagenpublicidadinferiormostrarpublidad;

	public VistaMostrarpublicidad() {
        // You can initialise any data required for the connected UI components here.
    }

}