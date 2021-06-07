/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package dao;

import java.util.List;
import model.Asignatura;

public interface AsignaturaDao
{
	List<Asignatura> getAllAsignaturas();
	Asignatura getAsignaturaByNombre_asignatura(String nombre_asignatura);
	Asignatura getAsignaturaBySemestre(int semestre);
	Asignatura getAsignaturaByObligatoria(String obligatoria);
	Asignatura getAsignaturaByNombre_titulo(String nombre_titulo);
	void saveAsignatura(Asignatura asignatura);
	void deleteAsignatura(Asignatura asignatura);
}
