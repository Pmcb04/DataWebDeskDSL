/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : DeleteCheckMatricula
	Proyecto de la asignatura DMSS
*/

package view.Rector;

import util.Keyin;
import roles.RectorMain;

public class DeleteCheckMatricula{
	public static void screen(){
		
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de borrado de " + "[ matricula ] " + " Rol " + "[ Rector ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		System.out.println("[Unex] " + "url : " + "http://www.unex.es");
		
		
		System.out.println("Multimedias: ");
		
		
	
		System.out.println("La entidad Matricula con identificación nombre_matricula  =   se eliminó satisfactoriamente.");
	
		System.out.println("Nota: No se eliminaron los datos correspondiente a las referencias de la Matricula :");
		System.out.println("id_Asignatura: nombre_asignatura:");
		System.out.println("id_Alumno: nombre_alumno:");

		int opcion = -1;

		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Pulse 0 para volver.");

		DeleteMatricula.screen();

 }
}
