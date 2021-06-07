/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : DetailAsignatura
	Proyecto de la asignatura DMSS
*/

package view.Estudiante;

import util.Keyin;
import model.Asignatura;
import roles.EstudianteMain;

public class DetailAsignatura{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de detalles de " + "[ asignatura ] " + " Rol " + "[ Estudiante ]");
		
		
		
		
		
		Asignatura asignatura = new Asignatura();
		asignatura.random();
	
		System.out.println("Campos: ");
	
		System.out.println("num_asignatura:");
		System.out.println(asignatura.getNum_asignatura());
		System.out.println();
	
		System.out.println("nombre_asignatura:");
		System.out.println(asignatura.getNombre_asignatura());
		System.out.println();
	

		System.out.println("id_num_profesor:");
		System.out.println(asignatura.getNum_profesor());
		System.out.println();
	
				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
		System.out.println("1.Consultar detalles de Profesor 3476");
	
		int opcion = -1;
	
		while(opcion > 1 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");
	
		switch(opcion){
			case 0:
				EstudianteMain.screen();
			break;
			case 1:
				DetailProfesor.screen();
			break;
			default:
			break;
		}
 }
}
