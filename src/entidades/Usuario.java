package entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

public class Usuario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoU;
	private String nombre;
	private String apellido;
	private String cedula;
	private String correo;
	private String contrasena;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "us_tel_id")
	private List<Telefono> telefonos;
	
	public Usuario() {
		super();
	}
	
	

	public Usuario(int codigoU, String nombre, String apellido, String cedula, String correo, String contrasena) {
		super();
		this.codigoU = codigoU;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.correo = correo;
		this.contrasena = contrasena;
	}



	public int getCodigoU() {
		return codigoU;
	}

	public void setCodigoU(int codigoU) {
		this.codigoU = codigoU;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
   
}
