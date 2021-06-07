/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CreateProfesor
	Proyecto de la asignatura DMSS
*/

package view.Profesor;

import util.Keyin;
import model.Profesor;
import roles.ProfesorMain;

public class CreateProfesor{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de creación de " + "[ profesor ] " + " Rol " + "[ Profesor ]");
		
		
		
		
		
		System.out.println("Introduzca la información correspondiente a los siguientes campos:");
	
		Profesor profesor = new  Profesor();
	
		System.out.println("nombre_profesor:");
		profesor.setNombre_profesor(Keyin.inString());
		System.out.println("num_profesor:");
		profesor.setNum_profesor(Keyin.inInt(""));
	
				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
		System.out.println("1.Crear profesor");
				
		System.out.println();
		System.out.println("profesor introducido:");
		System.out.println(profesor.toString());
	
		int opcion = -1;
	
		while(opcion > 1 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");
		
		ProfesorMain.screen();

 }
}
