package jpa;

import dao.UsuarioDAO;
import entidades.Usuario;

public class JPAUsuarioDAO extends JPAGenericDAO<Usuario,Integer> implements UsuarioDAO {
	
	 public JPAUsuarioDAO () {
		 super(Usuario.class);
	 }
	 
}
