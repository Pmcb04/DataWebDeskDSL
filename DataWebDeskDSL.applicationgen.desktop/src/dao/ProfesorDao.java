/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package dao;

import java.util.List;
import model.Profesor;

public interface ProfesorDao
{
	List<Profesor> getAllProfesors();
	Profesor getProfesorByNombre_profesor(String nombre_profesor);
	Profesor getProfesorByNum_profesor(int num_profesor);
	Profesor getProfesorByNum_expediente(int num_expediente);
	Profesor getProfesorByNombre_titulo(String nombre_titulo);
	void saveProfesor(Profesor profesor);
	void deleteProfesor(Profesor profesor);
}
