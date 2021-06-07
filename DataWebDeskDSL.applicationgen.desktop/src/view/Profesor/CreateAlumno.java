/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CreateAlumno
	Proyecto de la asignatura DMSS
*/

package view.Profesor;

import util.Keyin;
import model.Alumno;
import roles.ProfesorMain;

public class CreateAlumno{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de creación de " + "[ alumno ] " + " Rol " + "[ Profesor ]");
		
		
		System.out.println("Paginas externas: ");
		System.out.println("[Google] " + "url : " + "https://www.google.es");
		
		
		
		
		System.out.println("Introduzca la información correspondiente a los siguientes campos:");
	
		Alumno alumno = new  Alumno();
	
		System.out.println("nombre:");
		
		String [] nombre = Keyin.inString().split(" ");
		String[] nombreString = new String[nombre.length];
	
		for (int i = 0; i < nombre.length; i++) {
			nombreString[i] = nombre[i];
		}
	
		System.out.println("num_expediente:");
		alumno.setNum_expediente(Keyin.inInt(""));
	
				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
		System.out.println("1.Crear alumno");
				
		System.out.println();
		System.out.println("alumno introducido:");
		System.out.println(alumno.toString());
	
		int opcion = -1;
	
		while(opcion > 1 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");
		
		ProfesorMain.screen();

 }
}
