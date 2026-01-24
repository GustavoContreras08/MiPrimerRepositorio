package com.mx.ClaseCuenta;

public class Index {

	public static void main(String[] args) {
		CuentaAhorro cuenta = new CuentaAhorro("Jose", 200, 21);
		
		cuenta.mostrarInfo();
		cuenta.calcularInteres();
		
	}

}
