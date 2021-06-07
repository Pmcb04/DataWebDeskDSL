/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : AlumnoMain.java
	Proyecto de la asignatura DMSS
*/

package roles;

import util.*;
import view.Alumno.*;

public class AlumnoMain{
	public static void screen(){
		
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla principal del rol " + "[Alumno]");
		System.out.println("Listado de páginas a las que tiene acceso:");

		int opcion = 0;
		System.out.println("0.Volver");
		System.out.println(++opcion + "." + "[Asignatura]" +  " CRUD" );
		System.out.println(++opcion + "." + "info_matricula" );

			
		opcion = -1;
		
		while(opcion > 2 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-2] : ");
		
		switch(opcion){
			case 0:
				Main.screen();
			break;
			case 1:
				CrudAsignatura.screen();
			break;
			case 2:
			  Info_matricula.screen();
			break;
			default:
			break;
		}
	}
}
