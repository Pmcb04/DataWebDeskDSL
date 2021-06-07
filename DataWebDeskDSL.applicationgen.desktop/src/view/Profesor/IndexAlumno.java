/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : IndexAlumno
	Proyecto de la asignatura DMSS
*/

package view.Profesor;

import util.Keyin;
import roles.ProfesorMain;


public class IndexAlumno{
	public static void screen(){
		
    	System.out.println("\n\n\n\n");

		System.out.println("Pantalla de índice de " + "[ alumno ] " + " Rol " + "[ Profesor ]");
		
		System.out.println("Redes Sociales: ");
		System.out.println("Twitter " + "@" + "pmcb04");
		
		
		
		
	
		System.out.println("Listado de : [Alumno]");
	
		System.out.println("0.Volver");
		System.out.println("1.Alumno 9387");
	
		int opcion = -1;
	
		while(opcion >  1 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");

		switch(opcion){
			case 0:
				ProfesorMain.screen();
			break;
			case 1:
				DetailAlumno.screen();
			break;
			default:
			break;
		}

	}
}
	
