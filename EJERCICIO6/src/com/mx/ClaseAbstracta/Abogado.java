package com.mx.ClaseAbstracta;

public class Abogado extends Profesionista{
	
	private String tipo;
	private String despacho;
	private int honorarios;

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Trabajo de 12am - 4pm");
		
	}
	
	public Abogado() {
		
	}

	public Abogado(String nombre, String apellio, int edad, int cedula, String universidad, int experiencia,
			String tipo, String despacho, int honorarios) {
		super(nombre, apellio, edad, cedula, universidad, experiencia);
		this.tipo = tipo;
		this.despacho = despacho;
		this.honorarios = honorarios;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public int getHonorarios() {
		return honorarios;
	}

	public void setHonorarios(int honorarios) {
		this.honorarios = honorarios;
	}

	@Override
	public String toString() {
		return "Abogado [nombre=" + nombre + ", apellio=" + apellio + ", edad=" + edad + ", cedula=" + cedula
				+ ", universidad=" + universidad + ", experiencia=" + experiencia + ", tipo=" + tipo + ", despacho="
				+ despacho + ", honorarios=" + honorarios + "]\n";
	}

}
