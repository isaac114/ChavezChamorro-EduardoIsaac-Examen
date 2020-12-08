package jpa;

import java.util.List;

import javax.persistence.Query;

import dao.TelefonoDAO;
import entidades.Telefono;

public class JPATelefonoDAO extends JPAGenericDAO<Telefono,Integer> implements TelefonoDAO {
	
	public JPATelefonoDAO() {
		super(Telefono.class);
	}
	
	public List<Telefono> listarTelefonos(){
		Query query = em.createQuery("SELECT t FROM Telefono t");
		List<Telefono> tel = query.getResultList();
		return tel;
	}
	
	public Telefono buscarUsuario(String cedula, String telefono) {
		Query query = em.createQuery("SELECT t FROM Telefono t WHERE t.numero = :telefono AND t.us_tel_id.cedula = :cedula");
		query.setParameter("telefono", telefono);
		query.setParameter("cedula", cedula);
		Telefono tel = (Telefono) query.getSingleResult();
		return tel;
	}
}
