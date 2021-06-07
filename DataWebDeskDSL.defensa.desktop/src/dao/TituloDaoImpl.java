/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package dao;

import java.util.*;
import model.Titulo;


public class TituloDaoImpl implements TituloDao
{
	// list is working as a database
	private List<Titulo> titulos;

	//-------------------------------------------------------------------------------------
	// Metodo constructor de la clase Titulo
	//-------------------------------------------------------------------------------------	
	public TituloDaoImpl(){
		titulos = new ArrayList<Titulo>();
	}

	//-------------------------------------------------------------------------------------
	// Metodo getAll()
	//-------------------------------------------------------------------------------------
    @Override
    public List<Titulo> getAllTitulos() {
        return titulos;
    }

	//-------------------------------------------------------------------------------------
	// Metodo getTituloByNombre_titulo()
	//-------------------------------------------------------------------------------------
	@Override
    public Titulo getTituloByNombre_titulo(String nombre_titulo) {
        
		Titulo titulo = new Titulo();

		int i = 0;
		boolean enc = false;

		while(i < titulos.size() && !enc){
			if(titulos.get(i).getNombre_titulo().equals(nombre_titulo)){				titulo = titulos.get(i);
				enc = true;
			}
		}

		return titulo;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getTituloByCreditos()
	//-------------------------------------------------------------------------------------
	@Override
    public Titulo getTituloByCreditos(int creditos) {
        
		Titulo titulo = new Titulo();

		int i = 0;
		boolean enc = false;

		while(i < titulos.size() && !enc){
			if(titulos.get(i).getCreditos() == creditos){
				titulo = titulos.get(i);
				enc = true;
			}
		}

		return titulo;
	}



	//-------------------------------------------------------------------------------------
	// Metodo save()
	//-------------------------------------------------------------------------------------
	@Override
    public void saveTitulo(Titulo titulo) {
        titulos.add(titulo);
    }

	//-------------------------------------------------------------------------------------
	// Metodo delete()
	//-------------------------------------------------------------------------------------
    @Override
    public void deleteTitulo(Titulo titulo) {
         titulos.remove(titulo);
    }
}
