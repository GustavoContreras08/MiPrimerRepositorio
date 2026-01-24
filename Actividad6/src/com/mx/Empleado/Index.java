package com.mx.Empleado;

public class Index {

	public static void main(String[] args) {
		EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto("Juan", 22, 100, "Tiempo Completo");
		EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("Gustavo", 27, 20000, "Por Horas");
		
		empleado.calcularBono(empleado.getNombre(), empleado.getEdad(), empleado.getSalario(), empleado.getTip());
		empleado2.calcularBono(empleado2.getNombre(), empleado2.getEdad(), empleado2.getSalario(), empleado2.getTip());

	}

}
