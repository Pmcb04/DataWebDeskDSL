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
	// Metodo getAlumnoByNombre_alumno()
	//-------------------------------------------------------------------------------------
	@Override
    public Alumno getAlumnoByNombre_alumno(String nombre_alumno) {
        
		Alumno alumno = new Alumno();

		int i = 0;
		boolean enc = false;

		while(i < alumnos.size() && !enc){
			if(alumnos.get(i).getNombre_alumno().equals(nombre_alumno)){				alumno = alumnos.get(i);
				enc = true;
			}
		}

		return alumno;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getAlumnoByEvaluacion_continua()
	//-------------------------------------------------------------------------------------
	@Override
    public Alumno getAlumnoByEvaluacion_continua(String evaluacion_continua) {
        
		Alumno alumno = new Alumno();

		int i = 0;
		boolean enc = false;

		while(i < alumnos.size() && !enc){
			if(alumnos.get(i).getEvaluacion_continua().equals(evaluacion_continua)){				alumno = alumnos.get(i);
				enc = true;
			}
		}

		return alumno;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getAlumnoByEdad()
	//-------------------------------------------------------------------------------------
	@Override
    public Alumno getAlumnoByEdad(int edad) {
        
		Alumno alumno = new Alumno();

		int i = 0;
		boolean enc = false;

		while(i < alumnos.size() && !enc){
			if(alumnos.get(i).getEdad() == edad){
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
