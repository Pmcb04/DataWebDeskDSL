/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : Unex
	Proyecto de la asignatura DMSS
*/

package view.Estudiante;

import util.Keyin;
import roles.EstudianteMain;

public class Unex{
	public static void screen(){
     
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla " + "Unex"  + " Rol " + "["  + "Estudiante" + "]" );

		
		
		System.out.println("Multimedias: ");
		System.out.println("hola");
		System.out.println("tutorial");
		System.out.println("cancion");
		System.out.println("aprobado");
		

		int opcion = -1;
		
		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Pulse 0 para volver: ");
		
		EstudianteMain.screen();
 }
}
