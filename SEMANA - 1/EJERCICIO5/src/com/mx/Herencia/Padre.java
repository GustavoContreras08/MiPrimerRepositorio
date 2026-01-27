package com.mx.Herencia;

public class Padre {
	
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected String nacionalidad;
	
	public Padre(){
		
	}

	public Padre(String nombre, String apellido, int edad, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString(){
		return "Padre [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", nacionalidad="
				+ nacionalidad + "]\n";
	}
	
	//metodo personalizado 
	public void trabajar() {
		System.out.println("Trabajo de 8:00am - 4:00pm");
		
	}

}
