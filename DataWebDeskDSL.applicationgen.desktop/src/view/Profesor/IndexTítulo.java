/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudTítulo
	Proyecto de la asignatura DMSS
*/

package view.Profesor;

import util.Keyin;
import roles.ProfesorMain;


public class IndexTítulo{
	public static void screen(){
		
    	System.out.println("\n\n\n\n");

		System.out.println("Pantalla de índice de " + "[ título ] " + " Rol " + "[ Profesor ]");
		
		
		
		
	
		System.out.println("Listado de : [Título]");
	
		System.out.println("0.Volver");
		System.out.println("1.Título Ingenieria Informatica");
	
		int opcion = -1;
	
		while(opcion >  1 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");

		switch(opcion){
			case 0:
				ProfesorMain.screen();
			break;
			case 1:
				DetailTítulo.screen();
			break;
			default:
			break;
		}

	}
}
	
