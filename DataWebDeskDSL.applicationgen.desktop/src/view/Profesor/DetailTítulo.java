/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Fichero : CrudTítulo
	Proyecto de la asignatura DMSS
*/

package view.Profesor;

import util.Keyin;
import model.Título;
import roles.ProfesorMain;

public class DetailTítulo{
	public static void screen(){

		System.out.println("\n\n\n\n");

		System.out.println("Pantalla de detalles de " + "[ título ] " + " Rol " + "[ Profesor ]");
		
		
		
		
		
		Título título = new Título();
		título.random();
	
		System.out.println("Campos: ");
	
		System.out.println("nombre_titulo:");
		System.out.println(título.getNombre_titulo());
		System.out.println();
	
		System.out.println("num_creditos:");
		System.out.println(título.getNum_creditos());
		System.out.println();
	
		System.out.println("especialidad:");
		System.out.println(título.getEspecialidad());
		System.out.println();
	

				
		System.out.println("Listado de opciones: ");
		System.out.println("0.Volver");
	
		int opcion = -1;
	
		while(opcion > 0 || opcion < 0)
			opcion = Keyin.inInt("Selecciona una opcion [0-0] : ");
	
		switch(opcion){
			case 0:
				ProfesorMain.screen();
			break;
			default:
			break;
		}
 }
}
