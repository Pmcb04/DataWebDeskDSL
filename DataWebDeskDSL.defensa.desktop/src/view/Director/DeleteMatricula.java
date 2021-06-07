/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudMatricula
	Proyecto de la asignatura DMSS
*/

package view.Director;

import util.Keyin;
import model.Matricula;
import roles.DirectorMain;

public class DeleteMatricula{
	public static void screen(){

		System.out.println("\n\n\n\n");


		System.out.println("Pantalla de índice de " + "[ matricula ] " + " Rol " + "[ Director ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		System.out.println("[Unex] " + "url : " + "http://www.unex.es");
		
		
		System.out.println("Multimedias: ");
		
		
	
		System.out.println("Listado de : [Matricula]");
	
		System.out.println("0.Volver");
		System.out.println("1.Matricula ");
	
		int opcion = -1;
	
		while(opcion > 2 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");

		switch(opcion){
			case 0:
				DirectorMain.screen();
			break;
			case 1:
				DeleteCheckMatricula.screen();
			break;
			default:
			break;
		}

 }
}
