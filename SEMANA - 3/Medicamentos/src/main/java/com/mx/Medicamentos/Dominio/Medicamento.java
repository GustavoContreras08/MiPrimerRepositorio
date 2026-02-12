package com.mx.Medicamentos.Dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicamento")
public class Medicamento {
	
	@Id
	private int idMedicamento;
	private String nombre;
	private String laboratorio;
	private int precio;
	private int stock;
	
	public Medicamento() {
		
	}

	public Medicamento(int idMedicamento, String nombre, String laboratorio, int precio, int stock) {
		super();
		this.idMedicamento = idMedicamento;
		this.nombre = nombre;
		this.laboratorio = laboratorio;
		this.precio = precio;
		this.stock = stock;
	}

	public int getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Medicamento [IdMedicamento=" + idMedicamento + ", nombre=" + nombre + ", laboratorio=" + laboratorio
				+ ", precio=" + precio + ", stock=" + stock + "]";
	}

}
