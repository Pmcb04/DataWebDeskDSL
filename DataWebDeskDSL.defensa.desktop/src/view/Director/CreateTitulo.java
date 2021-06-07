/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CreateTitulo
	Proyecto de la asignatura DMSS
*/

package view.Director;

import util.Keyin;
import model.Titulo;
import roles.DirectorMain;

public class CreateTitulo{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de creación de " + "[ titulo ] " + " Rol " + "[ Director ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
		
		System.out.println("Introduzca la información correspondiente a los siguientes campos:");
	
		Titulo titulo = new  Titulo();
	
		System.out.println("nombre_titulo:");
		titulo.setNombre_titulo(Keyin.inString());
		System.out.println("creditos:");
		titulo.setCreditos(Keyin.inInt(""));
	
				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
		System.out.println("1.Crear titulo");
				
		System.out.println();
		System.out.println("titulo introducido:");
		System.out.println(titulo.toString());
	
		int opcion = -1;
	
		while(opcion > 1 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");
		
		DirectorMain.screen();

 }
}
