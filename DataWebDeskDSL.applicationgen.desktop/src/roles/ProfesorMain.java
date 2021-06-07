/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : ProfesorMain.java
	Proyecto de la asignatura DMSS
*/

package roles;

import util.*;
import view.Profesor.*;

public class ProfesorMain{
	public static void screen(){
		
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla principal del rol " + "[Profesor]");
		System.out.println("Listado de páginas a las que tiene acceso:");

		int opcion = 0;
		System.out.println("0.Volver");
		System.out.println(++opcion + "." + "[Alumno]" +  " Índice" );
		System.out.println(++opcion + "." + "[Alumno]" +  " Crear" );
		System.out.println(++opcion + "." + "[Título]" +  " CRUD" );
		System.out.println(++opcion + "." + "[Alumno]" +  " Detalles" );
		System.out.println(++opcion + "." + "[Profesor]" +  " Detalles" );
		System.out.println(++opcion + "." + "[Profesor]" +  " Índice" );
		System.out.println(++opcion + "." + "[Profesor]" +  " Crear" );
		System.out.println(++opcion + "." + "Unex" );

			
		opcion = -1;
		
		while(opcion > 8 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-8] : ");
		
		switch(opcion){
			case 0:
				Main.screen();
			break;
			case 1:
				IndexAlumno.screen();
			break;
			case 2:
				CreateAlumno.screen();
			break;
			case 3:
				CrudTítulo.screen();
			break;
			case 4:
				DetailAlumno.screen();
			break;
			case 5:
				DetailProfesor.screen();
			break;
			case 6:
				IndexProfesor.screen();
			break;
			case 7:
				CreateProfesor.screen();
			break;
			case 8:
			  Unex.screen();
			break;
			default:
			break;
		}
	}
}
