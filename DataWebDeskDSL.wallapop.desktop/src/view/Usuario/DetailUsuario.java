/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : DetailUsuario
	Proyecto de la asignatura DMSS
*/

package view.Usuario;

import util.Keyin;
import model.Usuario;
import roles.UsuarioMain;

public class DetailUsuario{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de detalles de " + "[ usuario ] " + " Rol " + "[ Usuario ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
		
		Usuario usuario = new Usuario();
		usuario.random();
	
		System.out.println("Campos: ");
	
		System.out.println("identificador:");
		System.out.println(usuario.getIdentificador());
		System.out.println();
	
		System.out.println("nombre:");
		System.out.println(usuario.getNombre());
		System.out.println();
	

				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
	
		int opcion = -1;
	
		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-0] : ");
	
		switch(opcion){
			case 0:
				UsuarioMain.screen();
			break;
			default:
			break;
		}
 }
}
