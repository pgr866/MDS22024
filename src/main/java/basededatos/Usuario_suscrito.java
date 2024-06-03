/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Pablo(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Usuario_suscrito")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Usuario_suscrito")
@PrimaryKeyJoinColumn(name="IdentificadoId", referencedColumnName="Id")
public class Usuario_suscrito extends basededatos.Identificado implements Serializable {
	public Usuario_suscrito() {
	}
	
	@Column(name="Num_tarjeta", nullable=false, length=255)	
	private String num_tarjeta;
	
	@Column(name="EsEliminado", nullable=false, length=1)	
	private boolean esEliminado;
	
	public void setNum_tarjeta(String value) {
		this.num_tarjeta = value;
	}
	
	public String getNum_tarjeta() {
		return num_tarjeta;
	}
	
	public void setEsEliminado(boolean value) {
		this.esEliminado = value;
	}
	
	public boolean getEsEliminado() {
		return esEliminado;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
