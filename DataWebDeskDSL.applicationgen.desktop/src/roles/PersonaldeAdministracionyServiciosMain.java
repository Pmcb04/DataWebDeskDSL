/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : PersonaldeAdministracionyServiciosMain.java
	Proyecto de la asignatura DMSS
*/

package roles;

import util.*;
import view.PersonaldeAdministracionyServicios.*;

public class PersonaldeAdministracionyServiciosMain{
	public static void screen(){
		
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla principal del rol " + "[Personal de Administracion y Servicios]");
		System.out.println("Listado de páginas a las que tiene acceso:");

		int opcion = 0;
		System.out.println("0.Volver");
		System.out.println(++opcion + "." + "[Asignatura]" +  " Detalles" );
		System.out.println(++opcion + "." + "[Profesor]" +  " Borrar" );
		System.out.println(++opcion + "." + "[Profesor]" +  " Índice" );
		System.out.println(++opcion + "." + "[Profesor]" +  " Detalles" );
		System.out.println(++opcion + "." + "Unex" );

			
		opcion = -1;
		
		while(opcion > 5 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-5] : ");
		
		switch(opcion){
			case 0:
				Main.screen();
			break;
			case 1:
				DetailAsignatura.screen();
			break;
			case 2:
				DeleteProfesor.screen();
			break;
			case 3:
				IndexProfesor.screen();
			break;
			case 4:
				DetailProfesor.screen();
			break;
			case 5:
			  Unex.screen();
			break;
			default:
			break;
		}
	}
}
