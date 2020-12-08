package jpa;

import javax.persistence.Query;

import dao.TipoTelefonoDAO;
import entidades.TipoTelefono;

public class JPATipoTelefonoDAO extends JPAGenericDAO<TipoTelefono,Integer> implements TipoTelefonoDAO{
	
	public JPATipoTelefonoDAO () {
		super(TipoTelefono.class);
	}
	
	public TipoTelefono buscarTipo(String nombre) {
		Query query = em.createQuery("SELECT t FROM TipoTelefono t WHERE t.nombre = :nombre");
		query.setParameter("nombre", nombre);
		TipoTelefono tt = (TipoTelefono) query.getSingleResult();
		return tt;
	}
}
