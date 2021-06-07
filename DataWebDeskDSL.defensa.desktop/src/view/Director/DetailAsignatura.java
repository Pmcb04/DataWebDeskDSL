/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudAsignatura
	Proyecto de la asignatura DMSS
*/

package view.Director;

import util.Keyin;
import model.Asignatura;
import roles.DirectorMain;

public class DetailAsignatura{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de detalles de " + "[ asignatura ] " + " Rol " + "[ Director ]");
		
		System.out.println("Redes Sociales: ");
		System.out.println("Twitter " + "@" + "unex");
		
		
		System.out.println("Paginas externas: ");
		
		
		System.out.println("Multimedias: ");
		
		
		
		Asignatura asignatura = new Asignatura();
		asignatura.random();
	
		System.out.println("Campos: ");
	
		System.out.println("nombre_asignatura:");
		System.out.println(asignatura.getNombre_asignatura());
		System.out.println();
	
		System.out.println("Semestre:");
		System.out.println(asignatura.getSemestre());
		System.out.println();
	
		System.out.println("obligatoria:");
		System.out.println(asignatura.getObligatoria());
		System.out.println();
	

		System.out.println("id_nombre_titulo:");
		System.out.println(asignatura.getNombre_titulo());
		System.out.println();
	
				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
		System.out.println("1.Consultar detalles de Titulo ");
	
		int opcion = -1;
	
		while(opcion > 1 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-1] : ");
	
		switch(opcion){
			case 0:
				DirectorMain.screen();
			break;
			case 1:
				DetailTitulo.screen();
			break;
			default:
			break;
		}
 }
}
