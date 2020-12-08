package jpa;

import dao.TelefonoDAO;
import entidades.Telefono;

public class JPATelefonoDAO extends JPAGenericDAO<Telefono,Integer> implements TelefonoDAO {
	
	public JPATelefonoDAO() {
		super(Telefono.class);
	}
}
