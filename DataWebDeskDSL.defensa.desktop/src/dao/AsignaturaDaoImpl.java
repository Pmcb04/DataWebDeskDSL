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
	// Metodo getAsignaturaBySemestre()
	//-------------------------------------------------------------------------------------
	@Override
    public Asignatura getAsignaturaBySemestre(int semestre) {
        
		Asignatura asignatura = new Asignatura();

		int i = 0;
		boolean enc = false;

		while(i < asignaturas.size() && !enc){
			if(asignaturas.get(i).getSemestre() == semestre){
				asignatura = asignaturas.get(i);
				enc = true;
			}
		}

		return asignatura;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getAsignaturaByObligatoria()
	//-------------------------------------------------------------------------------------
	@Override
    public Asignatura getAsignaturaByObligatoria(String obligatoria) {
        
		Asignatura asignatura = new Asignatura();

		int i = 0;
		boolean enc = false;

		while(i < asignaturas.size() && !enc){
			if(asignaturas.get(i).getObligatoria().equals(obligatoria)){				asignatura = asignaturas.get(i);
				enc = true;
			}
		}

		return asignatura;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getAsignaturaByNombre_titulo()
	//-------------------------------------------------------------------------------------
	@Override
    public Asignatura getAsignaturaByNombre_titulo(String nombre_titulo) {
        
		Asignatura asignatura = new Asignatura();

		int i = 0;
		boolean enc = false;

		while(i < asignaturas.size() && !enc){
			if(asignaturas.get(i).getNombre_titulo().equals(nombre_titulo)){				asignatura = asignaturas.get(i);
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
