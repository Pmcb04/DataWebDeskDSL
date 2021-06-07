/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package model;

import java.util.Random;

public class Alumno
{

	//-------------------------------------------------------------------------------------
	// Instance Variables
	//-------------------------------------------------------------------------------------
		private String nombre_alumno;
		private String evaluacion_continua;
		private int edad;

	//-------------------------------------------------------------------------------------
	// Constructores
	//-------------------------------------------------------------------------------------
		public Alumno(){
		}

		public Alumno(String nombre_alumno,String evaluacion_continua,int edad){
			this.nombre_alumno = nombre_alumno;
			this.evaluacion_continua = evaluacion_continua;
			this.edad = edad;
		}

	//-------------------------------------------------------------------------------------
	// Getters & Setters
	//-------------------------------------------------------------------------------------
		public String getNombre_alumno(){
			return nombre_alumno;
		}

		public void setNombre_alumno(String nombre_alumno){
			this.nombre_alumno = nombre_alumno; 
		}

		public String getEvaluacion_continua(){
			return evaluacion_continua;
		}

		public void setEvaluacion_continua(String evaluacion_continua){
			this.evaluacion_continua = evaluacion_continua; 
		}

		public int getEdad(){
			return edad;
		}

		public void setEdad(int edad){
			this.edad = edad; 
		}


	//-------------------------------------------------------------------------------------
	// Method toString()
	//-------------------------------------------------------------------------------------
		public String toString(){
			return 	"nombre_alumno:" + this.nombre_alumno+ "\n"+"evaluacion_continua:" + this.evaluacion_continua+ "\n"+"edad:" + this.edad+ "\n";
		}

	//-------------------------------------------------------------------------------------
	// Method random()
	//-------------------------------------------------------------------------------------
		public void random(){
		Random random = new Random();
			this.nombre_alumno = "prueba_nombre_alumno";
			this.evaluacion_continua = "prueba_evaluacion_continua";
			this.edad = random.nextInt();
		}

}
