/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : DeleteTitulo
	Proyecto de la asignatura DMSS
*/

package view.Rector;

import util.Keyin;
import model.Titulo;
import roles.RectorMain;

public class DeleteTitulo{
	public static void screen(){

		System.out.println("\n\n\n\n");


		System.out.println("Pantalla de índice de " + "[ titulo ] " + " Rol " + "[ Rector ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
	
		System.out.println("Listado de : [Titulo]");
	
		System.out.println("0.Volver");
		System.out.println("1.Titulo ");
	
		int opcion = -1;
	
		while(opcion > 2 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");

		switch(opcion){
			case 0:
				RectorMain.screen();
			break;
			case 1:
				DeleteCheckTitulo.screen();
			break;
			default:
			break;
		}

 }
}
