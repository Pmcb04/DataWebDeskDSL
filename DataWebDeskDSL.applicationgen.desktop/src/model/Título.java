/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package model;

import java.util.Random;

public class Título
{

	//-------------------------------------------------------------------------------------
	// Instance Variables
	//-------------------------------------------------------------------------------------
		private String nombre_titulo;
		private int num_creditos;
		private String especialidad;

	//-------------------------------------------------------------------------------------
	// Constructores
	//-------------------------------------------------------------------------------------
		public Título(){
		}

		public Título(String nombre_titulo,int num_creditos,String especialidad){
			this.nombre_titulo = nombre_titulo;
			this.num_creditos = num_creditos;
			this.especialidad = especialidad;
		}

	//-------------------------------------------------------------------------------------
	// Getters & Setters
	//-------------------------------------------------------------------------------------
		public String getNombre_titulo(){
			return nombre_titulo;
		}

		public void setNombre_titulo(String nombre_titulo){
			this.nombre_titulo = nombre_titulo; 
		}

		public int getNum_creditos(){
			return num_creditos;
		}

		public void setNum_creditos(int num_creditos){
			this.num_creditos = num_creditos; 
		}

		public String getEspecialidad(){
			return especialidad;
		}

		public void setEspecialidad(String especialidad){
			this.especialidad = especialidad; 
		}


	//-------------------------------------------------------------------------------------
	// Method toString()
	//-------------------------------------------------------------------------------------
		public String toString(){
			return 	"nombre_titulo:" + this.nombre_titulo+ "\n"+"num_creditos:" + this.num_creditos+ "\n"+"especialidad:" + this.especialidad+ "\n";
		}

	//-------------------------------------------------------------------------------------
	// Method random()
	//-------------------------------------------------------------------------------------
		public void random(){
		Random random = new Random();
			this.nombre_titulo = "prueba_nombre_titulo";
			this.num_creditos = random.nextInt();
			this.especialidad = "prueba_especialidad";
		}

}
