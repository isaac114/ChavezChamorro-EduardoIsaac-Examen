package entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TipoTelefono
 *
 */
@Entity

public class TipoTelefono implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoTT;
	private String nombre;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tt_tel_id")
	private List<Telefono> telefonos;

	public TipoTelefono() {
		super();
	}

	public TipoTelefono(int codigoTT, String nombre) {
		super();
		this.codigoTT = codigoTT;
		this.nombre = nombre;
	}

	public int getCodigoTT() {
		return codigoTT;
	}

	public void setCodigoTT(int codigoTT) {
		this.codigoTT = codigoTT;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	
	
   
}
