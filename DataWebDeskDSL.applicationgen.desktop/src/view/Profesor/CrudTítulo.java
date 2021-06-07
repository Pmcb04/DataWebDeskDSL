/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudTítulo
	Proyecto de la asignatura DMSS
*/

package view.Profesor;

import util.Keyin;
import roles.ProfesorMain;

public class CrudTítulo{
	public static void screen(){
     
		System.out.println("\n\n\n\n");


		System.out.println("Pantalla de índice de " + "[ título ] " + " Rol " + "[ Profesor ]");
		
		
		
		
	
		System.out.println("Listado de : [Título]");
	
		System.out.println("0.Volver");
		System.out.println("1.Listar");
		System.out.println("2.Crear nuevo elemento");
		System.out.println("3.Borrar un elemento");

		int opcion = -1;
	
		while(opcion > 3 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-3] : ");
	
		switch(opcion){
			case 0:
				ProfesorMain.screen();
			break;
			case 1:
				IndexTítulo.screen();
			break;
			case 2:
				CreateTítulo.screen();
			break;
			case 3:
				DeleteTítulo.screen();
			break;
			default:
			break;
		}


	}
}
