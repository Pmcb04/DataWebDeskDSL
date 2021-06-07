/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : DeleteProfesor
	Proyecto de la asignatura DMSS
*/

package view.Administrador;

import util.Keyin;
import model.Profesor;
import roles.AdministradorMain;

public class DeleteProfesor{
	public static void screen(){

		System.out.println("\n\n\n\n");


		System.out.println("Pantalla de índice de " + "[ profesor ] " + " Rol " + "[ Administrador ]");
		
		
		
		
	
		System.out.println("Listado de : [Profesor]");
	
		System.out.println("0.Volver");
		System.out.println("1.Profesor 3476");
	
		int opcion = -1;
	
		while(opcion > 2 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");

		switch(opcion){
			case 0:
				AdministradorMain.screen();
			break;
			case 1:
				DeleteCheckProfesor.screen();
			break;
			default:
			break;
		}

 }
}
