/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudProducto
	Proyecto de la asignatura DMSS
*/

package view.Usuario;

import util.Keyin;
import model.Producto;
import roles.UsuarioMain;

public class CreateProducto{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de creación de " + "[ producto ] " + " Rol " + "[ Usuario ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
		
		System.out.println("Introduzca la información correspondiente a los siguientes campos:");
	
		Producto producto = new  Producto();
	
		System.out.println("precio:");
		producto.setPrecio(Keyin.inInt(""));
		System.out.println("nombre:");
		producto.setNombre(Keyin.inString());
		System.out.println("categoria:");
		producto.setCategoria(Keyin.inString());
		System.out.println("identificador:");
		producto.setIdentificador(Keyin.inInt(""));
	
				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
		System.out.println("1.Crear producto");
				
		System.out.println();
		System.out.println("producto introducido:");
		System.out.println(producto.toString());
	
		int opcion = -1;
	
		while(opcion > 1 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");
		
		UsuarioMain.screen();

 }
}
