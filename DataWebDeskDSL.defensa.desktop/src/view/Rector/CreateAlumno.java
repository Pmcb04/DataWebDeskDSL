/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudAlumno
	Proyecto de la asignatura DMSS
*/

package view.Rector;

import util.Keyin;
import model.Alumno;
import roles.RectorMain;

public class CreateAlumno{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de creación de " + "[ alumno ] " + " Rol " + "[ Rector ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
		
		System.out.println("Introduzca la información correspondiente a los siguientes campos:");
	
		Alumno alumno = new  Alumno();
	
		System.out.println("nombre_alumno:");
		alumno.setNombre_alumno(Keyin.inString());
		System.out.println("evaluacion_continua:");
		alumno.setEvaluacion_continua(Keyin.inString());
		System.out.println("edad:");
		alumno.setEdad(Keyin.inInt(""));
	
				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
		System.out.println("1.Crear alumno");
				
		System.out.println();
		System.out.println("alumno introducido:");
		System.out.println(alumno.toString());
	
		int opcion = -1;
	
		while(opcion > 1 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");
		
		RectorMain.screen();

 }
}
