/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package dao;

import java.util.List;
import model.Usuario;

public interface UsuarioDao
{
	List<Usuario> getAllUsuarios();
	Usuario getUsuarioByIdentificador(int identificador);
	Usuario getUsuarioByNombre(String nombre);
	void saveUsuario(Usuario usuario);
	void deleteUsuario(Usuario usuario);
}
