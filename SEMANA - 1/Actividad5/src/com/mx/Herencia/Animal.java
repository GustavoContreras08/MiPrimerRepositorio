package com.mx.Herencia;

public class Animal {
	
	protected String Especie;
	protected String Altura;
	protected int edad;
	protected String Raza;
	
	public Animal() {
		
	}

	public Animal(String especie, String altura, int edad, String raza) {
		super();
		Especie = especie;
		Altura = altura;
		this.edad = edad;
		Raza = raza;
	}

	public String getEspecie() {
		return Especie;
	}

	public void setEspecie(String especie) {
		Especie = especie;
	}

	public String getAltura() {
		return Altura;
	}

	public void setAltura(String altura) {
		Altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return Raza;
	}

	public void setRaza(String raza) {
		Raza = raza;
	}

	@Override
	public String toString() {
		return "Animal [Especie=" + Especie + ", Altura=" + Altura + ", edad=" + edad + ", Raza=" + Raza + "]";
	}
	
	public void hacerSonido() {
	    System.out.println("Este animal hace este Sonido: ");
	}


}
