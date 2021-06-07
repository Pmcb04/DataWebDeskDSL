/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : DeleteCheckProfesor
	Proyecto de la asignatura DMSS
*/

package view.Administrador;

import util.Keyin;
import roles.AdministradorMain;

public class DeleteCheckProfesor{
	public static void screen(){
		
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de borrado de " + "[ profesor ] " + " Rol " + "[ Administrador ]");
		
		
		
		
	
		System.out.println("La entidad Profesor con identificación num_profesor  =  3476 se eliminó satisfactoriamente.");
	

		int opcion = -1;

		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Pulse 0 para volver.");

		DeleteProfesor.screen();

 }
}
