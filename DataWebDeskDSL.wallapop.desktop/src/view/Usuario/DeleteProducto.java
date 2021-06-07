/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudProducto
	Proyecto de la asignatura DMSS
*/

package view.Usuario;

import util.Keyin;
import model.Producto;
import roles.UsuarioMain;

public class DeleteProducto{
	public static void screen(){

		System.out.println("\n\n\n\n");


		System.out.println("Pantalla de índice de " + "[ producto ] " + " Rol " + "[ Usuario ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
	
		System.out.println("Listado de : [Producto]");
	
		System.out.println("0.Volver");
		System.out.println("1.Producto ");
	
		int opcion = -1;
	
		while(opcion > 2 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");

		switch(opcion){
			case 0:
				UsuarioMain.screen();
			break;
			case 1:
				DeleteCheckProducto.screen();
			break;
			default:
			break;
		}

 }
}
