package com.mx.Computadora.Dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //esta anotacion indica que esta clase representa la entidad de la bd
@Table(name = "computadora2") //Esta anotacion mapea a la tabla con el nombre especificado
//es decir JPA busca dentro de la conexion dentreo de la conexion que le indique en propeties, si la tabla existe
//si no existe, no podra realizar operaciones de persistetencia porque no existiria el objeto en cuestion
//en dado caso de que el nombre la clase java no coincida con el nombre de la tabla entonces
//con el atributo name, especificaras el nombre de la tabla a la que se debe mapear las operacions de persistencia
public class Computadora {
	
	@Id //mapea el atributo id correspondiente de la tabla
	private int idCompu2;
	private String marca;
	private String modelo;
	private int ram;
	private String procesador;
	private int precio;
	
	public Computadora() {
		
	}

	public Computadora(int idCompu2, String marca, String modelo, int ram, String procesador, int precio) {
		super();
		this.idCompu2 = idCompu2;
		this.marca = marca;
		this.modelo = modelo;
		this.ram = ram;
		this.procesador = procesador;
		this.precio = precio;
	}

	public int getIdCompu2() {
		return idCompu2;
	}

	public void setIdCompu2(int idCompu2) {
		this.idCompu2 = idCompu2;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Computadora [idCompu2=" + idCompu2 + ", marca=" + marca + ", modelo=" + modelo + ", ram=" + ram
				+ ", procesador=" + procesador + ", precio=" + precio + "]";
	}

}
