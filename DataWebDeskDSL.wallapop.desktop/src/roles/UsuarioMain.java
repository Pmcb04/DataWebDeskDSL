/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : UsuarioMain.java
	Proyecto de la asignatura DMSS
*/

package roles;

import util.*;
import view.Usuario.*;

public class UsuarioMain{
	public static void screen(){
		
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla principal del rol " + "[Usuario]");
		System.out.println("Listado de páginas a las que tiene acceso:");

		int opcion = 0;
		System.out.println("0.Volver");
		System.out.println(++opcion + "." + "[Usuario]" +  " Detalles" );
		System.out.println(++opcion + "." + "[Usuario]" +  " Índice" );
		System.out.println(++opcion + "." + "[Producto]" +  " CRUD" );
		System.out.println(++opcion + "." + "Contacto" );
		System.out.println(++opcion + "." + "Sobre Nosotros" );
		System.out.println(++opcion + "." + "Tienda" );
		System.out.println(++opcion + "." + "Vista Producto" );

			
		opcion = -1;
		
		while(opcion > 7 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-7] : ");
		
		switch(opcion){
			case 0:
				Main.screen();
			break;
			case 1:
				DetailUsuario.screen();
			break;
			case 2:
				IndexUsuario.screen();
			break;
			case 3:
				CrudProducto.screen();
			break;
			case 4:
			  Contacto.screen();
			break;
			case 5:
			  SobreNosotros.screen();
			break;
			case 6:
			  Tienda.screen();
			break;
			case 7:
			  VistaProducto.screen();
			break;
			default:
			break;
		}
	}
}
