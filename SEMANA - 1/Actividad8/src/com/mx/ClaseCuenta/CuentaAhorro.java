package com.mx.ClaseCuenta;

public class CuentaAhorro extends Cuenta{
	
	private double tasaInteres;

	public CuentaAhorro(String titular, double cantidad, double tasaInteres) {
		super(titular, cantidad);
		this.tasaInteres = tasaInteres;
	}

	public double getTasaInteres() {
		return tasaInteres;

	}

	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	@Override
	public String toString() {
		return "CuentaAhorro [getTitular()=" + getTitular() + ", getCantidad()=" + getCantidad() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", tasaInteres="
				+ tasaInteres + "]";
	}
	
	public void calcularInteres() {
		
		if(tasaInteres < 0) {
			System.out.println("El interés generado es: 0.00");
		}else {
			double interes = getCantidad() * tasaInteres / 100;
			System.out.println("El interés generado es: " + interes);
		}
	 
	}
	
}
