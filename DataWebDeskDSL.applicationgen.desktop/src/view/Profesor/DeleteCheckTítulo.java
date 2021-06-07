/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : DeleteCheckTítulo
	Proyecto de la asignatura DMSS
*/

package view.Profesor;

import util.Keyin;
import roles.ProfesorMain;

public class DeleteCheckTítulo{
	public static void screen(){
		
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de borrado de " + "[ título ] " + " Rol " + "[ Profesor ]");
		
		
		
		
	
		System.out.println("La entidad Título con identificación nombre_titulo  =  Ingenieria Informatica se eliminó satisfactoriamente.");
	

		int opcion = -1;

		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Pulse 0 para volver.");

		DeleteTítulo.screen();

 }
}
