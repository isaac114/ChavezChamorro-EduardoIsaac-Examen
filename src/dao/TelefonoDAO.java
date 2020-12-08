package dao;

import java.util.List;

import entidades.Telefono;

public interface TelefonoDAO extends GenericDAO<Telefono, Integer>{
	
	public List<Telefono> listarTelefonos();
	public Telefono buscarUsuario(String cedula, String telefono);
}
