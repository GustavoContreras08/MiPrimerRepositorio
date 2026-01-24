package com.mx.Polimorfismo;

public class Turismo extends Automovil{
	
	private int noAsiento;
	
	public String mostrarDatos() {
		return "Automovil\n" + "Marca: " + this.marca + "\nSubMarca: "+ this.subMarca + "\nColor: " + this.Color + "\nModelo: " 
	+ this.modelo + "\nNum de Asientos: " + this.noAsiento;
	}
	
	public Turismo(){
		
	}

	public Turismo(String marca, String subMarca, String color, int modelo, int noAsiento) {
		super(marca, subMarca, color, modelo);
		this.noAsiento = noAsiento;
	}

	public int getNoAsiento() {
		return noAsiento;
	}

	public void setNoAsiento(int noAsiento) {
		this.noAsiento = noAsiento;
	}

	@Override
	public String toString() {
		return "Turismo [marca=" + marca + ", subMarca=" + subMarca + ", Color=" + Color + ", modelo=" + modelo
				+ ", noAsiento=" + noAsiento + "]\n";
	}	

}
