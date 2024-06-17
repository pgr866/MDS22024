package interfaz;

public class Log_out extends vistas.VistaLogout{

	public Identificado _identificado;
	
	public Log_out(Identificado _identificado) {
		super();
		this._identificado = _identificado;
		this.getButtonlogout().addClickListener(event->
		{
			this._identificado.mainview.removeAll();
			this._identificado.mainview._usuario_no_registrado = new Usuario_no_Registrado(this._identificado.mainview);
			this._identificado.mainview.add(this._identificado.mainview._usuario_no_registrado);
			this._identificado.mainview._usuario_suscrito = null;
			this._identificado.mainview._periodista = null;
			this._identificado.mainview._editor = null;
		});
	}
}