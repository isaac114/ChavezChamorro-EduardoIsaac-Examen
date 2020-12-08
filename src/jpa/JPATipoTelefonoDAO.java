package jpa;

import dao.TipoTelefonoDAO;
import entidades.TipoTelefono;

public class JPATipoTelefonoDAO extends JPAGenericDAO<TipoTelefono,Integer> implements TipoTelefonoDAO{
	
	public JPATipoTelefonoDAO () {
		super(TipoTelefono.class);
	}
}
