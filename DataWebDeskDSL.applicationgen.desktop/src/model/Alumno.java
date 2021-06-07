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
		private String [] nombre;
		private int num_expediente;

	//-------------------------------------------------------------------------------------
	// Constructores
	//-------------------------------------------------------------------------------------
		public Alumno(){
		}

		public Alumno(String [] nombre,int num_expediente){
			this.nombre = nombre;
			this.num_expediente = num_expediente;
		}

	//-------------------------------------------------------------------------------------
	// Getters & Setters
	//-------------------------------------------------------------------------------------
		public String [] getNombre(){
			return nombre;
		}

		public void setNombre(String[]  nombre){
			this.nombre = nombre; 
		}

		public int getNum_expediente(){
			return num_expediente;
		}

		public void setNum_expediente(int num_expediente){
			this.num_expediente = num_expediente; 
		}


	//-------------------------------------------------------------------------------------
	// Method toString()
	//-------------------------------------------------------------------------------------
		public String toString(){
			return 	"nombre:" + this.nombre.toString()+ "\n"+"num_expediente:" + this.num_expediente+ "\n";
		}

	//-------------------------------------------------------------------------------------
	// Method random()
	//-------------------------------------------------------------------------------------
		public void random(){
		Random random = new Random();
			this.nombre[0] = "prueba_nombre";
			this.num_expediente = random.nextInt();
		}

}
