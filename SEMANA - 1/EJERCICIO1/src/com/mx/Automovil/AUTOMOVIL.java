package com.mx.Automovil;

public class AUTOMOVIL {
	//declaracion de los atributos
	private String marca;
	private String subMarca;
	private int precio;
	private String color;
	
	//Declaracion de los contructores: inicializan la clase
	
	//constructor por defecto
	public AUTOMOVIL() {
		
	}
	
	//contructor con parametros o contructor parametrista
	//inicializa la clase con sus atributos
	
	public AUTOMOVIL(String marca, String subMarca, int precio, String color) {
		this.marca = marca;
		this.subMarca = subMarca;
		this.precio = precio;
		this.color = color;
	}
	
	//getter y setter : nos permite acceder de forma controlada a los atributos 
	
	//get sirve para optener el valor del atributo 
	
	public String getMarca() {
		return marca;
	}
	
	//set: fijan o combian el valor del atributo
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getsubMarca() {
		return subMarca;
	}
	
	public void setsubMarca(String subMarca) {
		this.subMarca = subMarca;
	}
	
	public int getprecio() {
		return precio;
	}
	
	public void setprecio(int precio) {
		this.precio = precio;
	}
	
	public String getcolor() {
		return color;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	//metodo toString: convertir las cadenas en legibles para que se puedan interpretar
	@Override
	public String toString() {
		return "Automovil=[marca= " + marca + "subMarca= " + subMarca + "precio= " + precio + "Color= "+ color + "]\n";
	}

}
