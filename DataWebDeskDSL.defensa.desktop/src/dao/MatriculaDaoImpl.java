/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package dao;

import java.util.*;
import model.Matricula;


public class MatriculaDaoImpl implements MatriculaDao
{
	// list is working as a database
	private List<Matricula> matriculas;

	//-------------------------------------------------------------------------------------
	// Metodo constructor de la clase Matricula
	//-------------------------------------------------------------------------------------	
	public MatriculaDaoImpl(){
		matriculas = new ArrayList<Matricula>();
	}

	//-------------------------------------------------------------------------------------
	// Metodo getAll()
	//-------------------------------------------------------------------------------------
    @Override
    public List<Matricula> getAllMatriculas() {
        return matriculas;
    }

	//-------------------------------------------------------------------------------------
	// Metodo getMatriculaByNombre_matricula()
	//-------------------------------------------------------------------------------------
	@Override
    public Matricula getMatriculaByNombre_matricula(String nombre_matricula) {
        
		Matricula matricula = new Matricula();

		int i = 0;
		boolean enc = false;

		while(i < matriculas.size() && !enc){
			if(matriculas.get(i).getNombre_matricula().equals(nombre_matricula)){				matricula = matriculas.get(i);
				enc = true;
			}
		}

		return matricula;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getMatriculaByNombre_asignatura()
	//-------------------------------------------------------------------------------------
	@Override
    public Matricula getMatriculaByNombre_asignatura(String nombre_asignatura) {
        
		Matricula matricula = new Matricula();

		int i = 0;
		boolean enc = false;

		while(i < matriculas.size() && !enc){
			if(matriculas.get(i).getNombre_asignatura().equals(nombre_asignatura)){				matricula = matriculas.get(i);
				enc = true;
			}
		}

		return matricula;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getMatriculaByNombre_alumno()
	//-------------------------------------------------------------------------------------
	@Override
    public Matricula getMatriculaByNombre_alumno(String nombre_alumno) {
        
		Matricula matricula = new Matricula();

		int i = 0;
		boolean enc = false;

		while(i < matriculas.size() && !enc){
			if(matriculas.get(i).getNombre_alumno().equals(nombre_alumno)){				matricula = matriculas.get(i);
				enc = true;
			}
		}

		return matricula;
	}



	//-------------------------------------------------------------------------------------
	// Metodo save()
	//-------------------------------------------------------------------------------------
	@Override
    public void saveMatricula(Matricula matricula) {
        matriculas.add(matricula);
    }

	//-------------------------------------------------------------------------------------
	// Metodo delete()
	//-------------------------------------------------------------------------------------
    @Override
    public void deleteMatricula(Matricula matricula) {
         matriculas.remove(matricula);
    }
}
