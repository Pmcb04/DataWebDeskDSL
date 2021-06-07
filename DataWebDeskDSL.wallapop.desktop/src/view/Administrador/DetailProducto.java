/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudProducto
	Proyecto de la asignatura DMSS
*/

package view.Administrador;

import util.Keyin;
import model.Producto;
import roles.AdministradorMain;

public class DetailProducto{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de detalles de " + "[ producto ] " + " Rol " + "[ Administrador ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
		
		Producto producto = new Producto();
		producto.random();
	
		System.out.println("Campos: ");
	
		System.out.println("precio:");
		System.out.println(producto.getPrecio());
		System.out.println();
	
		System.out.println("nombre:");
		System.out.println(producto.getNombre());
		System.out.println();
	
		System.out.println("categoria:");
		System.out.println(producto.getCategoria());
		System.out.println();
	
		System.out.println("identificador:");
		System.out.println(producto.getIdentificador());
		System.out.println();
	

				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
	
		int opcion = -1;
	
		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-0] : ");
	
		switch(opcion){
			case 0:
				AdministradorMain.screen();
			break;
			default:
			break;
		}
 }
}
