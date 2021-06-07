/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : info_matricula
	Proyecto de la asignatura DMSS
*/

package view.Director;

import util.Keyin;
import roles.DirectorMain;

public class Info_matricula{
	public static void screen(){
     
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla " + "info_matricula"  + " Rol " + "["  + "Director" + "]" );

		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas Externas: ");
		
		
		System.out.println("Multimedias: ");
		

		int opcion = -1;
		
		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Pulse 0 para volver: ");
		
		DirectorMain.screen();
 }
}
