package com.mx.Animales;

public class Animal {
	private int isbn;
	private String nombre;
	private String Tipo;
	private int ejemplares;
	private int edadPromedio;
	
	public Animal(){
		
	}

	public Animal(int isbn, String nombre, String especie, int ejemplares, int edadPromedio) {
		super();
		this.isbn = isbn;
		this.nombre = nombre;
		this.Tipo = especie;
		this.ejemplares = ejemplares;
		this.edadPromedio = edadPromedio;
	}
	
	//Realizar una sobre carga de constructores, con uno que nos permita inicializar con 1 solo valor
		public Animal(int  isbn) {
			this.isbn = isbn;
			
		}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return Tipo;
	}

	public void setEspecie(String especie) {
		this.Tipo = especie;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getEdadPromedio() {
		return edadPromedio;
	}

	public void setEdadPromedio(int edadPromedio) {
		this.edadPromedio = edadPromedio;
	}

	@Override
	public String toString() {
		return "Animal [isbn=" + isbn + ", nombre=" + nombre + ", especie=" + Tipo + ", ejemplares=" + ejemplares
				+ ", edadPromedio=" + edadPromedio + "]\n";
	}
	
	

}
