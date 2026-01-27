package com.mx.Producto;

public class Producto {
	private String Nombre;
	private String Marca;
	private int Codigo;
	private int Stok;
	private double Precio;
	
	public Producto() {
		
	}

	public Producto(String nombre, String marca, int codigo, int stok, double precio) {
		this.Nombre = nombre;
		this.Marca = marca;
		Codigo = codigo;
		Stok = stok;
		Precio = precio;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public int getStok() {
		return Stok;
	}

	public void setStok(int stok) {
		Stok = stok;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	@Override
	public String toString() {
		return "Producto [Nombre=" + Nombre + ", Marca=" + Marca + ", Codigo="
				+ Codigo + ", Stok=" + Stok + ", Precio=" + Precio + "]\n";
	}

}
