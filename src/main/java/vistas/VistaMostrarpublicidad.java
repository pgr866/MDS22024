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