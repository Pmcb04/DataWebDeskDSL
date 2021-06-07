/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : DeleteCheckAlumno
	Proyecto de la asignatura DMSS
*/

package view.Rector;

import util.Keyin;
import roles.RectorMain;

public class DeleteCheckAlumno{
	public static void screen(){
		
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de borrado de " + "[ alumno ] " + " Rol " + "[ Rector ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
	
		System.out.println("La entidad Alumno con identificación nombre_alumno  =   se eliminó satisfactoriamente.");
	

		int opcion = -1;

		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Pulse 0 para volver.");

		DeleteAlumno.screen();

 }
}
