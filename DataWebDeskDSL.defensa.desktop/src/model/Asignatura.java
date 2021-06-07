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
		private String nombre_asignatura;
		private int Semestre;
		private String obligatoria;
		private String nombre_titulo;

	//-------------------------------------------------------------------------------------
	// Constructores
	//-------------------------------------------------------------------------------------
		public Asignatura(){
		}

		public Asignatura(String nombre_asignatura,int Semestre,String obligatoria){
			this.nombre_asignatura = nombre_asignatura;
			this.Semestre = Semestre;
			this.obligatoria = obligatoria;
		}

	//-------------------------------------------------------------------------------------
	// Getters & Setters
	//-------------------------------------------------------------------------------------
		public String getNombre_asignatura(){
			return nombre_asignatura;
		}

		public void setNombre_asignatura(String nombre_asignatura){
			this.nombre_asignatura = nombre_asignatura; 
		}

		public int getSemestre(){
			return Semestre;
		}

		public void setSemestre(int semestre){
			this.Semestre = semestre; 
		}

		public String getObligatoria(){
			return obligatoria;
		}

		public void setObligatoria(String obligatoria){
			this.obligatoria = obligatoria; 
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
			return 	"nombre_asignatura:" + this.nombre_asignatura+ "\n"+"Semestre:" + this.Semestre+ "\n"+"obligatoria:" + this.obligatoria+ "\n" + "nombre_titulo:" + this.nombre_titulo+ "\n" ;
		}

	//-------------------------------------------------------------------------------------
	// Method random()
	//-------------------------------------------------------------------------------------
		public void random(){
		Random random = new Random();
			this.nombre_asignatura = "prueba_nombre_asignatura";
			this.Semestre = random.nextInt();
			this.obligatoria = "prueba_obligatoria";
		}

}
