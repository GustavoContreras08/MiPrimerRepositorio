package Entidades;

public class Archivo {
	
	private int id;
	private String nombre;
	private String ruta;
	private int peso;
	private String Carpeta;
	
	public Archivo() {
		
	}

	public Archivo(int id, String nombre, String ruta, int peso, String carpeta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ruta = ruta;
		this.peso = peso;
		Carpeta = carpeta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getCarpeta() {
		return Carpeta;
	}

	public void setCarpeta(String carpeta) {
		Carpeta = carpeta;
	}

	@Override
	public String toString() {
		return "Archivo [id=" + id + ", nombre=" + nombre + ", ruta=" + ruta + ", peso=" + peso + ", Carpeta=" + Carpeta
				+ "]\n";
	}

}
