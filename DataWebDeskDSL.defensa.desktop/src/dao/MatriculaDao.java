/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package dao;

import java.util.List;
import model.Matricula;

public interface MatriculaDao
{
	List<Matricula> getAllMatriculas();
	Matricula getMatriculaByNombre_matricula(String nombre_matricula);
	Matricula getMatriculaByNombre_asignatura(String nombre_asignatura);
	Matricula getMatriculaByNombre_alumno(String nombre_alumno);
	void saveMatricula(Matricula matricula);
	void deleteMatricula(Matricula matricula);
}
