/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package model;

import java.util.Random;

public class Matricula
{

	//-------------------------------------------------------------------------------------
	// Instance Variables
	//-------------------------------------------------------------------------------------
		private String nombre_matricula;
		private String nombre_asignatura;
		private String nombre_alumno;

	//-------------------------------------------------------------------------------------
	// Constructores
	//-------------------------------------------------------------------------------------
		public Matricula(){
		}

		public Matricula(String nombre_matricula){
			this.nombre_matricula = nombre_matricula;
		}

	//-------------------------------------------------------------------------------------
	// Getters & Setters
	//-------------------------------------------------------------------------------------
		public String getNombre_matricula(){
			return nombre_matricula;
		}

		public void setNombre_matricula(String nombre_matricula){
			this.nombre_matricula = nombre_matricula; 
		}

		public String getNombre_asignatura(){
			return nombre_asignatura;
		}

		public void setNombre_asignatura(String nombre_asignatura){
			this.nombre_asignatura = nombre_asignatura; 
		}

		public String getNombre_alumno(){
			return nombre_alumno;
		}

		public void setNombre_alumno(String nombre_alumno){
			this.nombre_alumno = nombre_alumno; 
		}


	//-------------------------------------------------------------------------------------
	// Method toString()
	//-------------------------------------------------------------------------------------
		public String toString(){
			return 	"nombre_matricula:" + this.nombre_matricula+ "\n" + "nombre_asignatura:" + this.nombre_asignatura+ "\n"+"nombre_alumno:" + this.nombre_alumno+ "\n" ;
		}

	//-------------------------------------------------------------------------------------
	// Method random()
	//-------------------------------------------------------------------------------------
		public void random(){
		Random random = new Random();
			this.nombre_matricula = "prueba_nombre_matricula";
		}

}
