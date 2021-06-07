/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package model;

import java.util.Random;

public class Usuario
{

	//-------------------------------------------------------------------------------------
	// Instance Variables
	//-------------------------------------------------------------------------------------
		private int identificador;
		private String nombre;

	//-------------------------------------------------------------------------------------
	// Constructores
	//-------------------------------------------------------------------------------------
		public Usuario(){
		}

		public Usuario(int identificador,String nombre){
			this.identificador = identificador;
			this.nombre = nombre;
		}

	//-------------------------------------------------------------------------------------
	// Getters & Setters
	//-------------------------------------------------------------------------------------
		public int getIdentificador(){
			return identificador;
		}

		public void setIdentificador(int identificador){
			this.identificador = identificador; 
		}

		public String getNombre(){
			return nombre;
		}

		public void setNombre(String nombre){
			this.nombre = nombre; 
		}


	//-------------------------------------------------------------------------------------
	// Method toString()
	//-------------------------------------------------------------------------------------
		public String toString(){
			return 	"identificador:" + this.identificador+ "\n"+"nombre:" + this.nombre+ "\n";
		}

	//-------------------------------------------------------------------------------------
	// Method random()
	//-------------------------------------------------------------------------------------
		public void random(){
		Random random = new Random();
			this.identificador = random.nextInt();
			this.nombre = "prueba_nombre";
		}

}
