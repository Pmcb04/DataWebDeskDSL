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
	Asignatura getAsignaturaByNum_asignatura(int num_asignatura);
	Asignatura getAsignaturaByNombre_asignatura(String nombre_asignatura);
	Asignatura getAsignaturaByNum_profesor(int num_profesor);
	void saveAsignatura(Asignatura asignatura);
	void deleteAsignatura(Asignatura asignatura);
}
