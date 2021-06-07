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
	Alumno getAlumnoByNombre_alumno(String nombre_alumno);
	Alumno getAlumnoByEvaluacion_continua(String evaluacion_continua);
	Alumno getAlumnoByEdad(int edad);
	void saveAlumno(Alumno alumno);
	void deleteAlumno(Alumno alumno);
}
