/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : DeleteCheckTitulo
	Proyecto de la asignatura DMSS
*/

package view.Director;

import util.Keyin;
import roles.DirectorMain;

public class DeleteCheckTitulo{
	public static void screen(){
		
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de borrado de " + "[ titulo ] " + " Rol " + "[ Director ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
	
		System.out.println("La entidad Titulo con identificación nombre_titulo  =   se eliminó satisfactoriamente.");
	

		int opcion = -1;

		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Pulse 0 para volver.");

		DeleteTitulo.screen();

 }
}
