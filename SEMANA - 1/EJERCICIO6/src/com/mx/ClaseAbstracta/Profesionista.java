package com.mx.ClaseAbstracta;

//las clases abstractas no se instancias, solo heredan
public abstract class Profesionista {
	
	protected String nombre;
	protected String apellio;
	protected int edad;
	protected int cedula;
	protected String universidad;
	protected int experiencia;
	
	//metodo concreto
	public void cobrar(String trabajo, double sueldo) {
		System.out.println("Trabajo como: " + trabajo + " y me pagan: " + sueldo + " \n\n");
	}
	
	//metodo
	public abstract void trabajar();	
	
	//declaracion de los constructore
	public Profesionista() {
		
	}

	public Profesionista(String nombre, String apellio, int edad, int cedula, String universidad, int experiencia) {
		super();
		this.nombre = nombre;
		this.apellio = apellio;
		this.edad = edad;
		this.cedula = cedula;
		this.universidad = universidad;
		this.experiencia = experiencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellio() {
		return apellio;
	}

	public void setApellio(String apellio) {
		this.apellio = apellio;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Profesionista [nombre=" + nombre + ", apellio=" + apellio + ", edad=" + edad + ", cedula=" + cedula
				+ ", universidad=" + universidad + ", experiencia=" + experiencia + "]";
	}

}
