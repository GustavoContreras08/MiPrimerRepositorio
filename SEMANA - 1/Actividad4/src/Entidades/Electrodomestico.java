package Entidades;

public class Electrodomestico {

	private int codigo;
	private String nombre;
	private String marca;
	private int Stock;
	private double precio;
	
	public Electrodomestico() {
		
	}

	public Electrodomestico(int codigo, String nombre, String marca, int stock, double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		Stock = stock;
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Electrodomestico [codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", Stock=" + Stock
				+ ", precio=" + precio + "]\n";
	}
	
}
