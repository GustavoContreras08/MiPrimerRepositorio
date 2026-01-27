package com.mx.Herencia;

public class Perro extends Animal {
	
	private String nombre;
	private String color;
	
	public Perro() {
		
	}

	public Perro(String especie, String altura, int edad, String raza, String nombre, String color) {
		super(especie, altura, edad, raza);
		this.nombre = nombre;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Perro [Especie=" + Especie + ", Altura=" + Altura + ", edad=" + edad + ", Raza=" + Raza + ", nombre="
				+ nombre + ", color=" + color + "]";
	}
	
	@Override
	public void hacerSonido() {
	    System.out.println("Guau");
	}

}
