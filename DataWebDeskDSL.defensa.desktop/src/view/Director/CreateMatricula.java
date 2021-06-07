/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudMatricula
	Proyecto de la asignatura DMSS
*/

package view.Director;

import util.Keyin;
import model.Matricula;
import roles.DirectorMain;

public class CreateMatricula{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de creación de " + "[ matricula ] " + " Rol " + "[ Director ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		System.out.println("[Unex] " + "url : " + "http://www.unex.es");
		
		
		System.out.println("Multimedias: ");
		
		
		
		System.out.println("Introduzca la información correspondiente a los siguientes campos:");
	
		Matricula matricula = new  Matricula();
	
		System.out.println("nombre_matricula:");
		matricula.setNombre_matricula(Keyin.inString());
	
		System.out.println("id_Asignatura: nombre_asignatura:");
		matricula.setNombre_asignatura(Keyin.inString());
		System.out.println("id_Alumno: nombre_alumno:");
		matricula.setNombre_alumno(Keyin.inString());
				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
		System.out.println("1.Crear matricula");
				
		System.out.println();
		System.out.println("matricula introducido:");
		System.out.println(matricula.toString());
	
		int opcion = -1;
	
		while(opcion > 1 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");
		
		DirectorMain.screen();

 }
}
