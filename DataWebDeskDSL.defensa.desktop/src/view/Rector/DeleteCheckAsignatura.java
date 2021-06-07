/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : DeleteCheckAsignatura
	Proyecto de la asignatura DMSS
*/

package view.Rector;

import util.Keyin;
import roles.RectorMain;

public class DeleteCheckAsignatura{
	public static void screen(){
		
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de borrado de " + "[ asignatura ] " + " Rol " + "[ Rector ]");
		
		System.out.println("Redes Sociales: ");
		System.out.println("Twitter " + "@" + "unex");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
	
		System.out.println("La entidad Asignatura con identificación nombre_asignatura  =   se eliminó satisfactoriamente.");
	
		System.out.println("Nota: No se eliminaron los datos correspondiente a las referencias de la Asignatura :");
		System.out.println("id_Titulo: nombre_titulo:");

		int opcion = -1;

		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Pulse 0 para volver.");

		DeleteAsignatura.screen();

 }
}
