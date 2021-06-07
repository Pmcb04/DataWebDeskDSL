/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudAsignatura
	Proyecto de la asignatura DMSS
*/

package view.Rector;

import util.Keyin;
import model.Asignatura;
import roles.RectorMain;

public class CreateAsignatura{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de creación de " + "[ asignatura ] " + " Rol " + "[ Rector ]");
		
		System.out.println("Redes Sociales: ");
		System.out.println("Twitter " + "@" + "unex");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
		
		System.out.println("Introduzca la información correspondiente a los siguientes campos:");
	
		Asignatura asignatura = new  Asignatura();
	
		System.out.println("nombre_asignatura:");
		asignatura.setNombre_asignatura(Keyin.inString());
		System.out.println("Semestre:");
		asignatura.setSemestre(Keyin.inInt(""));
		System.out.println("obligatoria:");
		asignatura.setObligatoria(Keyin.inString());
	
		System.out.println("id_Titulo: nombre_titulo:");
		asignatura.setNombre_titulo(Keyin.inString());
				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
		System.out.println("1.Crear asignatura");
				
		System.out.println();
		System.out.println("asignatura introducido:");
		System.out.println(asignatura.toString());
	
		int opcion = -1;
	
		while(opcion > 1 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");
		
		RectorMain.screen();

 }
}
