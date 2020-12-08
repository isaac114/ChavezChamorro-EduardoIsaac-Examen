package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Telefono
 *
 */
@Entity

public class Telefono implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoT;
	private String numero;
	@ManyToOne
	@JoinColumn
	private Usuario us_tel_id;
	@ManyToOne
	@JoinColumn
	private Operadora op_tel_id;
	@ManyToOne
	@JoinColumn
	private TipoTelefono tt_tel_id;
	

	public Telefono() {
		super();
	}
	
	


	public Telefono(int codigoT, String numero, Usuario us_tel_id, Operadora op_tel_id, TipoTelefono tt_tel_id) {
		super();
		this.codigoT = codigoT;
		this.numero = numero;
		this.us_tel_id = us_tel_id;
		this.op_tel_id = op_tel_id;
		this.tt_tel_id = tt_tel_id;
	}




	public int getCodigoT() {
		return codigoT;
	}


	public void setCodigoT(int codigoT) {
		this.codigoT = codigoT;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public Usuario getUs_tel_id() {
		return us_tel_id;
	}


	public void setUs_tel_id(Usuario us_tel_id) {
		this.us_tel_id = us_tel_id;
	}


	public Operadora getOp_tel_id() {
		return op_tel_id;
	}


	public void setOp_tel_id(Operadora op_tel_id) {
		this.op_tel_id = op_tel_id;
	}


	public TipoTelefono getTt_tel_id() {
		return tt_tel_id;
	}


	public void setTt_tel_id(TipoTelefono tt_tel_id) {
		this.tt_tel_id = tt_tel_id;
	}
	
	
   
}
