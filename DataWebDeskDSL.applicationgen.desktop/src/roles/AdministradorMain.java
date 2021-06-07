/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : AdministradorMain.java
	Proyecto de la asignatura DMSS
*/

package roles;

import util.*;
import view.Administrador.*;

public class AdministradorMain{
	public static void screen(){
		
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla principal del rol " + "[Administrador]");
		System.out.println("Listado de páginas a las que tiene acceso:");

		int opcion = 0;
		System.out.println("0.Volver");
		System.out.println(++opcion + "." + "[Asignatura]" +  " Detalles" );
		System.out.println(++opcion + "." + "[Asignatura]" +  " Índice" );
		System.out.println(++opcion + "." + "[Asignatura]" +  " Crear" );
		System.out.println(++opcion + "." + "[Asignatura]" +  " Borrar" );
		System.out.println(++opcion + "." + "[Profesor]" +  " Detalles" );
		System.out.println(++opcion + "." + "[Profesor]" +  " Borrar" );
		System.out.println(++opcion + "." + "Unex" );

			
		opcion = -1;
		
		while(opcion > 7 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-7] : ");
		
		switch(opcion){
			case 0:
				Main.screen();
			break;
			case 1:
				DetailAsignatura.screen();
			break;
			case 2:
				IndexAsignatura.screen();
			break;
			case 3:
				CreateAsignatura.screen();
			break;
			case 4:
				DeleteAsignatura.screen();
			break;
			case 5:
				DetailProfesor.screen();
			break;
			case 6:
				DeleteProfesor.screen();
			break;
			case 7:
			  Unex.screen();
			break;
			default:
			break;
		}
	}
}
