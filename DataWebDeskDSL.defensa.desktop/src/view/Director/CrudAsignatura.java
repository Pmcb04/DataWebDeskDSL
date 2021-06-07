/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudAsignatura
	Proyecto de la asignatura DMSS
*/

package view.Director;

import util.Keyin;
import roles.DirectorMain;

public class CrudAsignatura{
	public static void screen(){
     
		System.out.println("\n\n\n\n");


		System.out.println("Pantalla de índice de " + "[ asignatura ] " + " Rol " + "[ Director ]");
		
		System.out.println("Redes Sociales: ");
		System.out.println("Twitter " + "@" + "unex");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
	
		System.out.println("Listado de : [Asignatura]");
	
		System.out.println("0.Volver");
		System.out.println("1.Listar");
		System.out.println("2.Crear nuevo elemento");
		System.out.println("3.Borrar un elemento");

		int opcion = -1;
	
		while(opcion > 3 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-3] : ");
	
		switch(opcion){
			case 0:
				DirectorMain.screen();
			break;
			case 1:
				IndexAsignatura.screen();
			break;
			case 2:
				CreateAsignatura.screen();
			break;
			case 3:
				DeleteAsignatura.screen();
			break;
			default:
			break;
		}


	}
}
