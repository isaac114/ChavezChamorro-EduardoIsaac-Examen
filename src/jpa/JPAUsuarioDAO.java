package jpa;

import javax.persistence.Query;

import dao.UsuarioDAO;
import entidades.Usuario;

public class JPAUsuarioDAO extends JPAGenericDAO<Usuario,Integer> implements UsuarioDAO {
	
	 public JPAUsuarioDAO () {
		 super(Usuario.class);
	 }
	 
	 public Usuario buscarPorCedula(String cedula) {
		Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.cedula = :cedula");
		query.setParameter("cedula", cedula);
		Usuario usuario = (Usuario) query.getSingleResult();
		return usuario;
			
	 }
	 
}
