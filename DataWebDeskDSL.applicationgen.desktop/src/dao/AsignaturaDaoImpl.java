/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package dao;

import java.util.*;
import model.Asignatura;


public class AsignaturaDaoImpl implements AsignaturaDao
{
	// list is working as a database
	private List<Asignatura> asignaturas;

	//-------------------------------------------------------------------------------------
	// Metodo constructor de la clase Asignatura
	//-------------------------------------------------------------------------------------	
	public AsignaturaDaoImpl(){
		asignaturas = new ArrayList<Asignatura>();
	}

	//-------------------------------------------------------------------------------------
	// Metodo getAll()
	//-------------------------------------------------------------------------------------
    @Override
    public List<Asignatura> getAllAsignaturas() {
        return asignaturas;
    }

	//-------------------------------------------------------------------------------------
	// Metodo getAsignaturaByNum_asignatura()
	//-------------------------------------------------------------------------------------
	@Override
    public Asignatura getAsignaturaByNum_asignatura(int num_asignatura) {
        
		Asignatura asignatura = new Asignatura();

		int i = 0;
		boolean enc = false;

		while(i < asignaturas.size() && !enc){
			if(asignaturas.get(i).getNum_asignatura() == num_asignatura){
				asignatura = asignaturas.get(i);
				enc = true;
			}
		}

		return asignatura;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getAsignaturaByNombre_asignatura()
	//-------------------------------------------------------------------------------------
	@Override
    public Asignatura getAsignaturaByNombre_asignatura(String nombre_asignatura) {
        
		Asignatura asignatura = new Asignatura();

		int i = 0;
		boolean enc = false;

		while(i < asignaturas.size() && !enc){
			if(asignaturas.get(i).getNombre_asignatura().equals(nombre_asignatura)){				asignatura = asignaturas.get(i);
				enc = true;
			}
		}

		return asignatura;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getAsignaturaByNum_profesor()
	//-------------------------------------------------------------------------------------
	@Override
    public Asignatura getAsignaturaByNum_profesor(int num_profesor) {
        
		Asignatura asignatura = new Asignatura();

		int i = 0;
		boolean enc = false;

		while(i < asignaturas.size() && !enc){
			if(asignaturas.get(i).getNum_profesor() == num_profesor){
				asignatura = asignaturas.get(i);
				enc = true;
			}
		}

		return asignatura;
	}



	//-------------------------------------------------------------------------------------
	// Metodo save()
	//-------------------------------------------------------------------------------------
	@Override
    public void saveAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

	//-------------------------------------------------------------------------------------
	// Metodo delete()
	//-------------------------------------------------------------------------------------
    @Override
    public void deleteAsignatura(Asignatura asignatura) {
         asignaturas.remove(asignatura);
    }
}
