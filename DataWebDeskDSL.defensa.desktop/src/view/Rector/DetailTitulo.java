/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : DetailTitulo
	Proyecto de la asignatura DMSS
*/

package view.Rector;

import util.Keyin;
import model.Titulo;
import roles.RectorMain;

public class DetailTitulo{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de detalles de " + "[ titulo ] " + " Rol " + "[ Rector ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
		
		Titulo titulo = new Titulo();
		titulo.random();
	
		System.out.println("Campos: ");
	
		System.out.println("nombre_titulo:");
		System.out.println(titulo.getNombre_titulo());
		System.out.println();
	
		System.out.println("creditos:");
		System.out.println(titulo.getCreditos());
		System.out.println();
	

				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
	
		int opcion = -1;
	
		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-0] : ");
	
		switch(opcion){
			case 0:
				RectorMain.screen();
			break;
			default:
			break;
		}
 }
}
