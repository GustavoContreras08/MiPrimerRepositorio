package com.mx.PadreHijo.Dominio;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Padre {

    @Id
    private Integer idPadre;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String trabajo;

    @OneToMany(mappedBy = "padre", cascade = CascadeType.ALL)
    @JsonIgnore 
    private List<Hijo> lista = new ArrayList<>();

    public Padre() {
    	
    }

	public Padre(Integer idPadre, String nombre, String apellido, Integer edad, String trabajo, List<Hijo> lista) {
		super();
		this.idPadre = idPadre;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.trabajo = trabajo;
		this.lista = lista;
	}

	public Integer getIdPadre() {
		return idPadre;
	}

	public void setIdPadre(Integer idPadre) {
		this.idPadre = idPadre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public List<Hijo> getLista() {
		return lista;
	}

	public void setLista(List<Hijo> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Padre [idPadre=" + idPadre + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", trabajo=" + trabajo + ", lista=" + lista + "]";
	}
    
    
}