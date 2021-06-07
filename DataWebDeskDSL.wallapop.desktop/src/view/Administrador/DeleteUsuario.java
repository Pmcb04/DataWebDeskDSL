/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : DeleteUsuario
	Proyecto de la asignatura DMSS
*/

package view.Administrador;

import util.Keyin;
import model.Usuario;
import roles.AdministradorMain;

public class DeleteUsuario{
	public static void screen(){

		System.out.println("\n\n\n\n");


		System.out.println("Pantalla de índice de " + "[ usuario ] " + " Rol " + "[ Administrador ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
	
		System.out.println("Listado de : [Usuario]");
	
		System.out.println("0.Volver");
		System.out.println("1.Usuario ");
	
		int opcion = -1;
	
		while(opcion > 2 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");

		switch(opcion){
			case 0:
				AdministradorMain.screen();
			break;
			case 1:
				DeleteCheckUsuario.screen();
			break;
			default:
			break;
		}

 }
}
