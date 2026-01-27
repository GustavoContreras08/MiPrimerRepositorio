package com.mx.Polimorfismo;

public class Automovil {
	
	protected String marca;
	protected String subMarca;
	protected String Color;
	protected int modelo;
	
	//metodo perosnalizado
	public String mostrarDatos() {
		return "Automovil\n" + "Marca: " + this.marca + "\nSubMarca: "+ this.subMarca + "\nColor: " + this.Color + "\nModelo: " + this.modelo;
	}
	
	public Automovil(){
		
	}

	public Automovil(String marca, String subMarca, String color, int modelo) {
		super();
		this.marca = marca;
		this.subMarca = subMarca;
		Color = color;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSubMarca() {
		return subMarca;
	}

	public void setSubMarca(String subMarca) {
		this.subMarca = subMarca;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", subMarca=" + subMarca + ", Color=" + Color + ", modelo=" + modelo + "]\n";
	}

}
