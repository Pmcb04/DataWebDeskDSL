/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : DetailAlumno
	Proyecto de la asignatura DMSS
*/

package view.Estudiante;

import util.Keyin;
import model.Alumno;
import roles.EstudianteMain;

public class DetailAlumno{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de detalles de " + "[ alumno ] " + " Rol " + "[ Estudiante ]");
		
		
		
		
		
		Alumno alumno = new Alumno();
		alumno.random();
	
		System.out.println("Campos: ");
	
		System.out.println("nombre:");
		System.out.println(alumno.getNombre());
		System.out.println();
	
		System.out.println("num_expediente:");
		System.out.println(alumno.getNum_expediente());
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
