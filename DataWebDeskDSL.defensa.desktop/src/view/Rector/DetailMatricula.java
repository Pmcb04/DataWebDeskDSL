/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudMatricula
	Proyecto de la asignatura DMSS
*/

package view.Rector;

import util.Keyin;
import model.Matricula;
import roles.RectorMain;

public class DetailMatricula{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de detalles de " + "[ matricula ] " + " Rol " + "[ Rector ]");
		
		System.out.println("Redes Sociales: ");
		
		
		System.out.println("Paginas externas: ");
		System.out.println("[Unex] " + "url : " + "http://www.unex.es");
		
		
		System.out.println("Multimedias: ");
		
		
		
		Matricula matricula = new Matricula();
		matricula.random();
	
		System.out.println("Campos: ");
	
		System.out.println("nombre_matricula:");
		System.out.println(matricula.getNombre_matricula());
		System.out.println();
	

		System.out.println("id_nombre_asignatura:");
		System.out.println(matricula.getNombre_asignatura());
		System.out.println();
	
		System.out.println("id_nombre_alumno:");
		System.out.println(matricula.getNombre_alumno());
		System.out.println();
	
				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
		System.out.println("1.Consultar detalles de Asignatura ");
		System.out.println("2.Consultar detalles de Alumno ");
	
		int opcion = -1;
	
		while(opcion > 2 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-2] : ");
	
		switch(opcion){
			case 0:
				RectorMain.screen();
			break;
			case 1:
				DetailAsignatura.screen();
			break;
			case 2:
				DetailAlumno.screen();
			break;
			default:
			break;
		}
 }
}
