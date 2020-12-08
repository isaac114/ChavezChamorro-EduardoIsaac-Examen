package jpa;

import dao.DAOFactory;
import dao.OperadoraDAO;
import dao.TelefonoDAO;
import dao.TipoTelefonoDAO;
import dao.UsuarioDAO;

public class JPADAOFactory extends DAOFactory {

	@Override
	public UsuarioDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new JPAUsuarioDAO();
	}

	@Override
	public TelefonoDAO getTelefonoDAO() {
		// TODO Auto-generated method stub
		return new JPATelefonoDAO();
	}

	@Override
	public OperadoraDAO getOperadoraDAO() {
		// TODO Auto-generated method stub
		return new JPAOperadoraDAO();
	}

	@Override
	public TipoTelefonoDAO getTipoTelefonoDAO() {
		// TODO Auto-generated method stub
		return new JPATipoTelefonoDAO();
	}

}
