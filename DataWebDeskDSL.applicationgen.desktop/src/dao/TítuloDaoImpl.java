/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package dao;

import java.util.*;
import model.Título;


public class TítuloDaoImpl implements TítuloDao
{
	// list is working as a database
	private List<Título> títulos;

	//-------------------------------------------------------------------------------------
	// Metodo constructor de la clase Título
	//-------------------------------------------------------------------------------------	
	public TítuloDaoImpl(){
		títulos = new ArrayList<Título>();
	}

	//-------------------------------------------------------------------------------------
	// Metodo getAll()
	//-------------------------------------------------------------------------------------
    @Override
    public List<Título> getAllTítulos() {
        return títulos;
    }

	//-------------------------------------------------------------------------------------
	// Metodo getTítuloByNombre_titulo()
	//-------------------------------------------------------------------------------------
	@Override
    public Título getTítuloByNombre_titulo(String nombre_titulo) {
        
		Título título = new Título();

		int i = 0;
		boolean enc = false;

		while(i < títulos.size() && !enc){
			if(títulos.get(i).getNombre_titulo().equals(nombre_titulo)){				título = títulos.get(i);
				enc = true;
			}
		}

		return título;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getTítuloByNum_creditos()
	//-------------------------------------------------------------------------------------
	@Override
    public Título getTítuloByNum_creditos(int num_creditos) {
        
		Título título = new Título();

		int i = 0;
		boolean enc = false;

		while(i < títulos.size() && !enc){
			if(títulos.get(i).getNum_creditos() == num_creditos){
				título = títulos.get(i);
				enc = true;
			}
		}

		return título;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getTítuloByEspecialidad()
	//-------------------------------------------------------------------------------------
	@Override
    public Título getTítuloByEspecialidad(String especialidad) {
        
		Título título = new Título();

		int i = 0;
		boolean enc = false;

		while(i < títulos.size() && !enc){
			if(títulos.get(i).getEspecialidad().equals(especialidad)){				título = títulos.get(i);
				enc = true;
			}
		}

		return título;
	}



	//-------------------------------------------------------------------------------------
	// Metodo save()
	//-------------------------------------------------------------------------------------
	@Override
    public void saveTítulo(Título título) {
        títulos.add(título);
    }

	//-------------------------------------------------------------------------------------
	// Metodo delete()
	//-------------------------------------------------------------------------------------
    @Override
    public void deleteTítulo(Título título) {
         títulos.remove(título);
    }
}
