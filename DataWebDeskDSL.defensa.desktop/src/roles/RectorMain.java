/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : RectorMain.java
	Proyecto de la asignatura DMSS
*/

package roles;

import util.*;
import view.Rector.*;

public class RectorMain{
	public static void screen(){
		
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla principal del rol " + "[Rector]");
		System.out.println("Listado de páginas a las que tiene acceso:");

		int opcion = 0;
		System.out.println("0.Volver");
		System.out.println(++opcion + "." + "[Titulo]" +  " Índice" );
		System.out.println(++opcion + "." + "[Titulo]" +  " Crear" );
		System.out.println(++opcion + "." + "[Titulo]" +  " Detalles" );
		System.out.println(++opcion + "." + "[Titulo]" +  " Borrar" );
		System.out.println(++opcion + "." + "[Matricula]" +  " CRUD" );
		System.out.println(++opcion + "." + "[Asignatura]" +  " CRUD" );
		System.out.println(++opcion + "." + "[Alumno]" +  " CRUD" );
		System.out.println(++opcion + "." + "info_matricula" );

			
		opcion = -1;
		
		while(opcion > 8 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-8] : ");
		
		switch(opcion){
			case 0:
				Main.screen();
			break;
			case 1:
				IndexTitulo.screen();
			break;
			case 2:
				CreateTitulo.screen();
			break;
			case 3:
				DetailTitulo.screen();
			break;
			case 4:
				DeleteTitulo.screen();
			break;
			case 5:
				CrudMatricula.screen();
			break;
			case 7:
				CrudAsignatura.screen();
			break;
			case 8:
				CrudAlumno.screen();
			break;
			case 6:
			  Info_matricula.screen();
			break;
			default:
			break;
		}
	}
}
