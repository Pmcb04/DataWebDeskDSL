/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudMatricula
	Proyecto de la asignatura DMSS
*/

package view.Rector;

import util.Keyin;
import roles.RectorMain;

public class CrudMatricula{
	public static void screen(){
     
		System.out.println("\n\n\n\n");


		System.out.println("Pantalla de índice de " + "[ matricula ] " + " Rol " + "[ Rector ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		System.out.println("[Unex] " + "url : " + "http://www.unex.es");
		
		
		System.out.println("Multimedias: ");
		
		
	
		System.out.println("Listado de : [Matricula]");
	
		System.out.println("0.Volver");
		System.out.println("1.Listar");
		System.out.println("2.Crear nuevo elemento");
		System.out.println("3.Borrar un elemento");

		int opcion = -1;
	
		while(opcion > 3 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-3] : ");
	
		switch(opcion){
			case 0:
				RectorMain.screen();
			break;
			case 1:
				IndexMatricula.screen();
			break;
			case 2:
				CreateMatricula.screen();
			break;
			case 3:
				DeleteMatricula.screen();
			break;
			default:
			break;
		}


	}
}
