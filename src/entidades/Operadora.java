package entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Operadora
 *
 */
@Entity

public class Operadora implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoO;
	private String nombre;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "op_tel_id")
	private List<Telefono> telefonos;
	

	public Operadora() {
		super();
	}


	public Operadora(int codigoO, String nombre) {
		super();
		this.codigoO = codigoO;
		this.nombre = nombre;
	}


	public int getCodigoO() {
		return codigoO;
	}


	public void setCodigoO(int codigoO) {
		this.codigoO = codigoO;
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
