package com.mx.VideoJuegos.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "videojuegos")
public class Videojuego {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_VJ;
	private String titulo;
	private String estudio;
	private String genero;
	private String isbn;
	private int precio;
	
	public Videojuego() {
		
	}

	public Videojuego(int id_VJ, String titulo, String estudio, String genero, String isbn, int precio) {
		super();
		Id_VJ = id_VJ;
		this.titulo = titulo;
		this.estudio = estudio;
		this.genero = genero;
		this.isbn = isbn;
		this.precio = precio;
	}

	public int getIdVJ() {
		return Id_VJ;
	}

	public void setIdVJ(int id_VJ) {
		Id_VJ = id_VJ;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Videojuego [Id_VJ=" + Id_VJ + ", titulo=" + titulo + ", estudio=" + estudio + ", genero=" + genero
				+ ", isbn=" + isbn + ", precio=" + precio + "]";
	}
	
}
