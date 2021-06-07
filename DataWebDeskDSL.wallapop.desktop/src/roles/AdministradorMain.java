/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : AdministradorMain.java
	Proyecto de la asignatura DMSS
*/

package roles;

import util.*;
import view.Administrador.*;

public class AdministradorMain{
	public static void screen(){
		
		System.out.println("\n\n\n\n");

		System.out.println("Pantalla principal del rol " + "[Administrador]");
		System.out.println("Listado de páginas a las que tiene acceso:");

		int opcion = 0;
		System.out.println("0.Volver");
		System.out.println(++opcion + "." + "[Usuario]" +  " Crear" );
		System.out.println(++opcion + "." + "[Usuario]" +  " Índice" );
		System.out.println(++opcion + "." + "[Usuario]" +  " Borrar" );
		System.out.println(++opcion + "." + "[Usuario]" +  " Detalles" );
		System.out.println(++opcion + "." + "[Producto]" +  " CRUD" );
		System.out.println(++opcion + "." + "Vista Producto" );
		System.out.println(++opcion + "." + "Tienda" );
		System.out.println(++opcion + "." + "Contacto" );
		System.out.println(++opcion + "." + "Sobre Nosotros" );

			
		opcion = -1;
		
		while(opcion > 9 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-9] : ");
		
		switch(opcion){
			case 0:
				Main.screen();
			break;
			case 1:
				CreateUsuario.screen();
			break;
			case 2:
				IndexUsuario.screen();
			break;
			case 3:
				DeleteUsuario.screen();
			break;
			case 4:
				DetailUsuario.screen();
			break;
			case 5:
				CrudProducto.screen();
			break;
			case 6:
			  VistaProducto.screen();
			break;
			case 7:
			  Tienda.screen();
			break;
			case 8:
			  Contacto.screen();
			break;
			case 9:
			  SobreNosotros.screen();
			break;
			default:
			break;
		}
	}
}
