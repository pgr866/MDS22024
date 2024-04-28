package interfaz;

import java.util.ArrayList;

import vistas.VistaListaperiodistas_item;

public class Lista_periodistas_item extends VistaListaperiodistas_item {
//	private event _baja_periodista;
	public Lista_periodistas _lista_periodistas;
	basededatos.Periodista periodista;
	
	public Lista_periodistas_item(Lista_periodistas _lista_periodistas, basededatos.Periodista periodista) {
		super();
		this._lista_periodistas = _lista_periodistas;
		this._lista_periodistas._buscar_periodista._baja_Alta_Periodistas.getButtondarbajaperiodista().addClickListener(event->Baja_periodista());
		this.periodista = periodista;
		this.getLayoutlistaperiodistaitem().setText(periodista.getNombre() + " " + periodista.getApellidos());
	}

	public void Baja_periodista() {
		if (this.getLayoutlistaperiodistaitem().getText() == this._lista_periodistas.getComboboxlistaperiodistas().getValue()) {
			// update periodista a EsEliminado 1 BD
			periodista.setEsEliminado(true);
			periodista.setContrasena("");
			periodista.setDni("");
			periodista.setEmail("");
			periodista.setFecha_nacimiento("");
			periodista.setTelefono(-1);
			periodista.setUrl_foto_perfil("");
			this._lista_periodistas._buscar_periodista._baja_Alta_Periodistas._editor.Baja_Alta_Periodistas(); // Refrescar pagina
		}
	}
}