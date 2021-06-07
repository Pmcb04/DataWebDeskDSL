/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package dao;

import java.util.List;
import model.Título;

public interface TítuloDao
{
	List<Título> getAllTítulos();
	Título getTítuloByNombre_titulo(String nombre_titulo);
	Título getTítuloByNum_creditos(int num_creditos);
	Título getTítuloByEspecialidad(String especialidad);
	void saveTítulo(Título título);
	void deleteTítulo(Título título);
}
