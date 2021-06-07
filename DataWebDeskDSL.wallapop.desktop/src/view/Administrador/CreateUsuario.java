/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CreateUsuario
	Proyecto de la asignatura DMSS
*/

package view.Administrador;

import util.Keyin;
import model.Usuario;
import roles.AdministradorMain;

public class CreateUsuario{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de creación de " + "[ usuario ] " + " Rol " + "[ Administrador ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
		
		System.out.println("Introduzca la información correspondiente a los siguientes campos:");
	
		Usuario usuario = new  Usuario();
	
		System.out.println("identificador:");
		usuario.setIdentificador(Keyin.inInt(""));
		System.out.println("nombre:");
		usuario.setNombre(Keyin.inString());
	
				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
		System.out.println("1.Crear usuario");
				
		System.out.println();
		System.out.println("usuario introducido:");
		System.out.println(usuario.toString());
	
		int opcion = -1;
	
		while(opcion > 1 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");
		
		AdministradorMain.screen();

 }
}
