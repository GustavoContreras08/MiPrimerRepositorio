package com.mx.Libro;

public class Libro {
	private int isbn;
	private String nombre;
	private String autor;
	private String editorial;
	private double precio;
	
	public Libro(){
		
	}

	public Libro(int isbn, String nombre, String autor, String editorial, double precio) {
		super();
		this.isbn = isbn;
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.precio = precio;
	}
	
	//Realizar una sobre carga de constructores, con uno que nos permita inicializar con 1 solo valor
	public Libro(int  isbn) {
		this.isbn = isbn;
		
	}
	

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", nombre=" + nombre + ", autor=" + autor + ", editorial=" + editorial
				+ ", precio=" + precio + "]\n";
	}

}
