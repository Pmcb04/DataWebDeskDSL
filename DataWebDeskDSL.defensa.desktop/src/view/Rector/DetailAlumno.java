/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudAlumno
	Proyecto de la asignatura DMSS
*/

package view.Rector;

import util.Keyin;
import model.Alumno;
import roles.RectorMain;

public class DetailAlumno{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de detalles de " + "[ alumno ] " + " Rol " + "[ Rector ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
		
		Alumno alumno = new Alumno();
		alumno.random();
	
		System.out.println("Campos: ");
	
		System.out.println("nombre_alumno:");
		System.out.println(alumno.getNombre_alumno());
		System.out.println();
	
		System.out.println("evaluacion_continua:");
		System.out.println(alumno.getEvaluacion_continua());
		System.out.println();
	
		System.out.println("edad:");
		System.out.println(alumno.getEdad());
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
