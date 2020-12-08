package jpa;

import dao.OperadoraDAO;
import entidades.Operadora;

public class JPAOperadoraDAO extends JPAGenericDAO<Operadora,Integer> implements OperadoraDAO {
	
	public JPAOperadoraDAO () {
		super(Operadora.class);
	}
}
