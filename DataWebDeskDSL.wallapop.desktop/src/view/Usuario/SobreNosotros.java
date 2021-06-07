/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : Sobre Nosotros
	Proyecto de la asignatura DMSS
*/

package view.Usuario;

import util.Keyin;
import roles.UsuarioMain;

public class SobreNosotros{
	public static void screen(){
     
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla " + "Sobre Nosotros"  + " Rol " + "["  + "Usuario" + "]" );

		System.out.println("Redes Sociales: ");
		System.out.println("Facebook " + "@" + "wallapop");
		System.out.println("Twitter " + "@" + "wallapop");
		
		
		System.out.println("Paginas Externas: ");
		
		
		System.out.println("Multimedias: ");
		System.out.println("nosotros");
		

		int opcion = -1;
		
		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Pulse 0 para volver: ");
		
		UsuarioMain.screen();
 }
}
