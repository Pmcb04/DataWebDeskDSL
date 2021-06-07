/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package model;

import java.util.Random;

public class Profesor
{

	//-------------------------------------------------------------------------------------
	// Instance Variables
	//-------------------------------------------------------------------------------------
		private String nombre_profesor;
		private int num_profesor;
		private int num_expediente;
		private String nombre_titulo;

	//-------------------------------------------------------------------------------------
	// Constructores
	//-------------------------------------------------------------------------------------
		public Profesor(){
		}

		public Profesor(String nombre_profesor,int num_profesor){
			this.nombre_profesor = nombre_profesor;
			this.num_profesor = num_profesor;
		}

	//-------------------------------------------------------------------------------------
	// Getters & Setters
	//-------------------------------------------------------------------------------------
		public String getNombre_profesor(){
			return nombre_profesor;
		}

		public void setNombre_profesor(String nombre_profesor){
			this.nombre_profesor = nombre_profesor; 
		}

		public int getNum_profesor(){
			return num_profesor;
		}

		public void setNum_profesor(int num_profesor){
			this.num_profesor = num_profesor; 
		}

		public int getNum_expediente(){
			return num_expediente;
		}

		public void setNum_expediente(int num_expediente){
			this.num_expediente = num_expediente; 
		}

		public String getNombre_titulo(){
			return nombre_titulo;
		}

		public void setNombre_titulo(String nombre_titulo){
			this.nombre_titulo = nombre_titulo; 
		}


	//-------------------------------------------------------------------------------------
	// Method toString()
	//-------------------------------------------------------------------------------------
		public String toString(){
			return 	"nombre_profesor:" + this.nombre_profesor+ "\n"+"num_profesor:" + this.num_profesor+ "\n" + "num_expediente:" + this.num_expediente+ "\n"+"nombre_titulo:" + this.nombre_titulo+ "\n" ;
		}

	//-------------------------------------------------------------------------------------
	// Method random()
	//-------------------------------------------------------------------------------------
		public void random(){
		Random random = new Random();
			this.nombre_profesor = "prueba_nombre_profesor";
			this.num_profesor = random.nextInt();
		}

}
