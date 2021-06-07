/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudAsignatura
	Proyecto de la asignatura DMSS
*/

package view.Director;

import util.Keyin;
import model.Asignatura;
import roles.DirectorMain;

public class DeleteAsignatura{
	public static void screen(){

		System.out.println("\n\n\n\n");


		System.out.println("Pantalla de índice de " + "[ asignatura ] " + " Rol " + "[ Director ]");
		
		System.out.println("Redes Sociales: ");
		System.out.println("Twitter " + "@" + "unex");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
	
		System.out.println("Listado de : [Asignatura]");
	
		System.out.println("0.Volver");
		System.out.println("1.Asignatura ");
	
		int opcion = -1;
	
		while(opcion > 2 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");

		switch(opcion){
			case 0:
				DirectorMain.screen();
			break;
			case 1:
				DeleteCheckAsignatura.screen();
			break;
			default:
			break;
		}

 }
}
