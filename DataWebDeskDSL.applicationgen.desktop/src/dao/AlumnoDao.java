/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package dao;

import java.util.List;
import model.Alumno;

public interface AlumnoDao
{
	List<Alumno> getAllAlumnos();
	Alumno getAlumnoByNombre(String nombre);
	Alumno getAlumnoByNum_expediente(int num_expediente);
	void saveAlumno(Alumno alumno);
	void deleteAlumno(Alumno alumno);
}
