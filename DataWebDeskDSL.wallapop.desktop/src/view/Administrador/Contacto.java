/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : Contacto
	Proyecto de la asignatura DMSS
*/

package view.Administrador;

import util.Keyin;
import roles.AdministradorMain;

public class Contacto{
	public static void screen(){
     
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla " + "Contacto"  + " Rol " + "["  + "Administrador" + "]" );

		System.out.println("Redes Sociales: ");
		System.out.println("Facebook " + "@" + "wallapop");
		System.out.println("Twitter " + "@" + "wallapop");
		
		
		System.out.println("Paginas Externas: ");
		System.out.println("[Google maps] " + "url : " + "");
		
		
		System.out.println("Multimedias: ");
		

		int opcion = -1;
		
		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Pulse 0 para volver: ");
		
		AdministradorMain.screen();
 }
}
