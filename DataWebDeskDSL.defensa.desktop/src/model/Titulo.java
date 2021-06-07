/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package model;

import java.util.Random;

public class Titulo
{

	//-------------------------------------------------------------------------------------
	// Instance Variables
	//-------------------------------------------------------------------------------------
		private String nombre_titulo;
		private int creditos;

	//-------------------------------------------------------------------------------------
	// Constructores
	//-------------------------------------------------------------------------------------
		public Titulo(){
		}

		public Titulo(String nombre_titulo,int creditos){
			this.nombre_titulo = nombre_titulo;
			this.creditos = creditos;
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

		public int getCreditos(){
			return creditos;
		}

		public void setCreditos(int creditos){
			this.creditos = creditos; 
		}


	//-------------------------------------------------------------------------------------
	// Method toString()
	//-------------------------------------------------------------------------------------
		public String toString(){
			return 	"nombre_titulo:" + this.nombre_titulo+ "\n"+"creditos:" + this.creditos+ "\n";
		}

	//-------------------------------------------------------------------------------------
	// Method random()
	//-------------------------------------------------------------------------------------
		public void random(){
		Random random = new Random();
			this.nombre_titulo = "prueba_nombre_titulo";
			this.creditos = random.nextInt();
		}

}
