package com.mx.Polimorfismo;

public class Deportivo extends Automovil {
	
	private int noCilindro;
	
	public String mostrarDatos() {
		return "Automovil\n" + "Marca: " + this.marca + "\nSubMarca: "+ this.subMarca + "\nColor: " + this.Color + "\nModelo: " 
				+ this.modelo + "\nNum de Cilindros: " + this.noCilindro;
	}
	
	public Deportivo() {
		
	}

	public Deportivo(String marca, String subMarca, String color, int modelo, int noCilindro) {
		super(marca, subMarca, color, modelo);
		this.noCilindro = noCilindro;
	}

	public int getNoCilindro() {
		return noCilindro;
	}

	public void setNoCilindro(int noCilindro) {
		this.noCilindro = noCilindro;
	}

	@Override
	public String toString() {
		return "Deportivo [marca=" + marca + ", subMarca=" + subMarca + ", Color=" + Color + ", modelo=" + modelo
				+ ", noCilindro=" + noCilindro + "]\n";
	}
	
	

}
