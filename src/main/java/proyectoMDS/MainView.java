package proyectoMDS;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import interfaz.Editor;
import interfaz.Periodista;
import interfaz.Usuario_Suscrito;
import interfaz.Usuario_no_Registrado;

@Route
@PWA(name = "Periodico MDS2 fornielesgomez",
        shortName = "PeriodicoMDS2fornielesgomez",
        description = "Periodico MDS2 fornielesgomez",
        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
@StyleSheet("context://fonts/Merriweather/stylesheet.css")
public class MainView extends VerticalLayout {
	
	public Usuario_no_Registrado _usuario_no_registrado;
	public Usuario_Suscrito _usuario_suscrito;
	public Periodista _periodista;
	public Editor _editor;
	
    public MainView(){
    	this.setPadding(false);
    	this._usuario_no_registrado = new Usuario_no_Registrado(this);
        this.add(_usuario_no_registrado);
    }
}
