package dao;

import entidades.TipoTelefono;

public interface TipoTelefonoDAO extends GenericDAO<TipoTelefono, Integer> {

		public TipoTelefono buscarTipo(String nombre);
}
