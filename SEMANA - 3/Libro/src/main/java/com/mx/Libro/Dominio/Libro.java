package com.mx.Libro.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity //esta anotacion indica que esta clase es una entidad de la base de datos
@Table(name = "libros") //esta anotacion mapea la clase con la tabla (no sirve para indica a que tabla nos referiamos con la clase. 
//no es necesario especificar el nombre de la tabla si el nombre la clase es iagua a la tabla, entonces no es necesario colocar el nombre)
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLibro;
	private String titulo;
	private String autor;
	private String genero;
	@Column(name = "a_publicacion", columnDefinition = "int")
	private int anioPublicacion;
	private String isbn;
	private String editorial;
	private int paginas;
	private int precio;
	
	public Libro(){
		
	}

	public Libro(int idLibro, String titulo, String autor, String genero, int anioPublicacion, String isbn,
			String editorial, int paginas, int precio) {
		super();
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.anioPublicacion = anioPublicacion;
		this.isbn = isbn;
		this.editorial = editorial;
		this.paginas = paginas;
		this.precio = precio;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", autor=" + autor + ", genero=" + genero
				+ ", anioPublicacion=" + anioPublicacion + ", isbn=" + isbn + ", editorial=" + editorial + ", paginas="
				+ paginas + ", precio=" + precio + "]";
	}
	
	
}