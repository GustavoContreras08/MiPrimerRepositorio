package com.mx.Polimorfismo;

public class PickUp extends Automovil{
	
	private int capacidadCarga;
	
	public String mostrarDatos() {
		return "Automovil\n" + "Marca: " + this.marca + "\nSubMarca: "+ this.subMarca + "\nColor: " 
				+ this.Color + "\nModelo: " + this.modelo + "\nCapacidad de carga: " + this.capacidadCarga;
	}
	
	public PickUp() {
		
	}

	public PickUp(String marca, String subMarca, String color, int modelo, int capacidadCarga) {
		super(marca, subMarca, color, modelo);
		this.capacidadCarga = capacidadCarga;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public String toString() {
		return "PickUp [marca=" + marca + ", subMarca=" + subMarca + ", Color=" + Color + ", modelo=" + modelo
				+ ", capacidadCarga=" + capacidadCarga + "]\n";
	}

}