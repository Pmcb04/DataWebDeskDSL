/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package dao;

import java.util.*;
import model.Alumno;


public class AlumnoDaoImpl implements AlumnoDao
{
	// list is working as a database
	private List<Alumno> alumnos;

	//-------------------------------------------------------------------------------------
	// Metodo constructor de la clase Alumno
	//-------------------------------------------------------------------------------------	
	public AlumnoDaoImpl(){
		alumnos = new ArrayList<Alumno>();
	}

	//-------------------------------------------------------------------------------------
	// Metodo getAll()
	//-------------------------------------------------------------------------------------
    @Override
    public List<Alumno> getAllAlumnos() {
        return alumnos;
    }

	//-------------------------------------------------------------------------------------
	// Metodo getAlumnoByNombre()
	//-------------------------------------------------------------------------------------
	@Override
    public Alumno getAlumnoByNombre(String nombre) {
        
		Alumno alumno = new Alumno();

		int i = 0;
		boolean enc = false;

		while(i < alumnos.size() && !enc){
			if(alumnos.get(i).getNombre().equals(nombre)){				
				alumno = alumnos.get(i);
				enc = true;
			}
		}

		return alumno;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getAlumnoByNum_expediente()
	//-------------------------------------------------------------------------------------
	@Override
    public Alumno getAlumnoByNum_expediente(int num_expediente) {
        
		Alumno alumno = new Alumno();

		int i = 0;
		boolean enc = false;

		while(i < alumnos.size() && !enc){
			if(alumnos.get(i).getNum_expediente() == num_expediente){
				alumno = alumnos.get(i);
				enc = true;
			}
		}

		return alumno;
	}



	//-------------------------------------------------------------------------------------
	// Metodo save()
	//-------------------------------------------------------------------------------------
	@Override
    public void saveAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

	//-------------------------------------------------------------------------------------
	// Metodo delete()
	//-------------------------------------------------------------------------------------
    @Override
    public void deleteAlumno(Alumno alumno) {
         alumnos.remove(alumno);
    }
}
