/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package dao;

import java.util.*;
import model.Usuario;


public class UsuarioDaoImpl implements UsuarioDao
{
	// list is working as a database
	private List<Usuario> usuarios;

	//-------------------------------------------------------------------------------------
	// Metodo constructor de la clase Usuario
	//-------------------------------------------------------------------------------------	
	public UsuarioDaoImpl(){
		usuarios = new ArrayList<Usuario>();
	}

	//-------------------------------------------------------------------------------------
	// Metodo getAll()
	//-------------------------------------------------------------------------------------
    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarios;
    }

	//-------------------------------------------------------------------------------------
	// Metodo getUsuarioByIdentificador()
	//-------------------------------------------------------------------------------------
	@Override
    public Usuario getUsuarioByIdentificador(int identificador) {
        
		Usuario usuario = new Usuario();

		int i = 0;
		boolean enc = false;

		while(i < usuarios.size() && !enc){
			if(usuarios.get(i).getIdentificador() == identificador){
				usuario = usuarios.get(i);
				enc = true;
			}
		}

		return usuario;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getUsuarioByNombre()
	//-------------------------------------------------------------------------------------
	@Override
    public Usuario getUsuarioByNombre(String nombre) {
        
		Usuario usuario = new Usuario();

		int i = 0;
		boolean enc = false;

		while(i < usuarios.size() && !enc){
			if(usuarios.get(i).getNombre().equals(nombre)){				usuario = usuarios.get(i);
				enc = true;
			}
		}

		return usuario;
	}



	//-------------------------------------------------------------------------------------
	// Metodo save()
	//-------------------------------------------------------------------------------------
	@Override
    public void saveUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

	//-------------------------------------------------------------------------------------
	// Metodo delete()
	//-------------------------------------------------------------------------------------
    @Override
    public void deleteUsuario(Usuario usuario) {
         usuarios.remove(usuario);
    }
}
