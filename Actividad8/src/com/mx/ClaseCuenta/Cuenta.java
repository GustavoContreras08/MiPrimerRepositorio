package com.mx.ClaseCuenta;

public class Cuenta {
	
	private String titular;
	private double cantidad;
	
	public Cuenta() {
		
	}
	
	public Cuenta(String titular, double cantidad) {
		super();
		this.titular = titular;
		
		if(cantidad < 0) {
			this.cantidad = 0;
		}
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		if(cantidad < 0) {
			return cantidad = 0;
		}else {

		return cantidad;
		}
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}	
	
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}

	public void mostrarInfo() {
	    System.out.println("Titular: " + getTitular());
	    System.out.println("Cantidad: " + getCantidad());
	}

}
