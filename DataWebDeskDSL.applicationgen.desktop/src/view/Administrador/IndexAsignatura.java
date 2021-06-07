/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : IndexAsignatura
	Proyecto de la asignatura DMSS
*/

package view.Administrador;

import util.Keyin;
import roles.AdministradorMain;


public class IndexAsignatura{
	public static void screen(){
		
    	System.out.println("\n\n\n\n");

		System.out.println("Pantalla de índice de " + "[ asignatura ] " + " Rol " + "[ Administrador ]");
		
		
		
		
	
		System.out.println("Listado de : [Asignatura]");
	
		System.out.println("0.Volver");
		System.out.println("1.Asignatura 84334");
	
		int opcion = -1;
	
		while(opcion >  1 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");

		switch(opcion){
			case 0:
				AdministradorMain.screen();
			break;
			case 1:
				DetailAsignatura.screen();
			break;
			default:
			break;
		}

	}
}
	
