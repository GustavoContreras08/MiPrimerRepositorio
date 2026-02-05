package com.mx.ClientePedido.Dominio;

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
public class Cliente {
	
	@Id
	private Integer idCliente;
	private String nombre;
	private String ciudad;
	
	 @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	 @JsonIgnore 
	 private List<Pedido> lista = new ArrayList<>();
	 
	 public Cliente() {
		 
	 }

	 public Cliente(Integer idCliente, String nombre, String ciudad, List<Pedido> lista) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.lista = lista;
	 }

	 public Integer getIdCliente() {
		 return idCliente;
	 }

	 public void setIdCliente(Integer idCliente) {
		 this.idCliente = idCliente;
	 }

	 public String getNombre() {
		 return nombre;
	 }

	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }

	 public String getCiudad() {
		 return ciudad;
	 }

	 public void setCiudad(String ciudad) {
		 this.ciudad = ciudad;
	 }

	 public List<Pedido> getLista() {
		 return lista;
	 }

	 public void setLista(List<Pedido> lista) {
		 this.lista = lista;
	 }

	 @Override
	 public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", ciudad=" + ciudad + ", lista=" + lista
				+ "]";
	 }

}