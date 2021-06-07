/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package dao;

import java.util.List;
import model.Titulo;

public interface TituloDao
{
	List<Titulo> getAllTitulos();
	Titulo getTituloByNombre_titulo(String nombre_titulo);
	Titulo getTituloByCreditos(int creditos);
	void saveTitulo(Titulo titulo);
	void deleteTitulo(Titulo titulo);
}
