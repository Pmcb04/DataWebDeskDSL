/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package dao;

import java.util.*;
import model.Profesor;


public class ProfesorDaoImpl implements ProfesorDao
{
	// list is working as a database
	private List<Profesor> profesors;

	//-------------------------------------------------------------------------------------
	// Metodo constructor de la clase Profesor
	//-------------------------------------------------------------------------------------	
	public ProfesorDaoImpl(){
		profesors = new ArrayList<Profesor>();
	}

	//-------------------------------------------------------------------------------------
	// Metodo getAll()
	//-------------------------------------------------------------------------------------
    @Override
    public List<Profesor> getAllProfesors() {
        return profesors;
    }

	//-------------------------------------------------------------------------------------
	// Metodo getProfesorByNombre_profesor()
	//-------------------------------------------------------------------------------------
	@Override
    public Profesor getProfesorByNombre_profesor(String nombre_profesor) {
        
		Profesor profesor = new Profesor();

		int i = 0;
		boolean enc = false;

		while(i < profesors.size() && !enc){
			if(profesors.get(i).getNombre_profesor().equals(nombre_profesor)){				profesor = profesors.get(i);
				enc = true;
			}
		}

		return profesor;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getProfesorByNum_profesor()
	//-------------------------------------------------------------------------------------
	@Override
    public Profesor getProfesorByNum_profesor(int num_profesor) {
        
		Profesor profesor = new Profesor();

		int i = 0;
		boolean enc = false;

		while(i < profesors.size() && !enc){
			if(profesors.get(i).getNum_profesor() == num_profesor){
				profesor = profesors.get(i);
				enc = true;
			}
		}

		return profesor;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getProfesorByNum_expediente()
	//-------------------------------------------------------------------------------------
	@Override
    public Profesor getProfesorByNum_expediente(int num_expediente) {
        
		Profesor profesor = new Profesor();

		int i = 0;
		boolean enc = false;

		while(i < profesors.size() && !enc){
			if(profesors.get(i).getNum_expediente() == num_expediente){
				profesor = profesors.get(i);
				enc = true;
			}
		}

		return profesor;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getProfesorByNombre_titulo()
	//-------------------------------------------------------------------------------------
	@Override
    public Profesor getProfesorByNombre_titulo(String nombre_titulo) {
        
		Profesor profesor = new Profesor();

		int i = 0;
		boolean enc = false;

		while(i < profesors.size() && !enc){
			if(profesors.get(i).getNombre_titulo().equals(nombre_titulo)){				profesor = profesors.get(i);
				enc = true;
			}
		}

		return profesor;
	}



	//-------------------------------------------------------------------------------------
	// Metodo save()
	//-------------------------------------------------------------------------------------
	@Override
    public void saveProfesor(Profesor profesor) {
        profesors.add(profesor);
    }

	//-------------------------------------------------------------------------------------
	// Metodo delete()
	//-------------------------------------------------------------------------------------
    @Override
    public void deleteProfesor(Profesor profesor) {
         profesors.remove(profesor);
    }
}
