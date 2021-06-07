/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudProducto
	Proyecto de la asignatura DMSS
*/

package view.Usuario;

import util.Keyin;
import roles.UsuarioMain;

public class CrudProducto{
	public static void screen(){
     
		System.out.println("\n\n\n\n");


		System.out.println("Pantalla de índice de " + "[ producto ] " + " Rol " + "[ Usuario ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
	
		System.out.println("Listado de : [Producto]");
	
		System.out.println("0.Volver");
		System.out.println("1.Listar");
		System.out.println("2.Crear nuevo elemento");
		System.out.println("3.Borrar un elemento");

		int opcion = -1;
	
		while(opcion > 3 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-3] : ");
	
		switch(opcion){
			case 0:
				UsuarioMain.screen();
			break;
			case 1:
				IndexProducto.screen();
			break;
			case 2:
				CreateProducto.screen();
			break;
			case 3:
				DeleteProducto.screen();
			break;
			default:
			break;
		}


	}
}
