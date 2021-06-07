/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package model;

import java.util.Random;

public class Producto
{

	//-------------------------------------------------------------------------------------
	// Instance Variables
	//-------------------------------------------------------------------------------------
		private int precio;
		private String nombre;
		private String categoria;
		private int identificador;

	//-------------------------------------------------------------------------------------
	// Constructores
	//-------------------------------------------------------------------------------------
		public Producto(){
		}

		public Producto(int precio,String nombre,String categoria,int identificador){
			this.precio = precio;
			this.nombre = nombre;
			this.categoria = categoria;
			this.identificador = identificador;
		}

	//-------------------------------------------------------------------------------------
	// Getters & Setters
	//-------------------------------------------------------------------------------------
		public int getPrecio(){
			return precio;
		}

		public void setPrecio(int precio){
			this.precio = precio; 
		}

		public String getNombre(){
			return nombre;
		}

		public void setNombre(String nombre){
			this.nombre = nombre; 
		}

		public String getCategoria(){
			return categoria;
		}

		public void setCategoria(String categoria){
			this.categoria = categoria; 
		}

		public int getIdentificador(){
			return identificador;
		}

		public void setIdentificador(int identificador){
			this.identificador = identificador; 
		}


	//-------------------------------------------------------------------------------------
	// Method toString()
	//-------------------------------------------------------------------------------------
		public String toString(){
			return 	"precio:" + this.precio+ "\n"+"nombre:" + this.nombre+ "\n"+"categoria:" + this.categoria+ "\n"+"identificador:" + this.identificador+ "\n";
		}

	//-------------------------------------------------------------------------------------
	// Method random()
	//-------------------------------------------------------------------------------------
		public void random(){
		Random random = new Random();
			this.precio = random.nextInt();
			this.nombre = "prueba_nombre";
			this.categoria = "prueba_categoria";
			this.identificador = random.nextInt();
		}

}
