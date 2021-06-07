/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package model;

import java.util.Random;

public class Asignatura
{

	//-------------------------------------------------------------------------------------
	// Instance Variables
	//-------------------------------------------------------------------------------------
		private int num_asignatura;
		private String nombre_asignatura;
		private int num_profesor;

	//-------------------------------------------------------------------------------------
	// Constructores
	//-------------------------------------------------------------------------------------
		public Asignatura(){
		}

		public Asignatura(int num_asignatura,String nombre_asignatura){
			this.num_asignatura = num_asignatura;
			this.nombre_asignatura = nombre_asignatura;
		}

	//-------------------------------------------------------------------------------------
	// Getters & Setters
	//-------------------------------------------------------------------------------------
		public int getNum_asignatura(){
			return num_asignatura;
		}

		public void setNum_asignatura(int num_asignatura){
			this.num_asignatura = num_asignatura; 
		}

		public String getNombre_asignatura(){
			return nombre_asignatura;
		}

		public void setNombre_asignatura(String nombre_asignatura){
			this.nombre_asignatura = nombre_asignatura; 
		}

		public int getNum_profesor(){
			return num_profesor;
		}

		public void setNum_profesor(int num_profesor){
			this.num_profesor = num_profesor; 
		}


	//-------------------------------------------------------------------------------------
	// Method toString()
	//-------------------------------------------------------------------------------------
		public String toString(){
			return 	"num_asignatura:" + this.num_asignatura+ "\n"+"nombre_asignatura:" + this.nombre_asignatura+ "\n" + "num_profesor:" + this.num_profesor+ "\n" ;
		}

	//-------------------------------------------------------------------------------------
	// Method random()
	//-------------------------------------------------------------------------------------
		public void random(){
		Random random = new Random();
			this.num_asignatura = random.nextInt();
			this.nombre_asignatura = "prueba_nombre_asignatura";
		}

}
