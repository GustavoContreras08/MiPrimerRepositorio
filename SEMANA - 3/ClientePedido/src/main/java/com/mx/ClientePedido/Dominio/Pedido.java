package com.mx.ClientePedido.Dominio;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Pedido {

	@Id
	private Integer idPedido;
	private LocalDate fecha;
	private Double monto;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_Id")
    private Cliente cliente;
	
	public Pedido() {
		
	}

	public Pedido(Integer idPedido, LocalDate fecha, Double monto, Cliente cliente) {
		super();
		this.idPedido = idPedido;
		this.fecha = fecha;
		this.monto = monto;
		this.cliente = cliente;
	}

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fecha=" + fecha + ", monto=" + monto + ", cliente=" + cliente + "]";
	}
	
	
}
