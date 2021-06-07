/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : IndexProfesor
	Proyecto de la asignatura DMSS
*/

package view.PersonaldeAdministracionyServicios;

import util.Keyin;
import roles.PersonaldeAdministracionyServiciosMain;


public class IndexProfesor{
	public static void screen(){
		
    	System.out.println("\n\n\n\n");

		System.out.println("Pantalla de índice de " + "[ profesor ] " + " Rol " + "[ Personal de Administracion y Servicios ]");
		
		
		
		
	
		System.out.println("Listado de : [Profesor]");
	
		System.out.println("0.Volver");
		System.out.println("1.Profesor 3476");
	
		int opcion = -1;
	
		while(opcion >  1 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");

		switch(opcion){
			case 0:
				PersonaldeAdministracionyServiciosMain.screen();
			break;
			case 1:
				DetailProfesor.screen();
			break;
			default:
			break;
		}

	}
}
	
