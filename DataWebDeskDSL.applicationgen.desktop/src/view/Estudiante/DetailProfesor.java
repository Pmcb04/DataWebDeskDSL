/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : DetailProfesor
	Proyecto de la asignatura DMSS
*/

package view.Estudiante;

import util.Keyin;
import model.Profesor;
import roles.EstudianteMain;

public class DetailProfesor{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de detalles de " + "[ profesor ] " + " Rol " + "[ Estudiante ]");
		
		
		
		
		
		Profesor profesor = new Profesor();
		profesor.random();
	
		System.out.println("Campos: ");
	
		System.out.println("nombre_profesor:");
		System.out.println(profesor.getNombre_profesor());
		System.out.println();
	
		System.out.println("num_profesor:");
		System.out.println(profesor.getNum_profesor());
		System.out.println();
	

				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
	
		int opcion = -1;
	
		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-0] : ");
	
		switch(opcion){
			case 0:
				EstudianteMain.screen();
			break;
			default:
			break;
		}
 }
}
