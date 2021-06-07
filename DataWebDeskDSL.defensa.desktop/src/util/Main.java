/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : Main.java
	Proyecto de la asignatura DMSS
*/

package util;

import roles.*;

public class Main{
	public static void main(String args[]){
	 	screen();
    }

   public static void screen(){
	
    	System.out.println("\n\n\n\n");

		System.out.println("Nombre de la aplicación: ");
		System.out.println("Roles de acceso a la información: ");
		System.out.println();
	
		String []  roles = {"Rector","Director","Alumno"};
		
		int opcion = 0;

		System.out.println("0.Salir");
		for (int i = 0; i < 3; i++)
			System.out.println(++opcion + "." + roles[i]);
			
		opcion = -1;
		
		while(opcion > 3 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-3] : ");

		System.out.println();

		switch(opcion){
			case 1:
				RectorMain.screen();
			break;
			case 2:
				DirectorMain.screen();
			break;
			case 3:
				AlumnoMain.screen();
			break;
			default:
			break;
		}
   }
	
}
