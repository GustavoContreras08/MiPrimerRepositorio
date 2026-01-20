package com.mx.Empleado;

public class Empleado {
	
	private String nombre;
	private String ApellidoP;
	private String ApellidoM;
	private long telefono;
	private int edad;
	private double sueldo;
	
	public Empleado() {
		
	}

	public Empleado(String nombre, String apellidoP, String apellidoM, long telefono, int edad, double sueldo) {
		this.nombre = nombre;
		ApellidoP = apellidoP;
		ApellidoM = apellidoM;
		this.telefono = telefono;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return ApellidoP;
	}

	public void setApellidoP(String apellidoP) {
		ApellidoP = apellidoP;
	}

	public String getApellidoM() {
		return ApellidoM;
	}

	public void setApellidoM(String apellidoM) {
		ApellidoM = apellidoM;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", ApellidoP=" + ApellidoP + ", ApellidoM=" + ApellidoM + ", telefono="
				+ telefono + ", edad=" + edad + ", sueldo=" + sueldo + "]\n";
	}

}
