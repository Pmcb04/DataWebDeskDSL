/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : DeleteCheckProducto
	Proyecto de la asignatura DMSS
*/

package view.Administrador;

import util.Keyin;
import roles.AdministradorMain;

public class DeleteCheckProducto{
	public static void screen(){
		
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de borrado de " + "[ producto ] " + " Rol " + "[ Administrador ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
	
		System.out.println("La entidad Producto con identificación identificador  =   se eliminó satisfactoriamente.");
	

		int opcion = -1;

		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Pulse 0 para volver.");

		DeleteProducto.screen();

 }
}
