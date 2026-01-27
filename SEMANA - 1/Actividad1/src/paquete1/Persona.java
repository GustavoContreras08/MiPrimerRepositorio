package paquete1;

public class Persona {
	private String Nombre;
	private String Apellido;
	private int Edad;
	private String Pais;
	
	public Persona() {
		
	}
	
	public Persona(String Nombre, String Apellido, int Edad, String Pais) {
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Edad = Edad;
		this.Pais = Pais;
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	public String getApellido() {
		return Apellido;
	}
	
	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}
	
	public int getEdad() {
		return Edad;
	}
	
	public void setEdad(int Edad) {
		this.Edad = Edad;
	}
	
	public String getPais() {
		return Pais;
	}
	
	public void setPais(String Pais) {
		this.Pais = Pais;
	}
	
	@Override
	public String toString() {
		return "Persona=[Nombre=" + Nombre + " Apellido=" + Apellido + " Edad=" + Edad + " Pais="+ Pais + "]\n";
	}

}
