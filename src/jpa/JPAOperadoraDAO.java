package jpa;

import javax.persistence.Query;

import dao.OperadoraDAO;
import entidades.Operadora;

public class JPAOperadoraDAO extends JPAGenericDAO<Operadora,Integer> implements OperadoraDAO {
	
	public JPAOperadoraDAO () {
		super(Operadora.class);
	}
	
	public Operadora buscarOperadora(String nombre) {
		Query query = em.createQuery("SELECT o FROM Operadora o WHERE o.nombre = :nombre");
		query.setParameter("nombre", nombre);
		Operadora op = (Operadora) query.getSingleResult();
		return op;
	}
}
