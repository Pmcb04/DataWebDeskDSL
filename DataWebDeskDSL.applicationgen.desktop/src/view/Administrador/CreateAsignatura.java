/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CreateAsignatura
	Proyecto de la asignatura DMSS
*/

package view.Administrador;

import util.Keyin;
import model.Asignatura;
import roles.AdministradorMain;

public class CreateAsignatura{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de creación de " + "[ asignatura ] " + " Rol " + "[ Administrador ]");
		
		System.out.println("Redes Sociales: ");
		System.out.println("Facebook " + "@" + "rubml");
		
		
		System.out.println("Paginas externas: ");
		System.out.println("[Unex] " + "url : " + "https://www.unex.es");
		
		
		
		
		System.out.println("Introduzca la información correspondiente a los siguientes campos:");
	
		Asignatura asignatura = new  Asignatura();
	
		System.out.println("num_asignatura:");
		asignatura.setNum_asignatura(Keyin.inInt(""));
		System.out.println("nombre_asignatura:");
		asignatura.setNombre_asignatura(Keyin.inString());
	
		System.out.println("id_Profesor: num_profesor:");
		asignatura.setNum_profesor(Keyin.inInt(""));
				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
		System.out.println("1.Crear asignatura");
				
		System.out.println();
		System.out.println("asignatura introducido:");
		System.out.println(asignatura.toString());
	
		int opcion = -1;
	
		while(opcion > 1 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");
		
		AdministradorMain.screen();

 }
}
