/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudTítulo
	Proyecto de la asignatura DMSS
*/

package view.Profesor;

import util.Keyin;
import model.Título;
import roles.ProfesorMain;

public class CreateTítulo{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de creación de " + "[ título ] " + " Rol " + "[ Profesor ]");
		
		
		
		
		
		System.out.println("Introduzca la información correspondiente a los siguientes campos:");
	
		Título título = new  Título();
	
		System.out.println("nombre_titulo:");
		título.setNombre_titulo(Keyin.inString());
		System.out.println("num_creditos:");
		título.setNum_creditos(Keyin.inInt(""));
		System.out.println("especialidad:");
		título.setEspecialidad(Keyin.inString());
	
				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
		System.out.println("1.Crear título");
				
		System.out.println();
		System.out.println("título introducido:");
		System.out.println(título.toString());
	
		int opcion = -1;
	
		while(opcion > 1 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");
		
		ProfesorMain.screen();

 }
}
