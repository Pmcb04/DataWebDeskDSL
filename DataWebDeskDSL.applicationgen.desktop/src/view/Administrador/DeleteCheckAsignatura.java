/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : DeleteCheckAsignatura
	Proyecto de la asignatura DMSS
*/

package view.Administrador;

import util.Keyin;
import roles.AdministradorMain;

public class DeleteCheckAsignatura{
	public static void screen(){
		
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de borrado de " + "[ asignatura ] " + " Rol " + "[ Administrador ]");
		
		
		
		
	
		System.out.println("La entidad Asignatura con identificación num_asignatura  =  84334 se eliminó satisfactoriamente.");
	
		System.out.println("Nota: No se eliminaron los datos correspondiente a las referencias de la Asignatura :");
		System.out.println("id_Profesor: num_profesor:");

		int opcion = -1;

		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Pulse 0 para volver.");

		DeleteAsignatura.screen();

 }
}
